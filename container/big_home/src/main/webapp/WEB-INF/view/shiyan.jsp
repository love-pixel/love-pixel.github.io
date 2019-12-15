<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>实验室</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menu.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/image.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/rcard.css" />

</head>

<body>
    <div class="Layout">
        <div class="Layout_Logo">
            <img src="${pageContext.request.contextPath}/res/logo.png" style="height: 100%;">
        </div>
        <div class="Layout_Head">
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/shiyan">实验室</a></div>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">计算机科学与技术</div>
                </div>
                <div class="MenuList">
                    <a>李瑞改</a>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">软件工程</div>
                </div>
                <div class="MenuList">
                    <a>王波</a>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">信息管理与信息系统</div>
                </div>
                <div class="MenuList">
                    <a>纪明宇</a>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/empty">实验室申请</a></div>
                </div>
            </div>
            <div class="Menu" style="margin-left: auto;">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/home">主页</a></div>
                </div>
                <div class="MenuList">
                    <a href="/profile">学院概况</a>
                    <a>开设专业</a>
                    <a>新闻</a>
                </div>
            </div>
        </div>
        <div class="Layout_Body">
            <c:forEach items="${labortories}" var="labortory">
                <div class="cardBox">
                    <div class="headerBox" style="background-color: #4caf50;">
                        <p>
                            <a title="查看详情" style="cursor: pointer; color:white" >${labortory.labName}</a>
                        </p>
                    </div>
                    <div class="bodyBox">
                        <p>负责专业：${labortory.major.majorName}</p>
                        <p>负责老师：${labortory.labTeacher.teacherName}</p>
                        <p>学生责任人：${labortory.labStudentName}</p>
                        <p>实验室状态：<span style="color:${labortory.labStatus==0?'green':'red'}">${labortory.labStatus==0?'启动':'关闭'}</span></p>
                        <p>实验项目：${labortory.labProject}</p>
                        <p>学生人数：${labortory.labStudentNumber}</p>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div>
        </div>
        <div class="Layout_Tail">
            <div class="Block" style="margin: 0 20px; font-size: large;">
                <div class="CenterText"><a>love-pixel.github.io&copy;</a></div>
            </div>
        </div>
    </div>
</body>

</html>