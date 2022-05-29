package kr.kro.faitmain.model.dao;

import kr.kro.faitmain.model.dto.TestDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestDao{
    List< TestDto > getTestData();
}
