#컴퓨터 전자시스템 공학과, 201903868, 황가은

.data
num: .word 10
arr: .word -2 -12 -4 -6 -98 -48 -14 -8 -20 0
even_min: .word -1
odd_max: .word 0
msg1: .asciiz "size of arr: "
msg2: .asciiz "odd_max: "
msg3: .asciiz "even_min: "
msg4: .asciiz "num range error: "
newline: .asciiz "\n"

.text
.globl mains

main:
	la $t0, arr
	lw $s0, num
	ble $s0, 0, ERROR		#num 에러 판단
	bge $s0, 11, ERROR
	lw $s1, even_min	#최소 짝수 디폴트 값
	lw $s2, odd_max	#최대 홀수 디폴트 값

Loop:
	beqz $s0, Exit
	lw $t1, 0($t0)
	addi $t0, $t0, 4
	addi $s0, $s0, -1

	andi $t2, $t1, 1	#홀짝 판별 (AND 연산 사용)
	beqz $t2, EVEN
	bnez $t2, ODD

EVEN:
	beq $s1, -1, UPDATE_E	#만약 짝수가 다 양수일 때를 대비해서 디폴트 값을 바꿔줍니다.	
	sle $t3, $t1, $s1

	beq $t3, 1, UPDATE_E
	bne $t3, 1, Loop

ODD:
	beqz $s2, UPDATE_O	#만약 홀수가 다 음수일 때를 대비해서 디폴트 값을 바꿔줍니다.
	sge $t4, $t1, $s2

	beq $t4, 1, UPDATE_O
	bne $t4, 1, Loop

UPDATE_E:
	move $s1, $t1
	j Loop

UPDATE_O:
	move $s2, $t1
	j Loop

ERROR:
	li $v0, 4
	la $a0, msg4
	syscall
	
	li $v0, 1
	addi $a0, $s0, 0
	syscall

	li $v0, 10		#num 에러면 그대로 종료
	syscall

Exit:
	li $v0, 4
	la $a0, msg1
	syscall
	
	li $v0, 1
	lw $a0, num
	syscall
	
	li $v0, 4
	la $a0, newline
	syscall

	li $v0, 4
	la $a0, msg2
	syscall

	li $v0, 1
	add $a0, $zero, $s2
	syscall

	li $v0, 4
	la $a0, newline
	syscall

	li $v0, 4
	la $a0, msg3
	syscall

	li $v0, 1
	add $a0, $zero, $s1
	syscall

	li $v0, 10	
	syscall
	




	