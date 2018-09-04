# Description:

<hr>
Write a function that takes a single string (word) as argument. The function must return an ordered list containing the indexes of all capital letters in the string.

A few examples:

```
Test.assertSimilar( capitals('CodEWaRs'), [0,3,4,6] );
```

Проблема заключается в том, что если не использовать `enumerate`, то будут повторятся `индексы`: 
```
word = "HeLLoWoRLD_HeLLoWoRLD"
word = re.findall(r'\w', word)
    print(word)
    result = []
    for i in word:
        if (i.istitle()): result.append(word.index(i))
    return sorted(result)
```

Первый результат
```
[0, 0, 2, 2, 2, 2, 2, 2, 5, 5, 7, 7, 9, 9]
```

Конечный результат(приведён в файле `Python.py`) через 'enumerate'
```
[0, 2, 3, 5, 7, 8, 9, 11, 13, 14, 16, 18, 19, 20]
```
