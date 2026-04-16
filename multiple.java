interface A {
    void showA();
}

interface B {
    void showB();

    default void draw() {
        System.out.println("APPLE");
    }
}

class C implements A, B {
    public void showA() {
        System.out.println("Class A method");
    }

    public void showB() {
        System.out.println("Class C method");
    }

    void showD() {
        System.out.println("Class D method");
    }
}

public class multiple {
    public static void main(String[] args) {
        C obj = new C();

        obj.showA();  // from interface A
        obj.showB();  // from interface B
        obj.draw();   // default method from interface B
        obj.showD();  // class C method
    }
}