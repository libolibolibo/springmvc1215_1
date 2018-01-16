package cn.itcast.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 
 * <p>Title: Hello</p>
 * <p>Description: 使用SimpleControllerHandlerAdapter适配器</p>
 * <p>Company: www.itcast.com</p> 
 * @author	
 * @version 1.0
 */
public class Hello implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		
		//鍚戦〉闈㈡樉绀轰竴琛屾彁绀轰俊鎭�
		//涓嬭竟鐨勬柟娉曞氨鐩稿綋浜巖equest.setAttribute(arg0, arg1)
		modelAndView.addObject("message", "helloworld!!!!!!");
		
		//鎸囧畾jsp椤甸潰鍦板潃
		
		//modelAndView.setViewName("/WEB-INF/jsp/hello.jsp");
		//鎸囧畾閫昏緫瑙嗗浘鍚嶏紝鐪熸鐨勮鍥惧湴鍧�锛氬墠缂�+閫昏緫瑙嗗浘鍚�+鍚庣紑
		modelAndView.setViewName("hello");
		
		return modelAndView;
	}

}
