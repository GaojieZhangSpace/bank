/**
 * 对于info页面的一些补充函数
 */
function getInfo(){
	var id= $('#id').val();
	var date= $('#date').val();
	
	if (id.length <= 0) {
        alert("合同号不能为空");
        return;
    }
    if (date.length <= 0) {
        alert("创建日期不能为空");
        return;
    }
    
    
    var url="http://localhost:8008/info/getInfo?id="+ id + "&date=" + date 
    $.post(url,function(data){
    	if(data.code==0){
    		layui.use('table', function(){
    			  var table1 = layui.table;
    			  table1.render({
    			    elem: '#InfoList'
    			    ,height: 312
    			    ,width: 1050
    			    ,url: 'http://localhost:8008/info/getInfo?id='+ id + '&date='+ date//数据接口
    			    ,page: false //未开启分页
    			    ,cols: [[ //表头
    			    	   {field: 'id', title: 'ID', sort: true}
         			      ,{field: 'date', title: '创建时间'}
         			      ,{field: 'zi', title: '流借字'} 
         			      ,{field: 'debt', title: '借款金额'}
         			      ,{field: 'currency',title: '币种'}
         			      ,{field: 'startDay', title: '借款起始日'}
         			      ,{field: 'endDay', title: '借款终止日'}
    			    ]]
    			  });
    			  
    			});
    	}else {
			alert("查询不到这个合同");
		}
    })

  
}