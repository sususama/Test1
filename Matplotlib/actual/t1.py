import requests


# 函数的封装
# def main()
url = "http://fanyi.youdao.com/translate?smartresult=dict&smartresult=rule"
ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
headers = {'USer-agent': ua}
# 定义请求参数
data = {
    "i": '你好',
    'doctype': 'json'
}
# 发送请求 post
res = requests.post(url=url, data=data, headers=headers)

# 查看请求结果
code = res.status_code
print(code)
if code == 200:
    data1 = res.json()
    print(data1['translateResult'][0][0]['tgt'])
    # print(res.json())
    #
