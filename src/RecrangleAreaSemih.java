import java.util.Scanner;

public class RecrangleAreaSemih {




    double Sunara,Sunarb,Sunararea;


    void pobierz()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nwprowadź wartość a:");
        Sunara = scanner.nextDouble();
        System.out.printf("\nwprowadź wartość b:");
        Sunarb = scanner.nextDouble();
    }
    void obliczenie()
    {
        Sunararea = Sunara * Sunarb;

    }
    void wyswietlanie()
    {
        System.out.printf("\nobszar prostokąta:" + Sunararea);
    }
    static void start()
    {
        RecrangleAreaSemih SBS = new RecrangleAreaSemih();
        SBS.pobierz();
        SBS.obliczenie();
        SBS.wyswietlanie();

    }








}
