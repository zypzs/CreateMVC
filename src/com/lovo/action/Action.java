package com.lovo.action;  
  
import java.io.IOException;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
/** 
 * 处理用户请求的控制器接口 
 * @author 骆昊 
 * 
 */  
public interface Action {  
  
//	execute方法是处理用户请求的方法，所以它的两个参数分别是HttpServletRequest和HttpServletResponse对象，
//	到时候我们会在前端控制中通过反射创建Action，并调用execute方法，由于不同的Action子类通过重写对execute方法
//	给出了不同的实现版本，因此该方法是一个多态方法
    public ActionResult execute(HttpServletRequest req, HttpServletResponse resp)   
            throws ServletException, IOException;  
}  
