interface vehicle {
    void sound();
}
class suzuki implements vehicle {
    public void sound() {
        System.out.println("horn");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        suzuki a = new suzuki();
        a.sound();
	}
}
