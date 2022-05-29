package kr.kro.faitmain.controller.test;

import kr.kro.faitmain.model.dao.TestDao;
import kr.kro.faitmain.model.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class TestRestController{

    @Autowired
    private TestDao testDao;

    @RequestMapping( "/hello" )
    public List< TestDto> getTestVAlue(){
        return testDao.getTestData();
    }
}