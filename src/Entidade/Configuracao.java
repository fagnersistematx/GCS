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
@Table(name="configuracao")
public class Configuracao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String path_word;
    private String path_excel;
    private String path_pp;
    private String path_team;
    private String path_calc;
    private String path_backup;
    private String path_rede;
    private String path_papel;
    private String path_favorito;
    private String tempo_backup;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar data_revisao;

    public Configuracao() {
    }

    public Configuracao(String path_word, String path_excel, String path_pp, String path_team, String path_calc, String path_backup, String path_rede, String path_papel, String tempo_backup, Calendar data_revisao) {
        this.path_word = path_word;
        this.path_excel = path_excel;
        this.path_pp = path_pp;
        this.path_team = path_team;
        this.path_calc = path_calc;
        this.path_backup = path_backup;
        this.path_rede = path_rede;
        this.path_papel = path_papel;
        this.tempo_backup = tempo_backup;
        this.data_revisao = data_revisao;
    }   

    public Calendar getData_revisao() {
        return data_revisao;
    }

    public void setData_revisao(Calendar data_revisao) {
        this.data_revisao = data_revisao;
    }

    public String getTempo_backup() {
        return tempo_backup;
    }

    public void setTempo_backup(String tempo_backup) {
        this.tempo_backup = tempo_backup;
    }
    
    public String getPath_backup() {
        return path_backup;
    }

    public void setPath_backup(String path_backup) {
        this.path_backup = path_backup;
    }

    public String getPath_calc() {
        return path_calc;
    }

    public void setPath_calc(String path_calc) {
        this.path_calc = path_calc;
    }

    public String getPath_excel() {
        return path_excel;
    }

    public void setPath_excel(String path_excel) {
        this.path_excel = path_excel;
    }

    public String getPath_papel() {
        return path_papel;
    }

    public void setPath_papel(String path_papel) {
        this.path_papel = path_papel;
    }

    public String getPath_pp() {
        return path_pp;
    }

    public void setPath_pp(String path_pp) {
        this.path_pp = path_pp;
    }

    public String getPath_rede() {
        return path_rede;
    }

    public void setPath_rede(String path_rede) {
        this.path_rede = path_rede;
    }

    public String getPath_team() {
        return path_team;
    }

    public void setPath_team(String path_team) {
        this.path_team = path_team;
    }

    public String getPath_word() {
        return path_word;
    }

    public void setPath_word(String path_word) {
        this.path_word = path_word;
    }

    public String getPath_favorito() {
        return path_favorito;
    }

    public void setPath_favorito(String path_favorito) {
        this.path_favorito = path_favorito;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Configuracao)) {
            return false;
        }
        Configuracao other = (Configuracao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Path[ id=" + id + " ]";
    }
    
}
