package lab3;

	import java.util.*;
	import java.time.*;

	public class AcceptDate {

	public static void main(String[] args)
	    {
	        LocalDate pdate = LocalDate.of(1999, 06, 19);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDifference: %d years, %d months and %d days old\n\n",
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }


}
