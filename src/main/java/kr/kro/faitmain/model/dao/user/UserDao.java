package kr.kro.faitmain.model.dao.user;

import kr.kro.faitmain.model.dto.Join;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao{

    void join( Join join );

    int overlapCheck( String value , String valueType );
}
