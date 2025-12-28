package oopsConcept;

// // Learning Oops main things  for Linked List 

// public class StudentClass{
//     // creating new data type
//     public static class student{    // blueprint class
//         String name;
//         int rollno;
//         double percent;
//     }
//     public static void main(String[] args) {
//         student s1 = new student();  // it is a declaration
//         s1.name = "priyanshu";
//         s1.rollno = 144;
//         s1.percent = 98.2;
//         System.out.println(s1.name);

//        student s2 = new student();
//        s2.name = "tarun";
//        s2.rollno = 87;
//        s2.percent = 89.3;
//        System.out.println(s2.name);  // s1 and s2 aree objects of class student 
//     }
// }




// /* public static void main(String[] args) {
//     public static class student{    // blueprint class
//         String name;
//         int rollno;
//         double percent;                        // class ko hum main function kai andar bhi bna sakte hain
//     }
//         student s1 = new student();  // it is a declaration
//         s1.name = "priyanshu";
//         s1.rollno = 144;
//         s1.percent = 98.2;
//         System.out.println(s1.name);

//        student s2 = new student();
//        s2.name = "tarun";
//        s2.rollno = 87;
//        s2.percent = 89.3;
//        System.out.println(s2.name); */

       
    //    public class StudentClass{
    //     public static class student{    //classes are passed by reference
    //         String name;
    //         int rno;
    //         double percent;
    //     }
    //     public static void change(student s1){
    //          s1.name = "rohan";
    //     }
    //     public static void main(String[] args) {
    //         student s1= new student();
    //         s1.name = "tarun";
    //         s1.rno = 45;
    //         s1.percent = 99.3;
    //         System.out.println(s1.name);
    //         //updation 
    //         change(s1);
    //         System.out.println(s1.name);
            
    //     }
    //    } 



    // *************** Getters and Setters *****************

    public class StudentClass{
        public static class student{
            public String name;
            private int rno;
            double percent;


            public int getRno(){   // it is a getter function
                return rno;
            }

            public void setRno(int rno){    // setter function  jabardasti rno ko set kr rhe hain
                //  rno = rno;  // it  gives us nothing bcz computer is confusion
                 // for this we use this keyword too referece it is a class propertiy
                 this.rno = rno;  //interview perspective

            }

            public void seRno(int x){   // isko hum aese bhi kr sakte hain
                rno = x;
            }

           public static void main(String[] args) {
               student s1 = new student();
               s1.name = "kunal";
               s1.rno = 67;
               s1.percent = 87.8;

            //    System.out.println(s1.getRno());

            s1.setRno(76);

            System.out.println(s1.getRno());
           } 
        }
    }
