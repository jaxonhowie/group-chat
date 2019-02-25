package org.jzp.controller.fgo;

import com.alibaba.fastjson.JSONObject;
import org.jzp.service.biz.fgo.GachaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hongyi Zheng
 * @date 2018/9/11
 */
@RestController
@RequestMapping("/fgo")
public class FgoGachaSimulator {

    @Autowired
    GachaService gachaService;

    @RequestMapping(value = "/show")
    public String summon(@RequestBody JSONObject req){
        String type = req.getString("type");
        gachaService.summon(type);
        return "success";
    }
}
