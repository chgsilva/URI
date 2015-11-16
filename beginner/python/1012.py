import math

line = str(input(""));

split = line.split();
a = float(split[0]);
b = float(split[1]);
c = float(split[2]);

triangulo = ((a *c)/2);
circulo =   3.14159 * math.pow(c, 2);
trapezio = (c* ((a+b)/2));
quadrado = b*b;
retangulo = a*b;


print("TRIANGULO: %0.3f" % triangulo); 
print("CIRCULO: %0.3f"   % circulo); 
print("TRAPEZIO: %0.3f"  % trapezio); 
print("QUADRADO: %0.3f"  % quadrado); 
print("RETANGULO: %0.3f" % retangulo);
