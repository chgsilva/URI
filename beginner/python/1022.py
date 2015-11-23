def main():
	n = int(input());
	for x in range(0,n):
		line = str(input(""));

		split = line.split(" ");
		N1 = int(split[0]);
		D1 = int(split[2]);
		op = split [3];
		N2 = int(split[4]);
		D2 = int(split[6]);

		if(op == '+'):
			N3 = (N1*D2 + N2*D1);
			D3 = (D1*D2);
			MDC = int(euclides(max(N3,D3), min(N3,D3)));
			print(str(N3) + "/" + str(D3) + " = " + str(int(N3/MDC)) + "/" + str(int(D3/MDC)));
		elif(op == '-'):
			N3 = (N1*D2 - N2*D1);
			D3 = (D1*D2);
			MDC = abs(int(euclides(max(N3,D3), min(N3,D3))));
			print(str(N3) + "/" + str(D3) + " = " + str(int(N3/MDC)) + "/" + str(int(D3/MDC)));
		elif(op == '*'):
			N3 = (N1*N2);
			D3 = (D1*D2);
			MDC = int(euclides(max(N3,D3), min(N3,D3)));
			print(str(N3) + "/" + str(D3) + " = " + str(int(N3/MDC)) + "/" + str(int(D3/MDC)));
		elif(op == '/'):
			N3 = (N1*D2);
			D3 = (N2*D1);
			MDC = int(euclides(max(N3,D3), min(N3,D3)));
			print(str(N3) + "/" + str(D3) + " = " + str(int(N3/MDC)) + "/" + str(int(D3/MDC)));
	return;

def euclides(x, y):
	r = x%y;
	if(r == 0):
		return y;
	else:
		return euclides(y, r);


if __name__=="__main__":
   main()
