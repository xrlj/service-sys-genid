package com.xrlj.servicesysgenid.api.vo.req;

import com.xrlj.framework.base.VBase;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class VGenidReq extends VBase {

    /**
     * 数据中心id
     */
    @Min(0)
    @Max(31)
    private long dataCenterId;

    /**
     * 机器id
     */
    @Min(0)
    @Max(31)
    private long workerId;
}
