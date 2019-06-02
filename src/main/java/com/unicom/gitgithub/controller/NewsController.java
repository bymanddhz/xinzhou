package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.controller.entity.News;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NewsController
 * @Description TODO
 * @Author bym
 * @Date 2019/5/31 9:04
 * @Version 1.0
 */
//http://10.11.1.222:8080/news/getall/
@RestController
@RequestMapping(value = "news")
public class NewsController {
    @RequestMapping(value = "getall")
    public List<News> getAll(){
        News news1=new News(1,"2","3");
        News news2=new News(4,"5","6");
        News news3=new News(7,"8","9");
        List<News> list=new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);
        list.add(news3);
        return list;
    }
}
