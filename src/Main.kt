fun main() {
    // Практическая работа №1: Остаток от деления
    val remainder = 20 % 17
    if (remainder > 0) {
        println("Получилось значение большее чем ноль!")
    }

    // Практическая работа №2: Простое условие
    print("Введите ваш возраст: ")
    val age = readln().toInt()
    when {
        age > 18 -> println("Вам уже все можно")
        age == 18 -> println("Ура, Вам 18 лет!")
        else -> println("Вы еще слишком молоды")
    }

    // Практическая работа №3: Небольшой калькулятор
    val num1 = 2
    val num2 = 6
    print("У вас есть числа: $num1 и $num2\n1 (Добавить)\n2 (Отнять)\n0 (Ничего)\nВыберите действие: ")
    val action = readln().toInt()
    when (action) {
        1 -> println("Результат сложения: ${num1 + num2}")
        2 -> println("Результат вычитания: ${num1 - num2}")
        0 -> println("Ничего не делаем")
        else -> println("Неверный выбор действия")
    }

    // Практическая работа №4: Определение дня недели
    print("Введите число от 1 до 7: ")
    val dayOfWeek = readln().toInt()
    when (dayOfWeek) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Неверный номер дня недели")
    }

    // Практическая работа №5: Среднее число
    print("Введите три числа через пробел: ")
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    if (a == b && b == c) {
        println("Ошибка")
    } else {
        val middle = when {
            b in a..c || b in c..a -> b
            a in b..c || a in c..b -> a
            else -> c
        }
        println("Среднее число: $middle")
    }

    // Практическая работа №6: Подсчет прибыли
    print("Введите значение экспорта: ")
    val export = readln().toInt()
    print("Введите значение импорта: ")
    val import = readln().toInt()
    val balance = export - import
    when {
        balance > 0 -> println("Ваша прибыль составляет: $balance")
        balance < 0 -> println("Ваши убытки составили: ${-balance}")
        else -> println("Сальдо равно нулю")
    }

    // Практическая работа №7: Проверка переменных
    print("Введите первое число: ")
    val firstNumber = readln().toInt()
    print("Введите второе число: ")
    val secondNumber = readln().toInt()
    val bothEven = firstNumber % 2 == 0 && secondNumber % 2 == 0
    println("Обе переменные четные: $bothEven")
}