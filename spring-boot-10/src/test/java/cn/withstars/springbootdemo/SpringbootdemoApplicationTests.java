package cn.withstars.springbootdemo;

import cn.withstars.springbootdemo.domain.Tab;
import cn.withstars.springbootdemo.service.impl.TabServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

	@Autowired
	private TabServiceImpl tabService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void tabServiceTest(){
		Tab tab = tabService.getTabById(3);
		System.out.println(tab);
		List<Tab> tabs = tabService.listTabs();
		System.out.println(tabs);
	}



}
