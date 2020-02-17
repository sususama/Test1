import requests
from lxml import etree
import time
import json


ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
headers = {'USer-agent': ua}
# 页面请求函数
def getPage(url):
    print('请求页面')
    # 定义请求头
    # 发起请求
    res = requests.get(url=url, headers=headers)
    # 判断请求状态
    if res.status_code == 200:
        # 获取响应数据
        response = res.content.decode('utf-8')
        html = etree.HTML(response)
        print('页面请求成功')
        return html
    else:
        return False
    # 请求指定的url，返回请求的页面


def parseHTML(html):
    try:
        print('拿到ip数据')
        ips = html.xpath('//table[@id="ip_list"]//tr//td[2]/text()')
        ports = html.xpath('//table[@id="ip_list"]//tr//td[3]/text()')
        data = list(zip(ips, ports))
        print('拿到数据成功')
        return data
    except:
        return False
    # 返回数据回来



def testIp(ips):
    print('开始测试IP')
    url = "http://httpbin.org/get"
    okList = []
    # 定义代理ip
    for ip in ips:
        proxies = {
            'http': f'{ip[0]}:{ip[1]}',
            'https': f'{ip[0]}:{ip[1]}'
        }
        try:
            # 发起get请求
            res = requests.get(url=url, headers=headers, proxies=proxies, timeout=1)
            # 检测请求状态
            if res.status_code == 200:
                # 获取相应内容
                data = res.json()
                okList.append(ip)
            else:
                pass
        except:
            pass
    print('ip测试完成')
    return okList
    # 返回可以使用的ip地址


# 主程序
def main(num):
    # 拼接url
    url = f"https://www.xicidaili.com/nn/{num}"
    # 调用请求页面的程序
    html = getPage(url)
    if html:
        # 调用解析html的方法
        aList = parseHTML(html)
        # 把返回的解析的数据去请求测试是否能够使用
        if aList:
            okList = testIp(aList)
            print(okList)
        # 把能够使用的ip写入文件
        with open('./ipdata.json', 'a+') as fp:
            for i in okList:
                fp.write(json.dumps(i))
                fp.write('\n')


#  如果当前的脚本是主程序那么__name__的结果就是主程序
if __name__ == '__main__':
    for i in range(1, 2):
        print(f'当前正在爬取第{i}页')
        main(i)
        # 每爬取一个页面停顿两秒
        time.sleep(2)


