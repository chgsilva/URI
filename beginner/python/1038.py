
line = str(input(""));

split = line.split(" ");
item = int(split[0]);
qnt = int(split[1]);
total = 0;

if(item == 1):
	total = qnt * 4;
elif item == 2:
	total = qnt * 4.5;
elif item == 3:
	total = qnt * 5;
elif item == 4:
	total = qnt * 2;
elif item == 5:
	total = qnt * 1.5;

print ("Total: R$ {:0.2f}".format(total))