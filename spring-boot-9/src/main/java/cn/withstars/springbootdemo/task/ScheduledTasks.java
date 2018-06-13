package cn.withstars.springbootdemo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 15:34
 * Mail: withstars@126.com
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("Currrent time is "+dateFormat.format(new Date()));
    }





}
