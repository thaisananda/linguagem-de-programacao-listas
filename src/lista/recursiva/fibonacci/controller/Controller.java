package lista.recursiva.fibonacci.controller;

public class Controller {
	
	public static int CalcFibonacci(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return CalcFibonacci(n - 1) + CalcFibonacci(n - 2);
	}

}
