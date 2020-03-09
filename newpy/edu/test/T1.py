from urllib.request import urlopen,Request

from http.client import HTTPResponse


url = 'http://www.bing.com'



response = urlopen(url)
print(response.closed)
with response:
    print(type(response))
    print(response.status)
    print(response._method)
    print(response.read())
    print(response.geturl())
    print(response.info())
print(response.closed)