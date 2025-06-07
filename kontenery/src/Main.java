public class Main {
    public static void main(String[] args) {
        try{
            Kontenerowiec statek = new Kontenerowiec("Pirat", 30, 5, 500);
            KonteneryNaPlyny   s1=new KonteneryNaPlyny(500, 400,100,2000,false);
            KonteneryNaGaz s2 = new KonteneryNaGaz(400, 100, 200, 1000, 200);
            KonteneryChlodnicze s3 = new KonteneryChlodnicze(200, 10, 300, 500, "Mleko", 10, 0);
            s1.zaladujKontener(800);
            s2.zaladujKontener(700);
            s3.zaladujKontener(600);

            statek.zaladujKontener(s1);
            statek.zaladujKontener(s2);
            statek.zaladujKontener(s3);
            statek.wypiszInformacje();
        }
        catch(Exception e){
            System.out.println("Błąd: "+e.getMessage());
        }
    }
}