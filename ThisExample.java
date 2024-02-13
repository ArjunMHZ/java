class Student{
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //method to display student info
     public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);  
        System.out.println();
    }
}
public class ThisExample {
    public static void main(String[] args) {
        Student student1 = new Student("Radha", 19);
        student1.displayInfo();
        
        Student student2 = new Student("Arjun Maharjan",20);
        student2.displayInfo();
        
    }
}

