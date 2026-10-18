package TugaspraktikumPBO_P2;

public class OperatorIncrement {
    public static void main(String[] args){
        int angka = 5;
        System.out.println("Nilai Awal: " + angka);
        
        //angka++ = post-increment yaitu dicetak dulu baru ditambah
        System.out.println("Post-Increment: " + (++angka));
        
        //++angka = pre-increment yaitu ditambah dulu angkanya, setelah itu dicetak
        System.out.println("Pre-Increment: " + (angka++));
        
              
    }
}
