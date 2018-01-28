package pl

class czlowiek(imie_init: String, dlugosckroku_init: Int) {

    var kroki = 0
    var imie = ""
    var dlugosckroku = 0

    init {
        this.imie = imie_init
        this.dlugosckroku = dlugosckroku_init
}

    fun zrobKrok(){
        this.kroki = this.kroki + 1
        println(this.imie + " robi krok")
    }

    fun cofaSie() {
        this.kroki = this.kroki -1
        println(this.imie + " cofa sie")
    }

    fun ileKrokow(){
        println(this.imie + " " + this.kroki)
    }

    fun multiply(): Int {
        return this.dlugosckroku * this.kroki

    }
    fun obliczDroge() {
        println(this.imie + " " + this.multiply())

    }


    }


