package kr.kro.faitmain.service.store;


import kr.kro.faitmain.domain.store.Store;
import kr.kro.faitmain.domain.store.StoreDetail;

import java.util.List;

public interface StoreService{

    List<Store> storeList(int category, int address);
    StoreDetail storeDetail( long id);
}
