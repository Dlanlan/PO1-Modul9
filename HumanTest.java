public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        // turunan LivingThing
        human.breath();
        human.eat();

        // override method Human
        human.walk();
    }
}