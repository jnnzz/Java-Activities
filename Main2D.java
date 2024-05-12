/******************************************************************************
Name: Jan Lorenz L. Laroco 
Date: May 12, 2024
Description: SemiFinal-Lab.Act.#11 
*******************************************************************************/

class Student {
    String name;
    int[] grades;
    
    double getAverage(){
        int sum = 0;
        for(int i=0; i<grades.length; i++){
            sum += grades[i];
        }
        return (double)sum/grades.length;
    }
    
}

class Main2D
{
    static Student[][] studArr;
    static String[] sections;
	public static void main(String[] args) {

	    //methods
	    displayInitialize();
	    displayMyName();
        displayHardCode();
        displayArrBefore();
        displayArrAfter();
        displayArrTopStudents();
        displayOverall();
	}
	
	static void displayInitialize(){
	   //initialize
	   studArr = new Student[2][3];
	   sections = new String[] {"BSIT 1-A", "BSIT 1-C"};
	   
	     for(int i=0; i<studArr.length; i++){
            for(int j=0; j<studArr[0].length; j++){
                studArr[i][j] = new Student();
            }
        }
	}
	static void displayMyName(){
	    System.out.printf("          ----------SemiFinal-Lab.Act.#11----------\n");
	    System.out.printf("          ----------LAROCO, Jan Lorenz L.----------\n");
	    System.out.println();
	}
	
	static void displayHardCode(){
        
        //hard coded grades
        //BSIT 1-A
        studArr[0][0].name = "Amanda";
        studArr[0][0].grades = new int[] {94,90,89};
        studArr[0][1].name = "Nicole";
        studArr[0][1].grades = new int[] {98,97,97};
        studArr[0][2].name = "Arthur";
        studArr[0][2].grades = new int[] {91,93,90};
        
        //BSIT-1B
        studArr[1][0].name = "Steve";
        studArr[1][0].grades = new int[] {94,94,93};
        studArr[1][1].name = "Wanda";
        studArr[1][1].grades = new int[] {91,82,93};
        studArr[1][2].name = "Jarvis";
        studArr[1][2].grades = new int[] {98,99,98};
	}
	
	static void displayArrBefore(){
	   System.out.printf("Array contents before sorting students by section:\n");
        
        //display
	    for(int i=0; i<studArr.length; i++){
	        System.out.printf("%s     ", sections[i]);
	        for(int j=0; j<studArr[0].length; j++){
	            System.out.printf("%-6s ", studArr[i][j].name);
	            double average = studArr[i][j].getAverage();
	            System.out.printf("%.2f  ||  ", average);
	        }
	        System.out.println();
	    }
	}
	
	static void displayArrAfter(){
	    System.out.println("");
	    System.out.println("");
	    System.out.printf("Array contents after sorting students by section:\n");
         
         //sort students by section
	     for(int i=0; i<studArr.length; i++){
	         for(int j=0; j<studArr[i].length-1; j++){
	             for(int k=j+1; k<studArr[i].length; k++){
	                 if(studArr[i][j].getAverage()<studArr[i][k].getAverage()){
	                     Student temp = studArr[i][j];
	                     studArr[i][j] = studArr[i][k];
	                     studArr[i][k] = temp; 
	                 }
	             }
	         }
	     }
	     //result
	     for(int i=0; i<studArr.length; i++){
	         System.out.printf("%s     ", sections[i]);
	         for(int j=0; j<studArr[i].length; j++){
	             System.out.printf("%-6s %.2f  ||  ", studArr[i][j].name, studArr[i][j].getAverage());
	         } 
	         System.out.println("");
	     }
	}
	
	static void displayArrTopStudents(){
	    
	    System.out.println();
	    System.out.println("");
          System.out.printf("Array contents after sorting by rows based on top students per section: \n");

	    for(int i=0; i<studArr.length-1; i++){
	        for(int j=i+1; j<studArr.length; j++){
	            if(studArr[i][0].getAverage()<studArr[j][0].getAverage()){
	                Student[] tempo = studArr[i];  //swapGrades
	                studArr[i] = studArr[j];
	                studArr[j] = tempo;
	                
	                String tempSection = sections[i]; //sections
                    sections[i] = sections[j];
                    sections[j] = tempSection;
	            }
	        }
	    } 
	    //result
	    for(int i=0; i<studArr.length; i++){
	        System.out.printf("%s     ", sections[i]);
	        for(int j=0; j<studArr[i].length; j++){
	           System.out.printf("%-6s %.2f  ||  ", studArr[i][j].name, studArr[i][j].getAverage());
	        }
	        System.out.println();
	    }
	    
	}
	
	static void displayOverall(){
	    
	  int allStud = studArr.length * studArr[0].length;
	  Student[] overAll = new Student[allStud];
	  int index = 0;
	      
	      //store in 1d array (overAll)
    	  for(int i=0; i<studArr.length; i++){
    	      for(int j=0; j<studArr[0].length; j++){
    	          overAll[index++] = studArr[i][j];
    	      }
    	      System.out.println();
    	  }
    	  //sort
    	  for(int i=0; i<overAll.length-1; i++){
    	      for(int j=i+1; j <overAll.length; j++){
    	          if(overAll[i].getAverage()<overAll[j].getAverage()){
    	          Student tempo = overAll[i];
    	          overAll[i] = overAll[j];
    	          overAll[j] = tempo;
    	          }
    	      }
    	  }
    	  
    	  //result
    	  System.out.printf("                       OVERALL RANKING\n");
    	  for(int i=0; i<overAll.length; i++){
    	      System.out.printf("             %d. %-6s -> %.2f",i+1, overAll[i].name, overAll[i].getAverage());
    	        if(overAll[i].getAverage()>=90 && overAll[i].getAverage() <=94.4){
    	            System.out.printf(" - Cum Laude\n");
    	        }else if(overAll[i].getAverage() >=95 && overAll[i].getAverage() <=97.4){
    	            System.out.printf(" - Magna Cum Laude\n");
    	        }else if(overAll[i].getAverage() >=98 && overAll[i].getAverage() <=100){
    	            System.out.printf(" - Summa Cum Laude\n");
    	        }else{
    	            System.out.printf("\n");
    	        }
    	  }
    }
}