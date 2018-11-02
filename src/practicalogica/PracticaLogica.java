package practicalogica;
public class PracticaLogica {
    public static void main(String[] args) {
        int n1 = (int) (Math.random()*100),n2 = (int) (Math.random()*100),n3 = (int) (Math.random()*100);
        System.out.println("Numeros desordenados: [" + n1 + "," + n2 + "," + n3 + "]");
        if ((n1==n2)||(n1==n3)||(n2==n3)){System.out.println("Error: No existe combinación para números repetidos");}
        if ((n1 < n2) && (n2 < n3)){System.out.println("Numeros ordenados 1 : [" + n1 + "," + n2 + "," + n3 + "]");}//Combinación 1
        if ((n1 < n3) && (n3 < n2)){System.out.println("Numeros ordenados 2 : [" + n1 + "," + n3 + "," + n2 + "]");}//Combinación 2
        if ((n2 < n1) && (n1 < n3)){System.out.println("Numeros ordenados 3 : [" + n2 + "," + n1 + "," + n3 + "]");}//Combinación 3
        if ((n2 < n3) && (n3 < n1)){System.out.println("Numeros ordenados 4 : [" + n2 + "," + n3 + "," + n1 + "]");}//Combinación 4
        if ((n3 < n2) && (n2 < n1)){System.out.println("Numeros ordenados 5 : [" + n3 + "," + n2 + "," + n1 + "]");}//Combinación 5
        if ((n3 < n1) && (n1 < n2)){System.out.println("Numeros ordenados 6 : [" + n3 + "," + n1 + "," + n2 + "]");}//Combinación 6
    }
}