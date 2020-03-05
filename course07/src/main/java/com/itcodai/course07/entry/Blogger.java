package com.itcodai.course07.entry;

/**
 * @ProjectName: course07
 * @Package: com.itcodai.course07.entry
 * @ClassName: Blogger
 * @Author: yuxingsheng
 * @Description: 博主信息
 * @Date: 2020/3/5 19:23
 * @Version: 1.0
 */
public class Blogger {
    private Long id;
    private String name;
    private String pass;

    public Blogger(Long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
