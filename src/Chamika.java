interface Chamika {
    public abstract void sound();
    public abstract void sleep();
}
class Human implements Chamika{
    @Override
    public void sound() {
        System.out.println("grrr.........grrrr.....");
    }

    @Override
    public void sleep() {
        System.out.println("Chamika Sleep");
    }
}
class Main{
    public static void main(String[] args) {

    Human h = new Human();
    h.sound();
    h.sleep();
    }
}
