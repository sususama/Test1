import pandas as pd
import baostock as bs

lg = bs.login()
rs = bs.query_history_k_data("sh.600000", "date,code,open,high,low,close,preclose,volume,amount,pctChg",
                             start_date='2017-07-01', end_date='2017-12-31', frequency="d", adjustflag="3")
print('query_history_k_data_plus respond error_code:'+rs.error_code)
print('query_history_k_data_plus respond  error_msg:'+rs.error_msg)

# 打印结果集
data_list = []
while (rs.error_code == '0') & rs.next():
    # 获取一条记录，将记录合并在一起
    data_list.append(rs.get_row_data())
result = pd.DataFrame(data_list, columns=rs.fields)
# 结果集输出到csv文件
result.to_csv("C:\\Users\\10236\\Desktop\\history_Index_k_data.csv", index=False)
print(result)

# 登出系统
bs.logout()

