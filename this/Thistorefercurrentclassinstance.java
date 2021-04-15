class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class Thistorefercurrentclassinstance{
    public static void main(String args[])
    {
        Student s1=new Student(11,"Samit Verma",10000f);
        Student s2=new Student(112,"Shivraj Verma",1000f);       
        s1.display();
        s2.display();
    }
}