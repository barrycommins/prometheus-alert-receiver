package com.barrycommins.prometheusalertreceiver;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AlertController {

    private final AlertForwarder alertForwarder;

    public AlertController(AlertForwarder alertForwarder) {
        this.alertForwarder = alertForwarder;
    }

    @PostMapping("/alerts")
    @ResponseStatus(HttpStatus.CREATED)
    void alert(@RequestBody @Valid PrometheusMessage message) {
        alertForwarder.send(message);
    }
}
