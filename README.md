# Mini projeto - Inversão de dependência

## Objetivo

Modificar a relação entre `Address` e `TransportCompany`.

### Antes

```text
TransportCompany -> Address
```

A transportadora recebia o objeto `Address`:

```java
calcFrete(Address address, Cart cart)
```

### Depois

```text
Address -> TransportCompany
```

Agora `Address` chama `TransportCompany`, enquanto a transportadora recebe apenas o CEP:

```java
calcFrete(String zipcode, Cart cart)
```

## Arquivos

- `Address.java`
- `TransportCompany.java`
- `Cart.java`
- `Frete.java`
- `Main.java`

## Como testar

Dentro da pasta do projeto:

```bash
javac *.java
java Main
```

Saída esperada aproximada:

```text
=== TESTE DA INVERSÃO DE DEPENDÊNCIA ===
Fluxo esperado: Address -> TransportCompany

Address está chamando a TransportCompany...
TransportCompany recebeu somente o CEP: 85660-000

=== RESULTADO ===
Transportadora: Transportadora ABC
CEP: 85660-000
Valor do frete: R$ 20,00
Prazo: 5 dias
```

O ponto principal é que `TransportCompany.java` não utiliza mais a classe `Address`.
A dependência foi invertida para `Address -> TransportCompany`.
