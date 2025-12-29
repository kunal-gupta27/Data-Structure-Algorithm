package oopsconcept;

// public class StudentClassCons {
//     public static class Student{
//        String name;
//        int rno;
//        double percent;

//     //    public Student(String naam, int roll, double per){  //it is the constructor
//     //         name = naam;    
//     //         rno = roll;
//     //         percent = per;

//     //    }

//     // OR

//     public Student(String name, int rno, double percent){  // Constructor ko aese bhi likh sakte hain
//         this.name = name;
//         this.rno=rno;
//         this.percent = percent;
//     }
//     }
//     public static void main(String[] args) {
//         Student s1 = new Student("Tarun", 87, 98.7);
//         System.out.println(s1.name);
//         System.out.println(s1.rno);
//         System.out.println(s1.percent);
//         // s1.name = "rachit";
//         // System.out.println(s1.name);   // hum inko update bhi kr sakte hain
//     }
// }


// Making deault Constructor

public class StudentClassCons{
    public static class student{
        String name;
        int rno;
        double percent;
        final String schoolName="KCS";  // final keyword use kiya hain
        //iski value ko hum update nhi kr sakte hain in future;

        private static int numberofStudent; //Using static keyword for how many object are created 

        public student(String naam, int rn, double per){  //Constructor hain jo class name ka he hota hain
            name = naam;
            rno = rn;
            percent = per;
            numberofStudent++;   //static ko use krne kai baad hum sonstructor main add krte numberofstudent ko ++ kai sath
        }

        public student(){   //default constructor hota hain

        }

        public static  int getnumberofStudent(){
            return numberofStudent;
        }
    }
    public static void main(String[] args) {
        System.out.println(student.getnumberofStudent());
        student s1 = new student("Tarun", 87, 99.5);
        // System.out.println(s1.name);
        // System.out.println(s1.rno);
        // System.out.println(s1.percent);
        System.out.println(s1.numberofStudent);

        student s2 = new student("Rachit", 78, 89.7);
        // System.out.println(s1.name);
        // System.out.println(s1.rno);
        // System.out.println(s1.percent);
        System.out.println(s2.numberofStudent);

        
                
        

    }
}