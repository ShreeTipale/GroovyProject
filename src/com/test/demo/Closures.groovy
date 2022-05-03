package com.test.demo

//closure without parameter
def myClosure1 = {println "Hello world..."}
myClosure1.call()

//closure with parameter
def str = "Hi.."
def myClosure2 = {name -> println "$str $name"}
myClosure2.call("Shree") //Hello Shree


// we can not do like below:
//for that we have to create instance of the class then call the method and variables
//def myMethod()
//{
//	println str
//}
//myMethod()//Caught: groovy.lang.MissingPropertyException:

//passing closures as variables in methods
def myMethod(clos)
{
	clos.call("dkj")
}

myMethod(myClosure2)

//multiple parameter in closure
def myClosure3 = {
	a,b,c ->
	return (a+b+c)
	}
def res = myClosure3(10,20,30)
println res

//list of closure
def myList = ["Apple","Orange","Grapes","Coconut","Mango"]
println myList.each { it }

//map in closure
def myMap = [  
	            "Class"   : "Auromation",
	            "Subject" : "Groovy"
			   ]
			   
println myMap.each { it }

def myList2 = [1,2,3,4,5]

println myList2.find { item -> item == 3 } //3
println myList2.findAll()//[1, 2, 3, 4, 5]
println myList2.each { it } //[1, 2, 3, 4, 5]
println myList2.findAll { item -> item >3 } //[4, 5]

println myList2.any()//true
println myList2.any { item -> item >3 } //true
println myList2.every { item -> item >3 } //false--> every item should be grater than 3

println myList2.collect{item -> item*2} //[2, 4, 6, 8, 10]
