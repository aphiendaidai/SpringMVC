package com.hello.controller;


import java.util.Locale;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


// CLASS NÀY KHÔNG CÓ TÁC DỤNG, QUÊN XÓA
public class LayoutViewResolver extends InternalResourceViewResolver {
    
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        // Nếu là redirect hoặc forward, không thay đổi gì
        if (viewName.startsWith("redirect:") || viewName.startsWith("forward:")) {
            return super.resolveViewName(viewName, locale);
        }
        
        // Nếu là view thông thường, tự động thêm layout
        String layoutViewName = "layout/layout"; // layout chung của bạn
        String contentViewName = viewName; // view con

        // Tạo model chứa nội dung và layout
        ModelAndView modelAndView = new ModelAndView(layoutViewName);
        modelAndView.addObject("contentPage", contentViewName);

        return super.resolveViewName(layoutViewName, locale);
    }
}
