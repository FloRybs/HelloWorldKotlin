package pl

fun main(args : Array<String>) {

    var Flora = czlowiek("FloraRybs",30)
    var Marcin = czlowiek("MaFraW",100)
    var Franek = czlowiek("Franciszek",70)

    Flora.zrobKrok()
    Marcin.zrobKrok()
    Flora.zrobKrok()
    Franek.zrobKrok()
    Franek.zrobKrok()
    Franek.cofaSie()
    Flora.cofaSie()
    Flora.cofaSie()
    Marcin.zrobKrok()


    Flora.ileKrokow()
    Marcin.ileKrokow()
    Franek.ileKrokow()

    Flora.obliczDroge()
    Marcin.obliczDroge()
    Franek.obliczDroge()

}