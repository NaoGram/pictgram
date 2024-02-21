package com.example.pictgram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.pictgram.service.FaqService;

@Controller
public class FaqController {

    @Autowired
    private FaqService faqService;

    @GetMapping("/faq")
    public String showFaq(Model model) {
        // FAQデータを取得してモデルに追加
    	model.addAttribute("faqs", faqService.getAllFaqs());
        // モデルにデータをセットしてFAQページを表示する処理を追加
        return "faqs/index";
    }

}
