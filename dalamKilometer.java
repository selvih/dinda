nama:selvi hidayah johan
nim:13020210019


public class dalamKilometer {

private double meter;

private double jam;

private double menit;

private double detik;

 

public dalamKilometer(double meter, double jam, double menit, double detik){

this.meter = meter;

this.jam = jam;

this.menit = menit;

this.detik = detik;

}

public void setMeter(double meter){

this.meter = meter;

}

public void setjam(double jam){

this.jam = jam;

}

public void setMenit(double menit){

this.menit = menit;

}

public void setdetik (double detik){

this.detik = detik;

}

public double getKecepatan(){

double waktu,hasil,km;

waktu = jam+(menit/60)+(detik/3600);

km = meter/1000;

hasil = km/waktu;

return hasil;

}

}