package riffrain.pln.module.lotto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LottoRestController {

    @RequestMapping(value = "/test")
    public Map<String, Object> aamain(){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("hello", "would");
        return resultMap;
    }

}
