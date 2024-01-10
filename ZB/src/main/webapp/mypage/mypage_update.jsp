<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../shadow/css/shadowbox.css">
<style type="text/css">
.row{
  margin: 0px auto;
  width:100%;
 
}
.listcontent{
	margin-top: 200px;
 }
</style>
<script type="text/javascript" src="../shadow/js/shadowbox.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
Shadowbox.init({
   players:['iframe']
})
$(function(){
   
   $('#postBtn').click(function(){
      Shadowbox.open({
    	  content:'../member/postfind.do',
    	  player:'iframe',
    	  width:520,
    	  height:350,
    	  title:'우편번호 검색'
      })
   })
   
   $('#joinBtn').click(function(){
	   $('#joinFrm').submit();
   })
})
</script>
</head>
<body>
 
  <div class="listcontent">
  <div class="wrapper row3">
   <main class="container clear">
    <h2 class="sectiontitle">회원수정</h2>
    <div class="row">
     <form method="post" action="../mypage/mypage_update_ok.do" name="joinFrm" id="joinFrm">
      <table class="table">
        <tr>
         <th class="text-right" width=15%>ID</th>
         <td width=80% class="inline">
          <input type=text name=id id=id size=15 class="input-sm"
           readonly value="${vo.id }">
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=15%>비밀번호</th>
         <td width=90% class="inline">
          <input type=password name=pwd id=pwd size=15 class="input-sm">
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=15%>이름</th>
         <td width=85% class="inline">
          <input type=text name=name id=name size=15 class="input-sm"
            value="${vo.name }"
          >
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=15%>성별</th>
         <td width=85% class="inline">
          <input type="radio" name=sex value="남자" ${vo.sex=='남자'?"checked":"" }>남자
          <input type="radio" name=sex value="여자" ${vo.sex=='여자'?"checked":"" }>여자
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=15%>생년월일</th>
         <td width=85% class="inline">
          <input type="date" name=birthday size=20 value="${vo.birthday }">
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=10%>이메일</th>
         <td width=90% class="inline">
          <input type=text name=email id=email size=55 class="input-sm" value="${vo.email }">
          <input type=button value="이메일체크" 
            class="btn btn-sm btn-danger" id="emailBtn">
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=10%>전화</th>
         <td width=90% class="inline">
          <select name=phone1 class="input-sm">
           <option>010</option>
           <option>011</option>
           <option>016</option>
           <option>017</option>
           <option>018</option>
           <option>019</option>
          </select>
          <input type=text name=phone id=phone size=12 
           class="input-sm" value="${vo.phone }">
         </td>
        </tr> 
        
        <tr>
         <th class="text-right" width=10%>우편번호</th>
         <td width=90% class="inline">
          <input type=text name=post id=post size=10 class="input-sm"
            value="${vo.post }"
          >
          <input type=button value="우편번호검색" class="btn btn-sm btn-info"
            id="postBtn">
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=10%>주소</th>
         <td width=90% class="inline">
          <input type=text name=addr1 id=addr1 size=55 class="input-sm"
           readonly value="${vo.addr1 }"
          >
         </td>
        </tr>
        
        <tr>
         <th class="text-right" width=10%>상세주소</th>
         <td width=90% class="inline">
          <input type=text name=addr2 id=addr2 size=55 class="input-sm"
            value="${vo.addr2 }"
          >
         </td>
        </tr>
       
        <tr>
         <th class="text-right" width=10%>소개</th>
         <td width=90% class="inline">
          <textarea rows="10" cols="55" name=content>aaa</textarea>
         </td>
        </tr> 
        
        <tr>
          <td colspan="2" class="text-center">
           <input type="button" value="회원수정" 
             class="btn btn-success btn-sm" id="joinBtn">
           <input type=button value="취소"
             class="btn btn-info btn-sm" onclick="javascript:history.back()">
          </td>
        </tr>
      </table>
      </form>
    </div>
   </main>
  </div>
 </div>
</body>
</html>