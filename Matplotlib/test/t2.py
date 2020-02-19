import matplotlib.pyplot as plt
import random


x = range(60)
y_shanghai = [random.uniform(15, 18) for i in x]
y_beijing = [random.uniform(25, 30) for i in x]
# 创建画布
# plt.figure(figsize=(20, 8), dpi=50)
figure, axes = plt.subplots(nrows=1, ncols=2, figsize=(20, 8), dpi=50)
axes[0].plot(x, y_shanghai, color='r', linestyle='-.', label='上海')
axes[1].plot(x, y_beijing, color='b', label='北京')
# plt.plot([6, 4, 3], [7, 3, 2])
# 显示图例
plt.legend()
# 准备x的刻度说明
x_label = ["11点{}分".format(i)for i in x]
# 修改x, y的刻度
axes[0].set_xticklabels(x_label[::5])
axes[0].set_yticklabels(range(40)[::5])
axes[1].set_xticklabels(x_label[::5])
axes[1].set_yticklabels(range(40)[::5])
# 添加网格显示
axes[0].grid(linestyle="--", alpha=0.5)
axes[1].grid(linestyle="--", alpha=0.5)
# 添加描述信息
axes[0].set_xlabel("时间变化")
axes[0].set_ylabel("温度变化")
axes[0].set_title("温度和时间的变化")
axes[1].set_xlabel("时间变化")
axes[1].set_ylabel("温度变化")
axes[1].set_title("温度和时间的变化")
plt.show()

