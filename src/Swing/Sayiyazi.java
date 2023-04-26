package Swing;

public class Sayiyazi {
	public static final String[] units = {
        "", "bir", "iki", "��", "d�rt", "be�", "alt�", "yedi",
        "sekiz", "dokuz", "on", "on bir", "on iki", "on ��", "on d�rt",
        "on be�", "on alt�", "on yedi", "on sekiz", "on dokuz"
};

public static final String[] tens = {
        "",        // 0
        "",        // 1
        "yirmi",  // 2
        "otuz",  // 3
        "k�rk",   // 4
        "elli",   // 5
        "altm��",   // 6
        "yetmi�", // 7
        "seksen",  // 8
        "doksan"   // 9
};

public String convert(int n) {

    if (n < 0) {
        return "eksi " + convert(-n);
    }

    if (n < 20) {
        return units[n];
    }

    if (n < 100) {
        return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
    }

    if (n < 1000) {
        return units[n / 100] + " y�z" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
    }

    if (n < 1000000) {
        return convert(n / 1000) + " bin" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
    }

    if (n < 1000000000) {
        return convert(n / 1000000) + " milyon" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
    	}

    	return convert(n / 1000000000) + " milyar"  + ((n % 1000000000 != 0) ? " " : "") + convert(n % 1000000000);
	}


}
