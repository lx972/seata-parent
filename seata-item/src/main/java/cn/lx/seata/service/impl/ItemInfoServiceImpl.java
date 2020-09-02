package cn.lx.seata.service.impl;

import cn.lx.seata.dao.ItemInfoMapper;
import cn.lx.seata.pojo.ItemInfo;
import cn.lx.seata.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * cn.lx.seata.service.impl
 *
 * @Author Administrator
 * @date 16:40
 */
@Service
public class ItemInfoServiceImpl implements ItemInfoService {

    @Autowired
    private ItemInfoMapper itemInfoMapper;

    /***
     * 库存递减
     * @param id
     * @param count
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void decrCount(int id, int count) {
        //查询商品信息
        ItemInfo itemInfo = itemInfoMapper.selectByPrimaryKey(id);
        itemInfo.setCount(itemInfo.getCount()-count);
        int dcount = itemInfoMapper.updateByPrimaryKeySelective(itemInfo);
        System.out.println("库存递减受影响行数："+dcount);
        //异常准备回滚
        //int q=10/0;
    }
}
