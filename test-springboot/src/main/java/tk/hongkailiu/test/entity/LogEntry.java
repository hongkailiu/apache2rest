package tk.hongkailiu.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

/**
 * Created by hongkailiu on 2016-08-25.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data public class LogEntry {
    // 24/Jul/2016:18:55:45 -0400
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MMM/yyyy:HH:mm:ss Z", timezone="America/Montreal")
    private Date time;
    private String agent;
    private String ip;
    private String request;
    private String host;
    private String ident;
    private String auth;
    private String verb;
    private String httpVersion;
    private String response;
    private String bytes;
}
