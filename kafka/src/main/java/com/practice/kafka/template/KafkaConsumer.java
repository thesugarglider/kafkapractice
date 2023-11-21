package com.practice.kafka.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.practice.kafka.utils.AppConstants;
public class KafkaConsumer {
    @Service
    public class KafKaConsumer {

        private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer.class);

        @KafkaListener(topics = AppConstants.TOPIC_NAME,
                groupId = AppConstants.GROUP_ID)
        public void consume(String message){
            LOGGER.info(String.format("Message received -> %s", message));
        }
    }

}
