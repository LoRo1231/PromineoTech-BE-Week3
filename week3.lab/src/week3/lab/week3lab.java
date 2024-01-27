package week3.lab;

public class week3lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

		
			int [] myArray = {1, 5, 2, 8, 13, 6};
			
			
		// 2. Print out the first element in the array
	
			System.out.println(myArray[0]);
			
			
		// 3. Print out the last element in the array without using the number 5
		
			System.out.println(myArray[myArray.length-1]);
			
			
		// 4. Print out the element in the array at position 6, what happens?

			
			//System.out.println(myArray[6]); - exception is thrown
			
			
		// 5. Print out the element in the array at position -1, what happens?

			
			//System.out.println(myArray[-1]); - exception is thrown
			
			
		// 6. Write a traditional for loop that prints out each element in the array
	
			for(int i = 0; i < myArray.length; i++) {
				System.out.print(myArray[i] + ", ");
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array

			System.out.println(" "); //space
			
			
			for(int num : myArray) {
				System.out.print(num + ", ");
			}
			
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum

			System.out.println(" "); //space
			
			
			int sum = 0;
			
			for(int i = 0; i < myArray.length; i++) {
				sum += myArray[i];
			}
			
			System.out.println(sum);
			
			
		// 9. Create a new variable called average and assign the average value of the array to it

			
			double average = (sum / myArray.length);
			
			System.out.println(average);
			
			
			
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
	
			
			for(int odd : myArray) {
				if(odd % 2 != 0) {
					System.out.print(odd + ", ");
				}
			}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

			String [] names = {"Sam", "Sally", "Thomas", "Robert"};
			
		
		// 12. Calculate the sum of all the letters in the new array

			System.out.println(" "); //space
			
			
			int letterSum = 0;
			
			for(String name : names) {
				letterSum += name.length();
			}

			System.out.println(letterSum);
			
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			
			
			
			 // THIS WILL BE CREATED OUTSIDE THE MAIN METHOD - SCROLL DOWN
			
			greet("Tom");
			greet("Logan");
			

		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

			String greeting = greet2("Hannah");
			System.out.println(greeting);
			
			
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
					
		//		b. What do you find? 
			
			// when returning something we need to set to a variable to use.
			
		//		c. How are they different?
		
			// first prints in the method when it is called on
			// second returns a vale but doesn't do anything with it
			
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
			boolean isGreater = greaterThan("Bananas",3);
			System.out.println(isGreater);
			
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
			String[] gymEquipment = {"Barbell", "Kettlebell", "Dumbbell"};
			
			System.out.println(sameString(gymEquipment, "Kettlebell"));
			
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
			int [] numbers = {10, 30, 11, 22, 8};
			
			System.out.println(smallestNumber(numbers));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
			double [] doubleNumbers = {23.56, 87.90, 12.14, 66.40};
			System.out.println(calAverage(doubleNumbers));
			
			
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

			String [] strings = {"cat", "dog", "cow", "mouse"};
			System.out.println(stringLength(strings));
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		
		
	}
	
	// Method 13.
	
		public static void greet(String name) {
			System.out.println("Hello, " + name);
		}
		
	// Method 14.
		
		public static String greet2(String name) {
			return "Hi, " + name;
		}
		
	// Method 15.
		
		public static boolean greaterThan(String fruit, int buying) {
			if(fruit.length() > buying) {
				return true;
			} else {
				return false;
			}
		}
		
	// Method 16.
		
		public static boolean sameString(String[] array, String string) {
			for(String str : array) {
				if(str.equals(string)) {	
					return true;
				}
			}
			return false;
		}
		
	// Method 17.
		
		// set variable "smallest" to the number in the first position of the array.
		// an enhanced for loop checks if the numbers in the array are less than the first number
		// yes true, set the variable smallest to that number & return that number.
		
		public static int smallestNumber(int[] numbers) {
			int smallest = numbers[0];
			for(int num : numbers) {
				if(num < smallest) {
					smallest = num;
				}
			}
			return smallest;
		}
		
	// Method 18.
		
		public static double calAverage(double[] doubleNumbers) {
			double sum = 0.00;
			for(double number : doubleNumbers) {
				sum += number;
			}
			double average = sum / doubleNumbers.length;
			return average;
		}
		
	// Method 19.
		
		public static int[] stringLength(String[] strings) {
			int [] stringNum = new int [strings.length];
			
			for(int i = 0; i < strings.length; i++) {
				stringNum[i] = strings[i].length();
			}
			return stringNum;
		}

}
