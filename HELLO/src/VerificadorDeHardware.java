public class VerificadorDeHardware {
    
    public static void main(String[] args) {
        
        // 1. As variáveis originais no "main"
        String modeloProcessador = "Ryzen 5 5500";
        int temperaturaAtual = 95;

        // 2. O envio da caixa (Passando o bastão)
        exibirAlerta(modeloProcessador, temperaturaAtual);
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



