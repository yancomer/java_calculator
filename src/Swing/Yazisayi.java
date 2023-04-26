package Swing;

import java.util.HashMap;

public class Yazisayi {
	
	static HashMap<String, Integer> numbers= new HashMap<String, Integer>();
    static HashMap<String, Integer> onumbers= new HashMap<String, Integer>();
    static HashMap<String, Integer> tnumbers= new HashMap<String, Integer>();

    static {
        numbers.put("s�f�r", 0);
        numbers.put("bir", 1);
        numbers.put("iki", 2);
        numbers.put("��", 3);
        numbers.put("d�rt", 4);
        numbers.put("be�", 5);
        numbers.put("alt�", 6);
        numbers.put("yedi", 7);
        numbers.put("sekiz", 8);
        numbers.put("dokuz", 9);
        numbers.put("on", 10);
        numbers.put("on bir", 11);
        numbers.put("on iki", 12);
        numbers.put("on ��", 13);
        numbers.put("on d�rt", 14);
        numbers.put("on be�", 15);
        numbers.put("on alt�", 16);
        numbers.put("on yedi", 17);
        numbers.put("on sekiz", 18);
        numbers.put("on dokuz", 19);

        tnumbers.put("yirmi", 20);
        tnumbers.put("otuz", 30);
        tnumbers.put("k�rk", 40);
        tnumbers.put("elli", 50);
        tnumbers.put("altm��", 60);
        tnumbers.put("yetmi�", 70);
        tnumbers.put("seksen", 80);
        tnumbers.put("doksan", 90);

        onumbers.put("y�z", 100);
        onumbers.put("bin", 1000);
        onumbers.put("milyon", 1000000);
        onumbers.put("milyar", 1000000000);        
    }
    public int wordToNumber(String input) {
        int sum=0;
        Integer temp=null;
        Integer previous=0;
        String [] splitted= input.toLowerCase().split(" ");


        for(String split:splitted){

            if( numbers.get(split)!=null){
                temp= numbers.get(split);

                sum=sum+temp;

                previous=previous+temp;
            }
            else if(onumbers.get(split)!=null){
                if(sum!=0){
                    sum=sum-previous;
                }
                sum=sum+previous*onumbers.get(split);
                temp=null;
                previous=0;


            }
            else if(tnumbers.get(split)!=null){
                temp=tnumbers.get(split);
                sum=sum+temp;

                previous=temp;
            }

        }

        return sum;
    }
}	

