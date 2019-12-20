package com.xrlj.servicesysgenid.api;

import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("${genid.index}")
public interface GenidApi {

    /**
     * 生成分布式id
     * @return
     */
    @GetMapping
    long genId();

    /**
     * 批量生成id。
     * @param size 生成id个数
     * @return 个数数组
     */
    @GetMapping("${genid.batch}")
    long[] genIds(@PathVariable(name = "size") int size);

    /**
     *
     * 解析分布式id
     * @param id
     * @return
     */
    @GetMapping("${genid.expId}")
    VIdResp expId(@PathVariable(name = "id") long id);

}
