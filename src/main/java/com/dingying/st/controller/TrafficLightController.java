package com.dingying.st.controller;

import com.dingying.st.po.TrafficLight;
import com.dingying.st.service.TrafficLightService;
import com.dingying.st.util.ServerResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Scope("prototype")
@RequestMapping("smart/traffic/api")
@Controller
@ResponseBody
public class TrafficLightController {

    @Resource
    private TrafficLightService trafficLightService;

    @RequestMapping(value = "light/getTrafficLightInfo",method = RequestMethod.POST)
    public ServerResponse getTrafficLightInfo(){
        List<TrafficLight> trafficLights=trafficLightService.list(null,null);
        return ServerResponse.createBySuccess("请求成功",trafficLights);
    }

    @RequestMapping(value = "light/updateTrafficLight",method = RequestMethod.POST)
    public ServerResponse updateTrafficLight(TrafficLight trafficLight){
        trafficLightService.update(trafficLight);
        return ServerResponse.createBySuccessMessage("修改成功");
    }

}
