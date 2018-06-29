package com.peddi.webserv;

import javax.persistence.*;

@Entity
@Table(name="Students")
public class Students {

    @Id
    @Column(name="sid")
    private int studentId;

    @Column(name="sname")
    private String studentName;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name= "addr_id", referencedColumnName = "addrId")
    private Address address;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getAddress() {
        return address;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                '}';
    }
}




@Entity(name = "Post")
@Table(name = "post")
public class Post {
 
    @Id
    @GeneratedValue
    private Long id;
 
    private String title;
 
    @OneToMany(
        cascade = CascadeType.ALL, 
        orphanRemoval = true
    )
    private List<PostComment> comments = new ArrayList<>();
 
    //Constructors, getters and setters removed for brevity
}

@Entity(name = "PostComment")
@Table(name = "post_comment")
public class PostComment {
 
    @Id
    @GeneratedValue
    private Long id;
 
    private String review;
 
    //Constructors, getters and setters removed for brevity
}


@Entity
@Table(name="company")
public class Company {
-----------------------------------------------------
-----------------------------------------------------
@OneToMany(cascade=CascadeType.ALL)
@JoinTable(name="Company_Employee", joinColumns={@JoinColumn(name ="companyId", referencedColumnName ="id")},
	inverseJoinColumns={@JoinColumn(name ="employeeId", referencedColumnName ="id")})
private Set<Employee> employees;
-------------------------------------
    
    
    
