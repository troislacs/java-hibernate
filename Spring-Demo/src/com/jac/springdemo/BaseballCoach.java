package com.jac.springdemo;

public class BaseballCoach implements ICoach {
	
	// define a private field for dependency
		private IFortuneService fortuneService;
	
	// define a constructor for dependency
		public BaseballCoach(IFortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
			
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}

