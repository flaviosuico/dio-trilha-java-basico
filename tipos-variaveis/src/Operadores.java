public class Operadores {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(a && b) {
            System.out.println("Ambos son verdaderos");
        } else if (a || b) {
            System.out.println("Al menos uno es verdadero");
        } else {
            System.out.println("Ninguno es verdadero");
        }
        
    }
}
