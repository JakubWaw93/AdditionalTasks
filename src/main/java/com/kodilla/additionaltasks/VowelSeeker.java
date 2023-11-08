package com.kodilla.additionaltasks;

public class VowelSeeker {

    public String vowelSeekerApp(String text){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='A'|| text.charAt(i)=='a'||text.charAt(i)=='Ą'||text.charAt(i)=='ą'||text.charAt(i)=='E'
               ||text.charAt(i)=='e'||text.charAt(i)=='Ę'||text.charAt(i)=='ę'||text.charAt(i)=='I'||text.charAt(i)=='i'
               ||text.charAt(i)=='O'||text.charAt(i)=='o'||text.charAt(i)=='Ó'||text.charAt(i)=='ó'||text.charAt(i)=='Y'||text.charAt(i)=='y'){
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }

    //test
    public static void main(String[] args) {

        String text = "Skromny test napisanej aplikacji.";
        VowelSeeker seeker = new VowelSeeker();
        String text2 = seeker.vowelSeekerApp(text);
        System.out.println(text2);
    }
}
