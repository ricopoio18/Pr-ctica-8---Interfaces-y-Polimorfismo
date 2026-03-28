package Clases;

import Interfaces.Inventariable;

import java.util.List;

public class Inventario {
    private int capacidadMaxima;
    private List<Inventariable> items;

    public Inventario(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public List<Inventariable> getItems() {
        return items;
    }

    public boolean agregarItem(Inventariable item){
        return items.add(item);
    }

    public boolean eliminarItem(Inventariable item){
        return items.remove(item);
    }

    public void listarItems(){
        for(int i = 0; i < items.size(); i++){
            System.out.println((i + 1) + ". " + items.get(i).toString());
        }
    }

}
