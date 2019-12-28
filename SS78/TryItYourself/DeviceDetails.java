/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryItYourself;

/**
 *
 * @author 84122
 */
public class DeviceDetails {

    int deviceNo;
    String deviceName, deviceType;
    double devicePrice;

    public DeviceDetails() {
        deviceNo = 0;
        deviceName = "";
        deviceType = "";
        devicePrice = 0.0;
    }

    public DeviceDetails(int deviceNo, String deviceType) {
        deviceNo = deviceNo;
        deviceType = deviceType;
    }

    public void displayDetails() {
        System.out.println("Device number : " + deviceNo);
        System.out.println("Device name : " + deviceName);
        System.out.println("Device type : " + deviceType);
        System.out.println("Device price : " + devicePrice);
    }
    public static void main(String[] args) {
        DeviceDetails objDetails = new DeviceDetails();
        objDetails.displayDetails();
    }
}
