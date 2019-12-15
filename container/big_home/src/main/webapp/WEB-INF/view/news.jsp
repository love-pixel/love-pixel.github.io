<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/card.css" />s
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/css_news.css" />


</head>

<body>
    <div class="GridContainer">
        <div class="GLogo">
            <img src="${pageContext.request.contextPath}/res/logo.png">
        </div>
        <div class="GHeader">
            <nav>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/news">新闻</a></li>
                    <!-- <li><a href="./profile.jsp">学院概况</a></li> -->
                    <!-- <li><a href="#">开设专业</a></li> -->
                    <!-- <li><a href="#">新闻</a></li> -->
                    <li class="right"><a href="${pageContext.request.contextPath}/home">返回主页</a></li>
                </ul>
            </nav>
        </div>
        <div class="GBody">
            <!-- 640 200 -->
            <img src="${pageContext.request.contextPath}/res/tl-2.png" id="PhotoWall">
            <h1>新闻</h1>
            <div class="News">
                <a>a</a>
            </div>
        </div>
        <div class="GFooter">
            <!-- <a>版权所有 2019 东北林业大学信息与计算机工程学院  技术支持：数建办</a> -->
            东北林业大学<br>
            软件工程专业 2019&copy;
        </div>
    </div>

    <script>
        var lb = document.getElementById("PhotoWall")
        var num = 1;
        // 自动换图
        setInterval(function () {
            num++;
            if (num == 4) {
                num = 1;
            }
            lb.src = "${pageContext.request.contextPath}/res/tl-" + num + ".png"
            // console.log(num)
        }, 1000)
    </script>
</body>

</html>