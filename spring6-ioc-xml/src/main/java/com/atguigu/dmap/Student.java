package com.atguigu.dmap;

import java.util.Map;

/**
 * ClassName: Studnegt
 * Package: com.atguigu.dmap
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 20:27
 * Version: v1.0
 */
public class Student {

    private Map<String,Teacher> map;
    private String sid;
    private String sname;

    public Map<String, Teacher> getMap() {
        return map;
    }

    public void setMap(Map<String, Teacher> map) {
        this.map = map;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
