package com.infosys.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

@Table(name="emp_tbl")
public class Employee {
	
	@Id
	@Column(name="eno")
  int eno;
	@Column(name="ename",length=20)
  String ename;
	@Column(name="addr",length=20)
  String addr;
	@Column(name="sal")
  int sal;
public Employee() {
	super();
}
public Employee(int eno, String ename, String addr, int sal) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.addr = addr;
	this.sal = sal;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", addr=" + addr + ", sal=" + sal + "]";
}
}
