package controllers;


import java.util.ArrayList;

import domains.Pedido;


public class PedidoProcess {

	public static ArrayList<Pedido> pedidos;
public static void main (String [] args) {
	pedidos = new ArrayList();
	pedidos.add(new Pedido("1","1","1","2021-09-21","10:19","10:30","10:40"));
	pedidos.add(new Pedido("2","3","2","2021-09-21","10:19","10:30","10:40"));
	
	
	for(Pedido p: pedidos) {
		System.out.println(p.toString());
		
	}
	
	
}
}
