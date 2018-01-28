package pl

class nowaKlasa {

    var zmienna1: Int = 1

    fun setZmienna1(c: Int): Int {
        this.zmienna1 = c
        println("zmienna 1 ustawiona na "+c)
        return 0
    }
    fun s(){
        println("Hello, world!")
        println("Hello, world2!")
        println("Zmienna 1 ustawiona była na: " + this.zmienna1 +" Dobranoc!!")
    }
}