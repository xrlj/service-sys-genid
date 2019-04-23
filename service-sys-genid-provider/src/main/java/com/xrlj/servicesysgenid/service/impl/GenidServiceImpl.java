package com.xrlj.servicesysgenid.service.impl;

import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import com.xrlj.servicesysgenid.common.ID;
import com.xrlj.servicesysgenid.common.SnowflakeIdWorker;
import com.xrlj.servicesysgenid.service.GenidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GenidServiceImpl implements GenidService {

    @Value("${snowflake.data-center-id}")
    private  String dataCenterId;
    @Value("${snowflake.worker-id}")
    private String workerId;

//    private static SnowflakeIdWorker snowflakeIdWorker = null;
//    {
//        if (snowflakeIdWorker == null) {
//            snowflakeIdWorker = new SnowflakeIdWorker(Long.valueOf(dataCenterId),Long.valueOf(workerId));
//        }
//    }

    @Override
    public long genId() {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(Long.valueOf(dataCenterId),Long.valueOf(workerId));
        long id = snowflakeIdWorker.nextId();
        return id;
    }

    @Override
    public VIdResp expId(long id) {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(Long.valueOf(dataCenterId),Long.valueOf(workerId));
        ID ID = snowflakeIdWorker.convert(id);
        VIdResp vIdResp = new VIdResp();
        vIdResp.setDataCenterId(ID.getDataCenterId());
        vIdResp.setWorkerId(ID.getWorkerId());
        vIdResp.setSequence(ID.getSequence());
        vIdResp.setTimeStamp(ID.getTimeStamp());
        return vIdResp;
    }
}
