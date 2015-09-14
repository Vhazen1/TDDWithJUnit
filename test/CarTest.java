import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CarTest {

	@Test 
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}
	
	@Test 
	public void canAccelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}
	
	@Test
	public void cannotAccelerateBeyondMaxSpeed(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}
	
	@Test 
	public void canDoToString(){
		Car car1 = new Car("Red", 100);
		assertThat(car1.toString(), is("Color: Red, Speed: 0"));
	}

	// Create and pass test for deceleration.
	public void decelerate(int amount){
		this.speed -= amount;
		if(this.speed - amount < 0) {
		this.speed = 0;
		}else{
			this.speed -= amount;
		}
	   }
	
	public void decelerate(int amount){
		this.speed -= amount;
		if(this.speed - amount < 0){
			this.speed = 0;
		}else{
			this.speed -= amount;
		}
	}
	
	// Create and pass test for no deceleration below 0.
	
	public void accelerate(int amount){
		this.speed -= amount;
		if(this.speed - amount <=10){
			this.speed = 10;
		}else{
			this.speed -= amount;
		}
	}

	
<<<<<<< HEAD
	
}
=======

>>>>>>> test2
