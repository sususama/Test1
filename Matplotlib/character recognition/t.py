from aip import AipOcr

APP_ID = '18372378'
API_Key = 'ubveXsGOwyjMjI93FmTncSqC'
Secret_Key = 'GbyKnaEfP4T8kfu7x5VqSGhGGL5eiOhs'
options = {"language_type": "CHN_ENG", "detect_direction": "true", "detect_language": "true", "probability": "true"}
client = AipOcr(APP_ID, API_Key, Secret_Key)
client.setConnectionTimeoutInMillis(4000)

with open('./baidu/1.jpg', 'rb') as fp:
    img = fp.read()
word = client.basicGeneral(img, options)
print(word.values())

