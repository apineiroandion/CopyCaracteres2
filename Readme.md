# copycaracteres2

BufferedWriter permite crear un buffer usando como argumento calquera obxecto heredadeo da clase Writer como FileWriter

PrintWriter admite tamen como argumento calquera obxecto heredado da clase Writer, como FileWriter ou BufferedWriter , e permite escribir datos no fluxo de salida  como tiras de caracteres usando os metodos print(argument)  e println (argument).

print(argument) escribe a representacion en modo  caracter do argumento
println (argument) escribe a representacion en modo  caracter do argumento seguido dun caracter de retorno de linea

BufferedReader permite crear un buffer usando como argumento calquera obxecto heredadeo da clase Reader como FileReader, e dispon dos metodos readLine() e read()

readLine() le unha linea de texto e a retorna como un String . CANDO  CHEGA AO FINAL DO FICHEIRO RETORNA UN NULL

read() le un so caracter o retorna como un int que represnta o codigo ASCII para ese caracter, cando tenta ler pasado o fin do ficheiro retorna un -1.

APLICACION:
Desenvolver  o que se pide no  exercicio anterior (copycaracteres) pero agora utilizando os metodos:
readLine() da   clase BufferedReader
println(argument) da clase PrintWriter que a sua vez  fara uso de BufferedWriter
        
