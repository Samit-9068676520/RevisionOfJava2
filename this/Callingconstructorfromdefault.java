class A{
    A(){
        System.out.println("Hello A");
    }
    A(int x)
    {
        this();
        System.out.println(x);
    }
}
class B
{
    B(int x)
    {
        System.out.println(x);
    }
    B()
    {
        this(10);
        System.out.println("Hello B");
    }
}
class Callingconstructorfromdefault{
    public static void main(String args[])
    {
        A a=new A(10);
        B b=new B();
    }
}