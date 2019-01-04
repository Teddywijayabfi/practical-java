package com.course.practicaljava.rest.service;

import java.util.List;

import com.course.practicaljava.rest.domain.Car;

public interface CarService {
	
	List<String> BRANDS = List.of("Toyota","Honda","Ford");
	List<String> Colors = List.of("Red","Black","White");
	List<String> Types = List.of("Sedan","SUV","MPV");
	
	Car generateCar();
}
