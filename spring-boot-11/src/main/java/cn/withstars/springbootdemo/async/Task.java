package cn.withstars.springbootdemo.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 20:15
 * Mail: withstars@126.com
 */
@Component
public class Task {

    private static Random random = new Random();

    @Async
    public Future<String> doTaskOne() throws Exception{
        System.out.println("开始任务一:");
        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        Long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时"+(end - start)+"毫秒");
        return new AsyncResult<>("完成任务一");
    }

    @Async
    public Future<String> doTaskTwo() throws Exception{
        System.out.println("开始任务二:");
        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        Long end = System.currentTimeMillis();
        System.out.println("完成任务二，耗时"+(end - start)+"毫秒");
        return new AsyncResult<>("完成任务二");
    }

    @Async
    public Future<String> doTaskThree() throws Exception{
        System.out.println("开始任务三:");
        Long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        Long end = System.currentTimeMillis();
        System.out.println("完成任务三，耗时"+(end - start)+"毫秒");
        return new AsyncResult<>("完成任务三");
    }






}
