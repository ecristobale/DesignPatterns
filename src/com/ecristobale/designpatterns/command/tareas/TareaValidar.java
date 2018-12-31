package com.ecristobale.designpatterns.command.tareas;

import com.ecristobale.designpatterns.command.model.Producto;

public class TareaValidar implements ITareaProducto {

	@Override
	public void ejecutar(Producto producto) {
		if(producto.getPrecio() <= 10) {
			System.out.println(producto.getName() + " no v�lido");
		} else {
			System.out.println(producto.getName() + " es v�lido");
		}
	}

}
