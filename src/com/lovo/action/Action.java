package com.lovo.action;  
  
import java.io.IOException;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
/** 
 * �����û�����Ŀ������ӿ� 
 * @author ��� 
 * 
 */  
public interface Action {  
  
//	execute�����Ǵ����û�����ķ����������������������ֱ���HttpServletRequest��HttpServletResponse����
//	��ʱ�����ǻ���ǰ�˿�����ͨ�����䴴��Action��������execute���������ڲ�ͬ��Action����ͨ����д��execute����
//	�����˲�ͬ��ʵ�ְ汾����˸÷�����һ����̬����
    public ActionResult execute(HttpServletRequest req, HttpServletResponse resp)   
            throws ServletException, IOException;  
}  
