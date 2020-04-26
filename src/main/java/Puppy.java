
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
        Puppy puppy_3 = new Puppy();
        puppy_3.setAge(2);
        puppy_3.getAge();
        System.out.println("My puppy age is " + puppy_3.puppyAge);
    }
}