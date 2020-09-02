package cn.lx.seata.controller;

import cn.lx.seata.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * cn.lx.seata.controller
 *
 * @Author Administrator
 * @date 16:42
 */
@RestController
@RequestMapping("/business")
@CrossOrigin
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    /***
     * 购买商品分布式事务测试
     * @return
     */
    @RequestMapping(value = "/addorder")
    public String order(){
        String username="zhangsan";
        int id=1;
        int count=5;
        //下单
        businessService.add(username,id,count);
        return "success";
    }
}
