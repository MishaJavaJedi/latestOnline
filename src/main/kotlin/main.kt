val lastOnline = 3600
val secondOnline = 45_853
val thirdOnline = 198_764

fun main() {
    agoToText(secondsToMinutes(lastOnline))
    agoToText(secondsToMinutes(secondOnline))
    agoToText(secondsToMinutes(thirdOnline))
}

fun secondsToMinutes(seconds: Int):Int{
   return seconds/60
}

fun agoToText(minutes: Int) {
    if (minutes < 60)
        when (minutes) {
            in 0..1 -> println("Был(a) в сети только что")
            2, 3, 4 -> println("Был(a) в сети $minutes минуты назад")
            in 5..20 -> println("Был(a) в сети $minutes минут назад")
            21, 31, 41 -> println("Был(a) в сети $minutes минуту назад")
            in 25..30 -> println("Был(a) в сети $minutes минут назад")
            in 32..34 -> println("Был(a) в сети $minutes минуты назад")
            in 35..40 -> println("Был(a) в сети $minutes минут назад")
            in 42..44 -> println("Был(a) в сети $minutes минуты назад")
            in 45..50 -> println("Был(a) в сети $minutes минут назад")
            in 52..54 -> println("Был(a) в сети $minutes минуты назад")
            in 55..59 -> println("Был(a) в сети $minutes минут назад")
        }
    if (minutes >= 60) minutesToHours(minutes)
}

fun minutesToHours(minutes: Int) {
    val hour = minutes / 60
    when (hour) {
        1, 21 -> println("Был(a) в сети $hour час назад")
        in 2..4 -> println("Был(a) в сети $hour часа назад")
        22, 23 -> println("Был(a) в сети $hour часа назад")
        in 5..20 -> println("Был(a) в сети $hour часов назад")
        in 24..48 -> println("Был(a) в сети сегодня")
        in 48..72 -> println("Был(a) в сети вчера")
        in 72..Int.MAX_VALUE -> println("Был(a) давно")
    }
}
















