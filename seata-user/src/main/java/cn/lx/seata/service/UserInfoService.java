package cn.lx.seata.service;

/**
 * cn.lx.seata.service
 *
 * @Author Administrator
 * @date 16:41
 */
public interface UserInfoService {

    /***
     * 账户金额递减
     * @param username
     * @param money
     */
    void decrMoney(String username, int money);
}
