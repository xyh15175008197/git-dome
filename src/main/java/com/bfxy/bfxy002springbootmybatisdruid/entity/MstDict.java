package com.bfxy.bfxy002springbootmybatisdruid.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class MstDict implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    private String id;
    private String code;
    private String name;
    private String status;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MstDict{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
