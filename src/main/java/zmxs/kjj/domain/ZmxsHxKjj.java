package zmxs.kjj.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: 张灿
 * @Time: 2021/1/9 17:45
 */
@Entity
public class ZmxsHxKjj {

    @Id
    private String jjName;

    private String stuName;

    private String kjjFun;

    private String grade;

    public String getJjName() {
        return jjName;
    }

    public void setJjName(String jjName) {
        this.jjName = jjName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getKjjFun() {
        return kjjFun;
    }

    public void setKjjFun(String kjjFun) {
        this.kjjFun = kjjFun;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ZmxsHxKjj{" +
                "jjName='" + jjName + '\'' +
                ", stuName='" + stuName + '\'' +
                ", kjjFun='" + kjjFun + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
