package day9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringAutoWireConfig {

	@Bean
	public MusicSystem getMusicSystem() {
		MusicSystem ms = new MusicSystem("Sony", "Dolby");
		return ms;
	}
	
	@Bean
	public MusicSystem getMusicSystem2() {
		MusicSystem ms = new MusicSystem("Panasonic", "Mono");
		return ms;
	}
	
	@Bean
	public Engine getEngine() {
		Engine eng = new Engine("Petrol", "1200 CC");
		return eng;
	}
	
	@Bean("myCar")
	public Car getCar() {
		Car carObj = new Car();
		carObj.setMake("Hyundai");
		carObj.setModel("I 20");
		carObj.setPrice(675000);
		//Values for musicSystemDetails and engineDetails have not been set.
		//Spring will auto wire them
		return carObj;
	}
}
