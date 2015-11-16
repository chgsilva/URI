linea = str(input(""))
lineb = str(input(""))

splita = linea.split()
a = int(splita[0]);
b = int(splita[1]);
c = float(splita[2]);

splitb = lineb.split()
d = int(splitb[0]);
e = int(splitb[1]);
f = float(splitb[2]);

value = b*c + e*f;
print('VALOR A PAGAR: R$ %0.2f' % value)