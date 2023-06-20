import conicas2.Elipse;
import conicas2.Parabola_Equipo2;
import conicas2.circunferencia_grupo2;
import conicas2.hiperbole;

import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int rep=0;
        circunferencia_grupo2 circulo=new  circunferencia_grupo2(52,8);
        Elipse elipse1=new Elipse(2,5 );
        hiperbole hiper=new hiperbole(4 ,7 );
        Parabola_Equipo2 parabola=new Parabola_Equipo2(7 ,8 ,7,8 ,8) ;

        do{
            System.out.println("------MENU PRINCIPAL----");
            System.out.println("Bienvenidos :)");
            System.out.println("CIRCUNFERENCIA");
            System.out.println("1. ELIPSE");
            System.out.println("2. HIPERBOLE");
            System.out.println("3. PARABOLA");
            System.out.println("iNGRESE UNA OPCION");
            opcion = entrada.nextInt();
               switch(opcion){
                   case 1:
                       System.out.println("Ha seleccionado la opcion 1");
                       System.out.println("Esta es el area del circulo");
                       System.out.println(circulo.area_cir());
                       System.out.println("Este es el perimetro del circulo");
                       System.out.println(circulo.angulo_inscrito_cir());
                       break;
                   case 2:
                       System.out.println("Ha seleccionado la opcion 2");
                       System.out.println("Esta es el area del elipse");
                       System.out.println(elipse1.area_elipse());
                       System.out.println("Este es el perimetro del elipse");
                       System.out.println(elipse1.perimetro_elipse());
                       break;
                   case 3:
                       System.out.println("Ha seleccionado la opcion 3");
                       hiper.variables();

                       break;
                   case 4:
                       System.out.println("Ha seleccionado la opcion 4");
                       System.out.println("Esta es el area de la parabola");
                       parabola.Parabola_Equipo2_ImpVer();
                       break;
                   default:
                       System.out.println("opcion no disponible");
                       break;



               }

        }while(rep==0);





    }

}
