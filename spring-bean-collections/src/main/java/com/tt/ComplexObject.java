package com.tt;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 演示 props、list、map、set 四种集合注入
 */
public class ComplexObject {

    private Properties adminEmails;
    private List<Object> someList;
    private Map<Object, Object> someMap;
    private Set<Object> someSet;
    private Map<String, Object> complexMap;   // 复杂 Map：value 为 list
    private List<Object> complexList;          // 复杂 List：元素为 map
    private Map<String, Float> accounts;        // 强类型 Map，XML 字符串 → Float 自动转换

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public void setSomeList(List<Object> someList) {
        this.someList = someList;
    }

    public void setSomeMap(Map<Object, Object> someMap) {
        this.someMap = someMap;
    }

    public void setSomeSet(Set<Object> someSet) {
        this.someSet = someSet;
    }

    public void setComplexMap(Map<String, Object> complexMap) {
        this.complexMap = complexMap;
    }

    public void setComplexList(List<Object> complexList) {
        this.complexList = complexList;
    }

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }

    public Properties getAdminEmails() {
        return adminEmails;
    }

    public List<Object> getSomeList() {
        return someList;
    }

    public Map<Object, Object> getSomeMap() {
        return someMap;
    }

    public Set<Object> getSomeSet() {
        return someSet;
    }

    public Map<String, Object> getComplexMap() {
        return complexMap;
    }

    public List<Object> getComplexList() {
        return complexList;
    }

    public Map<String, Float> getAccounts() {
        return accounts;
    }
}
