package model;
// Generated 14-may-2015 16:14:39 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name="curso"
    ,catalog="tesis"
)
public class Curso  implements java.io.Serializable {


     private Integer idcurso;
     private Ciclo ciclo;
     private Nivel nivel;
     private String nombre;
     private Integer puntuacion;
     private String descripcion;
     private Set usuarios = new HashSet(0);

    public Curso() {
    }

	
    public Curso(Ciclo ciclo, Nivel nivel) {
        this.ciclo = ciclo;
        this.nivel = nivel;
    }
    public Curso(Ciclo ciclo, Nivel nivel, String nombre, Integer puntuacion, String descripcion, Set usuarios) {
       this.ciclo = ciclo;
       this.nivel = nivel;
       this.nombre = nombre;
       this.puntuacion = puntuacion;
       this.descripcion = descripcion;
       this.usuarios = usuarios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idcurso", unique=true, nullable=false)
    public Integer getIdcurso() {
        return this.idcurso;
    }
    
    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ciclo_idciclo", nullable=false)
    public Ciclo getCiclo() {
        return this.ciclo;
    }
    
    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nivel_idnivel", nullable=false)
    public Nivel getNivel() {
        return this.nivel;
    }
    
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="puntuacion")
    public Integer getPuntuacion() {
        return this.puntuacion;
    }
    
    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="curso")
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


