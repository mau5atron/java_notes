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




	


}
