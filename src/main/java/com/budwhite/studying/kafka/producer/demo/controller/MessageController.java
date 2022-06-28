package com.budwhite.studying.kafka.producer.demo.controller;

import com.budwhite.studying.kafka.producer.demo.model.BaseResponse;
import com.budwhite.studying.kafka.producer.demo.model.Message;
import com.budwhite.studying.kafka.producer.demo.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody BaseResponse postMessage(@RequestBody Message message) {
        try {
            messageProducer.sendMessage(message);
            return new BaseResponse("ok");
        }
        catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(e.getMessage());
        }
    }
}
