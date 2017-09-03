$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/role/list',
        datatype: "json",
        colModel: [			
			{ label: '员工ID', name: 'roleId', index: "role_id", width: 45, key: true },
			{ label: '员工名称', name: 'roleName', index: "role_name", width: 75 },
            { label: '所属部门', name: 'deptName', width: 75 },
            { label: '工资', name: 'salary', width: 100 },
			{ label: '发放记录', name: 'salaryLog', width: 100 },
			{ label: '修改时间', name: 'createTime', index: "create_time", width: 80}
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		q:{
			roleName: null
		},
		showList: true,
		title:null,
		role:{
			deptId:null,
            deptName:null,
            salary:null
		}
	},
	methods: {
		query: function () {
			vm.reload();
		},
        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'roleName': vm.q.roleName},
                page:page
            }).trigger("reloadGrid");
        },
		update: function () {
			var roleId = getSelectedRow();
			if(roleId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
		},
		saveOrUpdate: function () {
			var url ="sys/role/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.role),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		}
	}
});