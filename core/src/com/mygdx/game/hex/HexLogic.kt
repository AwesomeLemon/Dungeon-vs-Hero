package com.mygdx.game.hex

public class HexForLogic(val x : Int, val y : Int, val R: Int) {
    public val r = R * Math.sqrt(3.0) / 2
    public val xl = x - R
    public val yl = y - r//R * Math.sqrt(3.0) / 2
}

public class HexField() {
    public val height = 11
    public val width = 9
    public  val hexR = 20
    private val xspace = 15
    private val yspace = 50
    //subtrahends in 3 lines below were calculated in an empiric way.
    private val xdiff = hexR * 2 - 6//+ 10
    private val ydiff = hexR * 2 - 2//+ 10
    private val evenOddDiff = hexR - 2
    //center of the most left and down hex
    private val xlce = xspace//hexR + xspace
    private val ylce = hexR + yspace
    val field = Array<List<HexForLogic>>(width,
            {i -> Array<HexForLogic>(height,
                    {j -> HexForLogic(xlce + i * xdiff, evenOddDiff * (i % 2) + ylce + j * ydiff, hexR) }
            ).toList()}
    ).toList()

    public fun draw() {

    }
}