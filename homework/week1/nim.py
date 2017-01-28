'''
author: Qiming Zhang
Date: 01/27/17
Title: Homework 1 - Week 1 vim game
Motivation:
Demonstrate your ability to program by completing this project in any language except Java
'''

import random
import sys

# judge whether all elements in the list are 0s
# input: list 
# output: boolean
def heapsAllZeros(list):
	for i in range(len(list)):
		if(list[i] != 0):
			return False
	return True

numOfHeaps = random.choice((3,5,7))
heapArray = []
for i in range(numOfHeaps):
	heapArray.append(random.choice((9,11,13)))
print('Created',numOfHeaps,'heaps of sizes ', end='')
for i in range(numOfHeaps):
	print(heapArray[i],'',end = '')
print()

whoGoesFirst = random.choice(('computer','human'))
print('Player',whoGoesFirst,'goes first')
player = whoGoesFirst
while(not heapsAllZeros(heapArray)):
	if(player == 'human'):
		# input the number of objects taken
		print('Player human enter the number of objects (Y) to take from what heap (X)- in order: Y X')
		sys.stdout.flush()
		try:
			removeNumOfObjects, removeHeap = map(int,sys.stdin.readline().split())
		except ValueError as e:
			print(' Player human that is an invalid move, try again')
			continue
		# the two numbers the human enter must satisfy with the range of indices
		if(not(removeHeap>0 and removeHeap <= numOfHeaps and removeNumOfObjects > 0 and heapArray[removeHeap - 1]>=removeNumOfObjects)):
			print(' Player human that is an invalid move, try again')
			continue
	else:
		# computer removes any positive and non-zero number of objects
		removeHeap = random.randint(1,numOfHeaps)
		while(heapArray[removeHeap - 1] == 0):
			removeHeap = random.randint(1,numOfHeaps)
		removeNumOfObjects = random.randint(1, heapArray[removeHeap - 1])
		print('Player', player, 'took', removeNumOfObjects ,'objects from heap',removeHeap)
	# reduce the number of objects in certain heaps
	heapArray[removeHeap - 1] = heapArray[removeHeap - 1] - removeNumOfObjects 
	for i in range(numOfHeaps):
		print(heapArray[i], end = ' ')
	print()
	# take turns to play
	if(player == 'human'):
		player = 'computer'
	else:
		player = 'human'
# judge whether the last player is human or computer
if(player == 'human'):
	print('Player computer has won')
else:
	print('Player human has won')

