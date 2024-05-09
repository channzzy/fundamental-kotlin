import java.io.FileReader
import java.io.FileWriter

const val APP = "LearnKotlin"
const val VERSION = "1.0"
fun main() {
    //PrintLn akan otomatis menggunakan enter
    println("Hallo saya chandra");
    println("Hallo saya chandra");
    println("Hallo saya chandra");

    //Jika print tidak otomatis menggunakan enter
    print("Ini tanpa otomatis enter");

    //Tipe data number
    //Int
    var age: Int = 170
    var heigh: Byte = 30
    println(age);
    println(heigh);

    //Float
    var float: Float = 98.98F; //Jika kita menggunakan tipe data float maka harus ada tanda F diakhir isi variable
    var radius: Double = 232993.78;
    println(float);
    println(radius)

    //Conversion
    var number:Int = 100;
    var byte: Byte = number.toByte();
    println(byte);
    var short: Short = number.toShort();
    var long: Long = number.toLong()

    //Tipe data character
    var char:Char = 'A';
    var charNumber: Char = '9';
    println(char);
    println(charNumber)

    //Tipe data boolean
    var iniTrue: Boolean = true;
    var iniFalse: Boolean = false;
    println(iniTrue);
    println(iniFalse);

    //Tipe data string
    //Tanda petik dua hanya bisa digunakan untuk satu baris
    //Sedangkan petik tiga kali bisa digunakan untuk lebih dari satu baris
    var nama: String = "Chandra";
    var namaBelakang: String = "Ardiansyah";
    var alamat:String = """
        Jl.Slamet Riyadi
        GG.Annur No 62
    """.trimIndent()

    //Jika muncul spasi sebelum string banyak baris maka kita bisa menggunakan beberapa func berikut
    //Trim margin
    //Ini akan menghapus semua spasi sebelum tanda pipe(|)
    //Atau kita bisa menentukan sendiri simbol apa yang kita inginkan dengan mengisi parameter dengan simbol yang kita inginkan
//    alamat.trimMargin(">")

    //TrimIndent
    //Ini lebih simple dari trim margin, jadi kotlin akan mendeteksi otomatis blank space dari string yang sudah kita masukan
//    alamat.trimIndent()

    println(nama)
    println(alamat)

    //Menggabungkan dua string
    //Menggunakan cara lama dengan menggunakan simbol +
//    var fullName:String = nama + " " + namaBelakang
//    println(fullName)

    //Menggunakan cara baru dengan menggunakan string template/interpolation
    var fullName:String = "$nama $namaBelakang"
    println(fullName)
    var desc:String = "total char dari $nama = ${fullName.length}"
    println(desc)

    //Variable
    // Kita bisa menggunakan var untuk muttable(bisa dirubah isinya sesuai dengan tipe datanya)
    // Kita bisa menggunakan val untuk Immutable(tidak bisa dirubah variablenya)

    var bisaDiUbah: String = "Chandra";
    val tidakBisaDiubah: String = "Ardiansyah";
    //Kita juga tidak perlu mendefinisikan tipe data secara eksplisit karena akan terdeteksi otomatis
    val hours = 10;

    println(bisaDiUbah)
    bisaDiUbah = "Ardi"
    println(bisaDiUbah)
    println(tidakBisaDiubah)

    //Untuk mengisi variable yang tidak memiliki nilai kita bisa menggunakan '?' agar bisa diiisi nullable
    //Karena pada kotlin jika kita membuat variable maka harus diisi

    var bisaNull: String? = null;
    println(bisaNull)
    // error karena bisaNull
//    println(bisaNull.length);
    // cara menggunakan func divariable null
    println(bisaNull?.length)

    //Constant ini sama aja dengan val tidak bisa ubah akan tetapi bisa diakses dimanapun
    println("$APP $VERSION")

    //Array
    //Dikotlin kita hanya bisa menampung tipe data yang sama
    var members:Array<String> = arrayOf("Chandra","Ardi","Chanzy")
    var values:Array<Int> = arrayOf(1,2,3)

    //Function dalam array
    //size : digunakan untuk menghitung jumlah item dalam array
    //get(index): digunakan untuk mengambil data sesuai indexnya
    //[index] : ini juga alternatif dari get kita bisa mengambil data sesuai indexnya
    //set(index,value) : kita bisa merubah data sesuai dengan indexnya
    //[index] = value : ini juga sama dengan set index

    println(members.size)
    println(members.get(1))
    println(members[1])
    members.set(1,"Chanzy")
    println(members[1])
    members[2] = "Chandra"
    println(members[2])

    //Kode array nullable
    val arrayNull: Array<String?> = arrayOfNulls(2)
    println(arrayNull[0])

    //Tipe data range
    //Operasi yang didukung di range
    //count: mendapatkan total data
    //contains(value) mengecek apakah terdapat value
    //first mendapatkan nilai last
    //last mendapatkan nilai akhir
    //step mendapatkan nilai kenaikan
//    val range = 0..1000
    val range = 1000 downTo 0 step 5

    //kita bisa mengatur step sesuai yang kita inginkan
    println(range.count())
    println(range.contains(20))
    println(range.first)
    println(range.last)
    println(range.step)

    //Operasi matematika
    var operasi: Int = 10 + 10;
    println(operasi)
    var operasi2: Int = 10 + 10 / 2;
    println(operasi2)

    //Augmented Assignments
    var total: Int = 0;
    total += 10;
    println(total)

    //Unary operator
    println(total++)
    println(total--)

    //Operator perbandingan
    var value1 = 0
    var value2 = 1
    println(value1 < value2)
    println(value1 != value2)

    //Operator Boolean
    var item1 = 80;
    var item2 = 70;
    println(item1 >= 80 && item2 <= 80)

    //If statement
    if(item1 >= 80 || item2 >= 80){
        println("Selamat anda lulus")
    }else{
        println("Anda tidak lulus")
    }

    //When expression
//    when(item1){
//        80 -> println("Anda lulus dengan baik")
//        70 -> println("Anda lulus")
//        60 -> println("Anda tidak lulus")
//        else -> println("Anda bukan siswa sini")
//    }
    //Multiple when option
//    when(item1){
//        80,70,90 -> {
//            println("Selamat anda lulus")
//        }else -> {
//            println("Anda tidak lulus")
//        }
//    }
    //When expression in
    //Biasanya digunakan untuk mengecek apakah data yang dicek ada didalam array
    val passValues = arrayOf(70,80,90)
    when(item1){
        in passValues -> println("Selamat anda lulus")
        !in passValues -> println("Anda tidak lulus")
    }

    //When expression is
    //Biasanya digunakan untuk mengecek tipe data
    when(nama){
        is String -> println("Nama adalah string")
        !is String -> println("Ini adalah bukan string")
    }

    //For loop
    for (pass in passValues){
        println(pass)
    }
    //While
    var i = 0;
    while (i < 10){
        println("Ini index ke $i")
        i++
    }

    //Function
    helloWorld()
    funParameter("Chandra", "Ardiansyah")
    defaultParam("Chandra")
    namedParamter(firstName = "Chandra", middleName = "Ardi", lastName = "syah")
    printHello(null)
    println(sum(90,20))
    hi("Chandra")

    //Class
    var rumah = Rumah("Subsidi",100000,2024,"Chandra")
    println("Ini adalah rumah ${rumah.pemilik} dengan harga ${rumah.harga} dari tahun ${rumah.tahunPemilik} dengan pemilik ${rumah.pemilik}")

    //Inherit class
    var animal = Animal("Ayam","Ijo",20)
    println(animal.jumlahKaki)

    var kucing = Kucing()
    kucing.name = "persia"
    kucing.color = "putih"
    kucing.jumlahKaki = 7
    println("Nama kucing ini ${kucing.name}, warnanya ${kucing.color} jumlah kakinya ${kucing.jumlahKaki}")

    //Overloaded const
    var pesawat = Kendaraan("Garuda","2","Sayap 2","Hijau")
    println("Ini adalah pesawat ${pesawat.nama} dengan roda ${pesawat.roda} dan warna ${pesawat.warna}")

    var becak = Kendaraan("Becak 01","2","Tidak punya")
    println("Ini adalah becak ${becak.nama} dengan roda ${becak.roda} dan beca ${becak.sayap} sayap")


    //Input and output
    menu()
}

