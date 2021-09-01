package com.company;

import com.company.model.Entregador;
import com.company.model.Vendedor;

public class Main {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Jose", "Vasos",8000d,7,8000d);
        Double total = vendedor.calculePlus();
        if(!total.equals(0d)){
            System.out.println("Vendedor: " + vendedor.getNome()+ " | Recebeu esse mês o valor de: " + total + "\n");
        }

        Entregador entregador = new Entregador("Lucas", "Quadros", 4000d,4,3);
        Double salarioTotal = entregador.calculePlus();
        if(!salarioTotal.equals(0d)){
            System.out.println("Entregador: " + entregador.getNome()+ " | Recebeu esse mês o valor de: " + salarioTotal + "\n");
        }

    }
}
