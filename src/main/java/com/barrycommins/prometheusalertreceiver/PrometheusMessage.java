package com.barrycommins.prometheusalertreceiver;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class PrometheusMessage {

    private String version;
    private String groupKey;
    private String status;
    private String receiver;
    private Map<String, String> groupLabels;
    private Map<String, String> commonLabels;
    private Map<String, String> commonAnnotations;
    private String externalUrl;
    private List<Alert> alerts;

    @Data
    static class Alert {
        private String status;
        private Map<String, String> labels;
        private Map<String, String> annotations;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        private Date startsAt;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        private Date endsAt;

        private String generatorUrl;
    }
}
