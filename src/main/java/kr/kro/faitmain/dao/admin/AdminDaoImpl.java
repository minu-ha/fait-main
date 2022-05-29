package kr.kro.faitmain.dao.admin;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class AdminDaoImpl implements AdminDao{
    @Autowired
    private SqlSession sql;

    @Override
    public int pointUpdate(long userId, String info, int point) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("info", info);
        map.put("point", point);

        return sql.insert("admin.pointUpdate", map);
    }
}
