import java.util.Scanner;
public class alistirmalar {
    public static void main(String[] args) {

        double tutar, kdvTutar, kdvliTutar;



        System.out.print("Tutarı Giriniz : ");

        Scanner input = new Scanner(System.in);
        tutar = input.nextDouble();


        if (tutar>=0 && tutar<=1000)  {
                kdvTutar = (tutar*0.18);
                kdvliTutar = kdvTutar + tutar;
        }
        else {
            kdvTutar = (tutar * 0.8);
                kdvliTutar = kdvTutar + tutar;
        }



        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);

    }
}
