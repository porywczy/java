import java.util.*;  

public class BusinessCard {

	public static void main(String[] args) {
		
		//String name = "Name";
		//String surname = "Surname";
		
		//int phone = 123456789;
		//String city = "City";
		
		//"\t"
		//"\n"
		
		//argument in constructor
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");   
		String name = in.next();
		
		System.out.print("Enter your surname: ");   
		String surname = in.next();
		
		System.out.print("Enter your phone: ");   
		int phone = in.nextInt();
		
		System.out.print("Enter your city: ");   
		String city = in.next();
		
		in.close();   
		
		String firstLine = "* " + name + " " + surname;
		String secondLine = "* " + phone + " " + city;
		String bottomLine = "";
		
		int firstLineLength = firstLine.length();
		int secondLineLength = secondLine.length();
		int biggestLength = 0;
		
		biggestLength = (firstLineLength > secondLineLength) 
			? firstLineLength 
			: secondLineLength;
			
		//biggestLength = Math.max(firstLineLength, secondLineLength);
			
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		
		System.out.println();
		
		for(int i=0; i<biggestLength + 2; i++)	{
			bottomLine += "*";
		}
		
		int firstLineWhiteCharNumber = biggestLength - firstLineLength;
		int secondLineWhiteCharNumber = biggestLength - secondLineLength;
		
		System.out.println(bottomLine);
		for(int i=0; i<firstLineWhiteCharNumber; i++)	{
			firstLine += " ";
		}
		System.out.println(firstLine + " *");
		
		for(int i=0; i<secondLineWhiteCharNumber; i++)	{
			secondLine += " ";
		}
		System.out.println(secondLine + " *");
		
		
		System.out.println(bottomLine);
	
	}
}
