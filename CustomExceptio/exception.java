class CusExcep extends Exception{
    CusExcep(String str)
	{
	   super(str);
	}
	static String stud_name[]={"Sandy","Kannan","Raghu","Arjith","Rose"};
	static int id[]={11,19,20,22,24};
	static int marks[]={85,90,76,69,50};
	static double att[]={90.0,80.6,72.2,55.8,79.0};
	
}
class MainExcep{
    public static void main(String...args){
	    for(int i=0;i<CusExcep.marks.length;i++){
		  try{
		       System.out.println("Student Name  :"+CusExcep.stud_name[i]+"\t"+ "Student Id :"+CusExcep.id[i]+"\t"+"Marks :"+CusExcep.marks[i]+"\t"+ "Attendance :"+CusExcep.att[i]);  
			     if(CusExcep.att[i]<60)
				 {
					 throw new CusExcep(CusExcep.stud_name[i]+"Secured less than 60 attendance");
				 }
				 
		  }
				 catch(CusExcep e)
				 {
					System.out.println(e.getMessage()); 
				 }
		     

		}
	}
}