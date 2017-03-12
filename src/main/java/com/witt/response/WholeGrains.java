package com.witt.response;

public class WholeGrains implements RecommendedDietRequirements {


	@Override
	public int getRequiredDailyUse() {
		return 6 ;
	}

	@Override
	public boolean hasCompletedDailyUse() {
		return false;
	}

}
