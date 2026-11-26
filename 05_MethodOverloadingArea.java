class MethodOverloadingArea {
    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        MethodOverloadingArea obj = new MethodOverloadingArea();

        System.out.println("Square: " + obj.area(5));
        System.out.println("Rectangle: " + obj.area(5, 10));
    }
}
    