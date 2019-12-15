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
    <style>
        .Layout_Body>h1 {
            text-align: center;
            margin: 40px;

        }
        .Text{
            overflow: hidden;
            font-family: "Microsoft YaHei UI";
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
            <!-- 主页 -->
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/home">主页</a></div>
                </div>
                <div class="MenuList">
                    <a href="/profile">学院概况</a>
                    <a>开设专业</a>
                    <a>新闻</a>
                </div>
            </div>
            <!-- 学院概况 -->
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/profile">学院概况</a></div>
                </div>
                <div class="MenuList">
                    <a href="/history">学院历史</a>
                    <a>历来成就</a>
                </div>
            </div>
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
            <!-- 实验室 -->
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/shiyan">实验室</a></div>
                </div>
            </div>
            <!-- 专业教师 -->
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/teacher">专业教师</a></div>
                </div>
                <!-- <div class="MenuList">
                    <a>软件工程</a>
                    <a>计算机科学与技术</a>
                    <a>信息管理</a>
                </div> -->
            </div>
            <!-- 新闻 -->
            <div class="Menu">
                <div class="MenuTitle">
                    <div class="CenterText"><a href="/news">新闻</a></div>
                </div>
                <div class="MenuList">
                    <a>Text in here</a>
                    <a>Text in here</a>
                    <a>Text in here</a>
                </div>
            </div>
            <!-- 登录/注册 -->
            <div class="Menu" style="margin-left: auto;">
                <div class="MenuTitle">
                    <div class="CenterText">
                        <a href="/logout">退出</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- 主要内容 -->
        <div class="Layout_Body">
            <!-- 轮播图 -->
            <div class="FullLine">
                <img src="${pageContext.request.contextPath}/res/tl-2.png" id="PhotoWall">
            </div>
            <h1>新闻</h1>
            <!-- 一行1卡片 -->
            <div class="FullLine">
                <div class="CardBlock" style="width: 100%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-1.png);"></div>
                        <div class="Text">
                            <p>${news.get(0).newsText}</p>
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
                            <p>${news.get(1).newsText}</p>
                        </div>
                    </div>
                </div>
                <div class="CardBlock" style="width: 50%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-2.png);"></div>
                        <div class="Text">
                            <p>${news.get(2).newsText}</p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 一行3卡片 -->
            <div class="FullLine">
                <div class="CardBlock" style="width: 30%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-1.png);"></div>
                        <div class="Text">
                            <p>${news.get(3).newsText}</p>
                        </div>
                    </div>
                </div>
                <div class="CardBlock" style="width: 40%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-2.png);"></div>
                        <div class="Text">
                            <p>${news.get(4).newsText}</p>
                        </div>
                    </div>
                </div>
                <div class="CardBlock" style="width: 30%;">
                    <div class="Card">
                        <div class="Image" style="background-image: url(${pageContext.request.contextPath}/res/tl-2.png);"></div>
                        <div class="Text">
                            <p>${news.get(5).newsText}</p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- <div class="FullLine">
                <div class="Block">
                    <a>Text in here</a>
                </div>
                <div class="Block">
                    <a>Text in here</a>
                </div>
                <div class="Block" style="margin: 0 20px; font-size: large;">
                    <div class="CenterText"><a>love-pixel.github.io&copy;</a></div>
                </div>

            </div> -->
        </div>
        <!-- 结束 -->
        <div class="Layout_Tail">
            <div class="Block" style="margin: 0 20px; font-size: large;">
                <div class="CenterText"><a>love-pixel.github.io&copy;</a></div>
            </div>
        </div>
    </div>

    <script>
        var lb = document.getElementById("PhotoWall")
        var num = 1;
        setInterval(function () {
            num++;
            if (num == 4) {
                num = 1;
            }
            lb.src = "${pageContext.request.contextPath}/res/tl-" + num + ".png"
        }, 1000)
    </script>
</body>

</html>