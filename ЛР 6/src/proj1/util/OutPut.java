package proj1.util;
//package util;

public class OutPut{
	public void outputString(String[] args){
	int count=0;
	System.out.print("String: ");
	System.out.print("\n");
	for(String arg : args){
	    System.out.print(count+". " + arg+"\n");
	    count++;
		}

	}
	
}