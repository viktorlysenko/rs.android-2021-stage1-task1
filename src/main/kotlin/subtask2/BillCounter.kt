package subtask2

class BillCounter {


    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var summAnnasBill:Int = 0
        val bonAppetit: String = "bon appetit"
        for(i in bill.indices) if(i != k) summAnnasBill += bill[i]
        val halfSumm = summAnnasBill/2
       return if ( halfSumm == b )
            bonAppetit
        else
            (b - halfSumm).toString()
    }
}
