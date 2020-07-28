package oopsAssignment;


public class Test5{

public static void main(String[] a){
L l1 = new M();
l1.meth1();
l1.meth2();
l1.meth3();
//l1.meth4();
}

}

interface L{
public void meth1();
public void meth2();
public void meth3();
}



class M implements L{

@Override
public void meth1() {
System.out.println("meth1");

}

@Override
public void meth2() {
System.out.println("meth2");

}

@Override
public void meth3() {
System.out.println("meth3");

}

public void meth4() {
System.out.println("meth4");

}

}
