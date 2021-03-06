package model;
// Generated 14-may-2015 16:14:39 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ciclo generated by hbm2java
 */
@Entity
@Table(name="ciclo"
    ,catalog="tesis"
)
public class Ciclo  implements java.io.Serializable {


     private Integer idciclo;
     private String nombre;
     private Date fechaInicio;
     private Date fechaFin;
     private Set cursos = new HashSet(0);

    public Ciclo() {
    }

    public Ciclo(String nombre, Date fechaInicio, Date fechaFin, Set cursos) {
       this.nombre = nombre;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.cursos = cursos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idciclo", unique=true, nullable=false)
    public Integer getIdciclo() {
        return this.idciclo;
    }
    
    public void setIdciclo(Integer idciclo) {
        this.idciclo = idciclo;
    }
    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_inicio", length=10)
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fecha_fin", length=10)
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ciclo")
    public Set getCursos() {
        return this.cursos;
    }
    
    public void setCursos(Set cursos) {
        this.cursos = cursos;
    }




}


