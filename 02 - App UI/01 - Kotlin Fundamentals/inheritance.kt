open class SmartDevice(val name: String, val category: String ){
    var deviceStatus = "Online";

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

    val deviceType = "Smart Radio"

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
}


// HAS A RELATIONSHIP(COMPOSITION)
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

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
}

fun main(){
    val gadget = SmartDevice("Gadget", "Electronic")
    println(gadget.category);

    val samsung = SmartTvDevice("Samsung", "Smart_Tv")
    println(samsung.deviceStatus);

    val bulb = SmartLightDevice("Philips", "Power_Saver")
    println(bulb.increaseBrightness());
    
    val home = SmartHome(samsung, bulb)
    home.turnOffAllDevices();
}
