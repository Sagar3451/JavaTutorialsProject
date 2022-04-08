package opps;

class Bike{
int i = 120;
int a = 20;
   void run(){System.out.println("running");}
   void run1(){System.out.println("running1");}
 }
 class Casting extends Bike{
 int i = 10;
 int bb = 1;
 
   void run(){System.out.println("running safely with 60km");}
   void run2(){System.out.println("running2");}
   public static void main(String args[]){
     Bike b1 = new Bike();
     b1.run();
     b1.run1();
     System.out.println(b1.i);
     

     Casting s1 = new Casting();
     s1.run();
     s1.run1();
     s1.run2();
     System.out.println(s1.i);

     Bike b = new Casting();//upcasting
     b.run();
     b.run1();
     System.out.println(b.i);

     Casting s = (Casting)b;//downcasting
     s.run();
     s.run1();
     s.run2();
     System.out.println(s.bb);

   }
 }

