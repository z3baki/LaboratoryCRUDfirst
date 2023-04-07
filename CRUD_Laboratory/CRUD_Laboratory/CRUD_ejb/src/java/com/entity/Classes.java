/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sebastian Varela
 */
@Entity
@Table(name = "CLASSES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c"),
    @NamedQuery(name = "Classes.findByClassid", query = "SELECT c FROM Classes c WHERE c.classid = :classid"),
    @NamedQuery(name = "Classes.findByClassname", query = "SELECT c FROM Classes c WHERE c.classname = :classname"),
    @NamedQuery(name = "Classes.findByCredits", query = "SELECT c FROM Classes c WHERE c.credits = :credits"),
    @NamedQuery(name = "Classes.findBySemester", query = "SELECT c FROM Classes c WHERE c.semester = :semester"),
    @NamedQuery(name = "Classes.findByAdmitedstudents", query = "SELECT c FROM Classes c WHERE c.admitedstudents = :admitedstudents")})
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLASSID")
    private Integer classid;
    @Size(max = 50)
    @Column(name = "CLASSNAME")
    private String classname;
    @Column(name = "CREDITS")
    private Integer credits;
    @Column(name = "SEMESTER")
    private Integer semester;
    @Column(name = "ADMITEDSTUDENTS")
    private Integer admitedstudents;

    public Classes() {
    }

    public Classes(Integer classid) {
        this.classid = classid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getAdmitedstudents() {
        return admitedstudents;
    }

    public void setAdmitedstudents(Integer admitedstudents) {
        this.admitedstudents = admitedstudents;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classid != null ? classid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.classid == null && other.classid != null) || (this.classid != null && !this.classid.equals(other.classid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Classes[ classid=" + classid + " ]";
    }
    
}
