package com.test.demo


	def fruits = ["Apples","Oranges","Grapes","Mangoes"]
	
	println fruits //[Apples, Oranges, Grapes, Mangoes]
	println fruits[1] //Oranges
	println fruits.get(2) //Grapes
	
	//nested list or //heterogeneous list
	
	def myList = [1,2,3,['A','B',"Groovy"],4,5] //size=6
	
	println myList[2] //3
	println myList[3] //[A, B, Groovy]
	println myList[3][0] //A
	println myList.get(3).get(1) //B
	
	
	println myList[0..2] //[1, 2, 3]
	println myList[5..0] //[5, 4, [A, B, Groovy], 3, 2, 1]
	
	println myList.contains(2) //true
	println myList.contains("Groovy") //false
	println myList[3].contains("Groovy") //true
	
	println myList.size() //6
	println myList[3].size() //3--> size of internal list
	
	myList.add(7)
	println myList //[1, 2, 3, [A, B, Groovy], 4, 5, 7]
	
	myList<<10
	println myList //[1, 2, 3, [A, B, Groovy], 4, 5, 7, 10]

	myList.add(2, 22)
	println myList //[1, 2, 22, 3, [A, B, Groovy], 4, 5, 7, 10]
	
	myList.remove(2)
	println myList //[1, 2, 3, [A, B, Groovy], 4, 5, 7, 10]
	
	myList = myList + [30,40]
	println myList //[1, 2, 3, [A, B, Groovy], 4, 5, 7, 10, 30, 40]
	
	myList = myList.plus(50)
	println myList //[1, 2, 3, [A, B, Groovy], 4, 5, 7, 10, 30, 40, 50]
	
	myList = myList - [30,40]
	println myList   //[1, 2, 3, [A, B, Groovy], 4, 5, 7, 10, 50]
	
	myList = myList.minus(50)
	println myList //[1, 2, 3, [A, B, Groovy], 4, 5, 7, 10]
	
	myList.pop()//it removes first element
	println myList //[2, 3, [A, B, Groovy], 4, 5, 7, 10]
	
	myList.removeLast()
	println myList //[2, 3, [A, B, Groovy], 4, 5, 7]
	
	println myList.intersect([1,2,3]) //[2, 3]
	
	myList = myList.reverse()
	println myList //[7, 5, 4, [A, B, Groovy], 3, 2]
	
	myList = myList.sort()
	println myList //[2, 3, 4, 5, 7, [A, B, Groovy]]
	
	println myList.isEmpty() //false
	myList.clear()
	println myList.isEmpty() //true
	
	

	