package com.example.demo.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    private Date timestamp;
    private String messenger;
    private String details;

    public ExceptionResponse(Date timestamp, String messenger, String details) {
        this.timestamp = timestamp;
        this.messenger = messenger;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessenger() {
        return messenger;
    }

    public String getDetails() {
        return details;
    }
}
