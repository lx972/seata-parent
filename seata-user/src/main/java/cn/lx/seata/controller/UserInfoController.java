package cn.lx.seata.controller;

import cn.lx.seata.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * cn.lx.seata.controller
 *
 * @Author Administrator
 * @date 16:42
 */
@RestController
@RequestMapping("/userInfo")
@CrossOrigin
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /***
     * 账户余额递减
     * @param username
     * @param money
     */
    @PostMapping(value = "/add")
    public String decrMoney(@RequestParam(value = "username") String username, @RequestParam(value = "money") int money){
        userInfoService.decrMoney(username,money);
        return "success";
    }

}