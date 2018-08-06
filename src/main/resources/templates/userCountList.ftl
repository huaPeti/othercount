<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <title>Dashboard - Ace Admin</title>
    <meta name="description" content="overview &amp; stats" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
</head>
<body id="innerBody">
<!-- 工具栏 -->
<div id="toolbox" >
    <a href="/fights/toAdd" >新增</a>
</div>
<div >
    <table>
        <tbody>
        <tr>
            <th>编号</th>
            <th>次数</th>
            <th>按钮民称</th>
        </tr>
        <#list userCounts as userCount>
        <tr>
            <td>${userCount.countId}</td>
            <td>${userCount.counts}</td>
            <td>${userCount.buttonName}</td>
        </tr>
        </#list>

        </tbody>
    </table>


</div>

</body>
<script src="/static/js/fights/clearFightList.js"></script>

</html>

