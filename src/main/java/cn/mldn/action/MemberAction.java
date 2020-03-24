package cn.mldn.action;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.vo.Member;
import net.sf.json.JSONObject;

@Controller
public class MemberAction {
	private Logger log = Logger.getLogger(MemberAction.class);
	@RequestMapping(value = "/echo/{msgParam}", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String echo(@PathVariable("msgParam") String msg) {
		return "ECHO : " + msg;
	}
	// 定义该方法的访问路径，而后表示该方法返回的数据类型为普通的文本类型（MIME）
	@RequestMapping(value="/info",produces="text/plain;charset=UTF-8")
	public @ResponseBody String info() {	// 该方法的返回值即回应的主题消息
		return "www.mldnjava.cn" ;
	}
	
	/**
	 * 增加用户
	 * */
	@RequestMapping(value="/member",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody Object add(Member vo){
		log.info(vo);
		JSONObject obj=new JSONObject();
		obj.put("flag",true);
		return obj;
	}
	
	@RequestMapping(value="/member",method=RequestMethod.PUT,produces="application/json;charset=UTF-8")
	public @ResponseBody Object edit(Member vo){
		log.info(vo);
		JSONObject obj=new JSONObject();
		System.out.println("member编辑测试");
		obj.put("flag", true);
		return obj;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(java.util.Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}
