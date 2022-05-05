package riffrain.pln.module.lotto.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface LottoService {
    Map<String, Object> selectLotto(Map<String, Object> requestMap);
}
