import java.io.*;  
class Student{
    public static void main(String[] args)
    {
        int n = 4;
        String names[] = { "Santhosh", "Kannan", "Raghu", "Riya" };
        String temp;
		int id[]={2301,2302,2303,2304};
		int atd[]={95,89,90,65};
		int marks[]={90,65,78,65};
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                if (names[i].compareTo(names[j]) >0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("The sorted list: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
			System.out.println(id[i]);
			System.out.println(atd[i]);
			System.out.println(marks[i]);
        }
    }
}