package model.bean;
// Generated 20/04/2019 15:26:40 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private Tipousuario tipousuario;
     private String nome;
     private String email;
     private String login;
     private String senha;
     private Integer status;
     private Date dtCadastro;
     private Set recepcionistas = new HashSet(0);
     private Set acessos = new HashSet(0);
     private Set medicos = new HashSet(0);

    public Usuario() {
    }

    public Usuario(Tipousuario tipousuario, String nome, String email, String login, String senha, Integer status, Date dtCadastro, Set recepcionistas, Set acessos, Set medicos) {
       this.tipousuario = tipousuario;
       this.nome = nome;
       this.email = email;
       this.login = login;
       this.senha = senha;
       this.status = status;
       this.dtCadastro = dtCadastro;
       this.recepcionistas = recepcionistas;
       this.acessos = acessos;
       this.medicos = medicos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tipousuario getTipousuario() {
        return this.tipousuario;
    }
    
    public void setTipousuario(Tipousuario tipousuario) {
        this.tipousuario = tipousuario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getDtCadastro() {
        return this.dtCadastro;
    }
    
    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
    public Set getRecepcionistas() {
        return this.recepcionistas;
    }
    
    public void setRecepcionistas(Set recepcionistas) {
        this.recepcionistas = recepcionistas;
    }
    public Set getAcessos() {
        return this.acessos;
    }
    
    public void setAcessos(Set acessos) {
        this.acessos = acessos;
    }
    public Set getMedicos() {
        return this.medicos;
    }
    
    public void setMedicos(Set medicos) {
        this.medicos = medicos;
    }




}


