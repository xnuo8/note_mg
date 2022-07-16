package com.xnuo.note.util;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 *
 * 将对象装换成json格式的字符串，响应给Ajax的回调函数
 */
public class JSONUtil {
    public  static  void toJson(HttpServletResponse resp, Object obj){
        try {
            //设置响应类型 及编码格式(JSON类型)
            resp.setContentType("application/json;charset=UTf-8");
            //得到字符输出流
            PrintWriter out=resp.getWriter();
            //通过fastjson的方法,将ResultInfo对象转换成JSON格式的字符串
            String json = JSON.toJSONString(obj);
            //通过输出流输出JSON
            out.write(json);
            //关闭资源
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
