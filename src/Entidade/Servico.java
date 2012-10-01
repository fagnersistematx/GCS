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
@Table(name = "servico")
public class Servico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String des;
    private String obs;
    private String responsavel;
    private String estado;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar data_servico;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar data_entraga_servico;

    public Servico(String des, String obs, String responsavel, Calendar data_servico,Calendar data_entraga_servico, String estado) {
        this.des = des;
        this.obs = obs;
        this.responsavel = responsavel;
        this.data_servico = data_servico;
        this.data_entraga_servico = data_entraga_servico;
        this.estado = estado;
    }

    public Servico() {
    }

    public Calendar getData_servico() {
        return data_servico;
    }

    public void setData_servico(Calendar data_servico) {
        this.data_servico = data_servico;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getData_entraga_servico() {
        return data_entraga_servico;
    }

    public void setData_entraga_servico(Calendar data_entraga_servico) {
        this.data_entraga_servico = data_entraga_servico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        if (!(object instanceof Servico)) {
            return false;
        }
        Servico other = (Servico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Servico[ id=" + id + " ]";
    }
}
