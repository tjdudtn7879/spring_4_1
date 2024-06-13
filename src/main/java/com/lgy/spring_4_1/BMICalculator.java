package com.lgy.spring_4_1;

public class BMICalculator {
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;
	
	
	public void bmiCalculation(double weight, double height) {
		double h = height *0.01;
		double result = weight / (h*h);
		
		System.out.println("BMI 지수 : "+(int)result);
		
		if (result > obesity) {
			System.out.println("비만skirrrrrr.");
		}else if(result > overWeight) {
			System.out.println("과체중skirrrrr.");
		}else if(result > normal) {
			System.out.println("정상수.");
		}else {
			System.out.println("저체중skirrrrrr.");
		}
	}
	
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	
}
