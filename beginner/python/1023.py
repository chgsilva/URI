class Node:
    def __init__(self, pessoas, media):
        self.pessoas = pessoas
        self.media = media
    def __repr__(self):
        return repr(str(self.pessoas) + "-" + str(self.media))

n = int(input());
cidade = 1;
while(n != 0):
	if cidade != 1:
		print();
	Node_OBJ = [];
	consumoTotal = 0;
	pessoasTotal = 0;
	for x in range(0,n):
		line = str(input(""));
		split = line.split(" ");
		consumoTotal += int(split[1]);
		pessoasTotal += int(split[0]);
		Node_OBJ.append( Node(int(split[0]), int(int(split[1])/int(split[0]))));

	ordenado = sorted(Node_OBJ, key=lambda Node: Node.media);
	print("Cidade# "+ str(cidade)+":" );
	cidade = cidade+1;
	
	for x in range(0,len(ordenado)):
		if (x+1) >= len(ordenado):
			break;
		if  ordenado[x].media == ordenado[x+1].media:
			ordenado[x+1].pessoas += ordenado[x].pessoas;
			ordenado.remove(ordenado[x]);

	print(repr(ordenado).replace(",", "").replace("'","").replace("[","").replace("]",""));
	value = int(float("%.2f" % float((consumoTotal*100)/(pessoasTotal))));

	print("Consumo medio: %0.2f m3." % (value/100));
	n = int(input());


