<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta lang="utf-8">
    <title>学院概况</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/image.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/card.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menu.css" />
    <style>
        .Text{
            overflow: hidden;
        }
    </style>

</head>

<body>
    <div class="Layout">
        <div class="Layout_Logo">
            <img src="${pageContext.request.contextPath}/res/logo.png" style="height: 100%;">
        </div>
        <div class="Layout_Head">
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/profile">学院概况</a></div>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/history">学院历史</a></div>
                </div>
            </div>
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText">历来成就</div>
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
            <!-- 一行1卡片 -->
            <div class="FullLine">
                <div class="CardBlock" style="width: 100%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-1.png);"></div>
                        <div class="Text">
                            <p>${profiles.get(2).profileMessage}</p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 一行2卡片 -->
            <div class="FullLine">
                <div class="CardBlock" style="width: 50%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-1.png);"></div>
                        <div class="Text">
                            <p>${profiles.get(0).profileMessage}</p>
                        </div>
                    </div>
                </div>
                <div class="CardBlock" style="width: 50%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-2.png);"></div>
                        <div class="Text">
                            <p>${profiles.get(1).profileMessage}</p>
                        </div>
                    </div>
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
    </div>
</body>

</html>