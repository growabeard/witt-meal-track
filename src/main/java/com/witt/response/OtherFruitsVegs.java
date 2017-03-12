package com.witt.response;

public class OtherFruitsVegs implements RecommendedDietRequirements {

	@Override
	public int getRequiredDailyUse() {
		return 2;
	}

	@Override
	public boolean hasCompletedDailyUse() {
		return false;
	}

}
