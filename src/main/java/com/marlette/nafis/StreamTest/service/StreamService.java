package com.marlette.nafis.StreamTest.service;

import com.marlette.nafis.StreamTest.model.StreamEvent;
import com.marlette.nafis.StreamTest.repository.StreamRepository;
import com.marlette.nafis.StreamTest.stream.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamService {

    @Autowired
    private StreamRepository streamRepository;
    @Autowired
    private Connector connector;

    public List getAllEvents() {
        connector.processGetEvent();
        return streamRepository.findAll();
    }

    public StreamEvent createEvent(StreamEvent newEvent) {
        connector.processCreateEvent(newEvent);
        return (StreamEvent) streamRepository.saveAndFlush(newEvent);
    }
}
