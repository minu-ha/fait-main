package kr.kro.faitmain.mapper;

import kr.kro.faitmain.domain.test.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper{
    List< TestVo > selectTest();
}
