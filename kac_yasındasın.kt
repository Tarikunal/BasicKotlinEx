import java.util.*

fun main(args: Array<String>)
{
    print("Doğum yılınız :")
    var dogum_yili : Int= readLine()!!.toInt()

    var bu_yil= Calendar.getInstance().get(Calendar.YEAR)
    var yas= bu_yil-dogum_yili

    println("Yaşınız $yas ")
}