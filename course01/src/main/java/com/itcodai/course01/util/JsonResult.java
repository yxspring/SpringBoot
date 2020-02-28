package com.itcodai.course01.util;

/**
 * @ProjectName: course01
 * @Package: com.itcodai.course01.util
 * @ClassName: JsonResult
 * @Author: yuxingsheng
 * @Description: code和msg泛型自定义输出
 * @Date: 2020/2/24 10:10
 * @Version: 1.0
 */
public class JsonResult<T> {
    private T data;
    private String code;
    private String msg;

    /*
    * 若没有数据返回，默认code=0 提示信息：操作成功
    * */
    public JsonResult(){
        this.code="0";
        this.msg="操作成功";
    }
    /*
     * 若没有数据返回，人为指定状态码和提示信息
     * */
    public JsonResult(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
    /*
     * 有数据返回,状态码为0 提示信息为 操作成功
     * */
    public JsonResult(T data){
        this.data=data;
        this.code="0";
        this.msg="操作成功";
    }
    /*
    * 有数据返回,状态码为0 人为指定提示信息
    * */
    public JsonResult(T data,String msg){
        this.data=data;
        this.code="0";
        this.msg=msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
