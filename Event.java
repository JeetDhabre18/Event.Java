
import java.util.*;

public class Event {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Choose your college");
		System.out.println("a. Pit");
		System.out.println("b. Piet");
		
		String collegename=sc.nextLine();
		switch(collegename){
			case "a":
				System.out.println("1.PIT");
				System.out.println("choose your department");
				
			    System.out.println("1. CSE");
			    System.out.println("2. CIVIL");
			    System.out.println("3. MECHANICAL");
			    String Department=sc.nextLine();
			    switch(Department) {
			    case "1":
			    	System.out.println("CSE");
			    	System.out.println("choose your specialization in cse");
			    	System.out.println("1.AI");
			    	System.out.println("2.IOT");
			    	System.out.println("3.CYBER");
			    	String Specialization=sc.nextLine();
			    	switch (Specialization) {
			    	case "1":
			    		System.out.println("AI");
			    		System.out.println(" choose an event in AI");
			    		System.out.println("1. neutral networks");
			    		System.out.println("2.Devops");
			    		String event=sc.nextLine();
			    		switch(event) {
			    		case"1":
			    			
			    			System.out.println("venue is pit room no 360");
			    			break;
			    		case "2":
			    			System.out.println("venue is at 361");
			    		}
			    		
			    		break;
			    	case "2":
			    		System.out.println("IOT");
						System.out.println("choose an event in IOT");
						System.out.println("1. IOT enterpreneur ideas evolution");
						System.out.println("2.iot best global speakers");
						event=sc.nextLine();
						switch(event){
						case "1":
						    System.out.println("events is at pit seminar hall at 10.30 to 12.30");
							break;
						case "2":
                            System.out.println("events is at pit seminar hall 1.00 to 3.00pm");
							break;
						}
						
						     
			    		break;
			    	case"3":
			    		System.out.println("CYBER");
						System.out.println("choose an event in Cyber");
						System.out.println("1.cyber security talks");
						System.out.println("2.introduction to kali linux");
						event=sc.nextLine();
						switch(event){
						case "1":
						    System.out.println("events is at 371 at 10.30 to 12.30");
							break;
						case "2":
                            System.out.println("events is at  302 1.00 to 3.00pm");
							break;
						}
			    		break;
			    	}
			    	break;
			    case "2":
			    	System.out.println("civil");
					System.out.println("choose your specialization in civil engineering");
					System.out.println("1.Infrastructural engineering");
					System.out.println("2.Environmental engineering");
					System.out.println("3.Geotechnical engineering");
					Specialization=sc.nextLine();
					switch (Specialization) {
						case "1":
							System.out.println("1.Infrastructral enginnering");
							System.out.println(" choose an event in Infrastructral enginnering");
							System.out.println("1. Orientation program");
							System.out.println("2.Infrastructure Models");
							String event=sc.nextLine();
							switch(event) {
							case"1":
								
								System.out.println("venue is pit room no 310");
								break;
							case "2":
								System.out.println("venue is at 362");
							}
							
							break;
						case "2":
							System.out.println("Environment engineering");
							System.out.println("choose an event in Environment engineering ");
							System.out.println("1.Orientation program ");
							System.out.println("2.Overcome the problem of environment");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at pit civil hall at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at pit near garden area 1.00 to 3.00pm");
								break;
							}
							
								 
							break;
						case"3":
							System.out.println("Geotechnical engineerong");
							System.out.println("choose an event in Geotechnical engineering");
							System.out.println("1.Orientation");
							System.out.println("2.future scope ");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at 171 at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at  102 1.00 to 3.00pm");
								break;
							}
							break;
						}


