package mascot;

public abstract class JavaMascot{
    public void executionAction() {}
}
class Duke extends JavaMascot {
    @Override
    public void executionAction() {
        System.out.println("Punch!"); }
}

class MainTest {
    public static void main(String[] args) {
        Duke duke = new Duke();
        duke.executionAction();
    }
}






//
//class Duke extends JavaMascot {
//    @Override
//    public void executeAction() {
//        System.out.println("Punch!");
//    }
//}
//
//class Juggy extends JavaMascot {
//    @Override
//    public void executeAction() {
//        System.out.println("Fly!");
//    }
//}
//
//class JavaMascotTest {
//    public static void main(String[] args) {
//        JavaMascot dukeMascot = new Duke();
//        JavaMascot juggyMascot = new Juggy();
//        dukeMascot.executeAction();
//        juggyMascot.executeAction();
//    }
//}