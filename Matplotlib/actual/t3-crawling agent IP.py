import requests
from lxml import etree

# 定义请求头
url = "https://www.xicidaili.com/"
ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
headers = {'USer-agent': ua}
# 发起请求
res = requests.get(url=url, headers=headers)
# 判断请求状态
if res.status_code == 200:
    # 获取响应数据
    response = res.content.decode('utf-8')
    html = etree.HTML(response)
    ips = html.xpath('//table[@id="ip_list"]//tr//td[2]/text()')
    ports = html.xpath('//table[@id="ip_list"]//tr//td[3]/text()')
    data = list(zip(ips, ports))
    print(data)


