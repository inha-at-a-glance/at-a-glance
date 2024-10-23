package com.example.AtaGlance.controller;

import com.example.AtaGlance.dto.NewsOrigin;
import com.example.AtaGlance.dto.CardNews;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/news")
@RequiredArgsConstructor
public class NewsController {
    /**
     * '/regist' 요청이 get 방식으로 들어왔을 때 regist로 연결한다.
     */
    @GetMapping("/register")
    public String showNewsRegistForm() {
        return "cardnewsRegister";
    }

    /**
     * '/regist' 요청이 post 방식으로 들어왔을 때 전달된 User 객체를 regist_result로 연결한다.
     */
    @PostMapping("/register")
    public ModelAndView doNewsRegist(NewsOrigin news) {
        ModelAndView mav = new ModelAndView();
        // 어디로 연결할지 설정
        mav.setViewName("newsList");
        // 전달할 객체
        mav.addObject("news", news);
        return mav;
    }
}
