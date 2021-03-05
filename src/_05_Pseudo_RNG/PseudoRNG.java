package _05_Pseudo_RNG;

public class PseudoRNG {
	/*
	 * It is impossible for a computer to come up with a series of numbers 
	 * that are truly random. They can, however, use mathematical algorithms
	 * to generate numbers that can seem random. These are called pseudo random 
	 * numbers.
	 * 
	 */
	
	//1. Create a member variable of type long called "seed"
	long seed;
	//2. Make a constructor that initializes the memeber variable
	public PseudoRNG(long seed) {
		this.seed=seed;
	}
	//3. Complete the steps inside the xorShift method
	
	//4. Complete the steps in the main method
	
	//5. Write your own pseudo random generation method. You can use the xor
	//    shift as a guide. Use the main method to test it.
	
	
	
	// This is called the xor shift. It is a very simple algorithm to generate
	// Pseudo random numbers. 
	long xorShift(){
		//1. Create a local long called seed and set it equal to the member variable 
		//   We will only use the local variable for the rest of the method
		long seeds=seed;
		//2. Shift seed to the left 13 bits and save the result
		long a=seed<<13;
		//3. xor seed by the result of step 1 and save that result
		long b=seeds^a;
		//4. Set seed equal to the result of step 2
	seeds=b;
		//5. Shift seed to the right 7 bits and save the result
		long c=seeds>>7;
		//6. xor seed by the result of step 4 and save that result
				long d=seeds^b;
		//7. Set seed equal to the result of step 5
		seeds=c;
		//8. Shift seed to the left 17 bits and save the result
		long e=seeds<<17;
		//9. xor seed by the result of step 7 and save that result
				long f=seeds^c;
		//10. Set seed equal to the result of step 8
		seeds=e;
		//11. change the line below to return seed
		seed = seeds;
		return seeds;
		
		//For fun, see if you can rewrite the method using only 4 lines of code
	}
	
	
	
	public static void main(String[] args) {
	
		//1. Create a PseudoRNG object with any seed. 
		long x=6;
		PseudoRNG yay=new PseudoRNG(System.currentTimeMillis());
		//2. Print the result of xorShift() 3 times and note the random numbers. 
		System.out.println(yay.xorShift());
		System.out.println(yay.xorShift());
		System.out.println(yay.xorShift());
		System.out.println(yay.xorShift());
		
	
		
		//3. Create a secon PSeudoRNG object with a different seed and print the result of xorShift 3 times.
		long y=10;
		PseudoRNG yayyay=new PseudoRNG(y);
		//4. Run the tests a second time and notice that 3 random numbers are the same because the seed generates the same sequence of random numbers.
		System.out.println(yayyay.xorShift());
		//If you would like to set the seed with a number that is hard to predict, you can use System.currentTimeMillis().
	System.currentTimeMillis();
	}
}


