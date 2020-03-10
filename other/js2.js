window.onload= function(){
	var btn=document.getElementsByTagName("button")[0];
	var btn1=document.getElementsByTagName("button")[1];
	btn.onclick=function(){
//	alert("点击成功");
		var tbody=document.getElementsByTagName("tbody")[0];
		var tr=document.createElement("tr");
			for(var j=0;j<4;j++){
				var td =document.createElement("td");
				if(j==0){
					var inp= document.createElement("input");
					inp.setAttribute("type","checkbox");
					td.appendChild(inp);
				}else{
					td.innerHTML="数据库内容";
					}
				tr.appendChild(td);
			}
		tbody.appendChild(tr);
	}
	btn1.onclick=function(){
		var table=document.getElementById("tab");
		table.setAttribute("class","abc");
	}
				
				//文档对象模型
//				var sel=document.getElementById("year");
//				for(var i=0;i<100;i++){
//					var y=document.createElement("option");
//					y.setAttribute("value",i);
//					y.textContent=i;
//					sel.appendChild(y);
//				}
				//浏览器对象模型
//				sel.onchange = function(){ 
//					sel.children[sel.selectedIndex];
//				}
	var sel=document.getElementById("year");
	for(var i=1997;i<=2070;i++){
		sel.options.add(new Option(i,i));
	}
	sel.onchange =function(){
		alert(sel.children[sel.selectedIndex].innerHTML)
	}
				//在id为tab文件中添加一个表格
	var tab1=document.getElementById("tab");
	var table=document.createElement("table");
	tab1.appendChild(table);
	table.setAttribute("width","300");
	table.setAttribute("cellpadding","0");
		{
			var thead=document.createElement("thead");
			var tbody=document.createElement("tbody");
			table.appendChild(thead);
			table.appendChild(tbody);
			//给thead追加tr
			var tr1=document.createElement("tr");
			thead.appendChild(tr1); 
			//给thead的tr增加th标签
			var th1 =document.createElement("th");
			tr1.appendChild(th1);
			var input=document.createElement("input");
			th1.appendChild(input);
			input.setAttribute("type","checkbox");
			for(var i=0;i<3;i++){
				var th =document.createElement("th");
				th.innerHTML="标题"+i;
				tr1.appendChild(th);
			}
			for(var i=0;i<10;i++){
				var tr =document.createElement("tr");
				for(var j=0;j<4;j++){
					var td =document.createElement("td");
					if(j==0){
						var inp= document.createElement("input");
						inp.setAttribute("type","checkbox");
						td.appendChild(inp);
					}else{
						td.innerHTML="数据库内容";				
					}
					tr.appendChild(td);
					tbody.appendChild(tr)
				}
			}
		}
		//找到第一个input标签
		var chk1 = document.getElementsByTagName("input")[0];
		chk1.onclick= function(){
			var chks= document.getElementsByTagName("input");
			for(var i=1;i<chks.length;i++){
				chks[i].checked=chk1.checked;
			}
		}
};