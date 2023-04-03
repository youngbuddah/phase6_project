package com.crs.main.service;

import java.util.List;

import com.crs.main.model.Feedbacks;

public interface FeedbackService {
	List<Feedbacks> fetchAllFeedbacks();
	void saveFeedback (Feedbacks feedback);
	

}
