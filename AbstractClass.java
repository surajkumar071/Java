



dheeth ho gaya hai ki vah apane aap ko bhi nahi hai ki va






public abstract class AbstractClass{

    @SuppressWarnings("unused")
    abstract void result();
    void display(){
        System.out.println("This is an abstract class");
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.result();
        student.display();
    }
}
class Student extends AbstractClass{
    @Override
    void result(){
        System.out.println("This is a student class");
    }
}