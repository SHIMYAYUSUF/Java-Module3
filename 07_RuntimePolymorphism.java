class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        a.sound();
        b.sound();
    }
}
