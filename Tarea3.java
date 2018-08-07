/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author JuanAndrés
 */
public class Tarea3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int Tarea=0;
        System.out.println("Ingrese el numero del ejercicio.");
        System.out.println("1, 2 o 3, cualquier otro numero para salir.");
        Tarea = leer.nextInt();
        while(Tarea >0 && Tarea <4)
        {
            if (Tarea==1)
            {
                int Iteracion = 0;
                int Pares = 0;
                int MultiploTres = 0;
                int Numero = 0;
                int Primo = 0;
                while(Iteracion < 20){
                System.out.println("Ingresar Valor: ");
                Numero = leer.nextInt();
       
                if(Numero % 2 == 0)
                {
                    Pares++;
                }
       
                if(Numero % 3 == 0)
                {
                     MultiploTres++;
                }
       
                int IteracionDivision = 1;
                int DivisionExacta = 0;
       
                while(IteracionDivision <= Numero)
                {
                      if(Numero % IteracionDivision == 0)
                      {
                            DivisionExacta++;
                      }
                      IteracionDivision++;              
                }
                if (DivisionExacta == 2)
                {
                    Primo++;
                }
                Iteracion++;
                }
                System.out.println("Cantidad de numeros pares: "+Pares);
                System.out.println("Cantidad de numeros multiplos de 3: "+MultiploTres;
                System.out.println("Cantidad de numeros primos: "+Primo);
            }
            else if(Tarea==2)
            {
                String NombreEmpleado;
                double Salario;
                double Deduccion=0;
                System.out.println("Ingrese nombre del empleado: ");
                NombreEmpleado=leer.nextLine();
                System.out.println("Ingrese el salario: ");
                Salario=leer.nextDouble();
                if (Salario>0.01 && Salario<152557.15)
                {
                    Deduccion=Salario*0.0;
                }
                else if (Salario>152557.16 && Salario<232622.61)
                {
                    Deduccion=(Salario*0.15);
                }
                else if (Salario>232622.62 && Salario<540982.82)
                {
                    Deduccion=Salario*0.20;
                }
                else if (Salario>540982.83)
                {
                    Deducción=Salario*0.25;
                }
                System.out.println("\n\n Nombre: "+NombreEmpleado);
                System.out.println("Salario: "+Salario);
                System.out.println("Deduccion: "+Deduccion);
                                
            }
            else if(Tarea==3)
            {
                
                int NumeroFac=0;
                int SalidaFac=0;
                System.out.println("Ingresar numero para calcular su factorial: ");
                NumeroFac=leer.nextInt();
                if(NumeroFac>0)
                {
                    int IteracionFac;
                    IteracionFac=NumeroFac;
                    SalidaFac=NumeroFac;
                    while(IteracionFac>0)
                    {
                        IteracionFac--;
                        if(IteracionFac!=0)
                        {
                            SalidaFac*=IteracionFac;
                        }
                    }
                    System.out.println(+NumeroFac+"!= "+SalidaFac);
                }
            }
        System.out.println("\n\n\n Ingrese el numero del ejercicio.");
        System.out.println("1, 2 o 3, cualquier otro numero para salir.");
        Tarea = leer.nextInt();
        }
    }
    
}
