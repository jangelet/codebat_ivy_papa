
public class makeBricks{

public static boolean makeBricks(int small, int big, int goal) {
	  if(big*5 <= small){
	     return (small + big*5) >= goal;
	   }
	   if(goal/5 <= big){
	     return (goal/5) * 5 + small >= goal; 
	   }
	  
	    return (small + big*5) >= goal;
}

public static void main(String[] args){
	
	System.out.println(makeBricks(3, 1, 8));
	}	
}
