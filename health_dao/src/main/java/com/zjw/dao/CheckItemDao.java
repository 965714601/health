package com.zjw.dao;

import com.zjw.pojo.CheckItem;

import java.util.List;

/**
 * @author zjw
 * @package health_parent
 * @Date 2021/9/4
 * @Time 22:51
 */
public interface CheckItemDao {

    /**
     * 查询 所有检查项
     * @return
     */
    List<CheckItem> findAll();
}
