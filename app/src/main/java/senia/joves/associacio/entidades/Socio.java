package senia.joves.associacio.entidades;

import java.io.Serializable;

/**
 * Created by Ruben on 02/05/2017.
 */

public class Socio implements Serializable{
    private String direccion;
    private String dni;
    private String email;
    private String nombre;
    private String poblacion;
    private String quota;
    private String socio;
    private String telefono;
    private String imagen;

    public Socio() {
    }

    public Socio(String direccion, String dni, String email, String nombre, String poblacion, String quota, String socio, String telefono) {
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.quota = quota;
        this.socio = socio;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
