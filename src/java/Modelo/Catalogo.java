package Modelo;
// Generated 23/11/2017 12:40:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Catalogo generated by hbm2java
 */
public class Catalogo  implements java.io.Serializable {


     private Integer idCatalogo;
     private String nombre;
     private Set productos = new HashSet(0);
     private Set usuarios = new HashSet(0);

    public Catalogo() {
    }

	
    public Catalogo(String nombre) {
        this.nombre = nombre;
    }
    public Catalogo(String nombre, Set productos, Set usuarios) {
       this.nombre = nombre;
       this.productos = productos;
       this.usuarios = usuarios;
    }
   
    public Integer getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

