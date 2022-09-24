package hwfunc;

import java.util.function.IntConsumer;

public class EvenNumberOperationsWithLambda {

	private static int total;
	private static int product = 1;
	private static int[] squares = new int[5];

	public static void main(String[] args) {
	IntConsumer printer = (i) -> System.out.print(i + " ");
	pickEvenNumber(10, printer);
	
	System.out.println();
	
	IntConsumer additionOperation = i -> total += i;
	pickEvenNumber(10,additionOperation);
	System.out.println("Sum: " + total);

	
	IntConsumer mult = i -> product *=i;
	pickEvenNumber(10,mult);
	System.out.println("Mult: " + product);
	
	
	IntConsumer squareOperation =  i -> squares[i/2-1] = i * i;
	pickEvenNumber(10,squareOperation);
	
	System.out.print("Squares: ");
	for(int i : squares)
		
		printer.accept(i);
}

public static void pickEvenNumber(int n, IntConsumer operation) {
	for (int i = 2; i <= n; i += 2) 
		operation.accept(i);
	
}
}