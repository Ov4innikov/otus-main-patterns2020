# otus-main-patterns2020
Домашние задания выполненные в процессе прохождения курса от отуса "Архитектура и шаблоны проектирования". В README.md будут помещаться сами задания.

## 1.ДЗ. ООП or not ООП 
Написать стек для строк
Цель: В результате выполнения ДЗ вы напишете программу с применением основ ООП (инкапсуляция, полиморфизм, наследование). В данном задании тренируются также навыки работы с динамическим распределением памяти.
1. Описать класс ""Строка"". Обязательные поля класса:

указатель хранит адрес динамически выделенной памяти для размещения символов строки;
отдельное значение значение хранит длину строки в байтах.
Реализовать обязательные методы следующего назначения:
-конструктор без параметров;
-конструктор, принимающий в качестве параметра строковый литерал;
-конструктор, принимающий в качестве параметра символ;
-метод получения длины строки;
-метод очистки строки (делает строку пустой);
-деструктор.

2. Написать класс работы со строками, который также может возвращать как массив символов либо всю строку либо её часть.

3. Описать стек хранения строковых данных, в котором могут использоваться объекты обоих классов. Инициализация определяет начальное число элементов, при превышении определённого процента заполнения динамически изменяется.

-инициализация стека
-помещение элемента в стек
-удаление элемента из стека
-получение верхнего элемента стека без его удаления
-определение, пуст ли стек возвращает 1 если стек пустой и 0 в противном случае.
-вывод элементов стека

4. Написать тестовый пример, который отражает:
работу каждого класса работы со строкой.
работу стека с объектами обоих классов согласно его функциональности.


## 2.ДЗ. "А если их будет много?" Однопоточное и многопоточное приложения 
Цель: В результате выполнения ДЗ вы сделаете решение задачи путем разделения её на потоки. В данном задании тренируются навыки создания многопоточных приложений.
Даны две матрицы A и B размерности NxN. Необходимо вычислить их произведение: матрицу С.
C[i][j] = сумма по k от 1 до N A[i][k]*B[k][j].
Разработайте многопоточное приложение, выполняющее вычисление произведения матриц. Элементы cij матрицы произведения С = A×B вычисляются параллельно p однотипными потоками. Если некоторый поток уже вычисляет элемент cij матрицы C, то следующий приступающий к вычислению поток выбирает для расчета элемент ci,j+1, если j
Решение, пакет: ru.otus.main.patterns


## 3.ДЗ. "Откуда ноги растут" или что предшествует программированию 
Тема проекта. Выбор архитектурного стиля для своего проекта
Цель: На этом этапе вы уже определились с проектом. Или, на выбор, выбирает из заданий: -Платформа чат сообщений -Интернет-магазин В данном задании тренируются навыки определения стиля, в котором он реализует свой проект. Закладывает фундамент в разработку.
Выбрать архитектурный стиль для проекта. Описать причины выбора. Возможно, в проекте будет несколько подсистем, тогда описать выбор по каждой.
Решение, ссылка на репо проекта: https://github.com/Ov4innikov/photo-platform/blob/master/README.md

ДЗ сдается в виде ссылки на GitHub репозиторий с проектом (текстовый файл с описанием внутри).


## 4.ДЗ. Общие шаблоны распределения ответственностей 
Выберет шаблоны, которые будет использовать в проекте.
Решение, шаблоны: информационный эксперт, контроллер, создатель. А вообще буду стараться применять все шаблоны.


### Примечания
* Срок сдачи решения 2 недели со дня занятия
ДЗ сдается в виде ссылки на GitHub репозиторий с проектом.
По вопросам обращаться в Slack к студентам, преподавателям и наставникам в канал группы
Критерии оценки: Критерии оценки:
1. Решение прислано в срок 1 балл
2. Описаны все объекты с использованием ООП, программа работает - 1 балл.
3. Разработан тест - 1 балл.