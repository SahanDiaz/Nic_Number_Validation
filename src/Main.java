public class Main {

    public static void main(String[] args) {

        NicValidator test1 = new NicValidator();
        test1.Status();
        System.out.println("******************");
        System.out.println(" ");
        System.out.println("Year : " + test1.GetYear());
        System.out.println("Month : " );
        System.out.println("Days : "+ test1.GetDays());
        System.out.println("Gender : "+ test1.GetGender());

    }
}