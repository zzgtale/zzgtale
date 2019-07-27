package cn.itcast.controller;

import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/show")
    public String showItem(Model model){
        Item item = itemService.findItem(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
