package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List test =new ArrayList();
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        System.out.println(test.get(0));

//        test.remove(0);
//
//        System.out.println(test.get(0));


        for(int i=0;i<test.size();i++){
            System.out.println(test.get(0));
            if(test.get(0).equals("a")){
                test.remove(0);
                System.out.println(test.get(0));
            }
        }

        System.out.println(test.get(0));

    }
}
