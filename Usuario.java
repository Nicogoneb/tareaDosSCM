/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadosigenieriadesoftware;

/**
 *
 * @author Nicolas
 */
public class Usuario {
    
    private String nombre;
    private int cedula;
    private String contraseña;
    private int edad;
    private int cantidadDeHijos;
    private int saldo = 0;
	
	 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Usuario(String nombre, int cedula, String contraseña, int edad, int cantidadDeHijos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.edad = edad;
        this.cantidadDeHijos = cantidadDeHijos;
    }
	
	    @Override
    public boolean equals(Object obj) {
        final Usuario other = (Usuario) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }

}