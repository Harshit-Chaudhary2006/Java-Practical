class Student{
  int Roll_no;
  String Name;
  int m1;
  int m2;
  int m3;
  
  Student(int Roll_no,String Name,int m1,int m2,int m3){
    this.Roll_no = Roll_no;
    this.Name = Name;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
  }
int total(){
  return m1+m2+m3;
}
  double percentage(){
    return total()/3.0;
  }

void display(){
  System.out.println("Roll_no- " + this.Roll_no);
  System.out.println("Name- "  + this.Name);
  System.out.println("Marks 1- "+ this.m1);
  System.out.println("Marks 2- " + this.m2);
  System.out.println("Marks 3- " + this.m3);
  System.out.println("Total Marks " + total());
  System.out.println("Percentage " + percentage()+"\n");

}
}
public class Main{
 public static void main(String[] args){
  Student s1 = new Student(1,"Rahul",90,89,56);
   Student s2 = new Student(2,"Amit",80,82,86);
   Student s3 = new Student(3,"Neha",89,39,56);

  s1.display();
  s2.display();
  s3.display();

}
}
