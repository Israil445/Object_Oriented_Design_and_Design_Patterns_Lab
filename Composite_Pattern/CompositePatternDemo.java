package Composite_Pattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
    
       Employee CEO = new Employee("John","CEO", 30000);
 
       Employee headSales = new Employee("Robert","Head Sales", 20000);
 
       Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
 
       Employee clerk1 = new Employee("Laura","Marketing", 10000);
       Employee clerk2 = new Employee("Bob","Marketing", 10000);
 
       Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
       Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
 
       CEO.add(headSales);
       CEO.add(headMarketing);//CEO = [headSales, headMarketing]
 
       headSales.add(salesExecutive1);
       headSales.add(salesExecutive2);//headSales = [salesExecutive1, salesExecutive2]
 
       headMarketing.add(clerk1);
       headMarketing.add(clerk2);//headMarketing = [clerk1, clerk2]
 
       //print all employees of the organization
       System.out.println(CEO); //Java uses the .toString() method automatically when you pass an object to System.out.println().
       
       for (Employee headEmployee : CEO.getSubordinates()) {
          System.out.println(headEmployee);
          
          for (Employee employee : headEmployee.getSubordinates()) {
             System.out.println(employee);
          }
       }		
    }
 }