
public class Puppy {
    int puppyAge;
    public Puppy(){
       // System.out.println("Hello "+ name);
    }
    public void setAge (int age){
        puppyAge = age;
    }
    public int getAge () {
        return puppyAge;
    }
    public static void main (String[] args) {
        Puppy puppy_1 = new Puppy();
        puppy_1.setAge(2);
        puppy_1.getAge();
        System.out.println("My puppy age is " + puppy_1.puppyAge);
    }
}