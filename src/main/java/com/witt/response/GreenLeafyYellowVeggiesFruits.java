package com.witt.response;

public class GreenLeafyYellowVeggiesFruits implements RecommendedDietRequirements {

	@Override
	public int getRequiredDailyUse() {
		return 4;
	}

	@Override
	public boolean hasCompletedDailyUse() {
		return false;
	}

}
