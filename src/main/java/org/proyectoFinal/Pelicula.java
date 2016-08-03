
package org.proyectoFinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author T-107
 */
@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String genero;
    private String clasificacion;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Sala>listaSalas;

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", clasificacion=" + clasificacion + ", listaSalas=" + listaSalas + '}';
    }

    public Pelicula(Long id) {
        this.id = id;
    }

    public Pelicula(String nombre, String genero, String clasificacion, List<Sala> listaSalas) {
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.listaSalas = listaSalas;
    }

    public Pelicula() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public List<Sala> getListaSalas() {
//        if(listaSalas==null){
//            listaSalas=new ArrayList<>();
//        }
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }
}
