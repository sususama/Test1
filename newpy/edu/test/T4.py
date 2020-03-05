from lxml import etree
import requests
class Yq():
    url = 'https://www.lmonkey.com/toutiao'
    ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
    headers = {'USer-agent': ua}
    res = None
    # 发送请求
    def __init__(self):
        res = requests.get(url=self.url, headers=self.headers)
        if res.status_code == 200:
            print('请求发送成功')
            #请求的内容写入文件
            with open('./yq.html', 'w', encoding='utf-8') as fp:
                fp.write(res.text)
        res = self.paseData()
        self.writeData()
    def paseData(self):
        # 解析数据
        html = etree.parse('./yq.html', etree.HTMLParser())
        # 提取数据  文章标题，文章地址url 作者
        author = html.xpath('/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]//strong/a/text()')
        title = html.xpath('/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]//div[@class="topic_title mb-0  essence_title yh"]/text()')
        titleUrl = html.xpath('/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]//a[@target]/attribute::href')
        return zip(title, author, titleUrl)
    # 写入数据
    def writeData(self):
        with open('./yq.json', 'w') as fp:
            for i in list(self.res):
                s = ','.join(str(i) for i in i)
                fp.write(s)
        print('写入完成')


