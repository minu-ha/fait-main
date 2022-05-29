package kr.kro.faitmain.service.store;

import kr.kro.faitmain.model.dao.store.StoreDao;
import kr.kro.faitmain.model.domain.store.Store;
import kr.kro.faitmain.model.domain.store.StoreDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreServiceImpl implements StoreService{
    @Autowired
    private StoreDao storeDao;

    @Override
    public List<Store> storeList(int category, int address) {
        Map<String, Object> map = new HashMap<>();
        map.put("category", category);
        map.put("address1", address);

        return storeDao.storeList(map);
    }
    @Override
    public StoreDetail storeDetail( long storeId) {
        Store storeInfo = storeDao.storeDetail(storeId);

//		List<Food> foodList = storeDAO.foodList(storeId);
//		List<Review> reviewList = storeDAO.reviewList(storeId);

        return new StoreDetail(storeInfo);
    }

}
