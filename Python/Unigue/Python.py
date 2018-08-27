array = [1, 1, 1, 2, 1, 1]
def find_uniq(arr):
    a, b = set(arr)
    return a if arr.count(a) == 1 else b

print(find_uniq(array))    