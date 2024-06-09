public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


    public void aumentarVolume(){
        if (ligada == true) {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);   
        } else{
            System.out.println("TV esta desligada.");
        }
    }

    public void diminuirVolume(){
        if (ligada == true) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        } else {
            System.out.println("TV esta desligada.");
        }
        
    }

    public void aumentarCanal(){
        if (ligada == true) {
            canal++;
            System.out.println("Aumentando o canal para: " + canal);
        } else {
            System.out.println("TV esta desligada.");
        }
        
    }

    public void diminuirCanal(){
        if (ligada == true) {
            canal--;
            System.out.println("Diminuindo o canal para: " + canal);   
        } else {
            System.out.println("TV esta desligada.");
        }
    }

    public void trocarCanal(int novoCanal){
        if (ligada == true) {
            canal = novoCanal;
            System.out.println("Trocando o canal para: " + novoCanal); 
        } else {
            System.out.println("TV esta desligada.");
        }
    }
}