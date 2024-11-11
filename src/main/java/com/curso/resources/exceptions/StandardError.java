package com.curso.resources.exceptions;

import com.curso.enums.Status;

public class StandardError {

    private static final long serialVersionUID = 1L;

    private long timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
        super();

    }

    public StandardError(long timeStamp, Integer status, String error, String message, String path) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public long getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }



    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setInteger(long integer) {
       status = status;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPath(String path) {
        this.path = path;
    }
}