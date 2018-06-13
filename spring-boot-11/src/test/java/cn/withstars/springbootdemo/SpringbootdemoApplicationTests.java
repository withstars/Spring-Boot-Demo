package cn.withstars.springbootdemo;

import cn.withstars.springbootdemo.async.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

	@Autowired
	private Task task;

	@Test
	public void contextLoads() {
	}

	@Test
	public void taskTest() {
		Long start = System.currentTimeMillis();
		try {
			Future<String> task1 = task.doTaskOne();
			Future<String> task2 = task.doTaskTwo();
			Future<String> task3 = task.doTaskThree();

			while (true){
				if (task1.isDone() && task2.isDone() && task3.isDone()){
					break;
				}
				Thread.sleep(1000);
			}
			Long end = System.currentTimeMillis();
			System.out.println("任务全部完成，总耗时"+(end-start)+"毫秒");

		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
