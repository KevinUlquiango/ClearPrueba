package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;
    
    public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4){
        celda1 = new Celda(codigo1);
        celda2 = new Celda(codigo2);
        celda3 = new Celda(codigo3);
        celda4 = new Celda(codigo4);
    }
    public void mostrarConfiguracion(){
        System.out.println(celda1.getCodigo());
        System.out.println(celda2.getCodigo());
        System.out.println(celda3.getCodigo());
        System.out.println(celda4.getCodigo());
        System.out.println(saldo);
    }

    public Celda buscarCelda(String codigoCelda){
        if (codigoCelda.equals(celda1.getCodigo())){
            return celda1;
        }else if (codigoCelda.equals(celda2.getCodigo())){
            return celda2;
        }else if (codigoCelda.equals(celda3.getCodigo())){
            return celda3;
        }else if (codigoCelda.equals(celda4.getCodigo())){
            return celda4;
        }else{
            return null;
        }
    }

    public void cargarProducto(Producto producto, String codigoCelda, int items){
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        celdaRecuperada.ingresarProducto(producto,items);
    }

    public void mostrarProductos(){
        System.out.println("celda1: codigo: " + celda1.getCodigo() + ",stock: " +
                celda1.getStock()+", Precio: " +celda1.getProducto().getPrecio()
                + ",Nombre: "+ celda1.getProducto().getNombre()) ;
        System.out.println("celda2: codigo: " + celda2.getCodigo() + ",stock: " +
                celda2.getStock()+", Precio: " +celda2.getProducto().getPrecio()
                + ",Nombre: "+ celda2.getProducto().getNombre());
        System.out.println("celda3: codigo: " + celda3.getCodigo() + ",stock: " +
                celda3.getStock()+", Precio: " +celda3.getProducto().getPrecio()
                + ",Nombre: "+ celda3.getProducto().getNombre()) ;
        System.out.println("celda4: codigo: " + celda4.getCodigo() + ",stock: " +
                celda4.getStock()+", Precio: " +celda4.getProducto().getPrecio()
                + ",Nombre: "+ celda4.getProducto().getNombre()) ;
    }

    public static void main(String[] args) {

    }

}
