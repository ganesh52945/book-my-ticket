package com.jsp.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book.entity.BookedTicket;

import java.util.List;
import com.jsp.book.entity.User;

public interface TicketRepository extends JpaRepository<BookedTicket, Long> {
	List<BookedTicket> findByUser(User user);
}
