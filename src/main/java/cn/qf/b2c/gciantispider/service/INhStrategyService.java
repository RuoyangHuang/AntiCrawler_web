/*
 * Created on 2017年7月19日
 * NhStrategyService.java V1.0
 *
 * Copyright Notice =========================================================
 * This file contains proprietary information of Kingpintcn Information Technology Co.,Ltd
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 =======================================================
 */
package cn.qf.b2c.gciantispider.service;

import cn.qf.b2c.gciantispider.model.NhStrategy;


public interface INhStrategyService {
    /**
     * 保存策略信息
     */
    void savaNhStrategy(NhStrategy nhStrategy);
}