//Function
fun helloWorld(){
    println("Hello world")
    println("Aku adalah chandra")
}

//Function paramter
fun funParameter(nama: String, lastName: String){
    println("Saya adalah $nama $lastName")
}

//Function default paramter

fun defaultParam(firstName: String, lastName:String = ""){
    println("Nama saya adalah $firstName $lastName")
}

//Named Parameter
fun namedParamter(firstName: String, lastName:String, middleName:String){
    println("Hello $firstName $middleName $lastName")
}

//Unit return function
//Function yang tidak mengembalikan data
fun printHello(name: String?) : Unit{
    if(name != null){
        println(name)
    }else{
        println("Tidak ada nama")
    }
}

//Return type function
fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

//Single experssion function
fun hi(name:String): Unit = println(name)

//OOP Class
class Rumah(var tipe:String, var harga:Int, var tahunPemilik:Int, var pemilik:String){
    init {
        this.tipe
        this.harga
        this.tahunPemilik
        this.pemilik
    }
}

//OOP Inheritance
open class Animal(){
    //deklrasi variable
    var name:String? = null
    var color:String? = null
    var jumlahKaki:Int? = null

    //membuat kontruktor
    constructor(name: String,color:String,jumlahKaki:Int) : this(){
        this.color = color
        this.name = name
        this.jumlahKaki = jumlahKaki
    }
}

//Inherit class
class Kucing() : Animal()
{

}

//Overloading constructor
class Kendaraan(){
    var nama:String?= null
    var roda:String? = null;
    var sayap:String? = null
    var warna:String? = null

    constructor(nama: String,roda: String,sayap: String,warna:String) : this(){
        this.nama = nama
        this.roda = roda
        this.sayap = sayap
        this.warna = warna

        println("object ${this.nama}")
        println(this.roda)
        println(this.sayap)
        println(this.warna)
        println(this.roda)
    }

    //Constructor ke 2 dengan 3 param
    constructor(nama: String,roda: String,sayap: String) : this(){
        this.nama = nama
        this.roda = roda
        this.sayap = sayap

        println("object ${this.nama}")
        println(this.roda)
        println(this.sayap)
        println(this.roda)
    }
}

//Input dan output pada kotlin
fun menu(){
    println("Enter: ")
    println("1 - Write: ")
    println("2 - Read: ")
    println("3 - Exit \n ")

    var choice = readLine()!!.toInt()
    var message:String?

    when(choice){
        1 -> {
            println("Enter message")
            message = readLine().toString()
            writetoFile(message)
        }
        2 -> {
            println("Reading")
            readFromFile()
        }

        3 -> {
            println("Exiting")
        }
    }
}

fun writetoFile(message:String){
    try {
        val writter = FileWriter("Appreader.txt", true)
        writter.write(message + "\n")
        writter.close()
    }catch (ex:Exception){
        println(ex)
    }
}

fun readFromFile(){
    val reader = FileReader("Appreader.txt")
    var char:Int?

    try{
        do{
            char = reader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex:Exception){
        print(ex.toString())
    }
}