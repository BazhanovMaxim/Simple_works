# Посчитать все гласные

## Два решения: 

1. `str.replaceAll("(?i)[qwrtpsdfghjklzxcvbnmy1234567890 ]" , "").length()` . Здесь мы заменяем всё, кроме тех, которые указали;
2. `str.replaceAll("(?i)[^aeiou]", "").length();`. Любой, кроме перечисленных (не a, e, i, o, u)