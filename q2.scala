object Filterstrings {

    def main(args:Array[String]): Unit = {

        val inputList = List("Thevindu","Scala","Javascript","programming","tired","hell");

        val resultList = filterLongStrings(inputList);

        println("The result list = " + resultList);

    }

    def filterLongStrings(strings:List[String]):List[String] = {

        strings.filter(_.length > 5);

    }
}