package kr.kro.faitmain.service.store;


import kr.kro.faitmain.model.domain.store.Store;
import kr.kro.faitmain.model.domain.store.StoreDetail;

import java.util.List;

public interface StoreService{

    List<Store> storeList(int category, int address);
    StoreDetail storeDetail( long id);
}
