package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		
		// Shift b seven bits to the right
		int bShifted;
		bShifted=b>>7;
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		bShifted=bShifted&1;
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(bShifted);
		//Use this method to print the remaining 7 bits of b
		bShifted=b>>6;
		bShifted=bShifted&1;
		System.out.print(bShifted);
		bShifted=b>>5;
		bShifted=bShifted&1;
		System.out.print(bShifted);
		bShifted=b>>4;
		bShifted=bShifted&1;
		System.out.print(bShifted);
		bShifted=b>>3;
		bShifted=bShifted&1;
		System.out.print(bShifted);
		bShifted=b>>2;
		bShifted=bShifted&1;
		System.out.print(bShifted);
		bShifted=b>>1;
		bShifted=bShifted&1;
		System.out.print(bShifted);
		bShifted=b&1;
		System.out.println(bShifted);
		
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte one;
		byte two;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		one=(byte)(s>>8);

		/*
		 * 10101
		 * 01011
		 * 11111
		 * 
		 */
		

		// 00000000 00000000
		// 00000000 11111111
		
		two=(byte)(s & 0b11111111);
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(one);
		printByteBinary(two);
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		short one;
		short two;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		one=(byte)(i>>16);
		two=(byte)(i&65535);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(one);
		printShortBinary(two);
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int one;
		int two;
		one=(byte)(l>>32);
		two=(byte)(l&4294967295);
		printIntBinary(one);
		printIntBinary(two);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter bPrint=new BinaryPrinter();
		//bPrint.printByteBinary((byte)23);
		System.out.println();
		//bPrint.printShortBinary((byte)(76));
		System.out.println();
		bPrint.printIntBinary((byte)(34));
		
	}
}
