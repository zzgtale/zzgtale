package cn.itcast;

import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItem {
    @Test
    public void testFind(){
//获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //service测试
        ItemService itemsService = ac.getBean(ItemService.class);
        //调用方法
        Item item = itemsService.findItem(1);
        System.out.println(item.getName());
    }
}
