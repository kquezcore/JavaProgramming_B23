package Day42_CustomClass_Constructors;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConstructorCalls {

    public  void method1(){
        System.out.println("Method1");
    }

    public  void method2(){
        method1();
        System.out.println("Method 2 ");
    }



    public  void method3(){ }

         public ConstructorCalls(){
            method1();
            method2();
        }


}
