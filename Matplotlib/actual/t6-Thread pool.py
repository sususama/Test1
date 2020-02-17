import time
# from threading import Thread
from concurrent.futures import ThreadPoolExecutor


def work(n):
    print(f'给{n}打销售电话')
    time.sleep(3)
    print(f'给{n}的销售电话结束')


userList = ['刘德华', '石原里美',
            '刘涛', '林俊杰', '彭于晏',
            '周杰伦', '郭富城']
# 创建线程池
pool = ThreadPoolExecutor(max_workers=3)

# 循环指派任务
for user in userList:
    # 指定对应任务和参数
    pool.submit(work, user)
pool.shutdown()
