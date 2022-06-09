package myfirstmodule.mybatis;

import java.sql.Date;

public class OutStudent {
  private String Name;

  public OutStudent(Integer studentId, String name, String phone, String email, Boolean sex, Boolean locked,
      Date gmtCreated, Date gmtModified) {
    Name = name;
    StudentId = studentId;
    Phone = phone;
    Email = email;
    Sex = sex;
    Locked = locked;
    GmtCreated = gmtCreated;
    GmtModified = gmtModified;
  }

  public OutStudent() {
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  private Integer StudentId;

  public Integer getStudentId() {
    return StudentId;
  }

  public void setStudentId(Integer studentId) {
    StudentId = studentId;
  }

  private String Phone;

  public String getPhone() {
    return Phone;
  }

  public void setPhone(String phone) {
    Phone = phone;
  }

  private String Email;

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  private Boolean Sex;

  public Boolean getSex() {
    return Sex;
  }

  public void setSex(Boolean sex) {
    Sex = sex;
  }

  private Boolean Locked;

  public Boolean getLocked() {
    return Locked;
  }

  public void setLocked(Boolean locked) {
    Locked = locked;
  }

  private Date GmtCreated;

  public Date getGmtCreated() {
    return GmtCreated;
  }

  public void setGmtCreated(Date gmtCreated) {
    GmtCreated = gmtCreated;
  }

  private Date GmtModified;

  public Date getGmtModified() {
    return GmtModified;
  }

  public void setGmtModified(Date gmtModified) {
    GmtModified = gmtModified;
  }
}
