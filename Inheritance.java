package Oops;
class a{
    public void a(){
        System.out.println("this is a class");
    }
}
class b extends  a{

    public void b() {
        System.out.println("this is b cllass");
    }
}
class c extends a{
    public void c (){
        System.out.println("this is c class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        c obj = new c();
b ooo = new b();
ooo.a();
ooo.b();
        obj.a();
        obj.c();



    }
}
