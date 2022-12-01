#funciones de los procesos 
#las formulas para de:
#peso ideal ,grasa corporal e indice meta basal
#estan separadas en funciones para la mujer y para el hombre 
#NOTA: Si alguna cosa profe dejo comentado algunas
#ejecuciones para que los calculos se realizen 
#en orden y no todas a la vez 

#formula para calcular el peso ideal del hombre
def peso_ideal_hombre(altu):
 hombre = 56.2 +1.41*(altu/2.54 -60)
 return hombre

#formula para calcular el peso ideal de la mujer 
def peso_ideal_mujer(altu):
 mujer = 53.1 +1.36 *(altu/2.54 -60)
 return mujer

#formula para calcular las calorias quemadas
#esta formula funciona para hombres y mujeres
def calorías_quemadas(tie,met,peso):
 calo_quema=(tie * met * peso)/200
 return calo_quema

#formula para calcular la grasa corporal del hombre 
def grasa_corporal_hombre(imc,edad):
 gras_cor_hom = 1.20* imc + 0.23*edad-16.2  
 return gras_cor_hom 

#formula para calcular la grasa corporal de la mujer 
def grasa_corporal_mujer(imc,edad):
 gras_cor_muj = 1.20* imc + 0.23*edad-5.4 
 return gras_cor_muj

#formula para calcular el indice meta basal del hombre 
def indice_meta_basal_hombre(pes,alt,ed):
 indi_hom = (13.397*pes) + (4.799 * ed) - (5.677*alt) + 88.362
 return indi_hom

#formula para calcular el indice meta basal de la mujer 
def indice_meta_basal_mujer(pes,alt,ed):
 indi_muj = (9.247*pes) + (3.098*ed) - (4.330*alt) + 447.593
 return indi_muj

"""
######################################################
#para ejecutar la primera funcion del peso ideal  se le solicita al usuario su altura en centimetros 
print("Peso ideal")
print("por favor digite su estatura en centimetros ejemplo: 165 : ")
altura = int(input("altura: "))
#dependiendo del genero se ejecuta la funcion de la  formula para realizar el calculo 
# se guarda el resultado de la funcion en una variable 
#para imprimirlo correctamente en pantalla
peso_h= peso_ideal_hombre(altura)
peso_m = peso_ideal_mujer(altura) 
print("el peso ideal es de : ", peso_h )
#peso ideal mujer
print("el peso ideal es de : ", peso_m )
#########################################################
"""
"""
#para ejecutar la segunda funcion de quema de calorias  
#se le solicita los minutos por las cuales realizo la actividad fisica 
print("Quema de calorias")
print("por favor digite los minutos en los cuales realizo la actividad ejemplo: 60")
tiempo = int(input("tiempo: "))
#se le pide al usuario que digite  el MET
#teniendo en cuenta las opciones  que se le muestra en pantalla de acuerdo a la actividad que realizo previamente
print(" por favor digite el MET teniendo en cuenta lo siguiente: ")
print("si camino escriba el numero  2")
print("si realizo tenis escriba el numero 5")
print("si montó bicicleta escriba el numero 14")
print("si estaba corriendo  escriba el numero 6")
print("si estaba nadando escriba el numero 9.8")
#aqui el usuario digita el numero de la actividad 
met = float(input("digite  el numero de su actividad: "))
#el usuario digita su peso corporal 
peso_calo= float(input("por favor digite su peso corporal: "))
#se almacena el valor de la funcion en una variable 
#para mostrarlo correctamente en pantalla
calorias = calorías_quemadas(tiempo,met,peso_calo)
print("usted ha quemado: ", calorias, " calorias")
"""
########################################################
#para ejecutar la tercera formula del calculo del porcentaje de grasa corporal 
#se le solicita primero el peso corporal 
"""
print("Grasa corporal")
print("por favor digite su peso")
peso_cuerpo = float(input("peso: "))
#se le solicita al usuario digitar su altura en metros 
print("por favor digite la altura de su cuerpo en metros ejemplo: 1.65 m")
#aqui se digita y se almacena el valor de la altura
altura_cuerpo= float(input("altura: "))
#se realiza el calculo del IMC previo a la ejecucion de la funcion con la formula 
imc = peso_cuerpo/altura_cuerpo**2
#se le solicita la edad al usuario 
edad = int(input("por favor digite su edad: "))
#se ejecuta la funcion del porcentaje de grasa corporal de acuerdo a su genero
#el resultado de la funcion se ejecuta en una variable
#para imprimirlo correctamente en pantalla
grasa_cor_h= grasa_corporal_hombre(imc,edad)
grasa_cor_m = grasa_corporal_mujer(imc,edad)
#porcentaje grasa hombre
print("su porcentaje de grasa corporal es de: ",grasa_cor_h)
#porcentaje grasa mujer
print("su porcentaje de grasa corporal es de: ",grasa_cor_m)
"""
#######################################################

#para ejecutar la cuarta funcion de la formula del indice metabolico basal 
# se le solicita al usuario:
# el peso corporal
print("Indice metabolico basal")
peso_cuerpo = float(input("por favor digite su peso: "))
# la altura en centimentros 
print("por favor digite su estatura en centimetros ejemplo:165")
altura = int(input("altura: "))
# su edad 
edad = int(input("por favor digite su edad: "))
#se ejecuta la funcion de la formula del indice metabolico basal de acuerdo a su genero 
#se almacena el resultado de la funcion en una variuable
#para imprimirlo correctamente en pantalla
indice_h = indice_meta_basal_hombre(peso_cuerpo,altura,edad)
print("su indice metabolico es de: ",indice_h)
#indice metabolico mujer 
indice_m = indice_meta_basal_mujer(peso_cuerpo,altura,edad)
print("su indice metabolico es de: ",indice_m)

