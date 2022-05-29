package kr.kro.faitmain.dao.store;

import kr.kro.faitmain.domain.store.Store;

import java.util.List;
import java.util.Map;

public interface StoreDao{

    List< Store > storeList( Map<String, Object> map);
    Store storeDetail(long storeId);

}
