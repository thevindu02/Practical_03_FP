object arithmetic {

    def main(args:Array[String]): Unit = {

        printf("The arithmetic mean = %.2f\n",arithmeticMean(5,10));
    }

    def arithmeticMean(num1:Int,num2:Int):Float = {

        (num1.toFloat + num2.toFloat)/2;
    }
}