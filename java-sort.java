import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code

public class Solution
{
   public static final Comparator<Student> CGPA_ORDER = new Comparator<Student>(){
       public int compare(Student s1, Student s2){
           int compareValue = new Double(s2.getCgpa()).compareTo(new Double(s1.getCgpa()));
           return compareValue;
       }
   };
    
      public static final Comparator<Student> ID_ORDER = new Comparator<Student>(){
       public int compare(Student s1, Student s2){
           int compareValue = new Integer(s1.getId()).compareTo(new Integer(s2.getId()));
           return compareValue;
       }
   };
    
      public static final Comparator<Student> NAME_ORDER = new Comparator<Student>(){
       public int compare(Student s1, Student s2){
           int compareValue = s1.getFname().compareTo(s2.getFname());
           return compareValue;
       }
   };
    
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       Collections.sort(studentList, ID_ORDER);
      Collections.sort(studentList, NAME_ORDER);
       Collections.sort(studentList, CGPA_ORDER);
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
