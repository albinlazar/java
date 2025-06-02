// This is a CLASS - like a blueprint for creating students
public class Student {
    // ATTRIBUTES (what every student has)
    String name;
    int age;
    String course;
    
    // METHODS (what students can do)
    void study() {
        System.out.println(name + " is studying " + course);
    }
    
    void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", Course: " + course);
    }
    
    // Main method to test our class
    public static void main(String[] args) {
        // Creating OBJECTS (actual students) from our CLASS
        Student alice = new Student();  // 'new' keyword creates an object
        Student bob = new Student();
        
        // Setting values for alice object
        alice.name = "Alice";
        alice.age = 20;
        alice.course = "Java Programming";
        
        // Setting values for bob object
        bob.name = "Bob";
        bob.age = 22;
        bob.course = "Data Structures";
        
        // Using methods on our objects
        System.out.println("=== Student Information ===");
        alice.displayInfo();
        alice.study();
        
        bob.displayInfo();
        bob.study();
    }
}

