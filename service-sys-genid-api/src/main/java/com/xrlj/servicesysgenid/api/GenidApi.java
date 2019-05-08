package com.xrlj.servicesysgenid.api;

import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/genid")
public interface GenidApi {

    /**
     * 生成分布式id
     * @return
     */
    @GetMapping
    long genId();

    /**
     *
     * 解析分布式id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    VIdResp expId(@PathVariable(name = "id") long id);
}
