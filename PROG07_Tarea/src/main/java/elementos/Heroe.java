/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author Car
 */
public class Heroe extends ElementoMovil implements Pintable {

    private int fuerza;

    public Heroe(int id, float posicionX, float posicionY, String nombre, int fuerza) {
        super(id, posicionX, posicionY, nombre);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza >= 0 && fuerza <= 9) {
            this.fuerza = fuerza;
        } else {
            throw new IllegalArgumentException("La fuerza debe ser un numero entero entre 0 y 9");
        }

    }

    public boolean colisiona(Elemento p) {

        return false;

    }

    @Override
    public boolean mover(float incrementoX, float incriementoY) {
        return true;
    }

    @Override
    public boolean esPintable() {
        return true;
    }

    @Override
    public void pintar() {
        if (this.esPintable() == true) {
            System.out.println("PINTANDO ");
        }
    }
}
