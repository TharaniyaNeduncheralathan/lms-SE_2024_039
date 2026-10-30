public class student {

        private String name;
        private int age;
        private final double gpa;
        public student( String name,int age,double gpa){
            this.name=name;
            this.age=age;
            this.gpa=gpa;
        }
        public void display(){
            System.out.println("name is :" +name);
            System.out.println("age is :"+age);
            System.out.println("gpa is : "+gpa);
        }
        public void checkresult(){
            if(gpa>2.0){
                System.out.println("pass");
            }
            else{
                System.out.println("fail");
            }
        }
    }


