package fcfmclases.practica8.labprogramacion;
/** PRACTICA 8 "ARRAY && SWITCH"
 * CLASE "METODOS"
 * @since 17/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
//LA CLASE SIRVE PARA PODER UTILIZAR LOS METODS DE AHI SU NOMBRE
public class Metodos {
    public static void subcadena(String t, int  a, int b){
        String sub;
        sub=t.substring(a, b);
        System.out.print("\nLA SUB CADENA ES: "+sub);
    }
    
    public static void lnecadena(char[] t){
        String s = new String(t);
        System.out.printf("El arreglo es:\"%s\"",s);
        for (int i=0;i<=5;i++){
            if(t[i]=='1'||t[i]=='2'){
                System.out.printf("\nEl elemento [%d] del arreglo \"%c\" es un numero ",i+1, t[i]);
            }
            if(t[i]=='T'){
                System.out.printf("\nEl elemento [%d] del arreglo \"%c\" es una letra ",i+1, t[i]);
            }
            if(t[i]=='e'){
                System.out.printf("\nEl elemento [%d] del arreglo \"%c\" es una letra ",i+1, t[i]);
            }
            if(t[i]=='x'){
                System.out.printf("\nEl elemento [%d] del arreglo \"%c\" es una letra ",i+1, t[i]);
            }
            if(t[i]==' '){
                System.out.printf("\nEl elemento [%d] del arreglo \"%c\" es un espacio ",i+1, t[i]);
            }
        }
    }
    
    public static void mMcadena(char[] t, String op){
        String s;
        switch (op) {
            case "M":
                s = new String(t);
                System.out.printf("El arreglo es:\"%s\"",s);
                for (int i=0;i<=5;i++){
                    if(t[i]=='S'){
                        t[i]='s';
                    }
                    if(t[i]=='N'){
                        t[i]='n';
                    }
                    if(t[i]=='Y'){
                        t[i]='y';
                    }
                    if(t[i]=='D'){
                        t[i]='d';
                    }
                    if(t[i]=='E'){
                        t[i]='e';
                    }
                    if(t[i]=='R'){
                        t[i]='r';
                    }
                }
                s = new String(t);
                System.out.println("\nDe mayusculas a minusculas: "+s);
                break;
            case "N":
                char[] txto3={'s','n','y','d','e','r'};
                t=txto3;
                s = new String(t);
                System.out.printf("El arreglo es:\"%s\"",s);
                for (int i=0;i<=5;i++){
                    if(t[i]=='s'){
                        t[i]='S';
                    }
                    if(t[i]=='n'){
                        t[i]='N';
                    }
                    if(t[i]=='y'){
                        t[i]='Y';
                    }
                    if(t[i]=='d'){
                        t[i]='D';
                    }
                    if(t[i]=='e'){
                        t[i]='E';
                    }
                    if(t[i]=='r'){
                        t[i]='R';
                    }
                }
                s = new String(t);
                System.out.println("\nDe minusculas a mayusculas: "+s);
                break;
            default:
                throw new AssertionError();
        } 
    }
    
    public static void cScadena(String[] t, char c){
        System.out.println("Arreglo:");
        for(int i=0;i<t.length;i++){
           System.out.printf("Elemento[%d]: ", i+1);
           System.out.println(t[i]);
           }
        char[] palabra;
        System.out.printf("\nCaracter:\"%c\"",c);
        System.out.printf("\n¿Cuantos elemtentos del arreglo empiezan con \"%c\"?\n", c);
        for(int i=0;i<t.length;i++){
            palabra = new char[t[i].length()];
            palabra = t[i].toCharArray();
            if(palabra[0]==c){
                System.out.printf("El elemento[%d] ", i+1);
                System.out.print("\""+t[i]);
                System.out.printf("\" empieza con \"%c\"\n",c);
            }
        }
    }
    
    public static void cScadenafinal(String[] t, char c){
        System.out.println("Arreglo:");
        char[] palabra= new char[8];
        for(int i=0;i<t.length;i++){
           System.out.printf("Elemento[%d]: ", i+1);
           System.out.println(t[i]);
           }
        System.out.printf("\nCaracter:\"%c\"",c);
        System.out.printf("\n¿Cuantos elemtentos del arreglo terminan con \"%c\"?\n", c);
        for(int i=0;i<t.length;i++){
            palabra = new char[t[i].length()];
            palabra = t[i].toCharArray();
            for (int j=5;j<palabra.length;j++){
                if(palabra[j]==c){
                    System.out.printf("El elemento[%d] ", i+1);
                    System.out.print("\""+t[i]);
                    System.out.printf("\" termina con \"%c\"\n",c);
                break;
                }
            }
        }
    } 
}//