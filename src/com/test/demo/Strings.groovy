package com.test.demo

//def name = "Shree"
//println name
//println "My name is "+name
//println "My name is ".concat(name)
//
//println "My name is ${name}"
//println "my name is $name"
//
//def s1 = '''This is my class
//and I love it'''
//
//println s1
//
//def s2 = """I have a graduation degree &
//I am a mechanical engineer """
//
//println s2  // I have a graduation degree &
             // I am a mechanical engineer 


//def name = "Shree"
//
//println name.length()  //5
//println name[2]  //r
//println name[-2]  //e
//println name.indexOf('S')  //0
//
//println name[0..2] //Shr
//println name[4..0] //eerhS
//println name[0,2,3] //Sre
//
//println name.substring(2) //ree
//println name.subSequence(0, 2) //Sh---begin index included and end index excluded
//println name.substring(0, 2)  //Sh---begin index included and end index excluded

//def str = "This is a groovy class"
//
//println str.split(" ") //[This, is, a, groovy, class]
//println str-("groovy ") //This is a class
//println str.replace("class", "session") //This is a groovy session
//
//println str.toLowerCase() //this is a groovy class
//println str.toUpperCase() //THIS IS A GROOVY CLASS
//
//println str.toList() // [T, h, i, s,  , i, s,  , a,  , g, r, o, o, v, y,  , c, l, a, s, s]
//
//println "Groovy " * 3 //Groovy Groovy Groovy 
//
//println "abc".equals("abc") //true
//println "abc".equals("ABC") //false
//println "Abc".equalsIgnoreCase("abc") //true

def name = "Shree"
def s1 = /My name is $name/
def s2 = $/a blue sky /$ +name

println s1 //My name is Shree
println s2 //a blue sky Shree

def s3 = "My name is \"Aarush\""
println s3  // My name is "Aarush"

def s4 = /My name is "Anu"/
println s4 //My name is "Anu"


