package com.witt.response;

public class PrenatalVitamin implements RecommendedDietRequirements{

	@Override
	public int getRequiredDailyUse() {
		return 1 ;
	}

	@Override
	public boolean hasCompletedDailyUse() {
		return false;
	}
	
}
