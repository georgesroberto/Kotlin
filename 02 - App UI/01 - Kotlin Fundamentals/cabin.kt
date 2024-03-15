
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartCabin(val name: String, val category: String) {

    var CabinStatus = "online"
        protected set

    open val CabinType = "unknown"

    open fun turnOn() {
        CabinStatus = "on"
    }

    open fun turnOff() {
        CabinStatus = "off"
    }
}

class SmartTvCabin(CabinName: String, CabinCategory: String) :
    SmartCabin(name = CabinName, category = CabinCategory) {

    override val CabinType = "Smart TV"

    private var speakerVolume by NewRangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by NewRangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightCabin(CabinName: String, CabinCategory: String) :
    SmartCabin(name = CabinName, category = CabinCategory) {

    override val CabinType = "Smart Light"

    private var brightnessLevel by NewRangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

class SmartCabinHome(
    val smartTvCabin: SmartTvCabin,
    val smartLightCabin: SmartLightCabin
) {

    var CabinTurnOnCount = 0
        private set

    fun turnOnTv() {
        CabinTurnOnCount++
        smartTvCabin.turnOn()
    }

    fun turnOffTv() {
        CabinTurnOnCount--
        smartTvCabin.turnOff()
    }

    fun increaseTvVolume() {
        smartTvCabin.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvCabin.nextChannel()
    }

    fun turnOnLight() {
        CabinTurnOnCount++
        smartLightCabin.turnOn()
    }

    fun turnOffLight() {
        CabinTurnOnCount--
        smartLightCabin.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightCabin.increaseBrightness()
    }

    fun turnOffAllCabins() {
        turnOffTv()
        turnOffLight()
    }
}

class NewRangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    var smartCabin: SmartCabin = SmartTvCabin("Android TV", "Entertainment")
    smartCabin.turnOn()

    smartCabin = SmartLightCabin("Google Light", "Utility")
    smartCabin.turnOn()
}