package cn.withstars.springbootdemo.service.impl;

import cn.withstars.springbootdemo.domain.Tab;
import cn.withstars.springbootdemo.repostiory.TabRepository;
import cn.withstars.springbootdemo.service.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 18:09
 * Mail: withstars@126.com
 */
@Service
public class TabServiceImpl implements TabService {

    @Autowired
    private TabRepository tabRepository;

    @Override
    public Tab getTabById(Integer id) {
        return tabRepository.findTabById(id);
    }

    @Override
    public List<Tab> listTabs() {
        return tabRepository.findAll();
    }
}
