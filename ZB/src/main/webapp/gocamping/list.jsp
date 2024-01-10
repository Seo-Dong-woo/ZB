<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 .thumbnail{
   margin-left: 30px;
   margin-right: 30px;
   margin-top: 50px;
} 

.thumbnail img {
    border-radius: 15px; 
    display: block;
    width: 100%;
    height: auto;
}
.content{
   margin-top: 42px;
}
.text{
   font-size: 14px;
}
.row{
   margin-left: 60px;
    margin-right: 60px;
}
.listcontent{
   margin-top: 140px;
}
</style>
</head>
<body>
<div class="listcontent">
  <div class="row">
    <!-- <h1 class="text-center">캠핑장</h1> -->
    
    
    <c:forEach var="vo" items="${list }">
     <div class="col-md-3">
       <div class="thumbnail">
         <a href="../gocamping/detail.do?no=${vo.mno }">
           <img src="${vo.poster }" title="${vo.title }" style="width:300px;height:200px ">
           <div class="caption">
             <p class="text-center">${vo.title }</p>
             <p>${vo.loc }</p>
           </div>
         </a>
        </div>
      </div>
   </c:forEach>
  </div>
  <div style="height: 20px"></div>
  <div class="row">
    <div class="text-center">
      <a href="../gocamping/list.do?page=${curpage>1?curpage-1:curpage }" class="btn btn-sm btn-primary">이전</a>
      ${curpage } page / ${totalpage } pages
      <a href="../gocamping/list.do?page=${curpage<totalpage?curpage+1:curpage }" class="btn btn-sm btn-primary">다음</a>
    </div>
  </div>
  <div style="height:20px"></div>
  <h3>최근 방문 상품</h3>
  <hr>
  <c:if test="${count==0 }">
     방문기록이 없습니다.
  </c:if>
  <c:if test="${count!=0 }">
     <c:forEach var="vo" items="${cList }">
        <img src="${vo.poster }" style="width:100px;height: 100px;margin-left:10px">
     </c:forEach>
  </c:if>
</div>
</body>
</html>