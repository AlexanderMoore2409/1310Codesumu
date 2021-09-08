#-------------------------------------------------------------------------------
# Name:        module2
# Purpose:
#
# Author:      Usuario
#
# Created:     08/09/2021
# Copyright:   (c) Usuario 2021
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def sumar_lista(lista):
    if len(lista) == 1:
        return lista [0]
    else:
         return lista [0] + sumar_lista(lista[1:])

numeros = [1,2,3,4,5,7,8,9,10]
resultado = sumar_lista (numeros)
print ("La suma de los valores del 1 al 10 es igual a %i" %resultado)




