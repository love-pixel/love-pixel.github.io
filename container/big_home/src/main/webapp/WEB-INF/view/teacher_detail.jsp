<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

<head>
    <meta lang="utf-8">
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menu.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/image.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/card.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/teacher.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/teacher_detail.css" />
    <style>
        .Layout_Body>h1 {
            text-align: center;
            margin: 40px;
        }
    </style>


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
            <!-- 专业教师 -->
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">李莉</div>
                </div>
            </div>
            <!-- 主页 -->
            <div class="Menu" style="margin-left: auto;">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/teacher">专业教师</a></div>
                </div>
            </div>
        </div>
        <!-- 主要内容 -->
        <div class="Layout_Body">
            <div class="TwoLine">
                <div class="OneLine">
                    <div class="TCard">
                        <div class="Image" style="background-image: url(../../res/tl-1.png);"></div>
                        <div class="Text">
                            <p>${teacher.teacherName}</p>
                            <p>${teacher.major.majorName}</p>
                        </div>
                    </div>
                </div>
                <div class="OneLine">
                    <!-- <div class="CenterText"> -->
                        <p><br>${teacher.teacherIntroduce}</p>
                    <!-- </div> -->

                </div>
            </div>
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