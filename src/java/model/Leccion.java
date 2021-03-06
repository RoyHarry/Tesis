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
 * Leccion generated by hbm2java
 */
@Entity
@Table(name="leccion"
    ,catalog="tesis"
)
public class Leccion  implements java.io.Serializable {


     private Integer idleccion;
     private DetalleLeccion detalleLeccion;
     private String estado;
     private String mensaje;
     private String descripcion;
     private Integer examen;
     private Integer notaFinal;
     private Set nivels = new HashSet(0);

    public Leccion() {
    }

	
    public Leccion(DetalleLeccion detalleLeccion) {
        this.detalleLeccion = detalleLeccion;
    }
    public Leccion(DetalleLeccion detalleLeccion, String estado, String mensaje, String descripcion, Integer examen, Integer notaFinal, Set nivels) {
       this.detalleLeccion = detalleLeccion;
       this.estado = estado;
       this.mensaje = mensaje;
       this.descripcion = descripcion;
       this.examen = examen;
       this.notaFinal = notaFinal;
       this.nivels = nivels;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idleccion", unique=true, nullable=false)
    public Integer getIdleccion() {
        return this.idleccion;
    }
    
    public void setIdleccion(Integer idleccion) {
        this.idleccion = idleccion;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="detalle_leccion_iddetalle_leccion", nullable=false)
    public DetalleLeccion getDetalleLeccion() {
        return this.detalleLeccion;
    }
    
    public void setDetalleLeccion(DetalleLeccion detalleLeccion) {
        this.detalleLeccion = detalleLeccion;
    }
    
    @Column(name="estado", length=45)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Column(name="mensaje", length=45)
    public String getMensaje() {
        return this.mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="examen")
    public Integer getExamen() {
        return this.examen;
    }
    
    public void setExamen(Integer examen) {
        this.examen = examen;
    }
    
    @Column(name="nota_final")
    public Integer getNotaFinal() {
        return this.notaFinal;
    }
    
    public void setNotaFinal(Integer notaFinal) {
        this.notaFinal = notaFinal;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="leccion")
    public Set getNivels() {
        return this.nivels;
    }
    
    public void setNivels(Set nivels) {
        this.nivels = nivels;
    }




}


