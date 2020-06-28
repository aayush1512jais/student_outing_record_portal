/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectexhibition1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author A K Singh
 */
@Entity
@Table(name = "usernames", catalog = "hostel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usernames.findAll", query = "SELECT u FROM Usernames u"),
    @NamedQuery(name = "Usernames.findByName", query = "SELECT u FROM Usernames u WHERE u.name = :name"),
    @NamedQuery(name = "Usernames.findByDesignation", query = "SELECT u FROM Usernames u WHERE u.designation = :designation"),
    @NamedQuery(name = "Usernames.findByUsername", query = "SELECT u FROM Usernames u WHERE u.username = :username"),
    @NamedQuery(name = "Usernames.findByPassword", query = "SELECT u FROM Usernames u WHERE u.password = :password")})
public class Usernames implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "Name")
    private String name;
    @Column(name = "Designation")
    private String designation;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Column(name = "Password")
    private String password;

    public Usernames() {
    }

    public Usernames(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        String oldDesignation = this.designation;
        this.designation = designation;
        changeSupport.firePropertyChange("designation", oldDesignation, designation);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usernames)) {
            return false;
        }
        Usernames other = (Usernames) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectexhibition1.Usernames[ username=" + username + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
