/* Nishchay Gupta
 * Student id: 1895314
 */ 
public class OutputFormatting 
{
	public static void main(String[] args) 
	{
			// This program will display some information regarding students' records  
			String stud1 = "Nishchay", stud2 = "Dipal", stud3 = "Jameel";
			int id1 = 9085541, id2 = 8723099, id3 = 4297650; 
			double total1 = 93.8, total2 = 86.4, total3 = 88.25;
			// Display a heading of the output 
			System.out.println("No.     Student Name       ID#");	
			System.out.println("===     ============       ===");	
			// Display the names and IDs of the students; each on one line
			System.out.printf(" 1 %16s %12d %n", stud1, id1);		// %n is for new line 
			System.out.printf(" 2 %16s %12d %n", stud2, id2);		 
			System.out.printf(" 3 %16s %12d %n", stud3, id3);	
			// Now display the marks. Since we wish to display something like %88.9 
			// for the final, we must escape the specifier 
			System.out.println("\nHere are the marks of the students. \"f\" is for Final and \"m\" is for Midterm");
			System.out.println("===========================================================================");
			System.out.printf("ID#: %d, has %%88.90f, and %%87.25m, so his total is: %10.2f%% %n", id1, total1);
			System.out.printf("ID#: %d, has %%74.90f, and %%77.50m, so her total is: %10.2f%% %n", id2, total2);
			System.out.printf("ID#: %d, has %%83.25f, and %%84.25m, so his total is: %10.2f%% %n", id3, total3);
	}
}