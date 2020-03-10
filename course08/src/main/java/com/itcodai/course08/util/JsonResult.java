package com.itcodai.course08.util;

/**
 * @ProjectName: course08
 * @Package: com.itcodai.course08.util
 * @ClassName: JsonResult
 * @Author: yuxingsheng
 * @Description: code和msg泛型自定义输出
 * @Date: 2020/2/24 10:10
 * @Version: 1.0
 */
public class JsonResult{
    private String code;
    private String msg;

    /*
    * 若没有数据返回，默认code=0 提示信息：操作成功
    * */
    public JsonResult(){
        this.code="200";
        this.msg="操作成功";
    }
    /*
     * 若没有数据返回，人为指定状态码和提示信息
     * */
    public JsonResult(String code,String msg){
        this.code=code;
        this.msg=msg;
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
