package com.hjrz.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.admin.dao.FeedbackMapper;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackMapper feedbackMapper;

	
}
