/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Fagner
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf_cnpj;
    private String rg;
    private String data_nas;
    private String tel_fixo;
    private String cel1;
    private String cel2;
    private String email;
    private String sexo;
    private String estado_civil;
    private boolean tipo;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE})
    private Endereco endereco;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE})
    private List<Maquina> maquinas;

    public Cliente() {
    }

    //Cliente físico.
    public Cliente(String nome, String cpf_cnpj, String rg, String data_nas, String tel_fixo, String cel1, String cel2, String email, String sexo, String estado_civil, boolean tipo, Endereco endereco) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.rg = rg;
        this.data_nas = data_nas;
        this.tel_fixo = tel_fixo;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.email = email;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.tipo = tipo;
        this.endereco = endereco;
    }

    //Cliente juridico.
    public Cliente(String nome, String cpf_cnpj, String tel_fixo, String cel1, String cel2, String email, boolean tipo, Endereco endereco) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.tel_fixo = tel_fixo;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.email = email;
        this.tipo = tipo;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCel1() {
        return cel1;
    }

    public void setCel1(String cel1) {
        this.cel1 = cel1;
    }

    public String getCel2() {
        return cel2;
    }

    public void setCel2(String cel2) {
        this.cel2 = cel2;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getData_nas() {
        return data_nas;
    }

    public void setData_nas(String data_nas) {
        this.data_nas = data_nas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTel_fixo() {
        return tel_fixo;
    }

    public void setTel_fixo(String tel_fixo) {
        this.tel_fixo = tel_fixo;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public void addMaquina(Maquina maquina) {
        this.maquinas.add(maquina);
    }

    public void atualizaCliente(String nome, String cpf_cnpj, String rg, String data_nas, String tel_fixo, String cel1, String cel2,
            String email, String sexo, String estado_civil, boolean tipo) {
        
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.rg = rg;
        this.data_nas = data_nas;
        this.tel_fixo = tel_fixo;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.email = email;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.tipo = tipo;
        this.endereco = endereco;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Cliente[ id=" + id + " ]";
    }
}
