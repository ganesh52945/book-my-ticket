package com.jsp.book.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.jsp.book.dto.UserDto;
import com.jsp.book.entity.BookedTicket;

@Service
public class RedisServiceImpl implements RedisService {

	private final Map<String, UserDto> userDtoMap = new ConcurrentHashMap<>();
	private final Map<String, Integer> otpMap = new ConcurrentHashMap<>();
	private final Map<String, BookedTicket> ticketMap = new ConcurrentHashMap<>();

	@Override
	public void saveUserDto(String email, UserDto userDto) {
		userDtoMap.put(email, userDto);
	}

	@Override
	public void saveOtp(String email, int otp) {
		otpMap.put(email, otp);
	}

	@Override
	public UserDto getUserDto(String email) {
		return userDtoMap.get(email);
	}

	@Override
	public int getOtp(String email) {
		Integer otp = otpMap.get(email);
		return otp != null ? otp : 0;
	}

	@Override
	public void saveTicket(String orderId, BookedTicket ticket) {
		ticketMap.put(orderId, ticket);
	}

	@Override
	public BookedTicket getTicket(String orderId) {
		return ticketMap.get(orderId);
	}
}
