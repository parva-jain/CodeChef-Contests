# cook your dish here

t = int(input())
for _ in range(t):
    n = int(input())
    s = input()
    alp = ['a', 'b', 'c', 'd',
           'e', 'f', 'g', 'h',
           'i', 'j', 'k', 'l',
           'm', 'n', 'o', 'p']
    o = ''      
    for i in range(n//4):
        c = s[i*4:(i*4) + 4]
        ind = int(c[0])*8 + int(c[1])*4 + int(c[2])*2 + int(c[3])*1
        o += alp[ind]
    print(o)
