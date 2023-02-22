/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author Car
 */
public class ElementoFijo extends Elemento implements Pintable {

    public ElementoFijo(int id, float posicionX, float posicionY, String nombre) {
        super(id, posicionX, posicionY, nombre);
    }

    @Override
    public boolean esPintable() {
        return true; // REVISAR!
    }

    @Override
    public void pintar(int id, String nombre, float x, float y) {

    }
}
