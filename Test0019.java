nama:selvi hidayah johan
nim:13020210019



public class Test4DigitTerakhirStambuk {
public static void main(String[] args) {
	(a)buat instansi objek bernama balok1 dari Class Balok() →default const.
	(b)buat instansi objek bernama balok2 dari Class Balok(20,35, 15)→param const.
	(c)setter → set nilai l = 5 dari konstruktor Balok()
	(d)setter → set nilai p = 25 dari konstruktor Balok()
	(e)setter → set nilai t = 10 dari konstruktor Balok(20,35, 15)
	(f)panggil method info dari konstruktor Balok ()
	(g)panggil method info dari konstruktor Balok(20,35, 15)
	
	}
}

class Balok extends PersegiPanjang{
int t;
public Balok() {
(h) berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass 
persegi panjang serta tinggi=15
}
public Balok(int p, int l, int t) {
(i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass 
persegi panjang t t;
}
(j) buat getter setter class balok
public int volume(){
(k) fungsi untuk menghitung volume balok : p x l x t
}
public void info(){
 (l)fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok
 
}
}

class PersegiPanjang{
int p, l;
public PersegiPanjang() {
(m) berisi nilai panjang=30 & lebar=20
}
public PersegiPanjang(int p, int l) {
(n) berisi nilai pada saat runtime p p, l=l 
 }
(o) buat getter setter class Persegi Panjang
public int luas(){
(q) fungsi untuk menghitung luas persegi panjang : p x l
 }
public int keliling(){
(r) fungsi untuk menghitung keliling persegi panjang : 2x (p+l)
}
}