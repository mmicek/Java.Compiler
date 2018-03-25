ile db  0
ala db  0
    mov ax,ile
    mov bx,ala
    cmp ax,bx
    jnz while_state1
loop1:
    mov ax,ala
    mov bx,0
    cmp ax,bx
    je if_state1
if_state1:
    mov ax,ile
    mov bx,ala
    cmp ax,bx
    jnz while_state2
loop2:
    mov ax,ile
    mov bx,ala
    cmp ax,bx
    je loop2
while_state2:
    mov ax,ile
    mov bx,ala
    cmp ax,bx
    je loop1
while_state1:
