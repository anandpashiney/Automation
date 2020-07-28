package AssignmentPackake3;

public class Test2 {

/**
* @param args
*/
public static void main(String[] args) {

try{
int o[] = new int[2];
o[3]=23;
o[1]=33;
}catch(Exception e){
System.out.println(e.getMessage());
e.printStackTrace();
}

System.out.println(o[1]);
}

}

