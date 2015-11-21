import math;

line = str(input(""))

split = line.split(" ");
a = float(split[0]);
b = float(split[1]);
c = float(split[2]);

try:
	x1 = ((-b) + math.sqrt(math.pow(b,2) - (4*a*c))) / (2*a);
	x2 = ((-b) - math.sqrt(math.pow(b,2) - (4*a*c))) / (2*a);

	print("R1 = {0:.5f}".format(x1));
	print("R2 = {0:.5f}".format(x2));

except ValueError:
	print("Impossivel calcular");
except ZeroDivisionError:
	print("Impossivel calcular");
