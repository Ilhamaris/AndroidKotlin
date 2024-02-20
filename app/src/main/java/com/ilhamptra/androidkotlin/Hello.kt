package com.ilhamptra.androidkotlin

fun main(args: Array<String>) {
    biodata("Ilham Putra Arysila", "Ds. Glonggong Kec. Balerejo Kab.Madiun", age = 19)
    hobby(nama1 = "Futsal",
        nama2 = "Mendaki Gunung",
        desc1 = "karena dengan bermain futsal tubuh menjadi sehat karena termasuk olahraga",
        desc2 = "karena mendaki gunung bisa menyembuhkan patah hati")
}

fun biodata(name:String, alamat:String, age:Int){ // minimal 2 parameter/args
    println("=======================")
    println("\t\tBIODATA")
    println("=======================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("Alamat\t: $alamat")
    println("=======================")
}

fun hobby(nama1:String, nama2:String, desc1:String, desc2:String){
    println("\t\tHOBI KU")
    println("=======================")
    println("Saya punya hobby $nama1 dan $nama2")
    println("Alasan suka bermain $nama1 adalah $desc1")
    println("Selain futsal hobiku yaitu $nama2.")
    println("Alasan suka $nama2 $desc2.")
}