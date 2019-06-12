package com.barrycommins.prometheusalertreceiver;

@FunctionalInterface
public interface AlertForwarder {

    /**
     * Send alerts received from the webhook receiver
     * @param message the Prometheus message
     */
    void send(PrometheusMessage message);
}
