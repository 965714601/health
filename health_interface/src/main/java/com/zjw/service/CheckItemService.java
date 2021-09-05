package com.zjw.service;

import com.zjw.pojo.CheckItem;

import java.util.List;

/**
 * @author zjw
 * @package health_parent
 * @Date 2021/9/4
 * @Time 22:32
 */
public interface CheckItemService {

    /**
     * 查询所有的检查项
     * @return
     */
   List<CheckItem> findAll();
}
