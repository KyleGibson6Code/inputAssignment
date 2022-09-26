package javaVariables;
import java.util.Scanner;
public class workAround {

	public static void main(String[] args) {
		
		Scanner user_input=new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter two numbers on the console:");
num1=user_input.nextInt();
num2=user_input.nextInt();

System.out.print("\nAddition :"+(num1+num2));



System.out.print("\nSubtraction :"+(num1-num2));


System.out.print("\nMultiplication :"+(num1*num2));



System.out.print("\nDivision :"+(num1/num2));




System.out.println("\nModulo :"+(num1%num2));


Scanner name =new Scanner(System.in);
System.out.println("Type your name to see it capitalized");
String nameUpper= name.nextLine();

System.out.println(nameUpper.toUpperCase());


System.out.println("Now type your name to see it in all lower case");
String nameLower=name.nextLine();
System.out.println(nameLower.toLowerCase());

System.out.println("Type a word to see how many charachters it has");
String word=name.nextLine();
System.out.println(word.length());


System.out.println("Type a word to see the first charachter of the word");
String first=name.nextLine();
System.out.println(first.charAt(0));

System.out.println("Enter a String with extra spaces ");
String space=name.nextLine();
System.out.println(space.trim());


System.out.println("What is your name?");
String person=name.nextLine();
Scanner input=new Scanner(System.in);

System.out.println("What is your age");
String age=input.nextLine();

System.out.println("What year were you born");
String year=input.nextLine();

System.out.println(" Hello " + person + " You are " + age + " You were born in the year "
		+ year);

		












		
		
		
		
		
		
		
		
		
		
		
		
		
}
}