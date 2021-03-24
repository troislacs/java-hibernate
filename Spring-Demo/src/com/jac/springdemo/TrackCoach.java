package com.jac.springdemo;

public class TrackCoach implements ICoach {

	private IFortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just DO It: " + fortuneService.getFortune();
	}

}
