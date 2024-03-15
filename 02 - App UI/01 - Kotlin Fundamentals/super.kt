fun main(){
    val gadget = SmartDevice("Gadget", "Electronic")
    println(gadget.category);
    println(gadget.turnOn());

    val samsung = SmartTvDevice("Samsung", "Smart_Tv")
    println(samsung.deviceStatus);
    println(samsung.turnOn());
    println(samsung.turnOff());

    val bulb = SmartLightDevice("Philips", "Power_Saver")
    println(bulb.increaseBrightness());
    
    val home = SmartHome(samsung, bulb)
    home.turnOffAllDevices();
}