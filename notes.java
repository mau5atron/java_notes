// single line comment 

/*
*
* multi line comment
*
*/ 

// You can import libraries 

import java.util.Scanner;
import java.util;

// A class defines the attributes (fields) - kinda like in a golang - 
// and capabiilities (methods) of a real world object

public class Animal {
	// static means this number is shared by all objects of type animal
	// final means that this value can't be changed

	public static final double FAVNUMBER = 1.6180;




	// Variables (Fields) start with a letter, underscore or $
	// Private fields can only be accessed by other methods in the class

	// Strings are objects taht hold a series of characters 
	private String name;

	// An integer can hold values from -2^31 to 2^31 -1
	private int weight;

	// Booleans have a value of true or false 
	private bootlean hasOwner = false;

	// Bytes can hold the values between -128 to 127
	private byte age;

	// Longs can hold the values between -2^63 to 2^63 -1
	private long uniqueID;

	// Chars are unsigned ints that represent UTF-16 codes from 0 to 65,535
	private char favoriteChar;

	// Doubles are 64 bit IEEE 754 floating points with decimal values 
	private double speed;

	// Floats are 32 bit IEEE 754 floating points with decimal values 
	private height;




	// Static variables have the same value for every object
	// Any variable or function that does not make sense for an obejct
		// to have should be made static

	// Protected means tha this value can only be accessed by other code 
		// in the same package
	// or by subclasses in other packages 
	protected static int numberOfAnimals = 0;

	// A scanner object allows you to accept user input from the keyboard
	static Scanner userInput = new Scanner(System.in);

	// Any time an Animal object is created this function called the constructor
		//  is called

	// initialize the Animal object with the line below
	public Animal(){
		// Shorthand for numberOfAnimals = numberOfAnimals + 1;
		numberOfAnimals++;

		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sunOfNumbers);

		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);

		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);

		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);

		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);





		// Print is used to print to the screen, but it does not
			//  end with a newline \n
		System.out.print("Enter the name: \n");

		// The 'if' statement performs the actions between the {} if the condition
			// is true

		// userInput.hasNextLine(); returns true if a String was entered in the keyboard

		if(userInput.hasNextLine()){

			// 'this' provides you with a way to refer to the object itself
			// userInput.nextLine() returns the value that was entered at the keyboard

			this.setName(userInput.nextLine());

			// hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean, 
				// hasNextByte, hasNextLong, nextInt, nextDouble, nextFloat, nextBoolean, etc.
		}

		this.setFavoriteChar();
		this.setUniqueID();
	}	
}







// It is good to use getter and setter methods so that you can protect
	//  your data
// In Eclipse right click => Source => Generate getter and setters 

public String getName(){
	return name;
}

public void setName(String name){
	this.name = name;
}

public int getWeight(){
	return weight;
}

public void setWeight(int weight){
	this.weight = weight;
}

public boolean isHasOwner(){
	return hasOwner;
}

public void setHasOwner(boolean hasOwner){
	this.hasOwner = hasOwner;
}

public byte getAge(){
	return age;
}

public void setAge(byte age){
	this.age = age;
}

public long getUniqueID(){
	return uniqueID;
}







// Method overloading allows you to accept different input with the same 
// method name


public void setUniqueID(long uniqueID){
	this.uniqueID = uniqueID;
	System.out.println("Unique ID set to: " + this.uniqueID);
}

public void setUniqueID(){
	long minNumber = 1;
	long maxNumber = 100000;


	// generates a random number between 1 and 100000
	this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));


	// You can cast from one primitive value into another by putting what you want
		// between ( )

	// (byte) (short) (long) (double)
	// (float), (boolean) & (char) don't work
	// (char) stays as a number instead of a character 

	// You convert from a primitive to a string like
	String stringNumber = Long.toString(maxNumber);


	// Byte.toString(bigByte); 
	// Short.toString(bigShort);
	// Integer.toString(bigInt);
	// Float.toString(bigFloat);
	// Double.toString(bigDouble);
	// Boolean.toString(trueOrFalse);
	


	// You convert from a String to a primitive like this.
	int numberString = Integer.parseInt(stringNumber);


	// parseShort
	// parseLong
	// parseByte
	// parseFloat 
	// parseDouble
	// parseBoolean
	System.out.println("Unique ID set to: " + this.uniqueID);
}


public char getFavoriteChar(){
	return favoriteChar;
}

public void setFavoriteChar(char favoriteChar){
	this.favoriteChar = favoriteChar;
}

