/******************************************************************************
Name: Jan Lorenz L. Laroco 
Date: May 2, 2024
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

class Main2DpartialPART3
{
    static Student[][] studArr;
    static String[] sections;
	public static void main(String[] args) {
	    
	    studArr = new Student[2][3];
	    sections = new String[] {"BSIT 1B", "BSIT 1C"};
	    
	    //methods
        displayHardCode();
        displayArrBefore();
        displayArrAfter();
        displayArray();
	}
	
	static void displayHardCode(){
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
        studArr[1][2].grades = new int[] {84,96,90};
	}
	static void displayArrBefore(){
	   System.out.printf("Array contents before sorting students by section:\n");
	   
	    for(int i=0; i<studArr.length; i++){
	        System.out.printf("Section %d     ", i+1);
	        for(int j=0; j<studArr[0].length; j++){
	            System.out.printf("%-6s ", studArr[i][j].name);
	            double average = studArr[i][j].getAverage();
	            System.out.printf("%.2f  ||  ", average);
	        }
	        	 System.out.println();
	    }
	}
	static void displayArrAfter(){
	    System.out.printf("Array contents after sorting students by section:\n");
	   // double tempo = studArr[0][0];
	    int temporary = 0;
	    
	   
	     for(int i=0; i<studArr.length-1; i++) {
         for (int j=i+1; j<studArr.length; j++)
            if (studArr[i][0].getAverage()<studArr[j][0].getAverage())
            {
               Student[] temp = studArr[i];
               studArr[i] = studArr[j];
               studArr[j] = temp;
               
               String tmpSect = sections[i];
               sections[i] = sections[j];
               sections[j] = tmpSect;
	     }
            
 }
}

        static void displayArray() {
           {
              System.out.println();
              for (int x=0; x<studArr.length; x++)
              {
                 System.out.printf("%-15s => ",sections[x]);
                 for(int y=0; y<studArr[0].length; y++)
                 {
                    System.out.printf("%-10s(%.2f)  ||  ",studArr[x][y].name,studArr[x][y].getAverage());
                 }
                 System.out.println();
              }  
           }
        }
}