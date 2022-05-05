package riffrain.pln.module.lotto.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import riffrain.pln.module.lotto.service.LottoService;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class LottoRestController {

    private final LottoService lottoService;

    @RequestMapping("/api/lotto/{id}")
    public Map<String, Object> hello(@PathVariable Long id) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("lttNo", id);
        return lottoService.selectLotto(requestMap);
    }
}
