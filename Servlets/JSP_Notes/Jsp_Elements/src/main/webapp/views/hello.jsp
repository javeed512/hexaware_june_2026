<%@ page language="java"    import="java.util.* , java.sql.*"   isELIgnored="false"   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JSP</h1>

 Hi friends!
 
 
 
 
 <%
 
 	int   amount = 9000;
 
 	String name = "javeed";
 	
 	
 		out.print("amount : "+amount);
 		out.print("<br>");
 		
 		out.print("name "+name);
 		
 		
 			List  list = new ArrayList();
 			
 				list.add("KIng");  list.add("Tom"); list.add("smith");
 		
 		
 				out.print("<br>"+ list);
 				
 					session.setAttribute("city","Hyderabad");
 				
 					
 					application.setAttribute("empList" , list);
 				
 
 %>
 <br>
 
 <%
 
 		String city  =  (String)	session.getAttribute("city");
 
 			out.print("city from scriptlet "+city);
 %>
 
 <br>JSP Expression <br>
 
 City:  <%=  session.getAttribute("city")   %>
 
 <br> EL Expression<br>
 
 ${ city }  <br>
 
 
 Employee List using EL Exp <br>
 
 ${ empList }  <br>
 
 
 
 <br>
 
 
 <%!
 
 
 	static int eid = 99;
 
 String ename = "hexaware";
 
 	public void m1(){
 		
 		
 	}
 
 %>
 
 <%
 		out.print(eid +" "+ename);
 
 %>
 
 
 
 
 
 
 
 
 
 
 
 
 

</body>
</html>