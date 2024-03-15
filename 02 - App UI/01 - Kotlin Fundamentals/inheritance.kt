open class SmartDevice(val name: String, val category: String ){
    var deviceStatus = "Online";
    open var deviceType = "Electronic"

    constructor(name: String, category: String, statusCode: Int) : this(name, category)
    {
        deviceStatus = when(statusCode){
            0 -> "Offline"
            1 -> "Online"
            else -> "Unknown"
        }

    }

    open fun turnOn(){
        println("Device is powered on");
    }

    open fun turnOff(){
        println("Device is powered off");
    }

    fun printSmartTvInfo(){
        println( "Device name: $name, category: $category, type: $deviceType")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) : 
    SmartDevice(name = deviceName, category = deviceCategory){

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun decreaseTvVolume() {
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")
    }

    fun changeTvChannelToPrevious() {
        channelNumber--;
        println("Channel number decreased to $channelNumber.")
    }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
}

class SmartRadioDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override var deviceType = "Smart Radio"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
    
    fun printSmartLightInfo(){

    }

    fun decreaseLightBrightness() {
        brightnessLevel--
        println("Brightness decreased to $brightnessLevel.")
    }
}


// HAS A RELATIONSHIP(COMPOSITION)
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    fun works(deviceStatus: String){
        if (deviceStatus == "on"){
            fun turnOnTv() {
                smartTvDevice.turnOn()
            }

            fun turnOffTv() {
                smartTvDevice.turnOff()
            }

            fun increaseTvVolume() {
                smartTvDevice.increaseSpeakerVolume()
            }

            fun changeTvChannelToNext() {
                smartTvDevice.nextChannel()
            }

            fun turnOnLight() {
                smartLightDevice.turnOn()
            }

            fun turnOffLight() {
                smartLightDevice.turnOff()
            }

            fun increaseLightBrightness() {
                smartLightDevice.increaseBrightness()
            }            
            fun turnOffAllDevices() {
                turnOffTv()
                turnOffLight()
            }
        } else {
                println("Turn On device")
            }
        }
}

fun main(){
    val gadget = SmartDevice("Gadget", "Electronic")
    println(gadget.category);
    gadget.printSmartTvInfo()

    val samsung = SmartTvDevice("Samsung", "Smart_Tv")
    println(samsung.deviceStatus);
    println(samsung.decreaseTvVolume());
    samsung.changeTvChannelToPrevious()

    val bulb = SmartLightDevice("Philips", "Power_Saver")
    println(bulb.increaseBrightness());
    bulb.printSmartLightInfo()
    bulb.decreaseLightBrightness()
    
    val home = SmartHome(samsung, bulb)
   home.works(samsung.deviceStatus);

}
