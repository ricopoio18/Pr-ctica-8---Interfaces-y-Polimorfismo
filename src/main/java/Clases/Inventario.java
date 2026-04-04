package Clases;

import Interfaces.Inventariable;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int capacidadMaxima;
    private List<Inventariable> items;

    public Inventario(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        items = new ArrayList<Inventariable>();
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public List<Inventariable> getItems() {
        return items;
    }

    public boolean agregarItem(Inventariable item){
        if(items.size() < capacidadMaxima){
            return items.add(item);
        } else {
            System.out.println("Inventario lleno");
            return false;
        }
    }

    public boolean eliminarItem(Inventariable item){
        return items.remove(item);
    }

    public void listarItems(){
        if(items.isEmpty()){
            System.out.println("Inventario vacío");
            return;
        }

        for(int i = 0; i < items.size(); i++){
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
}