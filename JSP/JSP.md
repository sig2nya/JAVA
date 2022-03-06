JSP
===
* 등장 : Servlet의 화면단 처리의 어려움을 해결하기 위해 등장.
* 특징
* * HTML 페이지에 자바 코드를 직접 삽입한다.
* * Custom Tag를 이용하여, 코드를 태그화 한다.(Action, JSTL 등)
* * EL을 통해 데이터를 표현한다.
* 구성 요소 : 지시어, 액션, 템플릿 데이터, 스크립트 요소, 커스텀태그, EL

지시어
====
* <%@ 지시어 속성 = "값" %>
* <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" errorPage="error.jsp" %>

Tag Library
===========
* <%@ taglib tagdir = "/WEB-INF/tags" prefix = "m" %>
* * <h2><m:printDate/></h2>

스크립트 요소
==========
* <!% %> : 선언을 위한 태그. 멤버 변수나 메서드 선언이 필요하다면 사용 가능하지만, 권장하지 않는다.
* <%= %> : Expression 태그. 웹 브라우저를 통해 클라이언트에 전달될 자바 표현식을 포함한다. EL로 대체 가능하다.
* <% %> : 스크립트릿 태그. 모든 자바 코드의 사용이 가능하다.
