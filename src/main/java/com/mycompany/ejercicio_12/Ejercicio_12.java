package com.mycompany.ejercicio_12;

import java.util.Scanner;
public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x, y, w, z;
        System.out.println("Ingrese el salario por hora del trabajador: ");
        x = input.nextFloat();
        System.out.println("Ingrese las horas trabajadas a la semana: ");
        z = input.nextFloat();
        System.out.println("Ingrese el porcentaje de retención de fuente: ");
        w = input.nextFloat();
        w = w/100;
        y = x*z;
        System.out.println("El salario bruto es de: $" + y);
        System.out.println("La retención en la fuente es de: $" + y*w);
        System.out.println("El salario neto es de: $" + y*(1-w));
    }
}