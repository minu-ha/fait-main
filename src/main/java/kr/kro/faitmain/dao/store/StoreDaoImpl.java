package kr.kro.faitmain.dao.store;

import kr.kro.faitmain.domain.store.Store;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class StoreDaoImpl implements StoreDao{
    @Autowired
    private SqlSession sql;

    @Override
    public List<Store> storeList(Map<String, Object> map) {
        return sql.selectList("store.storeList", map);
    }
    @Override
    public Store storeDetail(long storeId) {
        return sql.selectOne("store.storeDetail", storeId);
    }
}
