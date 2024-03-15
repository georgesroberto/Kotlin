class SmartDeviceClass {
    val category = "Electronic";
    val brand = "Hisense";
    val model = "SmartTv";

    var volume = 2;
        // get() = field;
        // set(value){
        //     if(field in 0..100){
        //         field = value;
        //     }
        // }
    fun turnOn(){
        println("Device is powered on");
    }

    fun turnOff(){
        println("Device is powered off");
    }

}

fun main(){

    var device = SmartDeviceClass();
    println(device.category)
    device.turnOn()

    var tv = SmartDeviceTV("Hisense", "32-inch", 1);
    println(tv.deviceStatus)
}


class SmartDeviceTV(val name: String, val category: String){
    var deviceStatus = "Online";

    constructor(name:String, category:String, statusCode: Int): this(name,category){
        deviceStatus = when(statusCode){
        0 -> "Offline"
        1 -> "Online"
        else -> "Unkown"
        }
    }

    // ...
}