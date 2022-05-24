import java.util.Scanner;

public class NicValidator {

    boolean IsNewNic = false;
    String NicNumber;
    Scanner Scan = new Scanner(System.in);

    public void Status(){

        System.out.print("Please enter your Nic Number : ");
        this.NicNumber = Scan.nextLine();
        Scan.close();

        if(NicValidation(NicNumber)){
            System.out.println("valid nic number");
            if(NicNumber.length()==12){
                this.IsNewNic =true;
                System.out.println("new nic");
            }
        }else{
            System.out.println("nic number not valid");
        }
    }

    public static boolean NicValidation(String nic){
        String _IdNumber ="^([0-9]{9}[vVxX]|[0-9]{12})$";
        return nic.matches(_IdNumber);
    }

    public int GetYear() {
        if(IsNewNic){
           String Year = NicNumber.substring(0,3);
           return Integer.parseInt(Year);
        } else {
            String Year = NicNumber.substring(0,2);
            int Year2 = Integer.parseInt(Year);
            return 1900+Year2;
        }
    }

    public int GetDays(){
        if(IsNewNic) {
            String _Day = NicNumber.substring(4,7);
            return Integer.parseInt(_Day);
        } else {
            String _Day = NicNumber.substring(2,5);
            return Integer.parseInt(_Day);
        }
    }

    public String GetGender(){
        int _Days = GetDays();
        if(_Days<500){
            return "Male";
        }
        else {
            return "Female";
        }
    }
}
