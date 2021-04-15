// Call to this() must be the first statement in constructor.
class Student{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fee)
    {
        this(rollno,name,course);
        this.fee=fee;
    }
    void dispaly()
    {
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}
class Realusaseofthisconstructorcall{
    public static void main(String args[])
    {
        Student s1=new Student(11,"samit","coding");
        Student s2=new Student(12,"maneesh","coding",1000f);
        s1.dispaly();
        s2.dispaly();
    }
} 