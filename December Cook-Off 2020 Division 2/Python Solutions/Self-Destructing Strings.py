# cook your dish here
t = int(input())
for _ in range(t):
    s = input()


    if len(s) % 2 != 0:
        print(-1)
    else:
        
        one_count = 0
        zero_count = 0
        
        for i in range(len(s)):
            if s[i] == '0':
                zero_count+=1 
            else:
                one_count+=1 
        if one_count == 0 or zero_count == 0:
            print(-1)
        else:
            
            print(abs((one_count - zero_count)//2))
