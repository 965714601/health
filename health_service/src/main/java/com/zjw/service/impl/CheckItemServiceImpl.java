package com.zjw.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjw.dao.CheckItemDao;
import com.zjw.pojo.CheckItem;
import com.zjw.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zjw
 * @package health_parent
 * @Date 2021/9/4
 * @Time 22:50
 */
@Service(interfaceClass = CheckItemService.class)
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemDao checkItemDao;

    /**
     * 查询所有的检查项
     *
     * @return
     */
    @Override
    public List<CheckItem> findAll() {
        return checkItemDao.findAll();
    }
}
