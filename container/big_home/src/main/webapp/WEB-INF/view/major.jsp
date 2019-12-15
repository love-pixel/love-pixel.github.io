<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta lang="utf-8">
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/image.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/card.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menu.css" />


</head>

<body>
    <!-- 总体布局 -->
    <div class="Layout">
        <!-- Logo -->
        <div class="Layout_Logo">
            <img src="${pageContext.request.contextPath}/res/logo.png" style="height: 100%;">
        </div>
        <!-- 导航下拉菜单 -->
        <div class="Layout_Head">
            <!-- 开设专业 -->
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/major">开设专业</a></div>
                </div>
                <div class="MenuList">
                    <a>软件工程</a>
                    <a>计算机科学与技术</a>
                    <a>信息管理</a>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">软件工程</div>
                </div>
                <div class="MenuList">
                    <a>Text in here</a>
                    <a>Text in here</a>
                    <a>Text in here</a>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">计算机科学与技术</div>
                </div>
                <div class="MenuList">
                    <a>Text in here</a>
                    <a>Text in here</a>
                    <a>Text in here</a>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">信息管理</div>
                </div>
                <div class="MenuList">
                    <a>Text in here</a>
                    <a>Text in here</a>
                    <a>Text in here</a>
                </div>
            </div>
            <!-- 主页 -->
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
        <!-- 主要内容 -->
        <div class="Layout_Body">
            <!-- 一行3卡片 -->
            <c:forEach items="${majors}" var="item" varStatus="itemStatus">
                <div class="FullLine">
                    <div class="CardBlock" style="width: 100%;">
                        <div class="Card">
                            <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-${itemStatus.index+1}.png);"></div>
                            <div class="Text">
                                <p>${item.majorIntroduce}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <!-- 结束 -->
        <div class="Layout_Tail">
            <div class="Block" style="margin: 0 20px; font-size: large;">
                <div class="CenterText"><a>love-pixel.github.io&copy;</a></div>
            </div>
        </div>
    </div>
</body>

</html>