package com.practice.kafka.controller;

import com.practice.kafka.template.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/kafka")
public class KafkaProducerController {
    private KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer){
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the body");
    }
}
