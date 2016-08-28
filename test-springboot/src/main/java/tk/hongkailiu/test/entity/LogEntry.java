package tk.hongkailiu.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * Created by hongkailiu on 2016-08-25.
 */
@Data public class LogEntry {
    // 24/Jul/2016:18:55:45 -0400
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MMM/yyyy:HH:mm:ss Z", timezone="America/Montreal")
    private Date time;
    private String level;
    private String agent;
    private String ip;
    private String content;
}
