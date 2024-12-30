package com.practicas.retos;

public class Direccion  {

private String direccion;
private String ciudad;
private String estado;
private String codigoPostal;
private String pais;


public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public String getCiudad() {
    return ciudad;
}
public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
}
public String getEstado() {
    return estado;
}
public void setEstado(String estado) {
    this.estado = estado;
}
public String getCodigoPostal() {
    return codigoPostal;
}
public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
}
public String getPais() {
    return pais;
}
public void setPais(String pais) {
    this.pais = pais;
}
public Direccion(String direccion, String ciudad, String estado, String codigoPostal, String pais) {
    this.direccion = direccion;
    this.ciudad = ciudad;
    this.estado = estado;
    this.codigoPostal = codigoPostal;
    this.pais = pais;
}
 






}
