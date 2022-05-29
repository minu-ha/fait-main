package kr.kro.faitmain.service.user;

import kr.kro.faitmain.dto.Join;
import org.springframework.stereotype.Service;

@Service
public interface UserService{

    void join( Join join );

    int overlapCheck( String value , String valueType );
}
