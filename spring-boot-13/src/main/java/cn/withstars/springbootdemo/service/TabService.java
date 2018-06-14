package cn.withstars.springbootdemo.service;

import cn.withstars.springbootdemo.domain.Tab;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 18:05
 * Mail: withstars@126.com
 */
public interface TabService {

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    Tab getTabById(Integer id);

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    List<Tab> listTabs();
}
