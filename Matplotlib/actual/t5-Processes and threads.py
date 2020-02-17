import time
from multiprocessing import Process
from threading import Thread


def work(n):
    print(f'给{n}打销售电话')
    time.sleep(3)
    print(f'给{n}的销售电话结束')


def processes():
    userList = ['刘德华', '张学友', '梁朝伟', '郭富城']

    # 启动了一个进程，进程中有一个主线程
    # for item in userList:
    #     work(item)

    # 多进程类似于 多个创建多个部门都来完成这个工作
    pList = []
    for item in userList:
        # 循环创建进程
        p = Process(target=work, args=(item,))
        # 生成进程任务
        p.start()
        #   把创建的进程加入到列表中
        pList.append(p)

    # 阻塞终止进程的执行
    for i in pList:
        i.join()


def threads():
    userList = ['刘德华', '张学友', '梁朝伟', '郭富城']

    # 启动了一个进程，进程中有一个主线程
    # for item in userList:
    #     work(item)

    # 多进程类似于 多个创建多个部门都来完成这个工作
    pList = []
    for item in userList:
        # 循环创建进程
        p = Thread(target=work, args=(item,))
        # 生成进程任务
        p.start()
        #   把创建的进程加入到列表中
        pList.append(p)

    # 阻塞终止进程的执行
    for i in pList:
        i.join()


if __name__ == '__main__':
    threads()

