package com.amrvt.rest.service;

import org.springframework.stereotype.Service;

import com.amrvt.rest.vo.NewsVO;

@Service
public class NewsService implements  INewsService{
    @Override
    public NewsVO getNews(String id) {

        NewsVO news=new NewsVO();
        news.setId(id);
        news.setDescription("This is the overview of the news");
        news.setContent("This is the content of the news");
        return news;
    }


}
