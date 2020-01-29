# Слово с наибольшим количеством очков

## Задача:
    Учитывая строку слов, вам нужно найти слово с наибольшим количеством очков.
    Каждая буква слова набирает очки в соответствии с его положением в алфавите `a = 1, b = 2, c = 3` и т. Д.

    Вам нужно вернуть слово с наибольшим количеством очков в виде строки.
    Если два слова имеют одинаковую оценку, вернуть слово, которое появляется раньше в исходной строке.
    Все буквы будут строчными, и все входные данные будут действительными.
    
Лучшие решения на Codewars:

```
import java.util.*;

public class Kata {
  public static String high(String s) {
    return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get(); 
  }
}
```

```
public class Kata {
  public static String high(String s) {
    String winner = "";
    int highScore = 0;
    for (String word : s.split(" ")) {
        int score = 0;
        for (char c : word.toCharArray()) {
          score += c - 'a' + 1;
        }
        if (score > highScore) {          
          winner = word;
          highScore = score;
        }
    } 
    return winner;
  }
}
```
