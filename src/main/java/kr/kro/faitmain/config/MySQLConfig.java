package kr.kro.faitmain.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan( "kr.kro.faitmain" )
public class MySQLConfig{

//    @Bean
//    public SqlSessionFactory sqlSessionFactory( DataSource dataSource ) throws Exception{
//
//        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource( dataSource );
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactory.setMapperLocations( resolver.getResources( "classpath:mappers/*.xml" ) );
//
//        Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource( "classpath:mybatis-config.xml" );
//        sqlSessionFactory.setConfigLocation( myBatisConfig );
//
//        return sqlSessionFactory.getObject();
//    }

//    @MapperScan
//    연결할 DAO 인터페이스를 담은 패키지를 등록한다.
//    @MapperScan(basePackages = {"com.project.mong.dao"}) 라고 정의할 수도 있다.
//    SqlSessionFactory
//    MySql과 MyBatis를 연결해주는 객체
//    SqlSessionFactoryBean
//    SqlSessionFactory를 생성해주는 클래스
//    setDataSource()
//    앞서 정의한 datasource를 참조하게 한다.
//    PathMatchingResourcePatternResolver
//    resource 위치 검색을 돕는 Spring class
//    getResources() 로 경로 검색을 해 SqlSessionFactory에 mapper 와 mybatis-config를 set해준다.
//    classpath
//    resource 폴더를 나타냄
}
