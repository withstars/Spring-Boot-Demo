package cn.withstars.springbootdemo.repostiory;

import cn.withstars.springbootdemo.domain.Tab;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 16:49
 * Mail: withstars@126.com
 */
@Repository
@CacheConfig(cacheNames = "tabs")  // 缓存配置注解
public interface TabRepository extends JpaRepository<Tab, Integer> {

    Tab findTabById(Integer id);

    List<Tab> findAll();





}
