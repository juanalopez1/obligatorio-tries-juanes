## PSeudocodigo de la función LPM()
```
Algoritmo LPM
    Definir s Como Cadena
    Definir node Como TNodoTrie
    Definir longestWord Como Cadena
    Definir currentWord Como Cadena

    // Inicializar variables
    node = this
    longestWord = ""
    currentWord = ""

    Para i = 0 Hasta longitud(s) - 1 Con Paso 1 Hacer
        // Obtener el índice correspondiente al carácter
        indice = getIndice(subcadena(s, i, i+1))

        // Si el nodo hijo en el índice no existe, retornar la palabra más larga encontrada
        Si node.hijos[indice] = NULO Entonces
            retornar longestWord
        FinSi

        // Moverse al nodo hijo correspondiente
        node = node.hijos[indice]

        // Agregar el carácter actual a la palabra actual
        currentWord = currentWord & subcadena(s, i, i+1)

        // Si el nodo actual es una palabra, actualizar la palabra más larga encontrada
        Si node.esPalabra Entonces
            longestWord = currentWord
        FinSi
    FinPara

    // Retornar la palabra más larga encontrada
    retornar longestWord
FinAlgoritmo
```