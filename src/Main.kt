fun main() {
    //Задание 1
    println("Введите сумму перевода в рублях:")

    // Считываем сумму с клавиатуры
    val summaPerevoda = readLine()!!.toDouble()

    // Считаем комиссию (0.75% это 0.0075)
    var komissiya = summaPerevoda * 0.0075

    // Если комиссия меньше 35, то она равна 35
    if (komissiya < 35.0) {
        komissiya = 35.0
    }

    println("Комиссия составит: $komissiya руб.")


    //Задание 2
    val likes = 32 // Можешь поменять на 61 или 100
    var text = "людям" // По умолчанию пишем "людям"

    // Проверяем последнюю цифру
    when (likes % 10) {
        1 -> {
            // Если 1, но не 11, то меняем на "человеку"
            if (likes % 100 != 11) {
                text = "человеку"
            }
        }
    }

    println("Понравилось $likes $text")

    //Задание 3
    val pokupka = 5000.0
    val postoyannik = true // true - если постоянный клиент

    var skidka = 0.0

    // Считаем скидку по акции
    if (pokupka <= 1000) {
        skidka = 0.0
    } else if (pokupka <= 10000) {
        skidka = 100.0
    } else {
        skidka = pokupka * 0.05 // 5%
    }

    // Считаем цену со скидкой
    var cena = pokupka - skidka

    // Если клиент постоянный, считаем ему еще 1% скидки
    if (postoyannik == true) {
        val dopSkidka = cena * 0.01 // 1% от новой цены
        cena = cena - dopSkidka
    }

    println("Сумма покупки: $pokupka")
    println("Скидка по акции: $skidka")
    println("К оплате: $cena")

}