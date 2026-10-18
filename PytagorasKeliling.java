package TugaspraktikumPBO_P2;

public class PytagorasKeliling {
    public static void main(String[] args){
        //Mencari nilai c(kemiringan) dengan pytagoras
        //rumus pytagoras: c = (akar kuadrat)/a^2 + b^2
        int a = 6;
        int b = 8;
        double c = Math.sqrt((a*a) + (b*b));
        double keliling = a + b + c;
        
        System.out.println("Sisi a = " + a);
        System.out.println("Alas b = " + b);
        System.out.println("Kemiringan c = " + c);
        System.out.println("Keliling Segitiga = " + keliling);
    }
}
