package edu.xatu.springmvc.web;

import com.mysql.fabric.xmlrpc.base.Data;
import com.sdicons.json.validator.impl.predicates.Bool;
import edu.xatu.springmvc.entity.Channel;
import edu.xatu.springmvc.entity.JSONObj;
import edu.xatu.springmvc.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;


@Controller
//@RestController//返回对象和传进对象的时候都是Json串
//它起的就是@ResponseBody和@Controller的作用
@RequestMapping("/aaa")
public class ExampleController {

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String testServletApi(String name, HttpServletRequest request){
        String password = request.getParameter("password");
        System.out.println(name + ":" + password);
        request.setAttribute("name",name);
        request.setAttribute("password",password);
        return "test";
    }

    @RequestMapping(value = "/test2",method = RequestMethod.POST)
    public String testModelMap(String name, String password, ModelMap map){

        System.out.println(name + ":" + password);
        map.put("password",password);
        return "test";
    }
    @RequestMapping("/test3")
    public String testRequrstParam(@RequestParam(name = "name")String n, @RequestParam(name = "password")String p, ModelMap map){
        System.out.println(n+":"+p);
        map.put("name",n);
        map.put("password",p);
        return "test";
    }
    @RequestMapping("/test4")
    public String testTypeConvert(String name, Integer age, Bool aa, Data cur){
        System.out.println(name+":"+cur);
        return "test";
    }
    @RequestMapping("/test5")
    public String testChannelConvert(Channel c){
        System.out.println(c.getCid()+":"+c.getCname()+":"
        +c.getDescription()+":"+c.getDate());
        return "test";
    }
    @RequestMapping("/test6")
    public String arryConvert(String[] arg,HttpServletRequest request){
        System.out.println(Arrays.asList(request.getParameterValues("arg")));
        System.out.println(Arrays.asList(arg));
        return "test";
    }
    @GetMapping("/test7")//只接收Get请求
    public String asd(String[] arg,HttpServletRequest request){
        System.out.println(Arrays.asList(request.getParameterValues("arg")));
        System.out.println(Arrays.asList(arg));
        return "test";
    }
    @PostMapping("/test8")//只接收Post请求
    public String test1(String name, String password, Model model){
        if (1 == 1) {

            throw new MyException("自己的异常类测试");
        }
        return "test";
    }
    @RequestMapping("/upload")//上传文件
    public String upload(MultipartFile photo,HttpServletRequest request){
        String contextType=photo.getContentType();
        //取出文件原来的名字
        String filename=photo.getOriginalFilename();
        //给文件取新文件名
        String newFilrName= UUID.randomUUID()+
                filename.substring(
                        filename.lastIndexOf("."));
        //上传文件的根路径
        String rootpath=request.getSession().
                getServletContext().
                getRealPath("/");
        //创建上传文件要保存的完整的路径
        String fullpath=rootpath+"upload/"+newFilrName;
        File file =new File(fullpath);
        //向磁盘写文件
        try {
            if (!file.exists()){
                file.mkdirs();
            }
            photo.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(rootpath);
        return "success";
    }
    @PostMapping("/test9")
    @ResponseBody//声明这个得到的返回就是JSon串
    public JSONObj test10(){
        JSONObj jsonObj=new JSONObj();
        jsonObj.setId(12);
        jsonObj.setName("asd");
        return jsonObj;
    }
    @PostMapping("/test11/{name}/{age}")
    public JSONObj test11(@PathVariable("name") String name,@PathVariable("age") int age){
        JSONObj jsonObj=new JSONObj();
        jsonObj.setId(age);
        jsonObj.setName(name);
        return jsonObj;
    }
}