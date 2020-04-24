
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
        Puppy puppy_2 = new Puppy();
        puppy_2.setAge(2);
        puppy_2.getAge();
        System.out.println("My puppy age is " + puppy_2.puppyAge);
    }
}