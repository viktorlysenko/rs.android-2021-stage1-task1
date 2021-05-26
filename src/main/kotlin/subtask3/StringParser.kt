package subtask3

class StringParser {

    fun findCloseBracketIndex(subString: String, openDelimiter: String, closeDelimiter: String): Int{
        var bracketLevel: Int = 1
        var lastPositionSt: Int = -1
        for( index in 0 .. subString.length - 1) {
            when (subString[index].toString()){
                openDelimiter->bracketLevel+=1
                closeDelimiter-> {
                    bracketLevel -= 1
                    lastPositionSt = index
                }
            }

            if (bracketLevel == 0) return lastPositionSt
        }
        return lastPositionSt
    }

    fun getSubstring(subString: String, i: String,resultArray: ArrayList<String>): String{
        var stringAfter:String = subString.substringAfter(i)
        var stringBefo:String =
            when(i) {
                "(" -> {
                    var closeBIndex: Int = findCloseBracketIndex(stringAfter,i,")")
                    stringAfter.substring(0, closeBIndex)
                }
                "[" -> {
                    var closeBIndex: Int = findCloseBracketIndex(stringAfter,i,"]")
                    stringAfter.substring(0, closeBIndex)
                }
                "<" -> {
                    var closeBIndex: Int = findCloseBracketIndex(stringAfter,i,">")
                    stringAfter.substring(0, closeBIndex)
                }
                else -> {
                    println("Error")
                    ""
                }
            }
       // println(stringBefo)
        resultArray.add(stringBefo)
        return stringBefo
    }

    fun getResult(inputString: String): Array<String> {
      var ResultStrigArray : ArrayList<String> = arrayListOf()
      var i:Int = 0
       while(i < inputString.length - 1) {
           if(inputString[i]=='(' || inputString[i]=='[' || inputString[i]=='<')
               getSubstring(inputString.substring(i),inputString[i].toString(),ResultStrigArray)

            i+=1
       }
        return ResultStrigArray.toTypedArray()
    }
}
