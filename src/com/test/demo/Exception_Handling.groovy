package com.test.demo

/* valid combination---> try-catch, try-catch-finally, try-finally
 *  finally block will be executed in any case even there is an exception occurring or not
 */


try {
	
	int i =1/0
}

catch(ArithmeticException e)
{
	println "catch block to catch Arithmetic exception"
}


catch(Exception exp)
{
	println "I am inside a exception block" //I am inside a exception block
    println exp.getCause() //null
	println exp.getMessage() /// by zero
	
	//exp.printStackTrace()
	
}

finally
{
	println "I am inside a finally block"
}

println "Printing another set of code"
