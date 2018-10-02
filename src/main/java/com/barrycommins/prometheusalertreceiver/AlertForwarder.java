package com.barrycommins.prometheusalertreceiver;

@FunctionalInterface
public interface AlertForwarder {

    /**
     * Send alerts recevied from the webhook receiver
     * @param message the Prometheus message
     */
    void send(PrometheusMessage message);
}
