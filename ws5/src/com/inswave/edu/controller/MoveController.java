package com.inswave.edu.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoveController {
	
	@RequestMapping(value = "/insa/memberupdateForm.do")
	public ModelAndView memberupdateForm() throws Exception{
		
		System.out.println("제대로 실행aaaaaaaaaaaa");
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("insa/sawon_update");
		
		return mv;
		
	}
	
	@RequestMapping("/upload2.do")
	 @ResponseBody
	  public void upload2(HttpServletRequest request, HttpServletResponse res) throws Exception{
	   System.out.println("upload2.do start===================");
	 
	   SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ("yyyyMMddHHmmssSSS", Locale.KOREA );
	   Date currentTime = new Date ();
	     
	   String uploadPath = "C:\\WRM\\WORKSPACE\\ws5\\WebContent\\upload\\";
	   String saveFileName = null;
	   String uploadFileName = null;
	   long uploadFileSize = 0;   
	   String OriginalfileName = null;
	 
	    MultipartHttpServletRequest multiPartRequest = (MultipartHttpServletRequest) request;
	    
	 //param 확인 
	    Enumeration<String> e = multiPartRequest.getParameterNames();
	    
	    String name = null;
	    while (e.hasMoreElements()){
	    name = e.nextElement().toString();
	    
	    System.out.println(name +":"+request.getParameter(name));
	    
	    }
	    
	    Iterator<String> iter = multiPartRequest.getFileNames();
	 
	   int i = 1;
	      while(iter.hasNext()) {
	       
	       String sNewFileName = mSimpleDateFormat.format ( currentTime ) + String.valueOf(i);
	        
	        uploadFileName = iter.next();
	        MultipartFile mfile = (MultipartFile) multiPartRequest.getFile(uploadFileName);
	        
	        uploadFileSize = mfile.getSize();
	        OriginalfileName = mfile.getOriginalFilename();
	        OriginalfileName = new String(OriginalfileName.getBytes("8859_1"),"utf-8");
	        
	        int index=OriginalfileName.lastIndexOf(".");
	           String fileExtension="." + OriginalfileName.substring(index + 1);
	           String fileName = OriginalfileName.substring(0,index);
	 
	     System.out.println("fileExtension="+fileExtension);
	     System.out.println("fileName="+fileName);
	 
	        saveFileName = uploadPath + fileName + fileExtension;
	        i++;
	        System.out.println("saveFileName="+saveFileName);
	        
	        mfile.transferTo(new File(saveFileName));
	      }   
	 
	   StringBuilder stb1 = new StringBuilder();
	 
	   stb1.append("<script>window.onload = doInit;function doInit() {");
	   stb1.append("parent.uploadCallback(\"<ret>");
	   stb1.append("<key>"+uploadPath+"</key>");
	   stb1.append("<storedFileList>"+saveFileName+"</storedFileList>");
	   stb1.append("<localfileList>"+OriginalfileName+"</localfileList>");
	   stb1.append("<fileSizeList>"+uploadFileSize+"</fileSizeList>");
	   stb1.append("<maxUploadSize></maxUploadSize>");
	   stb1.append("<deniedList></deniedList>");
	   stb1.append("<deniedCodeList></deniedCodeList>");
	   stb1.append("</ret>\");}</script>");
	 
	   HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper(res);
	   wrapper.setContentType("text/html;charset=UTF-8");
	   wrapper.setHeader("Content-length", "" + stb1.toString().getBytes().length);
	 
	   res.getWriter().print(stb1.toString());
	  
	}	

}
