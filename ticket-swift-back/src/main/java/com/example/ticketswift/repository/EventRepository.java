package com.example.ticketswift.repository;

import com.example.ticketswift.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
    // You can define custom query methods if needed
}