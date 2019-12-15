<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>登陆界面</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
	<div class="container">
		<!-- 导航 -->
		<div class="nav">
			<ul>
				<li><a href="http://acm.nefu.edu.cn/">acm</a></li>
				<li><a href="https://jwc.nefu.edu.cn/">教务处</a></li>
				<li><a href="https://www.nefu.edu.cn/">学校官网</a></li>
				<li><a href="/home">首页</a></li>
			</ul>
		</div>
		<!-- 主体内容 （登陆界面）-->
		<div class="main">
			<!-- 左侧信息栏 -->
			<div class="sideleft">
				<h1>学参天地    德合自然</h1>
				<h4>东北林业大学  信息与计算机工程学院</h4>
				</br></br></br>
				<p>自强、务实、尚学、进取</p>
				<p>以人为本、人才强院、提高质量、特色发展</p>
				<p>突出创新教育，注重内涵建设</p>
				<p>知识、能力、素质</p>
			</div>
			<!-- 右侧登陆界面 -->
			<div class="sideright">
				<div class="index">
					<form action="/login" method="post">
						<p class="headline">用户登陆</p>
						<p class="astyle">用户名：</p>
						<input type="text" name="number" placeholder="请输入您的学号">
						<p class="astyle">密码：</p>
						<input type="password" name="password" placeholder="请输入密码">
                    </br>
						<input type="submit" value="登陆" name="login">
						</br>
						<p class="bstyle"><input type="checkbox" name="rempas"/>  记住密码</p>
						<p class="cstyle"><a href="/retreve">忘记密码</a></p>
						</br></br>
						<p class="cstyle">没有账号？<a href="/register">立即注册</a></p>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
