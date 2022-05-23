package kr.kro.faitmain.service;

import kr.kro.faitmain.domain.test.TestVo;
import kr.kro.faitmain.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService{

    @Autowired
    public TestMapper mapper;

    public List< TestVo > selectTest(){
        return mapper.selectTest();
    }
}