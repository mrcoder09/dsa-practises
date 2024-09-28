import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.round

fun main(args: Array<String>) {

    val value = 1084610.0

    1119996.0


    println(value.formatWithCommas())
    println(value.formatWithCommas2(2))
    println(value.formatWithCommas3(2))
    print(value.toUnit())
}


fun Double.formatWithCommas(): String {
    val formatter = DecimalFormat("#,###.##")
    return formatter.format(this)
}

fun Double.formatWithCommas3(decimalPlaces: Int): String {
    val roundedValue = this.roundDecimal(decimalPlaces)
    val formatter = DecimalFormat("#,###")
    return formatter.format(roundedValue)
}

fun Double.roundDecimal(decimalPlaces: Int): Double {
    val factor = 10.0.pow(decimalPlaces)
    return round(this * factor) / factor
}

fun Double.formatWithCommas2(decimalPlaces: Int): String {
    val roundedValue = this.roundDecimal(decimalPlaces)
    val formatter = DecimalFormat("#,###.${"#".repeat(decimalPlaces)}")
    return formatter.format(roundedValue)
}

fun Double.toUnit(): String {
    return if (this == 0.0) {
        "0"
    } else {
        if (this >= 1000000) {
            val numberFormatter = DecimalFormat("#,##0.000")
            val formattedValue = numberFormatter.format(this / 1000000)
            formattedValue.removeSuffix(".000")
        } else {
            this.formatWithCommas2(2)
        }
    }
}



