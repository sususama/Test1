from lxml import etree
import requests
# from bs4 import BeautifulSoup
urls = ['http://www.bilibili.com']
session = requests.Session()
ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
headers = {'USer-agent': ua}
with session:
    for url in urls:
        response = session.get(url, headers=headers)
        content = response.text
        html = etree.HTML(content)
        titles = html.xpath('id("bili_report_movie")/div[@class="pgc-rank"]/div[@class="pgc-rank-wrap"]/a')
        for t in titles:
            print(t)


