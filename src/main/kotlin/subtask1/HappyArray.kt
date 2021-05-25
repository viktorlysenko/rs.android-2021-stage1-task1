package subtask1

class HappyArray {

    @Throws(NotImplementedError::class)

    fun convertToHappy(sadArray: IntArray): IntArray =
        when {
            sadArray.size <= 2 -> {
                sadArray
            }
            else -> {
                val moreHappyArray: ArrayList<Int> = arrayListOf()
                moreHappyArray.add(sadArray[0])
                var i:Int = 1

                while (i <= sadArray.size - 2) {
                    if (sadArray[i] <= sadArray[i - 1] + sadArray[i + 1]) {
                        moreHappyArray.add(sadArray[i])
                    }
                    i+=1
                }
                moreHappyArray.add(sadArray[sadArray.size - 1])
                if (moreHappyArray.size == sadArray.size) {
                    sadArray
                } else {
                    convertToHappy(moreHappyArray.toIntArray())
                }
            }
        }

}
