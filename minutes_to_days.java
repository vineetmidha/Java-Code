import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        long minutes;
        
        System.out.println("Enter total minutes: ");
        
        Scanner in = new Scanner(System.in); 
        
        minutes = in.nextLong();
        
        long hours = minutes / 60;
        
        long days = hours / 24;
        
        long years = days / 365;
        
        days %= 365;
        
        System.out.println("Years = " + years + ", Days = " + days);
	}
}

/*
Enter total minutes:                                                                                                                             
3456789                                                                                                                                          
Years = 6, Days = 210 
*/
