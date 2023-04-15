class Parent
{
public void f1()
{
System.out.println("Parent class");
}
}
class Child extends Parent{
public void f1()
{
System.out.println("Child class");
}
}
class MethodOverriding
{
public static void main(String args[])
{
Parent p = new Parent();
p.f1();
}
}
