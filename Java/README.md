# Убрать все глассные

## Решения

1. `return str.replaceAll("(?i)[aeiou]" , "");`
2. `return str.replaceAll("[aAeEiIoOuU]", "");`