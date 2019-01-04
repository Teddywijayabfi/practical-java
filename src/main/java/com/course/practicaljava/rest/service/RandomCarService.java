package com.course.practicaljava.rest.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.course.practicaljava.rest.domain.Car;

@Service
public class RandomCarService implements CarService {

	private Random random = new Random();
	
	@Override
	public Car generateCar() {
		var randomBrand = BRANDS.get(random.nextInt(BRANDS.size()));
		var randomColor = Colors.get(random.nextInt(Colors.size()));
		var randomType = Types.get(random.nextInt(Types.size()));
		
		var car = new Car(randomBrand, randomColor, randomType);
		
		return car;
	}

}
