public class DivisionResta {
    public static void main(String[] args) {
        int divid = 50;
        int divis = 13;
        int cocie = 0;
        int resi = divid;

        while (resi >= divis) {
            resi = resi - divis;
            cocie++;
        }
        System.out.println("Cociente: " + cocie);
        System.out.println("Residuo: " + resi);
    }
}