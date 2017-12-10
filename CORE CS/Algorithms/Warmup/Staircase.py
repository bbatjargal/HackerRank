#!/bin/python3

import sys


n = int(input().strip())
for i in range(1, n+1):
    stairs = ""
    for j in range(0, n-i):
        stairs = stairs + " "
    for k in range(0, i):
        stairs = stairs + "#"
    print(stairs)
