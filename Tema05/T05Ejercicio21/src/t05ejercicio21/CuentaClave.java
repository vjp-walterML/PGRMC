/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05ejercicio21;

/**
 *
 * @author Walter
 */
public class CuentaClave extends Cuenta {

    private int clave;
    
    public CuentaClave(int clave){
        super();
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public int getClave(){
        return clave;
    }
    
    @Override
     public void extraer(float cantidad) {
         
     }
}
