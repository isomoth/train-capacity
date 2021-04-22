package train;

import java.util.Scanner;

public class Train {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		This program was written for an imaginary train system. 
//		It verifies if the amount of passengers is appropriate, depending on the train's capacity. 
		
		// All variables are given as integers: 
		int capacity, totalStations, passengerOut, passengerIn, stay;
		// The train starts the train empty
		capacity = totalStations = passengerOut = passengerIn = stay = 0; 
		
		System.out.println("PASSENGER CHECK-UP");
		System.out.println("Fill in the train's capacity: ");
		capacity = input.nextInt();
		System.out.println("Nr. of stations: ");
		totalStations = input.nextInt();
		
		int i = 0; 
		while (i < totalStations) {

			//  Input at every station: 
			for (int j = 0; j < totalStations; j++) {
				System.out.println("Nr. of passengers that got off: ");
				passengerOut = input.nextInt();
				System.out.println("Nr. of passengers that got in: ");
				passengerIn = input.nextInt();
				System.out.println("Nr. of passengers that stayed at the station: ");
				stay = input.nextInt();
				
				// When the passenger has gotten off, the capacity increases: 
				capacity += passengerOut;
				// When the passenger has gotten off, the capacity decreases:  
				capacity -= passengerIn;
				// Finally, the passengers that had stayed at the station:  
				capacity -= stay; 
				System.out.println("-------------");
			}
			
			// Check if boarding is allowed 
			if (passengerOut >= capacity && passengerIn <= capacity) {
				System.out.println("Boarding allowed");
			}
			else 
				System.out.println("Boarding not allowed");
			break;
		}
		input.close();
	}
}

