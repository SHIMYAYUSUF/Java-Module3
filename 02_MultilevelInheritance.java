class Grandparent {
    void house() {
        System.out.println("Grandparent's house");
    }
}

class Parent extends Grandparent {
    void car() {
        System.out.println("Parent's car");
    }
}

class Child extends Parent {
    void bike() {
        System.out.println("Child's bike");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.house();
        c.car();
        c.bike();
    }
}
