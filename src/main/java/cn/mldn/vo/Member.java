package cn.mldn.vo;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@SuppressWarnings("serial")
@XmlRootElement 
public class Member implements Serializable {
	private Integer mid ;
	private String name ;
	private Double salary ;
	private Date hiredate ;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", salary=" + salary + ", hiredate=" + hiredate + "]";
	}
}
