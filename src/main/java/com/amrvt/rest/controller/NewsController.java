package com.amrvt.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amrvt.rest.service.INewsService;
import com.amrvt.rest.service.NewsService;
import com.amrvt.rest.vo.NewsVO;

@RestController
@RequestMapping(value="/rest/v1/news")
public class NewsController {

    @Autowired
    INewsService newsService;

    @RequestMapping("/{id}")
    public NewsVO home(@PathVariable String id){
        return newsService.getNews(id);
    }


}
