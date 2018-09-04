import re

word = "HeLLoWoRLD_HeLLoWoRLD"

def capitals(word):
    word = re.findall(r'\w', word)
    result = []

    for index, value in enumerate(word):
        if (value.istitle()): result.append(index)
    return result
    
print(capitals(word))