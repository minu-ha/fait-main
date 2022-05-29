package kr.kro.faitmain.service.user;

import kr.kro.faitmain.model.dao.user.UserDao;
import kr.kro.faitmain.model.dto.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public void join( Join join ){

    }

    @Override
    public int overlapCheck( String value , String valueType ){
        return userDao.overlapCheck( value , valueType );
    }
}
