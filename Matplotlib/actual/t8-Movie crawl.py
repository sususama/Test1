import requests
import time
from lxml import etree
from concurrent.futures import ThreadPoolExecutor


def getPage(url):
    try:
        ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
        headers = {'USer-agent': ua}
        # 执行请求
        res = requests.get(url, headers=headers)
        if res.status_code == 200:
            return res.text
        else:
            return None
    except:
        return None


def parsePage(html):
    # 解析页面
    res = etree.HTML(html)
    imgList = res.xpath('id("content")/div[1]/div[1]/ol[1]/li/div[1]/div[1]/a[1]/img//attribute::src')
    titleList = res.xpath('id("content")/div[1]/div[1]/ol[1]/li/div[1]/div[1]/a[1]/img//attribute::alt')
    urlList = res.xpath('id("content")/div[1]/div[1]/ol[1]/li/div[1]/div[2]/div[1]/a[1]/attribute::href')
    data = list(zip(titleList, imgList, urlList))
    return data


def writeFile(item):
    with open('./movie.txt', 'a') as pf:
        for i in item:
            pf.write(str(i)+"\n")


def main(offset):
    url = f'https://movie.douban.com/top250?start={offset}'
    # 调用函数进行页面的爬取
    html = getPage(url)
    if html:
        # 解析页面数据
        data = parsePage(html)
        # print(type(data))
        # 写入页面数据
        writeFile(data)


if __name__ == '__main__':
    pool = ThreadPoolExecutor(max_workers=4)
    for i in range(10):
        pool.submit(main, i*25)
        time.sleep(3)
    pool.shutdown()
    # for i in range(10):
    #     main(offset=i * 25)
    #     time.sleep(5)
