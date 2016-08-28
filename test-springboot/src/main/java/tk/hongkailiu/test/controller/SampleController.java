package tk.hongkailiu.test.controller;

/**
 * Created by hongkailiu on 2016-08-25.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import tk.hongkailiu.test.entity.LogEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;

@Controller
@EnableAutoConfiguration
public class SampleController {

    private List<LogEntry> logEntries = new ArrayList<>();

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

    @RequestMapping(value = "/log", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody void post(@RequestBody LogEntry logEntry) {
        System.out.println("====:" + logEntry.getTime());
        logEntries.add(logEntry);
        //HttpHeaders headers = new HttpHeaders();
        //headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        //return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public @ResponseBody List<LogEntry> get() {
        return  logEntries;
    }
}
