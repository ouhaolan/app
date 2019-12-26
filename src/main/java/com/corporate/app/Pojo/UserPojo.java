package com.corporate.app.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		//类级注解-修饰在实体类 可以自动生成私有属性的 get\set 方法使实体类只写私有属性
@NoArgsConstructor	    //类级注解-自动生成无参构造函数
@AllArgsConstructor	    //类级注解-自动生成有参构造函数
public class UserPojo {
    private Integer id;
    private String username;
    private Integer age;
    private Integer customerid;

}
