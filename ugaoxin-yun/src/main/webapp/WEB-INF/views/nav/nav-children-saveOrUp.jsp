<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> 

<html>
  <head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:site" content="@pratikborsadiya">
    <meta property="twitter:creator" content="@pratikborsadiya">
    <!-- Open Graph Meta-->
    <meta property="og:type" content="website">
    <meta property="og:site_name" content="Vali Admin">
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme">
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin">
    <meta property="og:image" content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png">
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <title>角色添加//修改</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

  
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>
  <body class="app sidebar-mini rtl">
    <!-- Navbar-->
    <%@ include file="../../../index/header.jsp" %>
    <%@ include file="../../../index/aside.jsp" %> 
    <main class="app-content">
      <div class="app-title">
        <div>
          <h1><i class="fa fa-edit"></i> 添加/更新</h1>
          <p>添加/更新，目录，各位dayday up！</p>
        </div>
        <ul class="app-breadcrumb breadcrumb">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item">Forms</li>
          <li class="breadcrumb-item"><a href="#">Sample Forms</a></li>
        </ul>
      </div>
      <div class="row">
          <div class="col-md-6">
          <div class="tile">
            <h3 class="tile-title">Save or Update</h3>
            <div class="tile-body">
              <form class="form-horizontal" id="saveOrUp">
              
               <div class="form-group row">
                  <label class="control-label col-md-3">上级名称</label>
                  <div class="col-md-8"> 
                      <input class="form-control" type="text"   value="${pName}">
                      <input class="form-control" type="hidden" name="parentId"  value="${parentId }">
                  </div>
                </div>
                
                <div class="form-group row">
                  <label class="control-label col-md-3">菜单名称</label>
                  <div class="col-md-8">
                    <input class="form-control" type="hidden" name="mId"  value="${nav.mId }">
                    <input class="form-control" type="text" name="menuName" placeholder="菜单名称" value="${nav.menuName }">
                  </div>
                </div>
               
                <div class="form-group row">
                  <label class="control-label col-md-3">菜单图标</label>
                  <div class="col-md-8"> 
                      <input class="form-control" type="text" name="menuIcon" placeholder="菜单图标" value="${nav.menuIcon }">
                   
                  </div>
                </div>
                 
                </div>
                
              </form>
            </div>
               <div class="tile-footer">
              <div class="row">
                <div class="col-md-8 col-md-offset-3">
                  <button class="btn btn-primary" type="button" id="doAdd"><i class="fa fa-fw fa-lg fa-check-circle"></i>操作</button>&nbsp;&nbsp;&nbsp;<a class="btn btn-secondary" href="#"><i class="fa fa-fw fa-lg fa-times-circle"></i>Cancel</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="clearix"></div>
        
    </main>
    <!-- Essential javascripts for application to work-->
    <script src="<%=basePath%>static/main/js/jquery-3.2.1.min.js"></script>
    <script src="<%=basePath%>static/main/js/popper.min.js"></script>
    <script src="<%=basePath%>static/main/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>static/main/js/main.js"></script>
     <script src="<%=basePath%>static/ztree/js/jquery.ztree.all.min.js"></script>
     <script src="<%=basePath%>static/icheck/icheck.min.js"></script>
    
     <link rel="stylesheet" type="text/css" href="<%=basePath%>static/ztree/css/metroStyle/metroStyle.css">
      <link rel="stylesheet" type="text/css" href="<%=basePath%>static/icheck/flat/green.css">
    <!-- The javascript plugin to display page loading on top-->
    <script src="<%=basePath%>static/main/js/plugins/pace.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/main/js/plugins/bootstrap-notify.min.js"></script>
        <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/main/css/main.css">
    <!-- Page specific javascripts-->
    <!-- Google analytics script-->
    <script type="text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
    <script type="text/javascript">
   
    $("#doAdd").click(function(){ 
 	  
 	   var menusId=""; 
 	   // 联合参数处理
 	   var params="";
 	   params+=$("#saveOrUp").serialize();  //javabean
 	   params+="&menusId="+menusId;  
 	   
 	   $.ajax({
        	url:"doAdd",
            async:true,
            type:"GET",
            dataType:"json",
            cache:false,    //不允许缓存
            data:params,
            success: function(data){
                var obj = eval(data);
                if(obj.code==0)
                  {   
                	$.notify({
                  		title: "操作提醒 : ",
                  		message: "添加成功哦！^_^",
                  		icon: 'fa fa-check' ,
                  		url: 'show'
                  		
                  	},{
                  		type: "info"
                  	});
                	window.location.href="show";
                     
                  }
                  else
                  {
                      
               	    swal("Cancelled", "操作失败", "error");
                  }

            }
 	   });
    })
    
    </script>
    <!-- 获取传递过来的变量 -->
    <script type="text/javascript">
          var ztreeMenus='${menus}'
    </script>
    <!-- 初始化Ztree数据 -->
    <script type="text/javascript">
       var ztreeObject;
       var nodes;
       var setting={
    		data:{
    			simpleData:{
    				enable:true,
    				idKey:"mId",
    				pIdKey:"parentId",
    				rootPId:0
    			},
    			key:{
    				name:"menuName",
    				title:"menuName"
    			}
    			
    		},
    		check:{
    			enable:true,
    			nocheckInherit:true
    			
    		}
    	
       };
       
      /*  $(function(){
    	   
    	   ztreeMenus=eval('('+ztreeMenus+")");
    	   
    	   ztreeObject=$.fn.zTree.init($("#ztree"),setting,ztreeMenus);
    	   
    	   ztreeObject.expandAll(true);
    	   
       })
       */
       
       $(function(){
    	    var rId='${rId}'
    	   loadZtreeData(rId);
    	   
            ztreeObject=$.fn.zTree.init($("#ztree"),setting,ztreeMenus);
            //ztreeObject.checkNode(ztreeMenus, true, true);
 	        ztreeObject.expandAll(true);
       })
       
       function loadZtreeData(rId){
    	   $.ajax({
    		   type:"post",
    		   contentType: "application/x-www-form-urlencoded;charset=utf-8",
    		   url:"getRolesMenusByrId?rId="+rId,
    		   data:{},
    		   async:false,   
    		   dataType:"json",
    		   success:function(data){
    			   //console.log(data);
    			   ztreeMenus= data;
    		   }
    	   })
       }
    </script>
    <script>
$(document).ready(function(){
  $('input').iCheck({
    checkboxClass: 'icheckbox_minimal',
    radioClass: 'iradio_minimal',
    increaseArea: '20%' // optional
  });
});
</script>
  </body>
</html>