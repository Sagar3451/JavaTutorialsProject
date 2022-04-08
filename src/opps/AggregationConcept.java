package opps;

class Address {
String City,State,Country;

public Address(String City, String State, String Country){
this.City=City;
this.State=State;
this.Country=Country;
}

}

public class AggregationConcept{
int Id;
String Name;
String Dept;
Address adds;

public AggregationConcept (int Id, String Name, String Dept, Address adds){
this.Id=Id;
this.Name=Name;
this.Dept=Dept;
this.adds =adds;
}

void display(){
System.out.println(Id+" "+Name+" "+Dept+" "+adds.City+" "+adds.State+" "+adds.Country);

}

public static void main(String args[]){

Address a1 = new Address("Bangalore", "Karnataka", "India");
Address a2 = new Address("Mangalore", "Karnataka", "India");

AggregationConcept e1= new AggregationConcept (007, "Sagar", "IT", a1);
AggregationConcept e2= new AggregationConcept (006, "Roshan", "IT", a2);

e1.display();
e2.display();
}

}
