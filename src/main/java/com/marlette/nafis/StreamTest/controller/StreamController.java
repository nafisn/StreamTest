package com.marlette.nafis.StreamTest.controller;

import com.marlette.nafis.StreamTest.api.StreamControllerURL;
import com.marlette.nafis.StreamTest.model.StreamEvent;
import com.marlette.nafis.StreamTest.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreamController {

    @Autowired
    private StreamService streamService;

    @GetMapping(StreamControllerURL.GET_ALL_EVENTS_URL)
    public List<StreamEvent> getAllEvents(){
        return streamService.getAllEvents();
    }

    @PostMapping(StreamControllerURL.CREATE_NEW_EVENT_URL)
    public StreamEvent createEvent(@RequestBody StreamEvent newEvent){
        return streamService.createEvent(newEvent);
    }

}
