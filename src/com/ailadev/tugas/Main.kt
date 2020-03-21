package com.ailadev.tugas

import kotlin.math.pow
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var loop: Boolean = true

    do {
        menu()
    }
    while (loop)
}

fun menu() {
    println("--- Program rumus Kubus ---")
    println("1. Volume")
    println("2. Keliling")
    println("3. Luas")
    print("Pilih :")
    val pilih = readLine()!!.toInt()
    var kubus = Kubus()
    when (pilih) {
        1 -> {
            print("Masukkan panjang sisi :")
            val sisi = readLine()!!.toDouble()
            val result = kubus.volume(sisi)
            println(result)
            println("=========")
        }
        2 -> {
            print("Masukkan panjang rusuk :")
            val rusuk = readLine()!!.toDouble()
            val result = kubus.keliling(rusuk)
            println(result)
            println("=========")
        }
        3 -> {
            print("Masukkan panjang sisi :")
            val sisi = readLine()!!.toDouble()
            val result = kubus.luas(sisi)
            println(result)
            println("=========")
        }
        else -> {
            exitProcess(0)
        }
    }
}

interface BangunRuang {
    fun volume(sisi: Double): String
    fun keliling(rusuk: Double): String
    fun luas(sisi: Double): String
}

class Kubus() : BangunRuang {
    override fun volume(sisi: Double): String {
        return "Hasil volume : ${sisi.pow(3)}"
    }

    override fun keliling(rusuk: Double): String {
        return "Hasil keliling : ${12 * rusuk}"
    }

    override fun luas(sisi: Double): String {
        return "Hasil luas permukaan : ${6 * (sisi * sisi)}"
    }
}
