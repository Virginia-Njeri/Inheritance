fun main() {
var car=Cars("Subaru","legacy","White",12)
    car.carry(78)
    car.Identity()
   println( car.calculateParkingFees(2))
    var bus=Bus("Toyota","hiace","blue",32)
   println (bus.maxtrippleFare(50.0))

}
 open class Cars(var make:String,var model:String,var color:String,var capacity:Int) {


    fun carry(people: Int):Int {
        var x = 10
        if (people == x) {
            println("Carrying $people passengers")
        } else {
            println("over capacity by $people")
        }
return x
    }
    fun Identity(){
        println("I am a $color $make $model ")
    }
     fun calculateParkingFees(hours:Int):Int{
         var product=hours*20
return product
    }
}
class Bus( make:String, model: String, color:String, capacity:Int):Cars (make,model,color,capacity){
       fun maxtrippleFare(fare:Double): Double {
           var maxfare=fare*capacity
return maxfare
}
}



