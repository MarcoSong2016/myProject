package com.bai.dao;

import com.bai.entity.Successkilled;

/**
 * Created by Bai on 2017/3/6.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可以过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int  insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据id查询successkilled并且携带秒杀对象实体
     * @param seckilledId
     * @return
     */
    Successkilled queryByIdWithSeckill(long seckilledId);
}
