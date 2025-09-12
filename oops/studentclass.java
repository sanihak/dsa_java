package oops;

public class studentclass {
    //creating own datatype
    public static class Student{
        String name;
        int rollno;
        double percentage;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "raghav";
        x.rollno = 1;
        x.percentage=90.5;
        System.out.println(x.name);

        Student s = new Student();
        s.name = "akshit";
        s.percentage = 97.2;
        s.rollno = 3;
        
    }
    
}
