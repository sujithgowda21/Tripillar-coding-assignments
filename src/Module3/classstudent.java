package Module3;

public class classstudent {
    String name;
    int usn,sub1,sub2,sub3;
    classstudent(String name,int usn,int sub1,int sub2,int sub3){
            this.name = name;
            this.usn = usn;
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
        }

        void printdetails(){
            System.out.println("student name is:" + this.name);
            System.out.println("student usn is:" + this.usn);
            System.out.println("student marks in sub1:" + this.sub1);
            System.out.println("student marks in sub2:" + this.sub2);
            System.out.println("student marks in sub3:" + this.sub3);

        }

    }

    class Driver{
        public static void main(String[] args) {
            classstudent srm1 = new classstudent("Sujith",112,60,90,70);
            classstudent srm2 = new classstudent("Srujan",113,30,90,50);
            classstudent srm3 = new classstudent("Darshan",114,90,50,90);
            classstudent srm4 = new classstudent("Punith",116,50,40,50);

            srm1.printdetails();
            srm2.printdetails();
            srm3.printdetails();
            srm4.printdetails();
        }


    }


