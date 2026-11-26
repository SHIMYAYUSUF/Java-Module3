class MethodOverloading {
    void display() {
        System.out.println("No arguments");
    }

    void display(int a) {
        System.out.println("Number: " + a);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.display();
        obj.display(10);
        obj.display(10, 20);
    }
}