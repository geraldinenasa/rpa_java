package geraldine.ejerciciosrpa;
import java.util.Scanner;

public class Ejerciciosrpa {

    public static void main(String[] args) {
        Double numeroGramos, resultados;
        int cucharaPequena = 7;
        int cucharaGrande = 18;
        int tazaGrande = 120;
        int tazaPequena = 70;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte gramos de azucar: ");
        numeroGramos = sc.nextDouble();
        //condicion
          if (numeroGramos >= 0 && numeroGramos<cucharaGrande) {
            resultados = numeroGramos/cucharaPequena;
            System.out.println(resultados + " cucharadas pequeñas");
        } else if (numeroGramos >= cucharaGrande) {
            resultados = numeroGramos/cucharaGrande;
            System.out.println(resultados + " cucharadas grandes");
        } else if (numeroGramos >= tazaPequena) {
            resultados = numeroGramos/tazaPequena;
            System.out.println(resultados + " tazas pequeñas");
        } else if (numeroGramos >= tazaGrande) {
            resultados = numeroGramos/tazaGrande;
            System.out.println(resultados + " tazas grandes");
        } else {
            //preguntar esta funcion como tomar en cuenta valores string
            System.out.println("Inserte un número válido");
        }
    }
}
