public class Student {
        String name;
        int age;
        public Student(String n, int a) {
            name = n;
            age = a;
        }
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        public static void main(String[] args) {
            Student student1 = new Student("Arjun Maharjun", 20);
            student1.displayInfo();
        }
    }

