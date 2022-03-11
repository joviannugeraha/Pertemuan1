fun main() {
    //Variabel dengan kata kunci val hanya bisa diberikan nilai sekali saja ketika program dijalankan, untuk assigned
    //value yang kedua dan selanjutnya maka variabel dengan kata kunci val tersebut akan diangap suatu kesalahan oleh compiler.
    var varVariabel: Int
    varVariabel = 56 //assigning first value to varVariabel
    println("Pemberian nilai pertama pada varVariabel = "+varVariabel)
    varVariabel = 78 //assigning second value to varVariabel
    println("Pemberian nilai kedua pada varVariabel = "+varVariabel)
    var phi = 3.14
    phi = 2.5
    //Ketika kita merubah nilai variabel val phi untuk kedua kalinya maka akan terdapat pesan kesalahan agar kita menggunakan var variabel.
}