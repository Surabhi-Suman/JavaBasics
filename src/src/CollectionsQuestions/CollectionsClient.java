package CollectionsQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
// This question asked by me in Morgan Stanley interview

public class CollectionsClient {
   public static void main(String args[])
   {
       Set<Employee> testSet = new TreeSet<>();
       testSet.add(new Employee("Ram",1));
       testSet.add(new Employee("Sita",2));
       testSet.add(new Employee("Ram",5));
       Set<Employee> hashSet = new HashSet<>();
       hashSet.add(new Employee("Ram",1));
       hashSet.add(new Employee("Sita",2));
       hashSet.add(new Employee("Ram",5));
       System.out.println("TreeSet:"+testSet);
       System.out.println("HashSet:"+hashSet);
   }
}

 class Employee implements Comparable<Employee>{
     String name;
     int id;
     Employee(String name,int id)
     {
         this.name=name;
         this.id=id;
     }
     //Its tree set which uses this method to get the ordering and equality/
     public int compareTo(Employee other)
     {
         if(this.id>other.id)
             return 1;
             else if(this.id==other.id)
                 return 0;
             else
                 return -1;

     }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Employee )
        {
            Employee otherEmployee =(Employee)other;
            if(otherEmployee.name.equals(this.name))
                return true;
        }

        return false;
    }

    public String toString()
    {
        return this.name + ": " + this.id;
    }
//Uncomment the hash code method to see , how hashset differs in output
   /* @Override
 public int hashCode()
 {
     return 17* this.name.hashCode();
 }*/
}


