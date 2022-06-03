package fcfmclases.practica8.labprogramacion;
import java.util.Scanner;
/** PRACTICA 8 "ARRAY && SWITCH"
 * RUN FILE
 * @since 17/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public class RunPractica8 {
    public static void main(String[] args) {
    // S C A N N E R
        Scanner scan = new Scanner(System.in);
        Metodos iniciar = new Metodos();
        //Para poder usar el metodo
    // V A R I A B L E S
        String[] txt4 = {"Nombre","Palabra", "Trabajo", "Codigo", "Netbeans"};
        String txto1 = "Hola Mundo";
        String ops;
        char[] txto2={'T','e','x',' ','1','2'};
        char[] txto3={'S','N','Y','D','E','R'};
        char c1='N', c2='o';
        byte op;
    // S O U T 
        System.out.println("¡ P R A C T I C A   M E T O D O S !");
        System.out.println("1) METODO SUBCADENA");
        System.out.println("2) METODO LNE CADENA");
        System.out.println("3) METODO MAYUSCULAS-MINUSCULAS");
        System.out.println("4) METODO CUANTOS EMPIEZAN CON...");
        System.out.println("5) METODO CUANTOS TERMINAN CON...");
        System.out.println("Selecciona una opcion...");
        op = scan.nextByte();
        switch (op) {
            case 1: //METODO SUBCADENA
                System.out.println("\tMETODO SUBCADENA");
                System.out.print("La cadena es: "+txto1);
                iniciar.subcadena(txto1, 2, 7);
                break;
            case 2: //METODO LNE CADENA (Letra Numero Espacio)
                System.out.println("\tMETODO CANDENA: LETRA NUMERO ESPACIO");
                iniciar.lnecadena(txto2);
                break;
            case 3: //METODO MAYUSCULAS MINUSCULAS
                System.out.println("\tMETODO MAYUSCULAS-MINUSCULAS");
                System.out.println("Usa \"M\" para transformar de Mayusculass a minusculas");
                System.out.println("Usa \"N\" para transformar de minusculas a Mayusculass");
                System.out.println("Ingresa tu opcion (MAYUSCULAS)...");
                ops = scan.next();
                switch (ops) {
                    case "M":
                        iniciar.mMcadena(txto3, ops);
                        break;
                    case "N":
                        iniciar.mMcadena(txto3, ops);
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 4: //METODO CUANTOS EMPIEZAN CON...
                System.out.println("\tMETODO CARACTER INICIAL");
                iniciar.cScadena(txt4,c1);
                break;
            case 5: //METODO CUANTOS TERMINAN CON...
                System.out.println("\tMETODO CARACTER FINAL");
                iniciar.cScadenafinal(txt4,c2);
                break;
            default:
                throw new AssertionError();
        }
    }
}