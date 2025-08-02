package org.example

import org.w3c.dom.ranges.Range
import kotlin.math.pow

fun main() {
//   1. Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
//    var x = readln().toInt()
//    if (x>0){
//        println("Ваше число $x положительное")}
//    else if (x<0){
//        println("Ваше число $x отрицательное")
//        }

//   2.Дана строка. Выведите в консоль длину этой строки.
//    var string: String = readln()
//    println("Длина вашей строки:${string.length.toInt()}")

//    3.Дана строка. Выведите в консоль последний символ строки.
//    var string=readln().toString()
//    println("Последний символ строки:${string.last()}")

//   4. Дано число. Проверьте, четное оно или нет.
    /*   Решение Чтобы проверить, является ли число чётным или нет в Kotlin,
нужно разделить его на 2 и проверить остаток(%). Если остаток равен 0,
то число чётное, если 1 — нечётное.*/
//    val x: Int =  readln().toInt()
//    if (x % 2 == 0){
//        println("Число четное")}
//    else {
//            println("Число нечетное")
//        }

//   5. Даны два слова. Проверьте, что первые буквы этих слов совпадают.
//    println("Введите первое слово:")
//    var word1 = readln().toString()
//    println("Введите второе слово:")
//    var word2 = readln().toString()
//
//    if (word1.first()==word2.first()){
//        println("Нашли сходсвто")}
//        else{
//            println("Не нашли сходсвто")
//        }

    /*  6.Дано слово.Получите его последнюю букву.
    Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.*/

//    println("Введите слово:")
//    var word = readln().toString()
//    if (word.last() == 'ь') {
//        println("${word[word.length-1]}")
//    } else {
//        println("${word.last()}")
//    }

    //Прикол про сережу (Тест While)
//    println("Введите число:")
//    var x=readln().toInt()
//    while(x>0) {
//        println("Время до прикола: ${x--}")
//        Thread.sleep(1000)
//        continue
//        }
//    println("Сережа пидарас")

//    7.Дано целое число. Выведите в консоль первую цифру этого числа.
//    val x: String =  readln().toString()
//    println("${x[0]}")

//    8.Дано целое число. Выведите в консоль последнюю цифру этого числа.

//    var x: String= readln().toString()
//    println("${x.last()}")

//    9.Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
//    println("Введите свое число:")
//    var x = readln().toString()
//    var sum = x.first().digitToInt()+x.last().digitToInt()
//    println("Сумма первого и последнего числа: $sum")

//   10. Дано целое число. Выведите количество цифр в этом числе.
//    val number=readln().toString()
//    val lenght= number.length
//    println("Длина вашего числа: $lenght")

//   11. Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
//    val num1= readln().toString()
//    val num2= readln().toString()
//    val sum: Boolean = (num1.first()==num2.first())
//    println("Результат сравнения: $sum")

//    12.Выведите в консоль все целые числа от 1 до 100.
//    var num = 0
//    while (num<=100){
//        println("${num++}")

    /*    13.Дана строка. Если в этой строке более одного символа,
            выведите в консоль предпоследний символ этой строки.*/
//    var string = readln().toString()
//    var Lenght = string.length
//    if (Lenght>=2){
//        println("Предпоследний символ строки:${(string[string.length-2])}")}
//        else {
//            println("Строка слишком короткая")}

//    14.Даны два целых числа. Найдите остаток от деления первого числа на второе.
//    println("Введите число A:")
//    val a = readln().toInt()
//    println("Введите число B:")
//    val b = readln().toInt()
//    val c = (a % b)
//    println("Ваш остаток: $c")


//   15. Дано целое число, содержащее номер месяца от 1 до 12: 1
    //    Определите, в какую пору года попадает этот месяц.
//    println("Введите число:")
//    var x = readln().toInt()
//    if (x in 2 downTo 1) {
//        println("Зима")
//    } else  if (x in 5 downTo 3){
//        println("Весна")
//    } else  if (x in 8 downTo 6){
//        println("Лето")
//    } else  if (x in 11 downTo 9){
//        println("Осень")
//    } else if (x == 12){
//        println("Зима")

//    16.Выведите в консоль все четные числа из промежутка от 1 до 100.
//    var x = 0
//    while (x<=100) {
//        x = x + 1
//        if (x % 2 == 0) {
//            println("Ваше число: $x")
//        }
//    }

//  17. Дана некоторая строка: Переберите и выведите в консоль по очереди все символы с конца строки.
//    val word = readln().toString()
//    for (i in word.length-1 downTo 0  ){
//        println("Вот ваши буквы: ${word[i]}")}

//  18.
//    println("Введите число:")
//    val x = readln().toInt()
//     val result = when (x){
//         in 15 downTo 0  ->  "1"
//         in 30 downTo 16 ->  "2"
//         in 45 downTo 31 ->  "3"
//         in 59 downTo 46 ->  "4"
//         60 -> "Ровно час"
//         else -> "Некорректное значение "
//         }
//println(result)

// 19.Выведите в консоль все числа кратные трем в промежутке от 1 до 100
//    var num = 0
//    while (num<=100 ){
//        num++
//        if (num % 3 == 0 ){
//            println(num)
//        }
//    }
// 20.Даны два целых числа. Проверьте, что первое число без остатка делится на второе.

//    val a = readln().toInt()
//    val b = readln().toInt()
//    val z: Boolean = (a % b == 0)
//    print(z)
//21.
//    val wd1: Char = 'a'
//    val wd2: Char = 'b'
//    val wd3: Char = 'c'
//    println(wd1.toString()+wd2.toString()+wd3.toString())
// 22.
//    println("Введите количество килобайт:")
//    val kb = readln().toInt()
//    val b: Int = (kb * 1024)
//    println("Количество байт: $b")
// 23.Найдите сумму всех целых чисел от 1 до 100
//    var num = 0
//    var sum = 0
//    while (num < 100){
//        num = num + 1
//        sum = sum + num
//
//    println(sum)}
// 24.
//    val wd1: Char = '1'
//    val wd2: Char = '2'
//    val wd3: Char = '3'
//    println(wd1.digitToInt()+wd2.digitToInt()+wd3.digitToInt())
// 25.
//    println("Введите количество килобайт:")
//    val mb = readln().toInt()
//    val kb = mb * 1024
//    val b: Int = (kb * 1024)
//    println("Количество байт: $b")
// 26. Найдите сумму всех целых нечетных чисел в промежутке от 1 до 100
//    var num = 0
//    var sum = 0
//    while (num < 100){
//        num = num + 1
//        if (num % 2 != 0 ){
//        sum = sum + num}}
//
//    println(sum)
// 27. Напишите код, который выведет первые N степеней двойки
//    var num: Int = readln().toInt()
//    var num1: Int = 0
//    while (num1 < num){
//        num1++
//        println("${2.0.pow(num1)}")
//    }
//    28.Сложите значения этих строк как целые числа.
//    val str1: String = "123"
//    val str2: String = "345"
//    val str3: String = "678"
//    println("Сумма чисел: ${str1.toInt()+str2.toInt()+str3.toInt()}")
//      29.
//    var number: Int = 12345
//    var reversed: Int = 0
//    while (number != 0 ) {
//        val digit = number % 10
//        reversed = reversed * 10 + digit
//        number /= 10
//
//    }
//    println(reversed)

// 30.Найдите сумму цифр этого числа
//    var number: Int = 12345
//    var reversed: Int = 0
//    var sum: Int = 0
//    while (number != 0 ) {
//        val digit = number % 10
//        reversed = reversed + digit
//        number /= 10}
//    println(reversed)
/*    31.Дано дробное число, содержащее количество гигабайт
* Переведите это значение в мегабайты, килобайты и байты.*/
//    val gb: Double = readln().toDouble()
//    val mb: Float = (gb*1024).toFloat()
//    val kb: Float = (mb*1024).toFloat()
//    val b: Float = (kb*1024).toFloat()
//    val TXT = """
//                     |Количество МБ:$mb
//        |Количество КБ:$kb
//                 |Количество Б:$b
//    """.trimMargin()
//
//   println(TXT)
// 32.Выведите в консоль все целые числа от 100 до 1

//    var n = 100
//    while (n != 0 ){
//        n--
//    println(n)}
// 33.Дана некоторая строка:Переберите и выведите в консоль по очереди все символы с конца строки
//    val str: String = "abcd"
//    for (i in str.length-1 downTo 0 ){
//        println(str[i])}
// 34.Дано целое число, содержащее количество байт переведите это значение в гигабайты, мегабайты и килобайты
//    val b: Long = readln().toLong()
//    val kb: Float = (b/1024).toFloat()
//    val mb: Float = (kb/1024).toFloat()
//    val gb: Float = (mb/1024).toFloat()
//    val TXT = """
//                     |Количество КБ:$kb
//        |Количество МБ:$mb
//                 |Количество ГБ:$gb
//    """.trimMargin()
//
//   println(TXT)

    }
































