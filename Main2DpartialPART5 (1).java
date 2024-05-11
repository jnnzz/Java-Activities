/******************************************************************************
Name: Jan Lorenz L. Laroco 
Date: May 11, 2024
Description: SemiFinal-Lab.Act.#11 PARTIAL
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

class Main2DpartialPART5
{
    static Student[][] studArr;
    static String[] sections;
    static String[] tempArr;
	public static void main(String[] args) {
	    

	    //methods
	    displayMyName();
        displayHardCode();
        displayArrBefore();
        displayArrAfter();
        displayArrTopStudents();
        displayOverall();
	}
	
	static void displayMyName(){
	    System.out.printf("          ----------SemiFinal-Lab.Act.#11----------\n");
	    System.out.printf("          ----------LAROCO, Jan Lorenz L.----------\n");
	    System.out.println();
	}
	static void displayHardCode(){
	   
	   //initialize
	   tempArr = new String[studArr.length * studArr[0].length];
	   studArr = new Student[2][3];
	   sections = new String[] {"BSIT 1B", "BSIT 1C"};
	   
	     for(int i=0; i<studArr.length; i++){
            for(int j=0; j<studArr[0].length; j++){
                studArr[i][j] = new Student();
            }
        }
        
        //hard coded grades
        //section1
        studArr[0][0].name = "Amanda";
        studArr[0][0].grades = new int[] {79,80,89};
        studArr[0][1].name = "Nicole";
        studArr[0][1].grades = new int[] {98,85,90};
        studArr[0][2].name = "Arthur";
        studArr[0][2].grades = new int[] {87,86,90};
        
        //section2
        studArr[1][0].name = "Steve";
        studArr[1][0].grades = new int[] {93,85,89};
        studArr[1][1].name = "Wanda";
        studArr[1][1].grades = new int[] {91,82,93};
        studArr[1][2].name = "Jarvis";
        studArr[1][2].grades = new int[] {91,96,90};
	}
	static void displayArrBefore(){
	   System.out.printf("Array contents before sorting students by section:\n");
	    
	    for(int k=0; k<studArr.length; k++){
	        System.out.printf("Section");
	        System.out.printf("       Name");
	    }
	    System.out.println("");
	    for(int i=0; i<studArr.length; i++){
	        System.out.printf("BSIT %d-C     ", i+1);
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
	    System.out.printf("Array contents after sorting students by section.\n");
	       
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
	   for(int i=0; i<studArr.length; i++){
	        System.out.printf("BSIT %d-C     ", i+1);
	       for(int j=0; j<studArr[i].length; j++){
	           System.out.printf("%-6s %.2f  ||  ", studArr[i][j].name, studArr[i][j].getAverage());
	       }
	       System.out.println("");
	   }
	}
	static void displayArrTopStudents(){
	    System.out.println();
	    for(int i=0; i<studArr.length-1; i++){
	        for(int j=i+1; j<studArr.length; j++){
	            if(studArr[i][0].getAverage()<studArr[j][0].getAverage()){
	                Student tempo = studArr[i][0];
	                studArr[i][0] = studArr[j][0];
	                studArr[j][0] = tempo;
	            }
	        }
	    } 
	    
	    System.out.printf("Array contents after sorting by rows based on top students per section: \n");
	    	           
	    for(int i=0; i<studArr.length; i++){
	        System.out.printf("BSIT %d-C     ", i+1);
	        for(int j=0; j<studArr[i].length; j++){
	           System.out.printf("%-6s %.2f  ||  ", studArr[i][j].name, studArr[i][j].getAverage());
	           
	        }
	        System.out.println();
	    }
	    
	}
	static void displayOverall(){
	   
	   double index = 0;
	   System.out.println();
	   for(int i=0; i<studArr.length; i++){
	       for(int j=0; j<studArr[i].length; j++){
	            tempArr[index++] = studArr[i][j].name; 
	       }
	   }
	   
	    for(int i=0; i<studArr.length; i++){
	        for(int j=0; j<studArr[i].length+1; j++){
	            for(int k=j+1; k<studArr[i].length; k++){
	                if(studArr[i][j].getAverage()<studArr[i][k].getAverage()){
	                    Student temp = studArr[i][j];
	                    studArr[i][j] = studArr[i][k];
	                    studArr[i][k] = temp;
	                }
	            }
	        }
	    }
	    for(int i=0; i<studArr.length; i++){
	        for(int j=0; j<studArr[0].length; j++){
	            System.out.printf("                       %-6s = %.2f\n",studArr[i][j].name,studArr[i][j].getAverage());
	        }
	    }
	}
	
	
}