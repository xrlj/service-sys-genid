package com.xrlj.servicesysgenid.api.vo.req;

import com.xrlj.framework.vo.VBaseReq;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class VGenidReq extends VBaseReq {

    private static final long serialVersionUID = -5172672830059752986L;

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
