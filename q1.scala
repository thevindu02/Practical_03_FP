object reverse {

    def main(args:Array[String]): Unit = {


    }

    def reverseString(str:String):String = {
        if(str.isEmpty) ""

        else reverseString(str.tail) + str.head
    }

    println(reverseString("hello"))
    
}