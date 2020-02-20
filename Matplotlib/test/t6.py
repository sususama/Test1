import pandas as pd
import matplotlib.pyplot as plt


data = pd.read_csv("C:\\Users\\10236\\Desktop\\history_Index_k_data.csv")
data = data.drop(["code"], axis=1)
# print(data.head())
# 直接索引的时候必须先列后行
# print(data.loc[0]['volume'])
# 混合索引
# print(data.ix[:4]['open'])
# 按内容排序
# print(data.sort_values(by="high", ascending=False).head())
# 按索引进行排序
# print(data.sort_index().head())
sr = data["preclose"]
# print(sr.sort_values(ascending=False).head())
# print(sr.sort_index().head())
# 统计运算
# print(data.describe())
# data["pctChg"].sort_index().cumsum().plot()
df = data.plot(x="date", y="pctChg")
# df = pd.DataFrame(data["pctChg"].sort_values().cumsum())
df.plot()
plt.show()

