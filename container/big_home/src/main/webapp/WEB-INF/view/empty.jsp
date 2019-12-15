<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>实验室申请</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menu.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/image.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/tcard.css" />

</head>

<body>
<div class="Layout">
    <div class="Layout_Logo">
        <img src="${pageContext.request.contextPath}/res/logo.png" style="height: 100%;">
    </div>
    <div class="Layout_Head">
        <div class="Menu">
            <div class="MenuTitle">
                <div class="CenterText"><a href="/profile">实验室</a></div>
            </div>
        </div>
        <div class="Menu">
            <div class="MenuTitle">
                <div class="CenterText"><text>实验室申请</text></div>
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
        <div class="GBody">
            <div class="Main">
                <div class="ROrL">
                    <button id="LoginButton" style="text-align: center;">实验室申请</button>
                </div>
                <form action="/empty" method="post">
                    <div class="form-group">
                        <input type="text" name="labname" required>
                        <label>申请教室</label>
                    </div>
                    <div class="form-group">
                        <select name="labmajor" >
                            <c:forEach items="${majors}" var="major" varStatus="majorStatus">
                                <option value="${major.majorId}">${major.majorName}</option>
                            </c:forEach>
                        </select>
                        <label class="focus">申请专业</label>
                    </div>
                    <div class="form-group">
                        <select name="labteacher">
                            <c:forEach items="${teachers}" var="teacher" varStatus="teacherStatus">
                                <option value="${teacher.teacherId}">${teacher.teacherName}</option>
                            </c:forEach>
                        </select>
                        <label  class="focus">申请负责老师</label>
                    </div>
                    <div class="form-group">
                        <input type="text" name="labstudent" required>
                        <label>申请学生负责人</label>
                    </div>
                    <div class="form-group">
                        <select name="labstatus">
                            <option value="0" selected style="color: red">关闭</option>
                            <option value="1" style="color: green">开启</option>
                        </select>
                        <label class="focus">申请实验室状态</label>
                    </div>
                    <div class="form-group">
                        <input type="text" name="labproject" required>
                        <label>申请项目</label>
                    </div>
                    <div class="form-group">
                        <input type="text" name="labstudentnumber" required>
                        <label>申请人数</label>
                    </div>
                    <button id="SubmitButton" type="submit" name="Submit">申请</button>
                </form>
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