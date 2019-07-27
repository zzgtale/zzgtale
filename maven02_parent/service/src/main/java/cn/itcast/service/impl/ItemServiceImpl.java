package cn.itcast.service.impl;

import cn.itcast.dao.ItemDao;
import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    public Item findItem(Integer id) {
        return itemDao.findItem(id);
    }
}
