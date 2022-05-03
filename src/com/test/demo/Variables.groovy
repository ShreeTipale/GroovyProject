package com.test.demo

class Variables {
	
	//groovy is case sensitive like java
	//How to define variables in groovy
	//To name variables we can use--> letters,underscore,combination of letters,digits and underscore
	//first letter should be a character or underscore but not the digit
	
	//groovy is dynamically typed language...that is type of variable is resolved at runtime
	
	static void main(args) {
		
	
	def name = "Shree"
	String str = "Tipale"
	int a = 100
	float b = 20
	double c = 30
	
	println name
	println str
	println 'My Name is ${name}'
	
	println "My Name is ${name}"
	
	println a
	println b
	println c
	
	//groovy is dynamically typed language...that is type of variable is resolved at runtime
	def phone = "Realme"
	phone = "Samsung"
	
	println phone //Samsung
	
	
	//Assign multiple value to different variables in a single line 
	
	def (String e,int f, double g) = ["shree",50,60]
	println e
	println f
	println g
	

	}
	
}