public void setFavoriteChar(){
	int randomNumber = (int) (Math.random() * 126) + 1;
	this.favoriteChar = (char) randomNumber;


	// if then else statement
	// > < == != >= <= 
	if(randomNumber == 32){
		System.out.println("Favorite character set to: Space");
	} else if(randomNumber == 10){
		System.out.println("Favorite character set to: New Line");
	} else {
		System.out.println("Favorite character set to: " + this.favoriteChar);
	}







	// Logical operators 

	// ! : converts the boolean value to its right to its opposite 
		// from: true => false

	// & : Returns true if boolean value on the right and left are both true
		// (always evaluates both boolean values)
	// && (and) : Returns true if boolean value on the right and left are both true
		// (stops evaluating after first false)
	// | (or) : Returns true if either boolean value on the right or left are true 
		// (stops evaluating after first true)
	// ^ : Returns true if there is 1 true and 1 false boolean value on the right or left


	if((randomNumber > 97) && (randomNumber < 122)){
		System.out.println("Favorite character is a lowercase letter");
	}	

	if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))){
		System.out.println("I turned false to " + !false);
	}

	if(!false){
		System.out.println("I turned false to " + !false);
	}

	// The ternary operator assigns one or another value based on a condition 
	int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

	System.out.println("The biggest number is " + whichIsBigger);

	

	// The switch statement is great for when you have a limited number of values
		// and the values are int, byte, or char unless you have Java 7 which allows strings

	switch(randomNumber){
		case 8 : 
		System.out.println("Favorite character set to: Backspace");
		break;

		case 9 : 
		System.out.println("Favorite character set to: Horizontal tab");
		break;

		case 10 : 
		case 11 : 
		case 12 : 
			System.out.println("Favorite character set to: Something else weird");
		break;

		default : 
			System.out.println("Favorite character set to: " + this.favoriteChar);
		break;
	}
}





public double getSpeed(){
	return speed;
}

public void setSpeed(double speed){
	this.speed = speed;
}

public float getHeight(){
	return height;
}

public void setHeight(float height){
	return numberOfAnimals;
}



// Since numberOfAnimals is Static you must set the value using the class name
public void setNumberOfAnimals(int numberOfAnimals){
	Animal.numberOfAnimals = numberOfAnimals;
}

protected static void countTo(int startingNumber){
	for(int 1 = startingNumber; i <= 100; i++){
		// continue is used to skip 1 iteration of the loop
		if(i == 90)continue;
		System.out.println(i);
	}
}

protected static String printNumbers(int maxNumbers){
	int i = 1;
	while(i < (maxNumbers / 2)){
		System.out.println(i);
		i++;

		// This is not needed, but if you want to jump out of a loop use break
		if(i == (maxNumbers/2)) break;

		Animal.countTo(maxNumbers/2);

		// You can return a value like this
		return "End of printNumbers()";
	}

	protected static void guessMyNumber(){
		int number;


		// Do while loops are used when you want to execute the code in the braces at least once;

		do {
			System.out.println("Guess my number up to 100");

			// If the input entered is not a number send a warning 
			while(!userInput.hasNextInt()){
				String numberEntered = userInput.next();
				System.out.printf("%s is not a number\n", numberEntered);
			}
			number = userInput.nextInt();
		} while(number != 50);
		System.out.println("Yes the number was 50");
	}

	// This will be used to demonstrate polymorphism

	public String makeSound(){
		return "uwu";
	}

	// With polymorphism we can refer to any Animal and yet use overriden methods
		// in the specific animal type
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says" + randAnimal.makeSound());
	}

	// public allows other classes to use this method 
	// static means that only a class can call for this to execute 
	// void means it doesn't return a value when it finishes executing 
	// This method can accept Strings that can be stored in the String array args
		// when it is executed

	public static void main (String[] args){
		Animal theDog = new Animal();

		System.out.println("The animal's name is " + theDog.getName());

		System.out.println(Animal.printNumbers(100));

		Animal.countTo(100);

		Animal.guessMyNumber();

		// An array is a fixed series of boxes that contain multiple values of 
			// the same data type 
		// How you create arrays 
		// int[] favoriteNumbers;
		// favoriteNumbers = new int[20];

		int[] favoriteNumbers = new int[20];

		favoriteNumbers[0] = 100;

		String[] stringArray = {"Random", "Words", "Here"};

		// for(dataType[] varForNow) : arrayName)
		for(String word : stringArray){
			System.out.println(word);
		}

		// this is a multidemnsional array 
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~
		String[][][] arrayName = {
			{
				{"000"}, 
				{"100"}, 
				{"200"}, 
				{"300"}
			},
			{
				{"010"},
				{"110"},
				{"210"},
				{"310"}
			}, 
			{
				{"020"},
				{"120"},
				{"220"},
				{"320"}
			}
		};
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~
		for(int i = 0; i < arrayName.length; i++){
			for(int j = 0; j < arrayName[i].length; j++){
				for(int k = 0; k < arrayName[i][j].length; k++){
					System.out.print("| " + arrayName[i][j][k] + " ");
				}
			}
			System.out.println("|"); 
		}

		// Different ways to print out the array 
		// You can copy an array (stringToCopy, indexes to copy)
		String[] cloneOfArray = Arrays.copyOf(stringArray, 3);

		// You can print out the whole array 
		System.out.println(Arrays.toString(cloneOfArray));

		// Returns the index or a negative number
		System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));

	}

} 



















