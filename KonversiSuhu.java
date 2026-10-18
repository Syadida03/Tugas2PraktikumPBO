package TugaspraktikumPBO_P2;

public class KonversiSuhu {
    public static void main(String[] args){
        float c = 10;
        float f = 15;
        float r = 5;
        
        
        System.out.println("Celcius (C) = " + c);
        System.out.println("Fahrenheit (F) = " + f);
        System.out.println("Reamur (R) = " + r);
        
        System.out.println("Konversi: ");
        System.out.println("Celsius ke Fahrenheit dan Sebaliknya");
        //Rumus C ke F: (C * 9/5) + 32
        //Rumus F ke C: (F - 32) * 5/9
        double CelciusKeFahrenheit = (c * 9.0 / 5.0) + 32;
        double FahrenheitKeCelcius = (f - 32) * 5.0 / 9.0;
        System.out.println(c + " C ke Fahrenheit = " + CelciusKeFahrenheit + " F");
        System.out.println(f + " F ke Celcius    = " + FahrenheitKeCelcius + " C");
        
        System.out.println("Celsius ke Reamur dan Sebaliknya");
        //Rumus C ke R: C * 4/5
        //Rumus R ke C: R * 5/4
        double CelciusKeReamur = c * 4.0 / 5.0;
        double ReamurToCelcius = r * 5.0 / 4.0;
        System.out.println(c + " C ke Reamur     = " + CelciusKeReamur + " R");
        System.out.println(r + " R ke Celcius    = " + ReamurToCelcius + " C");
        
        
        System.out.println("Fahrenheit ke Reamur dan Sebaliknya");
        //Rumus F  ke R: 4/9 * (F - 32)
        //Rumus R ke F: (R * 9/4) + 32
        double FahreinheitToReamur = 4.0 / 9.0 * (f - 32);
        double ReamurToFahrenhit = (9.0 / 4.0 * r) + 32;
        System.out.println(f + " F ke Reamur     = " + FahreinheitToReamur + " R");
        System.out.println(r + " R ke Fahrenheit = " + ReamurToFahrenhit + " F");
    }
}
