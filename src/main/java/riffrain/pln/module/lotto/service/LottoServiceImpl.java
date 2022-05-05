package riffrain.pln.module.lotto.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import riffrain.pln.module.lotto.repository.LottoMapper;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class LottoServiceImpl implements LottoService{

    private LottoMapper lottoMapper;

    @Override
    public Map<String, Object> selectLotto(Map<String, Object> map) {
        return lottoMapper.selectLotto(map);
    }
}
