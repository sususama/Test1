import requests


# 定义请求url
url = "http://httpbin.org/get"
ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
headers = {'USer-agent': ua}
# 定义代理ip
proxies = {
    'http': '223.199.24.111:9999',
    'https': '223.199.24.111:9999'
}
# 发起get请求
res = requests.get(url=url, headers=headers, proxies=proxies, timeout=5)
# 检测请求状态
if res.status_code == 200:
    # 获取相应内容
    data = res.json()
    print(data['origin'].split(',')[0])
# 定义代理ip


