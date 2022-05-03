package com.test.demo

//1.Method without parameter
def printHello(){
	
	println "Hello..."	
}

//calling method 
printHello()

//2.Method with parameter
def sum(int a,int b)
{
	int c = a+b
	println "sum is:"+c
}

sum(10, 5)//15

//3.method with default parameter
def add(int a=10,int b=30)
{
	println "addition:"+(a+b)
}

add()//40

//4.method with mixed parameter
def sub(int a,int b=5)
{
	println "subtraction:"+(a-b)
}

sub(15)//10
sub(15,10)//5

//5.method with return type
def myMethod(int a,int b)
{
	int c=a+b
	return c
}

int result = myMethod(50, 10)
println "result is:"+result

