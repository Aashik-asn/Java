jug1_cap=int(input("Enter jug1 capacity: "))
jug2_cap=int(input("Enter jug2 capacity: "))
target_quantity=int(input("Target litres: "))
target_jug=input("Target Jug (A/B): ")

flag=False
l=[(0,0,[])]
visited_combinations=[]
while l:
    jug1,jug2,path=l.pop()
    if(jug1,jug2) in visited_combinations:
        continue
    curr_path=path+[(jug1,jug2)]
    visited_combinations.append((jug1,jug2))

    if(target_jug.upper()=="A" and jug1==target_quantity) or (target_jug.upper()=="B" and jug2==target_quantity):
        for i in curr_path:
            print(f"JUG A : {i[0]}L    JUG B : {i[1]}L")
            flag=True
        break

    comb1=(jug1_cap,jug2)
    comb2=(jug1,jug2_cap)
    comb3=(jug1,0)
    comb4=(0,jug2)
    comb5=(jug1-min(jug1,jug2_cap-jug2),jug2+min(jug1,jug2_cap-jug2))
    comb6=(jug1+min(jug1_cap-jug1,jug2),jug2-min(jug1_cap-jug1,jug2))
    
    temp=[comb1,comb2,comb3,comb4,comb5,comb6]
    
    for i in temp:
        if i not in visited_combinations:
            l.append((i[0], i[1], curr_path))
if flag==False:
    print("No such quantity")