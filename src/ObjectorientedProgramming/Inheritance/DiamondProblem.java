//package Inheritance;
//// Parent class
//class Parent {
//    void show() {
//        System.out.println("Parent show()");
//    }
//}
//
//// First child class
//class ChildOne extends Parent {
//    void show() {
//        System.out.println("ChildOne show()");
//    }
//}
//
//// Second child class
//class ChildTwo extends Parent {
//    void show() {
//        System.out.println("ChildTwo show()");
//    }
//}
//
///*
// Diamond Problem:
// Parent
//   ↑   ↑
//ChildOne  ChildTwo
//      ↑
// DiamondProblemDemo  ❌
//*/
//
//// ❌ Java does NOT allow multiple inheritance using classes
//public class DiamondProblem extends ChildOne, ChildTwo {
//
//    public static void main(String[] args) {
//        DiamondProblem obj = new DiamondProblem();
//        obj.show(); // ❓ Which show()? ChildOne or ChildTwo
//    }
//}
