# Oriana Moreno - C.I 29929240

import sys

def orderingProcess(list):
    words = []
    numbers = []
    for element in list:
        if element.replace('-', '').isdigit():
            numbers.append(element)
        else:
            words.append(element)

    ordered_numbers = sorted(numbers, key=assignSign)
    ordered_words = sorted(words, key=str.lower)
    ordered_list = []
    index_word = 0
    index_number = 0
    for element in list:
        if element.replace('-', '').isdigit():
            ordered_list.append(ordered_numbers[index_number])
            index_number += 1
        else:
            ordered_list.append(ordered_words[index_word])
            index_word += 1

    return ordered_list

def assignSign(num):
    if '-' not in num:
        return int(num)
    else:
        unsigned_number = int(num[1:])
        signed_number = 0 - unsigned_number
        return signed_number

def main():
    try:
        with open('Listas.in', 'r', encoding='utf-8') as file: 
            lines = file.readlines()
        
        try:
            with open('Salida.out', 'w', encoding='utf-8') as output:
                print("\n----------------Lista ordenada-----------------\n")
                for line in lines:
                    if line.strip() == '.':
                        break
                    elements = line.strip().rstrip('.').split(', ')
                    ordered_list = orderingProcess(elements)
                    view_ordered_list = ', '.join(ordered_list)
                    output.write(view_ordered_list + '.\n')
                    print(view_ordered_list + ".") 
            
            print("\n-----------------------------------------------")
            print("El archivo de salida ha sido creado exitosamente!\n")

        except Exception as e:
            print("Ocurrio un error. No se pudo crear el archivo de salida", e)

    except FileNotFoundError:
        print("El archivo no fue encontrado")
        sys.exit(1)

if __name__ == "__main__":
    main()