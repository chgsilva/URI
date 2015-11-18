import math;
from decimal import *;

posa = str(input(""));
splita = posa.split(" ");
x1 = Decimal(splita[0]);
y1 = Decimal(splita[1]);

posb = str(input(""));
splitb = posb.split(" ");
x2 = Decimal(splitb[0]);
y2 = Decimal(splitb[1]);

distance = math.sqrt( math.pow(x2-x1,2) + math.pow(y2-y1,2));
getcontext().prec = 4
print("%0.4f" % distance);