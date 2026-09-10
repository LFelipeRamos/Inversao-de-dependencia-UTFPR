public class Main {
    public static void main(String[] args) {
        Address address = new Address(
            1,
            "Rua A",
            "Dois Vizinhos",
            "85660-000",
            "100"
        );

        TransportCompany company = new TransportCompany(
            1,
            "Transportadora ABC"
        );

        Cart cart = new Cart(1, 150.0);

        System.out.println("=== TESTE DA INVERSÃO DE DEPENDÊNCIA ===");
        System.out.println("Fluxo esperado: Address -> TransportCompany");
        System.out.println();

        Frete frete = address.calcFrete(company, cart);

        System.out.println();
        System.out.println("=== RESULTADO ===");
        System.out.println("Transportadora: " + frete.getTransportCompany().getName());
        System.out.println("CEP: " + frete.getZipcode());
        System.out.printf("Valor do frete: R$ %.2f%n", frete.getCost());
        System.out.println("Prazo: " + frete.getDays() + " dias");
    }
}
