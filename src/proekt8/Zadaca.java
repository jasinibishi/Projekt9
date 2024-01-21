package proekt8;

import java.util.Scanner;

public class Zadaca {

    public static void main(String[] args) {
        int a, b, c, d, e;
        int Parni_Broevi = 0;
        Scanner tastatura = new Scanner(System.in);
        System.out.println("| ZADACA - DOMASNO |");
        System.out.println("| Vnesuvate vrednosti za 5 elementi od nizat |");
        System.out.print("| Prv broj : ");
        a = tastatura.nextInt();
        System.out.print("| Vtor broj : ");
        b = tastatura.nextInt();
        System.out.print("| Tret broj: ");
        c = tastatura.nextInt();
        System.out.print("| Cetvrt broj: ");
        d = tastatura.nextInt();
        System.out.print("| Petti broj: ");
        e = tastatura.nextInt();
        System.out.println("| Vnesenite broevi vo nizata se: " + a + " " + b + " " + c + " " + d + " " + e + " ");
        if (a%2 == 0) 
        {
            Parni_Broevi += a;
        }
        if (b%2 == 0) 
        {
        	Parni_Broevi += b;
        }
        if (c%2 == 0) 
        {
        	Parni_Broevi += c;
        }
        if (d%2 == 0) 
        {
        	Parni_Broevi += d;
        }
        if (e % 2 == 0) 
        {
        	Parni_Broevi += e;
        }
        System.out.println("Zbirot na parnite broevi od nizata e : "+Parni_Broevi);
    }
}