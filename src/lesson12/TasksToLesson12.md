Задача №1
Нужно смоделировать подключение наушников к телефону. Наушники могут быть
проводными и беспроводными.
Создать:
● Абстрактный класс Headphones, который знает марку/модель наушников
● Конкретные классы WiredHeadphones и WirelessHeadphones
● Класс Phone, в котором есть методы connect(WiredHeadphones wh) и
connect(WirelessHeadphones). Когда эти методы вызываются, на консоль
выводится сообщение о том, какие конкретные наушники какого типа были
подключены.

Задача №2 (трудная)*
Необходимо реализовать простой рабочий пул (workers pool). Для этого нужно создать:
● Класс Worker, в котором есть:
○ внутренний идентификатор (например, целочисленный)
○ Метод doWork(String taskSummary), который напечатает “Worker {id} is
doing {taskSummary}”
● Класс WorkerPool, в конструкторе которого можно задать максимальный размер
пула. В классе должен быть статический метод getWorker(), который должен
возвращать экземпляр класса Worker. Этот метод должен следить за тем, чтобы
количество экземпляров (объектов) класса Worker не превышало размер пула. То
есть, если размер пула 3, то последовательные вызовы метода getWorker()
должны возвращать:
○ Worker номер 0
○ Worker номер 1
○ Worker номер 2
○ Worker номер 0 — тот же самый объект, что и при первом вызове
○ Worker номер 1 — тот же самый объект, что и при втором вызове
○ и т. д.