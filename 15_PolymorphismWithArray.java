class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Animal animals[] = {new Dog(), new Cat()};

        for (Animal a : animals) {
            a.sound();
        }
    }
}
