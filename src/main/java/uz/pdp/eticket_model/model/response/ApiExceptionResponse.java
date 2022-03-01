package uz.pdp.eticket_model.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class ApiExceptionResponse {
    private LocalDateTime timestamp;

    @JsonProperty("status_code")
    private int statusCode;

    @JsonProperty("error")
    private String error;

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    public LocalDateTime getTimestamp() {
        return LocalDateTime.now();
    }

    public ApiExceptionResponse(LocalDateTime timestamp, int statusCode, String error) {
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.error = error;
    }

    public ApiExceptionResponse() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getError() {
        return this.error;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("status_code")
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }


}
