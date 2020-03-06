from lxml import etree
import requests
from bs4 import BeautifulSoup
import re

urls = ['https://book.douban.com/top250?icn=index-book250-all']
session = requests.Session()
ua = 'Mozilla/5.0 (compatible) AppleWebKit/534.21 (KHTML, like Gecko) Chrome/11.0.682.0 Safari/534.21'
headers = {'USer-agent': ua}
with session:
    for url in urls:
        response = session.get(url, headers=headers)
        content = response.text
        html = etree.HTML(content)
        # id("content")/div[1]/div[1]/div[1]//a[@title]
        # //*[@id="bili_report_anime"]/div[1]/div[2]//span[@title]
        # titles = html.xpath('//*[@id="content"]/div[1]/div[1]/div[1]//a[@title]/text()')
        # for t in titles:
        #     print('-'*30)
        #     print(t)
        #     print('-'*30)
soup = BeautifulSoup(content)
tag = soup.div
print(tag.find_all(string=re.compile('a*')))

