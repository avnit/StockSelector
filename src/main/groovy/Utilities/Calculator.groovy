package Utilities

class Calculator {
	 def input_one	
	 def input_two 
	 def operator
	 
	 public def operatoe() {
		 def result 
		 switch (operator) {
			 case "+":
			 result = add()
			 case "-":
			 result = sub()
			 
			case "*" : 
			result = multiply()
			case "/" :
			result =divide()
			 
			 
		 }
		 return result
	 }
	 
	 public def add() {
		 return input_one + input_two
	 }
	 public def sub() { 
		 return input_one - input_two 
	 }
	 public def multiply() { 
		 return input_one * input_two
	 }
	 
	 public def divide() { 
		 return input_two == 0 ? 0 :input_one / input_two 
	 }

}
