<%--
  Created by IntelliJ IDEA.
  User: 高靖宇🐳
  Date: 2020/8/26
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>
<body>
<script type="text/javascript">
    function search() {
        var id = $("#userId").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/user/getUser",
            type:"post",
            data:{"id":id},
            dataType:"json",
            success:function(data){
                $("#msg").text(JSON.stringify(data))
            },
            error:function(data){

            }
        });
    }

</script>
   <span>用户id：</span><input id="userId" type="text" name="id" value="">
   <input type="button" value="搜索" onclick="search()">
   <div>
      <span id="msg" style="color: #ff4630;"></span>
   </div>
</body>
</html>
