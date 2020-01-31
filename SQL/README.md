# SQL задачи

Table name: ``` travelers ```

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

#### Задача 1: показать все страны, кроме: Мексика, США, Канада

``` select * from travelers   WHERE "country" NOT IN ('Mexico', 'USA', 'Canada') ```
