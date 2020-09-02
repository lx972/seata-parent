package cn.lx.seata.service;

/**
 * cn.lx.seata.service
 *
 * @Author Administrator
 * @date 16:41
 */
public interface ItemInfoService {

    /**
     * 库存递减
     * @param id
     * @param count
     */
    void decrCount(int id, int count);
}
