<html>
<head>

</head>
<body>
<form action="admin/login" method="post">
	<input type="text" name="id" value="wangchao" />
	<input type="text" name="password" value="wangchao" />
	<input type="submit" value="submit"/>
</form>

<br>
<br>
<br>
<form action="video/getByMessage" method="post">
	<input type="text" name="msg" value="123"/>
	<input type="text" name="videoClass" />
	<input type="text" name="maxTime" />
	<input type="text" name="minTime" />
	<input type="text" name="order" />
	<input type="text" name="orderType" />
	<input type="submit" value="submit"/>
</form>

<br>
<form action="video/add" method="post" enctype="multipart/form-data">
	视频：<input type="file" name="videoFile"><br>
	封面：<input type="file" name="imgFile"><br>
	标题：<input type="text" name="videoTitle"><br>
	简介：<input type="text" name="videoBrief"><br>
	分类：<input type="text" name="videoClass"><br>
	标签：<input type="text" name="videoLabel"><br>
	<input type="submit" value="submit"><br>
</form>
</body>
</html>
