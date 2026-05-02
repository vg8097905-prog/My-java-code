package OOPs;

interface camera {
    void captures1();
}

interface video {
    void captures2();
}

class mobile implements camera, video {
    public void captures1() {
        System.out.println("Taking a high quality photo... ");
    }

    public void captures2() {
        System.out.println("Shoot a cinematic video ");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.captures1();
        m1.captures2();
    }
}
