# cook your dish here

t = int(input())

for _ in range(t):
    
    n, k, x, y = map(int, input().split(' '))
    
    if x == y:
        print(n, n)
    else:
        impacts = []
        if x > y:
            impacts= [(n, y+n-x), (n-x+y, n), (0, x-y), (x-y, 0)]
        if y > x:
            impacts = [(x+n-y, n), (n, n-y+x), (y-x, 0), (0, y-x)]
    
        if k < 5:
            
            d, e = impacts[k-1]
            
        
        else:
            d, e = impacts[(k-1)%4]
        
        print(d, e)
