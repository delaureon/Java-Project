class calculator {

    public static void main(String[] args) {
        add(3,4);
        sub(4,3);
        multi(6,6);
        div(3,3);
    }

    public static void div(int a, int b) {
        System.out.println(a + " divided by " + b + " is " + (a/b));
    }

    public static void multi(int a, int b) {
        System.out.println(a + " multiplied by " + b + " is " + (a * b));
    }

    public static void sub(int a, int b) {
        System.out.println(a + " subtracted by " + b + " is " + (a - b));
    }

}