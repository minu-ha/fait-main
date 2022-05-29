package kr.kro.faitmain.dao.user;

import kr.kro.faitmain.dto.Join;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SqlSession sql;

    @Override
    public void join( Join join ){
        sql.insert( "user.join" , join );
    }

    @Override
    public int overlapCheck( String value , String valueType ){
        HashMap< String, String > map = new HashMap<>();
        map.put( "value" , value );
        map.put( "valueType" , valueType );
        return sql.selectOne( "user.overlapCheck" , map );
    }
}
