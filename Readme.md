# Prometheus Alert Receiver [![Build Status](https://travis-ci.org/barrycommins/prometheus-alert-receiver.svg?branch=master)](https://travis-ci.org/github/barrycommins/prometheus-alert-receiver)


Simple Spring Boot project to receive alerts from Prometheus' AlertManager.


Contains an implementation of an interface (`AlertForwarder`) to log out the alert, but could be configured to forward anywhere.

