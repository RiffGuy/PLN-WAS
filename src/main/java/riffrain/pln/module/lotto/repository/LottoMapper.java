package riffrain.pln.module.lotto.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LottoMapper {
    Map<String, Object> selectLotto(Map<String, Object> map);
}
