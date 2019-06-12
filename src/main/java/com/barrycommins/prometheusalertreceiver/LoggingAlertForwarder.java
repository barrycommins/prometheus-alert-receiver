package com.barrycommins.prometheusalertreceiver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoggingAlertForwarder implements AlertForwarder {

    private final ObjectMapper objectMapper;

    LoggingAlertForwarder(ObjectMapper objectMapper) {

        this.objectMapper = objectMapper;
    }

    @Override
    public void send(PrometheusMessage message) {
        try {
            log.info(objectMapper.writeValueAsString(message));
        } catch (JsonProcessingException e) {
            log.error("Can't process json", e);
        }
    }
}
