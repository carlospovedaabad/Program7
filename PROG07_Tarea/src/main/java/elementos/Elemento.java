/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elementos;

/**
 *
 * @author Car
 */
public abstract class Elemento implements Pintable{

    private int id;
    private float posicionX;
    private float posicionY;
    private String nombre;

    protected static final float TAMANO_PANTALLA = 1000f;
    protected static final float LIMITE_INFERIOR = 0.5f*TAMANO_PANTALLA;
    protected static final float LIMITE_SUPERIOR = -0.5f*TAMANO_PANTALLA;

    public Elemento(int id, float posicionX, float posicionY, String nombre) {
        this.id = id;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.nombre = nombre;
    }

    protected void posicionar(float x, float y) {
        this.setPosicionX(x);
        this.setPosicionY(y);
    }

    public abstract boolean esPintable();

    public int getId() {
        return id;
    }

    public float getPosicionX() {
        return posicionX;
    }

    public float getPosicionY() {
        return posicionY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosicionX(float posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(float posicionY) {
        this.posicionY = posicionY;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Elemento{" + "id=" + id + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", nombre=" + nombre + '}';
    }

}
