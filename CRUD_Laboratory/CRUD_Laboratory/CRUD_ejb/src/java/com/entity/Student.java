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
@Table(name = "STUDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studen.findAll", query = "SELECT s FROM Studen s"),
    @NamedQuery(name = "Studen.findByStudentid", query = "SELECT s FROM Studen s WHERE s.studentid = :studentid"),
    @NamedQuery(name = "Studen.findByLastname", query = "SELECT s FROM Studen s WHERE s.lastname = :lastname"),
    @NamedQuery(name = "Studen.findByFirstname", query = "SELECT s FROM Studen s WHERE s.firstname = :firstname"),
    @NamedQuery(name = "Studen.findByYearlevel", query = "SELECT s FROM Studen s WHERE s.yearlevel = :yearlevel")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "STUDENTID")
    private String studentid;
    @Size(max = 50)
    @Column(name = "LASTNAME")
    private String lastname;
    @Size(max = 50)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "YEARLEVEL")
    private int yearlevel;

    public Student() {
    }

    public Student(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getYearlevel() {
        return yearlevel;
    }

    public void setYearlevel(int yearlevel) {
        this.yearlevel = yearlevel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Studen[ studentid=" + studentid + " ]";
    }
    
}
