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








