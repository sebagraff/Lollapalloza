package com.mindhub.Lollapalooza.models;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GenericGenerator(name ="native", strategy = "native")
    private long id;
    private String usuario;
    private String password;

    public Cliente(){}

    public Cliente(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
}
