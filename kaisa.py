msgbox = '''
*******************************************************

    欢迎使用20级计院13班蜡笔3小新的的恺撒密码系统  

*******************************************************
'''
print(msgbox)
def jiami():
 wz = input("请输入需要加密的英文:")
 k = int(input('请输入偏移值（默认为3）：') or 3)
 for c in wz:
       if "a"<=c<="z":
            print(chr(ord("a")+(ord(c)-ord("a")+k)%26),end="")
       elif "A"<=c<="Z":
            print(chr(ord("A")+(ord(c)-ord("A")+k)%26),end="")
       else:
            print(c,end="")	
 print()
 pass

def jiemi():
 wz = input("请输入需要解密的英文:")
 k = int(input('请输入偏移值（默认为3）：') or 3)
 for c in wz:
       if "a"<=c<="z":
            print(chr(ord("a")+(ord(c)-ord("a")-k)%26),end="")
       elif "A"<=c<="Z":
            print(chr(ord("A")+(ord(c)-ord("A")-k)%26),end="")
       else:
            print(c,end="")	
 print()
 pass

while True:
    print ("1. 加密")
    print ("2. 解密")
    print ("3. 退出")
    a = input("请选择：")
    if a == "1":
         jiami()
    elif a == "2":
         jiemi()
    elif a == "3":
         break
    else:
        print ("您的输入有误！")