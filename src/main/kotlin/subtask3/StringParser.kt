package subtask3

class StringParser {

    /*fun getSubstring(subString: String, i: String,resultArray: ArrayList<String>): String{
        var stringBefo:String = subString.substringBefore(i)
        //println("Befo $stringBefo")
        stringBefo =
            when(i) {
            ")" -> stringBefo.substringAfter("(")
             "]" -> stringBefo.substringAfter("[")
             ">" -> stringBefo.substringAfter("<")
        else -> {
            println("Error")
            ""
        }
        }
        println("Befo $stringBefo")
        var stringAfter = subString.substringAfter(i)
        println("After $stringAfter")
        val afterafter = stringAfter.substringAfter(i)
        println("After-after $afterafter")
        if (stringAfter != stringBefo && afterafter != stringAfter)
        getSubstring(stringAfter, i,resultArray)
        resultArray.add(stringBefo)
        return stringBefo//stringAfter
    }*/
    fun getSubstring(subString: String, i: String,resultArray: ArrayList<String>): String{
        var stringAfter:String = subString.substringAfter(i)
        var stringBefo:String =
            when(i) {
                "(" -> stringAfter.substringBefore(")")
                "[" -> stringAfter.substringBefore("]")
                "<" -> stringAfter.substringBefore(">")
                else -> {
                    println("Error")
                    ""
                }
            }
        println(stringBefo)
        resultArray.add(stringBefo)
        return stringBefo//stringAfter
    }

    fun getResult(inputString: String): Array<String> {
        var ResultStrigArray : ArrayList<String> = arrayListOf()
      var i:Int = 0
       while(i < inputString.length - 1) {
           if(inputString[i]=='(' || inputString[i]=='[' || inputString[i]=='<')
               getSubstring(inputString.substring(i),inputString[i].toString(),ResultStrigArray)


            i+=1
       }
        //println(ResultStrigArray)
        return ResultStrigArray.toTypedArray()
     /*   var ResultStrigArray : ArrayList<String> = arrayListOf()
      for(i in ">])") {

          println(i)
          var st: String = getSubstring(inputString,i.toString(),ResultStrigArray)
          println(ResultStrigArray)
         // ResultStrigArray.add(st)
      }
        return ResultStrigArray.toTypedArray()*/

    }
}
