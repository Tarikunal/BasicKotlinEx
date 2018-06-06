fun main(args: Array<String>)

{
    println("Toplanacak sayıları giriniz.")
    print("Sayı1 :")
    var sayi1: Int= readLine()!!.toInt()
    print("Sayı2 :")
    var sayi2: Int= readLine()!!.toInt()
    var sonuc: Int?
    sonuc= sayi1+sayi2
    print("$sayi1 ile $sayi2'nin toplamı : $sonuc'tur.") //üstteki değişkenleri tırnak içinde kullanmak istiyorsak $ kullanıyoruz.
}
