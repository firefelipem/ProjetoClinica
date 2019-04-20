package model.bean;
// Generated 20/04/2019 15:26:40 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Agenda generated by hbm2java
 */
public class Agenda  implements java.io.Serializable {


     private Integer id;
     private Medico medico;
     private Especialidade especialidade;
     private Date dia;
     private String hora;
     private Integer status;
     private Date dtCadastro;
     private Set consultas = new HashSet(0);

    public Agenda() {
    }

    public Agenda(Medico medico, Especialidade especialidade, Date dia, String hora, Integer status, Date dtCadastro, Set consultas) {
       this.medico = medico;
       this.especialidade = especialidade;
       this.dia = dia;
       this.hora = hora;
       this.status = status;
       this.dtCadastro = dtCadastro;
       this.consultas = consultas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Medico getMedico() {
        return this.medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Especialidade getEspecialidade() {
        return this.especialidade;
    }
    
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    public Date getDia() {
        return this.dia;
    }
    
    public void setDia(Date dia) {
        this.dia = dia;
    }
    public String getHora() {
        return this.hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
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
    public Set getConsultas() {
        return this.consultas;
    }
    
    public void setConsultas(Set consultas) {
        this.consultas = consultas;
    }




}


