package com.example.pictgram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pictgram.entity.Faq;
import com.example.pictgram.repository.FaqRepository;

@Service
public class FaqService {

	@Autowired
	private FaqRepository faqRepository;

	public List<Faq> getAllFaqs() {
		return faqRepository.findAll();
	}
}
