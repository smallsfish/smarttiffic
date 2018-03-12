package com.dingying.st.controller;

import com.dingying.st.dto.AirQualityDTO;
import com.dingying.st.po.Road;
import com.dingying.st.po.Station;
import com.dingying.st.service.StationService;
import com.dingying.st.util.ServerResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Scope("prototype")
@RequestMapping("smart/traffic/api")
@Controller
@ResponseBody
public class RoadController {

    private static Random random=new Random(47);

    @Resource
    private StationService stationService;

    @RequestMapping(value = "road/getRoadStatus",method = RequestMethod.POST)
    public ServerResponse getRoadStatus(){
        List<Station> stations=stationService.list(null,null);
        List<Road> roads=new ArrayList<>();
        Road road=null;
        for (int i = 0; i < stations.size(); i++) {
            road=new Road();
            road.setCrowdStatus(((Integer)(random.nextInt(5)+1)).byteValue());
            roads.add(road);
        }
        return ServerResponse.createBySuccess("请求成功",roads);
    }

    @RequestMapping(value = "road/getCurrentAirQuality",method = RequestMethod.POST)
    public ServerResponse getCurrentAirQuality(){
        AirQualityDTO airQualityDTO=new AirQualityDTO();
        airQualityDTO.setHumidity(random.nextInt(101));
        airQualityDTO.setPm(random.nextInt(100));
        airQualityDTO.setTemperature(random.nextInt(50));
        return ServerResponse.createBySuccess("请求成功",airQualityDTO);
    }

    


}
