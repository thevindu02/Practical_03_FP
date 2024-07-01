object Even {

    def main(args:Array[String]):Unit = {

        val inputList = List( 10, 13, 2, 9, 5, 24);

        val  returnList = evenSum(inputList)

        println(s"The sum of even numbers in the list = $returnList")
    }

    def evenSum(nums:List[Int]):Int = {

        var sum = 0

        for( i <- nums)
        {
            if(i%2==0)
            {
                sum += i
            }
        }

        return sum
    }

}