import pytesseract
from PIL import Image


pytesseract.pytesseract.tesseract_cmd = r'C:\Program Files (x86)\Microsoft Visual Studio\Shared\Python36_64\Lib\tesseract'
tesseract_cmd = r'C:\Program Files (x86)\Microsoft Visual Studio\Shared\Python36_64\Lib\tesseract'
TESSDATA_PREFIX = r'C:\Program Files (x86)\Microsoft Visual Studio\Shared\Python36_64\Lib'
tesseract_cmd = r'C:\Program Files (x86)\Microsoft Visual Studio\Shared\Python36_64\Lib\tesseract'
tessdata_dir_config = r'--tessdata-dir "C:\Program Files (x86)\Microsoft Visual Studio\Shared\Python36_64\Lib\tesseract"'
# img = Image.open(r'./baidu/2.jpg')
# text = pytesseract.image_to_string(img)
# print(text)
print(pytesseract.image_to_string(Image.open('./baidu/21.jpg'), lang='eng', config=tessdata_dir_config))

'''
from PIL import Image
import pytesseract
tesseract_cmd = 'D:\\Softwares\\Tesseract-OCR\\tesseract'
pytesseract.pytesseract.tesseract_cmd = 'D:\\Softwares\\Tesseract-OCR\\tesseract'
TESSDATA_PREFIX= 'D:\Softwares\Tesseract-OCR'
tessdata_dir_config = '--tessdata-dir "D:\\Softwares\\Tesseract-OCR\\tessdata"'
print(pytesseract.image_to_string( Image.open('D:\\ImageProcessing\\f2.jpg'), lang='eng', config=tessdata_dir_config))

'''

