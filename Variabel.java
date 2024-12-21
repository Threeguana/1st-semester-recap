public class Variabel {
    public static void main(String[] args) {
        String myHobi = "Playing Video Games";
        boolean isSmart = true;
        char gender = 'F';
        byte age = 18;
        double $gpa = 3.5, height = 1.78;
        System.out.println(myHobi);
        System.out.println("Is smart? " + isSmart);
        System.out.println("Gender? " + gender);
        System.out.println("Age? " + age);
        System.out.println(String.format("GPA %s, height %s", $gpa, height));
    }
}