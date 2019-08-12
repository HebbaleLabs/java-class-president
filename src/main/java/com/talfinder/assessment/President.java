package com.talfinder.assessment;

public class President {
    public static int selectPresident(int studentsno, int songlength) {

        /*
         * NOTE:
         * 1. Write your solution within this method
         * 2. Do not make changes to the Class Name, Method Name or Method Signature
         * 3. Use the Run-Java command to run main method
         * 4. Use the BuildAndRunTests command to evaluate your solution
         */
        int president = 0;
        return president;
    }

    public static void main(String[] args) {
        int studentsno = 23;
        int songlength = 7;
        if (studentsno != 0) {
            System.out.print(selectPresident(studentsno, songlength));
        } else {
            throw new ArithmeticException(" No. of students cannot be zero");
        }

    }
}