			    	break;
			    case "3":
			    	System.out.println("mechanical");
					System.out.println("choose your specialization in Mechanical engineering");
					System.out.println("1.Fluid mechanics and thermal systems");
					System.out.println("2.Machine Design");
					System.out.println("3.Aerospace Engineering");
					Specialization=sc.nextLine();
					switch (Specialization) {
						case "1":
							System.out.println("1. Fluid mechanics and thermal systems");
							System.out.println(" choose an event in fluid mechanics");
							System.out.println("1. Orientation program");
							System.out.println("2. Reserach on different Models");
							String event=sc.nextLine();
							switch(event) {
							case"1":
								
								System.out.println("venue is pit room no 110");
								break;
							case "2":
								System.out.println("venue is at 162");
							}
							
							break;
						case "2":
							System.out.println("Machine Designs");
							System.out.println("choose an event in Machine design ");
							System.out.println("1.Orientation program ");
							System.out.println("2.3D models ");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at pit mechnical hall at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at pit mechanical hall area 1.00 to 3.00pm");
								break;
							}
							
								 
							break;
						case"3":
							System.out.println("Aerospace engineerong");
							System.out.println("choose an event in aerospace engineering");
							System.out.println("1.Orientation");
							System.out.println("2.future scope ");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at aviation room at 2nd floor at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at aviation room at 2nd floor 1.00 to 3.00pm");
								break;
							}
							break;
						}
			    	break;
			    
			    }
			    
				
				break;
			case "b":
				System.out.println("2.PIET");
				System.out.println("choose your department");
				
			    System.out.println("1. CSE");
			    System.out.println("2. CIVIL");
			    System.out.println("3. MECHANICAL");
			    Department=sc.nextLine();
			    switch(Department) {
			    case "1":
			    	System.out.println("CSE");
			    	System.out.println("choose your specialization in cse");
			    	System.out.println("AI");
			    	System.out.println("IOT");
			    	System.out.println("CYBER");
			    	String Specialization=sc.nextLine();
			    	switch (Specialization) {
			    	case "1":
			    		System.out.println("AI");
			    		System.out.println(" choose an event in AI");
			    		System.out.println("1. neutral networks");
			    		System.out.println("2.Devops");
			    		String event=sc.nextLine();
			    		switch(event) {
			    		case"1":
			    			
			    			System.out.println("venue is piet admin block room no 360");
			    			break;
			    		case "2":
			    			System.out.println("venue is piet admin block at 361");
			    		}
			    		
			    		break;
			    	case "2":
			    		System.out.println("IOT");
						System.out.println("choose an event in IOT");
						System.out.println("1. IOT enterpreneur ideas evolution");
						System.out.println("2.iot best global speakers");
						event=sc.nextLine();
						switch(event){
						case "1":
						    System.out.println("events is at piet seminar hall at 10.30 to 12.30");
							break;
						case "2":
                            System.out.println("events is at piet seminar hall 1.00 to 3.00pm");
							break;
						}
						
						     
			    		break;
			    	case"3":
			    		System.out.println("CYBER");
						System.out.println("choose an event in Cyber");
						System.out.println("1.cyber security talks");
						System.out.println("2.introduction to kali linux");
						event=sc.nextLine();
						switch(event){
						case "1":
						    System.out.println("events is at  N block 371 at 10.30 to 12.30");
							break;
						case "2":
                            System.out.println("events is at  N block 302 1.00 to 3.00pm");
							break;
						}
			    		break;
			    	}
			    	break;
			    case "2":
			    	System.out.println("civil");
					System.out.println("choose your specialization in civil engineering");
					System.out.println("1.Infrastructural engineering");
					System.out.println("2.Environmental engineering");
					System.out.println("3.Geotechnical engineering");
					Specialization=sc.nextLine();
					switch (Specialization) {
						case "1":
							System.out.println("1.Infrastructral enginnering");
							System.out.println(" choose an event in Infrastructral enginnering");
							System.out.println("1. Orientation program");
							System.out.println("2.Infrastructure Models");
							String event=sc.nextLine();
							switch(event) {
							case"1":
								
								System.out.println("venue is at Design and architecture building  room no 310");
								break;
							case "2":
								System.out.println("venue is at Design and architecture building  362");
							}
							
							break;
						case "2":
							System.out.println("Environment engineering");
							System.out.println("choose an event in Environment engineering ");
							System.out.println("1.Orientation program ");
							System.out.println("2.Overcome the problem of environment");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at piet agriculture building  hall at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at piet agriculture building  near garden area 1.00 to 3.00pm");
								break;
							}
							
								 
							break;
						case"3":
							System.out.println("Geotechnical engineerong");
							System.out.println("choose an event in Geotechnical engineering");
							System.out.println("1.Orientation");
							System.out.println("2.future scope ");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at  N block 171 at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at N block 102 1.00 to 3.00pm");
								break;
							}
							break;
						}


			    	break;
			    case "3":
			    	System.out.println("mechanical");
					System.out.println("choose your specialization in Mechanical engineering");
					System.out.println("1.Fluid mechanics and thermal systems");
					System.out.println("2.Machine Design");
					System.out.println("3.Aerospace Engineering");
					Specialization=sc.nextLine();
					switch (Specialization) {
						case "1":
							System.out.println("1. Fluid mechanics and thermal systems");
							System.out.println(" choose an event in fluid mechanics");
							System.out.println("1. Orientation program");
							System.out.println("2. Reserach on different Models");
							String event=sc.nextLine();
							switch(event) {
							case"1":
								
								System.out.println("venue is piet D block room no 110");
								break;
							case "2":
								System.out.println("venue is piet D blockat 162");
							}
							
							break;
						case "2":
							System.out.println("Machine Designs");
							System.out.println("choose an event in Machine design ");
							System.out.println("1.Orientation program ");
							System.out.println("2.3D models ");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at piet mechnical hall at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at piet mechanical hall area 1.00 to 3.00pm");
								break;
							}
							
								 
							break;
						case"3":
							System.out.println("Aerospace engineerong");
							System.out.println("choose an event in aerospace engineering");
							System.out.println("1.Orientation");
							System.out.println("2.future scope ");
							event=sc.nextLine();
							switch(event){
							case "1":
								System.out.println("events is at  A block aviation room at 2nd floor at 10.30 to 12.30");
								break;
							case "2":
								System.out.println("events is at A block aviation room at 2nd floor 1.00 to 3.00pm");
								break;
							}
							break;
						}
			    	break;
			    
			    }
		
		

	    }
		sc.close();
	}

}

