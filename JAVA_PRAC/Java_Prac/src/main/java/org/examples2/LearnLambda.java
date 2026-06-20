package org.examples2;

interface  LearnLambda {
     String dance();
     default void sing(){
         System.out.println("I am singing");
     }

//     class ABC implements LearnLambda{
//         public String dance(){
//             System.out.println("I am dancing");
    //         return "cat";
//         }
//    }

    public static void main(String[] args) {
//        LearnLambda ld =new ABC();
//        ld.dance();
        LearnLambda ld =()->{System.out.println("I am dancing");
        return "cat";};
        ld.dance();
        ld.sing();


    }
}
