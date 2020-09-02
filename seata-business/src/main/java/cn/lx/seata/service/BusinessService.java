package cn.lx.seata.service;

/**
 * cn.lx.seata.service
 *
 * @Author Administrator
 * @date 16:41
 */
public interface BusinessService {

    /**
     * 下单
     * @param username
     * @param id
     * @param count
     */
    void add(String username, int id, int count);
}
