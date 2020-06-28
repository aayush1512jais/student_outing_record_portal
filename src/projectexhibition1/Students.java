/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectexhibition1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author A K Singh
 */
@Entity
@Table(name = "students", catalog = "hostel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s"),
    @NamedQuery(name = "Students.findByName", query = "SELECT s FROM Students s WHERE s.name = :name"),
    @NamedQuery(name = "Students.findByDob", query = "SELECT s FROM Students s WHERE s.dob = :dob"),
    @NamedQuery(name = "Students.findByRegNo", query = "SELECT s FROM Students s WHERE s.regNo = :regNo"),
    @NamedQuery(name = "Students.findByBranch", query = "SELECT s FROM Students s WHERE s.branch = :branch"),
    @NamedQuery(name = "Students.findByParentsName", query = "SELECT s FROM Students s WHERE s.parentsName = :parentsName"),
    @NamedQuery(name = "Students.findByParentPh", query = "SELECT s FROM Students s WHERE s.parentPh = :parentPh"),
    @NamedQuery(name = "Students.findByParentEmail", query = "SELECT s FROM Students s WHERE s.parentEmail = :parentEmail"),
    @NamedQuery(name = "Students.findByStudentPh", query = "SELECT s FROM Students s WHERE s.studentPh = :studentPh"),
    @NamedQuery(name = "Students.findByStudentEmail", query = "SELECT s FROM Students s WHERE s.studentEmail = :studentEmail"),
    @NamedQuery(name = "Students.findByRoom", query = "SELECT s FROM Students s WHERE s.room = :room")})
public class Students implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "Name")
    private String name;
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Id
    @Basic(optional = false)
    @Column(name = "RegNo")
    private String regNo;
    @Column(name = "Branch")
    private String branch;
    @Column(name = "ParentsName")
    private String parentsName;
    @Column(name = "ParentPh")
    private String parentPh;
    @Column(name = "ParentEmail")
    private String parentEmail;
    @Column(name = "StudentPh")
    private String studentPh;
    @Column(name = "StudentEmail")
    private String studentEmail;
    @Column(name = "Room")
    private String room;

    public Students() {
    }

    public Students(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        Date oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        String oldRegNo = this.regNo;
        this.regNo = regNo;
        changeSupport.firePropertyChange("regNo", oldRegNo, regNo);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        String oldParentsName = this.parentsName;
        this.parentsName = parentsName;
        changeSupport.firePropertyChange("parentsName", oldParentsName, parentsName);
    }

    public String getParentPh() {
        return parentPh;
    }

    public void setParentPh(String parentPh) {
        String oldParentPh = this.parentPh;
        this.parentPh = parentPh;
        changeSupport.firePropertyChange("parentPh", oldParentPh, parentPh);
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        String oldParentEmail = this.parentEmail;
        this.parentEmail = parentEmail;
        changeSupport.firePropertyChange("parentEmail", oldParentEmail, parentEmail);
    }

    public String getStudentPh() {
        return studentPh;
    }

    public void setStudentPh(String studentPh) {
        String oldStudentPh = this.studentPh;
        this.studentPh = studentPh;
        changeSupport.firePropertyChange("studentPh", oldStudentPh, studentPh);
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        String oldStudentEmail = this.studentEmail;
        this.studentEmail = studentEmail;
        changeSupport.firePropertyChange("studentEmail", oldStudentEmail, studentEmail);
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        String oldRoom = this.room;
        this.room = room;
        changeSupport.firePropertyChange("room", oldRoom, room);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regNo != null ? regNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectexhibition1.Students[ regNo=" + regNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
