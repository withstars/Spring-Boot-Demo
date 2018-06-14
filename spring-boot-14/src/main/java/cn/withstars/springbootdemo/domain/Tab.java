package cn.withstars.springbootdemo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 16:49
 * Mail: withstars@126.com
 */
@Entity
public class Tab {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String tabName;

    @Column(nullable = false)
    private String tabNameEn;

    public Tab(){

    }

    public Tab(String tabName, String tabNameEn) {
        this.tabName = tabName;
        this.tabNameEn = tabNameEn;
    }

    public String getTabNameEn() {
        return tabNameEn;
    }

    public void setTabNameEn(String tabNameEn) {
        this.tabNameEn = tabNameEn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    @Override
    public String toString() {
        return "Tab{" +
                "id=" + id +
                ", tabName='" + tabName + '\'' +
                ", tabNameEn='" + tabNameEn + '\'' +
                '}';
    }
}
