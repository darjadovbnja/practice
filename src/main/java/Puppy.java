
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
        Puppy my_puppy = new Puppy();
        my_puppy.setAge(2);
        my_puppy.getAge();
        System.out.println("My puppy age is " + my_puppy.puppyAge);
    }
}