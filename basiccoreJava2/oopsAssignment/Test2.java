package oopsAssignment;

public class Test2 {


public static void main(String[] args) {
C c = new C();
D d = new D();

c.parentMeth();
c.childMeth();

d.childMeth();
d.parentMeth();

}

}



class C{

public void parentMeth(){

}
}

class D extends C{
public void childMeth(){

}

}

