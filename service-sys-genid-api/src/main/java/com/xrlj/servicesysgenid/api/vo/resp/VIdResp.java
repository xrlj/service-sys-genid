package com.xrlj.servicesysgenid.api.vo.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class VIdResp implements Serializable,Cloneable {

    /**
     * 时间戳。41位的时间序列
     */
    private long timeStamp;

    /**
     * 数据中心id。5位
     */
    private long dataCenterId;

    /**
     * 节点机器id。5位
     */
    private long workerId;

    /**
     * 12位序列号
     */
    private long sequence;
}
