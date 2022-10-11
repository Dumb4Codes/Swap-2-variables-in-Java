
public class SwapTwoVariables {

	public static void main(String[] args) {
		 //We're swapping our value like x is going to be y and y is going to be x
		
  String x = "Water";
  String y = "Fire";
  
  //For swaping we introduce another variable String temp
  String temp; //We can also write String temp = null; 
  temp = x;
  x=y;
  y=temp;
  
  
  System.out.println("x :"+x);
  System.out.println("y :"+y);
		
		
	}

}
