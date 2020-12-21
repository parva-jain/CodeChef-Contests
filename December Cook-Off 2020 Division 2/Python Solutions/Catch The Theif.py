# cook your dish here       
t = int(input())
for _ in range(t):
    x, y, k, n = map(int,input().split())
    diff = abs(y-x)
    if diff/k % 2 == 0:
        print('Yes')
    else:
        print('No')
