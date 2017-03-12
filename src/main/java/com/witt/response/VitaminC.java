package com.witt.response;

public class VitaminC implements RecommendedDietRequirements {

	@Override
	public int getRequiredDailyUse() {
		return 3;
	}

	@Override
	public boolean hasCompletedDailyUse() {
		return false;
	}

}
