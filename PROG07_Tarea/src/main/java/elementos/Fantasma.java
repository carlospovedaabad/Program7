/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author Car
 */
public class Fantasma extends ElementoMovil implements Pintable {

    public boolean vivo;

    public Fantasma(int id, float posicionX, float posicionY, String nombre) {
        super(id, posicionX, posicionY, nombre);
        this.vivo = true;
    }

    @Override
    public boolean mover(float incrementoX, float incriementoY) {
        return true;
    }

    @Override
    public boolean esPintable() {
        if (this.vivo == true) {
            float x = this.getPosicionX();
            float y = this.getPosicionY();
            boolean dentroX = x <= LIMITE_SUPERIOR && x >= LIMITE_INFERIOR;
            boolean dentroY = y <= LIMITE_SUPERIOR && y >= LIMITE_INFERIOR;
            if (dentroX && dentroY) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    @Override
    public void pintar() {
        if (this.esPintable() == true) {
            System.out.println("PINTANDO ");
        }
    }

}
