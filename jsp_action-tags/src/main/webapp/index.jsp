<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h1>Out Tag :</h1>

<c:out value="This is JSTL  c:out tag"></c:out><br>


<h1>Set Tag :</h1>
<c:set var="name" value="Gourav"></c:set>
<c:out value="${name}"></c:out>

<%-- <h1>Import Tag :</h1>
<c:import var="data" url="http://www.google.co.in"></c:import>
<c:out value="${data}"></c:out>
 --%>
 
<h1>Remove Tag :</h1>
<c:remove var="name"/>
<c:out value="Tried to print name : ${name}"></c:out>

<h1>Catch Tag :</h1>
<c:catch var="exceptionCatcher">
	<% int a=3/0; %>
</c:catch>

<c:if test="${exceptionCatcher!=null }">
<p>${exceptionCatcher} Exception has occurred..!!!</p>
</c:if>

<h1>If Tag :</h1>
<c:set var="balance" value ="${500}"></c:set>
<c:if test="${balance == 500 }">
<p>Value is 500</p>
</c:if>

<h1>Choose(switch) ,when(case),otherwise(default) Tag :</h1>
<p>Balance is : <c:out value="${balance}"></c:out> </p>

<c:choose>
<c:when test="${balance<100 }">
<p>Balance is very low</p>
</c:when>

<c:when test="${balance ==500 }">
<p>Balance is very High</p>
</c:when>

<c:otherwise>
<p>Invalid balance</p>
</c:otherwise>
</c:choose>

<h1>For-Each Tag :</h1>
<c:forEach var="i" begin="1" end="5">
Hello<c:out value=" ${i} "></c:out>
</c:forEach>

<h1>ForTokens Tag :</h1>
<c:forTokens var="abc" items="Hell-how-are-you" delims="-">
<c:out value="${abc}"></c:out>
</c:forTokens>

<h1>Function Tags :</h1>

<h1>Contain Tag :</h1>
<c:set var="string" value="Hello Gourav"></c:set>
<c:if test="${fn:contains(string,'Gourav')}">
<p>String found..!!!!</p>
</c:if>

<c:if test="${!fn:contains(string,'Gurav')}">
<p>String not found..!!!!</p>
</c:if>

<h1>Trim Tag :</h1>
<c:set var="str1" value="Hii how     are    you      "></c:set>
<c:set var="str2" value="${fn:trim(str1)}" ></c:set>
<c:out value="${str2 }"></c:out>

</body>

</html>
