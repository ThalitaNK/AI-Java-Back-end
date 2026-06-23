public class VerificadorDeHardware {
    
    public static void main(String[] args) {
    String modeloProcessador = "Ryzen 5 5500";
    
    // Nossa lista com 5 temperaturas diferentes
    int[] listaTemperaturas = { 45, 88, 92, 30, 95 };

    // O loop que vai percorrer do índice 0 até o final da lista
    for (int i = 0; i < listaTemperaturas.length; i++) {
        // O desafio está aqui!
        exibirAlerta(modeloProcessador, listaTemperaturas[i]);
    }
}

    // 3. A porta de entrada do método recebendo a caixa
    public static void exibirAlerta(String modelo, int temperatura) {
        
        // 4. O método resolvendo o problema sozinho com o que recebeu
        if (temperatura >= 90) { 
            System.out.println("CUIDADO! O " + modelo + " está com a temperatura " + temperatura + " ! Vai fritar!");
        } else {
            System.out.println("Temperatura estável. Pode continuar jogando Sea of Stars em paz.");
        }
    }
}



