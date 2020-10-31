package day1.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		students set= new students();
		String studentsinOrder [];
		studentsinOrder = set.studentsNamesInAlphabetOrder();
		System.out.println("*************************");
		
		for(int i=0;i<studentsinOrder.length;i++) {
			System.out.println(studentsinOrder[i]);
		}
		
	double loanInterest ;
	Calculator c1= new Calculator();
	loanInterest = c1.interestCalculator(2000, 15);
	System.out.println(" Interest calculator function being  called : " + loanInterest);

	}

	private String[]  studentsNamesInAlphabetOrder() {
		
		//declaring a String array 
		String studentsNameInOrder[] = new String[7];
		
		String fileName = "C:\\Users\\jeyth\\javaProjects\\Sample\\studentsName";
	
		
		 //String fileName="RAILWAY.txt";
	       try{

	          //Create object of FileReader
	          FileReader inputFile = new FileReader(fileName);

	          //Instantiate the BufferedReader Class
	          BufferedReader bufferReader = new BufferedReader(inputFile);

	          //Variable to hold the one line data
	          String line;
	          int i =0;

	          // Read file line by line and print on the console
	          while ((line = bufferReader.readLine()) != null)   {
	            System.out.println(line);
	            studentsNameInOrder[i]= line;
	            i++;
	          }
	         
	          bufferReader.close();
	          
	       }catch(Exception e){
	          System.out.println("Error while reading file line by line:" + e.getMessage());                      
	       }
				
	     
	        Arrays.sort(studentsNameInOrder);
	       
	     return studentsNameInOrder;
	       
	};
	
}
