/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Fagner
 */
@Entity
@Table(name="backup")
public class Backup implements Serializable {
    
    public static final String TIPOAUTO     = "Backup Automático";
    public static final String TIPOMANUAL   = "Backup manual";
    public static final String TIPORESTAURAR= "Restauração";
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String arquivo;
    private String tipo;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar data_bkp;

    public Backup() {
    }

    public Backup(String usuario, String arquivo, String tipo, Calendar data_bkp) {
        this.usuario = usuario;
        this.arquivo = arquivo;
        this.tipo = tipo;
        this.data_bkp = data_bkp;
    }  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Calendar getData_bkp() {
        return data_bkp;
    }

    public void setData_bkp(Calendar data_bkp) {
        this.data_bkp = data_bkp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Backup)) {
            return false;
        }
        Backup other = (Backup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Backup[ id=" + id + " ]";
    }
    
}
