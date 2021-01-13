t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    a_sum = sum(A)
    b_sum = sum(B)
    count = 0
    while a_sum <= b_sum:
        a_min = min(A)
        b_max = max(B)
        A[A.index(a_min)] = b_max
        B[B.index(b_max)] = a_min
        a_sum = sum(A)
        b_sum = sum(B)
        count += 1
        if count > n:
            count = -1
            break
            
    print(count)
