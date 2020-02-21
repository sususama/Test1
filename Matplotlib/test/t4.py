import numpy as np
import pandas as pd

# 股票demo
# 生成随即数，遵循平均分布
stock_change = np.random.normal(0, 1, (10, 5))
# 添加行索引
stock = {'股票-{}'.format(i) for i in range(10)}
# 添加列索引
date = pd.date_range(start='20180101', periods=5, freq='B')
data = pd.DataFrame(stock_change, index=stock, columns=date)
# 索引    索引不能单独修改一个
print(data.iloc[1, :])


