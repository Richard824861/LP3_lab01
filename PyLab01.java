import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do{
            vida ++;
            System.out.println("Vida: "+ vida +"\t¿Cual es el numero secreto? ");
            rp = sc.nextInt();
            if(rp == 1234)
                fl = true;
        }while(vida < 3 && !fl );
        if (fl == true){
            System.out.println("Adivinastes!!!!!");
            // Mi primera modificacion....
            System.out.println("Eres un genio!!!!");}
        else 
            System.out.println("ups, perdiste...");
            // Segunda modificacion
            System.out.println("Puedes intentar de nuevo ....");

            // Tercera modificacion son los comentarios.
    }
}