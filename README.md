# Desafio - Componentes e Injeção de Dependência com Spring Boot

## Desafio
Este projeto consiste em um sistema desenvolvido em Java com Spring Boot que realiza o cálculo do valor total de um pedido, considerando:

Porcentagem de desconto.

Valor do frete conforme a faixa de preço.

O projeto foi elaborado como exercício para aplicar conceitos de:

✅ Injeção de dependência com @Autowired.

✅ Componentes e serviços com @Service.

---

## Requisitos e regras do sistema

O cálculo do valor total do pedido é feito aplicando o desconto sobre o valor básico e somando o valor do frete.

### Regras para o cáculo do frete:
| Valor básico do pedido                   | Valor do frete    |
| ---------------------------------------- | ----------------- |
| Abaixo de R\$ 100,00                     | R\$ 20,00         |
| De R\$ 100,00 até R\$ 200,00 (exclusive) | R\$ 12,00         |
| A partir de R\$ 200,00                   | Grátis (R\$ 0,00) |

---

### Tecnologias utilizadas
- Java 21
- Spring Boot 3.5.0
- Maven
---

### Estrutura das Classes:
- `Order` → Entidade que representa um pedido, com:
    - `code` (Integer): código do pedido.
    - `basic` (double): valor básico do pedido.
    - `discount` (Double): percentual de desconto.

- `ShippingService` → Serviço responsável pelo cálculo do frete.

- `OrderService` → Serviço responsável pelo cálculo do valor total do pedido.

- `DesafioApplication` → Classe principal que executa exemplos de pedidos e imprime os resultados no console.

---

### Saida esperada:
```
Pedido código 1034
Valor total: R$ 132.00
```

---
## Como executar o projeto
Para executar o projeto, siga os passos abaixo:
```
git clone: https://github.com/allanaavila/desafio-devsuperior.git
```

### Autor
Allana Ávila