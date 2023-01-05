import java.util.*;
import java.io.*;
class Book implements Comparator,Serializable{
String bookname, authorname ;
int isbcno ;
public int compare(Book b1 , Book b2){
return b1.bookname.compareTo(b2.bookname);
}
Book(){
}
Book(String bookname,String authorname , int isbcno ){
this.bookname = bookname ;
this.authorname= authorname ;
this.isbcno = isbcno ;
}
public String toString(){
return "Book Name : "+bookname+" Author Name : "+ authorname +" ISBC NO : "+isbcno;
}
}
class Main{
public static void main(String... args)throws IOException,ClassNotFoundException{
LinkedList a = new LinkedList();
Book b1 = new Book ("The old monk " , "richard ", 234567);
Book b2 = new Book ( "the world of peace " , " micheal " , 234678);
Book b3 = new Book ("after war" , "james " ,567890 );
a.add(b1);
a.add(b2);
a.add(b3);
Collections.sort(a,new Book ());
Iterator it = a.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}