#SQL задачи

Table name: ``` traveles ```

name | country | 
--- | --- | 
Andrew | Italy |  
Maria | Mexico | 
Sam | Canada | 
Jonathan | France | 
Andrew | Egypt | 
Mena | Argentina | 
Lukas | China | 
Maxim | USA | 

### Задача 1:
Показать все страны, кроме: Мексика, США, Канада

``` select * from travelers   WHERE "country" NOT IN ('Mexico', 'USA', 'Canada') ```