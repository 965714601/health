package com.zjw.controller;

import com.zjw.constant.MessageConstant;
import com.zjw.pojo.CheckItem;
import com.zjw.entity.Result;
import com.zjw.service.CheckItemService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zjw
 * @package health_parent
 * @Date 2021/9/4
 * @Time 22:31
 */

@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;

    @GetMapping("/findAll")
    public Result findAll(){
        // 调用服务查询所有的检查项
        List<CheckItem> list = checkItemService.findAll();
        System.out.println("findAll");

        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,list);
    }
}
