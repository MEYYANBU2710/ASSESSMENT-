abstract class College{
     int clgid;
	 String clgname;
	 College (int clgid, String clgname)
	 {
	 this.clgid=clgid;
	 this.clgname=clgname;
	 }
void display(){
System.out.println("College Name :"+clgname+"\t Collge Id : "+clgid);
}
abstract void dept(int students, String deptname);

}
class Anudip extends College{
Anudip(int clgid, String clgname){
super(clgid,clgname);
}
void dept(int students, String deptname)
{
System.out.println("Department Name : " +deptname+"\t No.of Students : "+students);
}
}
class CollegeDept{
public static void main(String... args)
{
Anudip a=new Anudip(1100, "Queen Mary's College");
a.display();
a.dept(25, "BCA");
}
}