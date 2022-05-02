Общий класс - Animal <br>
Создать наследников:
1. Кошку
2. Собаку
3. Утку
4. Хомяка
5. Жирафа

- В общем классе объявить поля, которые характерны любому животному <br>
- Объявить пару методов обычных дефолтных для любого животного <br>
- И пару абстрактных, которые будут реализовываться в конкретных животных <br>

Создать интерфейсы:
1. Умеет летать
2. Умеет кусать

Объявить в этих интерфейсах методы <br>
Реализовать эти интерфейсы в соответствующих животных

В мейне:
1. Создать штук 10 животных конкретных
2. Закинуть их в массив animals
3. Пробежаться по массиву циклом и вызвать методы из 
   1. Animal - абстрактные методы из Animal
   2. Умеет летать - проверить умеет ли летать, если умеет, то летать
   3. Умеет кусать - проверить умеет ли кусать, если умеет, то кусать