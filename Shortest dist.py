from itertools import permutations
from sys import maxsize

k=int(input("Enter no of cities: "))

graphs=[]
for i in range(1,k+1):
    row=list(eval(input(f"Enter distance from {i}th city: ")))
    graphs.append(row)

s=int(input("Enter starting city: "))
min_route=maxsize

temp=[]
for i in range(k):
    if i!=s:
        temp.append(i)
perm=permutations(temp)


for i in perm:
    current_dist=0
    temp_from=s
    for j in i:
        current_dist+=graphs[temp_from][j]
        temp_from=j
    current_dist+=graphs[temp_from][s]
    min_route=min(min_route,current_dist)
    
print(min_route)