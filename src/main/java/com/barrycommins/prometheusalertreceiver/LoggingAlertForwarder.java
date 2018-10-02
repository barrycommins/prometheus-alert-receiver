package com.barrycommins.prometheusalertreceiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoggingAlertForwarder implements AlertForwarder {

    @Override
    public void send(PrometheusMessage message) {
        log.info(message.toString());
    }
}
