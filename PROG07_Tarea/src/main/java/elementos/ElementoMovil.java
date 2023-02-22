/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author Car
 */
public abstract class ElementoMovil extends Elemento {

    public ElementoMovil(int id, float posicionX, float posicionY, String nombre) {
        super(id, posicionX, posicionY, nombre);
    }
    public abstract boolean mover(float incrementoX, float incriementoY);
    
}
