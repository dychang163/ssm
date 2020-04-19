package com.ssm.bean;

import lombok.ToString;

@ToString
public class Employee {
    private Integer eid;

    private String ename;

    private Integer age;

    private String sex;

    private String dept;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", sex=" + sex + ", dept=" + dept + "]";
	}
}