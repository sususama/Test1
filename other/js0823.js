$(
    function () {
        //初始化
        // var yearSel=$("select [name='year']");//选择select包装成jQuery对象
        // for (var i = 1950; i < 2050; i++) {
        //     var options=$("<option value='"+i+"'>"+i+"</option>");
        //     yearSel.appendChild(options);
        // }
        var yearSel=document.getElementsByName("year")[0];
        for (var i = 1950; i <= 2050; i++) {
            var opt =new Option(i,i);
            yearSel.options.add(opt);
        }
    }
);