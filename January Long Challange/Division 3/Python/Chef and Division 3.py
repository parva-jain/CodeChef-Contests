# cook your dish here

t = int(input())
for _ in range(t):
    n, k, d = map(int, input().split(' '))
    A = list(map(int,input().split(' ')))
    q = sum(A)
    j = q//k 
    if j >= d:
        print(d)
    else:
        print(j)
