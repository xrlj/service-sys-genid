package com.xrlj.servicesysgenid.service;

import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;

public interface GenidService {

    /**
     * 生成分布式id
     * @return
     */
    long genId();

    /**
     *
     * 解析分布式id
     * @param id
     * @return
     */
    VIdResp expId(long id);
}
