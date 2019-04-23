package com.xrlj.servicesysgenid.service.impl;

import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import com.xrlj.servicesysgenid.common.SnowflakeIdWorker;
import com.xrlj.servicesysgenid.service.GenidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GenidServiceImpl implements GenidService {

    @Value("${snowflake.data-center-id}")
    private static long dataCenterId;
    @Value("${snowflake.worker-id}")
    private static long workerId;

    private static SnowflakeIdWorker snowflakeIdWorker = null;
    static {
        if (snowflakeIdWorker == null) {
            snowflakeIdWorker = new SnowflakeIdWorker(dataCenterId,workerId);
        }
    }

    @Override
    public long genId() {
        return 0;
    }

    @Override
    public VIdResp expId(long id) {
        return null;
    }
}
