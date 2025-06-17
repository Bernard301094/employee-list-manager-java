# Sistema de Gerenciamento de Funcionários

## Descrição

Este é um exercício de programação Java proposto pelo professor Nelio Alves que implementa um sistema simples de gerenciamento de funcionários. O programa permite registrar funcionários, armazenar suas informações e aplicar aumentos salariais.

## Funcionalidades

- ✅ Registro de múltiplos funcionários
- ✅ Armazenamento de dados (ID, Nome, Salário)
- ✅ Aplicação de aumento salarial por percentual
- ✅ Exibição da lista completa de funcionários
- ✅ Validação de entrada para percentuais

## Estrutura do Projeto

```
src/
├── Employee.java    # Classe modelo do funcionário
└── Main.java        # Classe principal com interface do usuário
```

## Classes

### Employee.java
Classe modelo que representa um funcionário com:
- **Atributos**: `name` (String), `id` (int), `salary` (double)
- **Métodos**: Getters, Setters, `toString()`, `increaseSalary()`

### Main.java
Classe principal que contém:
- Interface de linha de comando
- Lógica de entrada de dados
- Gerenciamento da lista de funcionários
- Aplicação de aumentos salariais

## Como Executar

1. **Pré-requisitos**: Java 8 ou superior instalado

2. **Compilação**:
   ```bash
   javac *.java
   ```

3. **Execução**:
   ```bash
   java Main
   ```

## Exemplo de Uso

```
How many employees will be registered?
3

Employee #1:
Id: 178
Name: Alex Green
Salary: 3000.00

Employee #2:
Id: 49
Name: Anna Red
Salary: 4000.00

Employee #3:
Id: 106
Name: Bob Blue
Salary: 5000.00

Enter the employee id that will have a salary increase:
49
Enter the percentage:
10

List of employees:
178, Alex Green, 3000.0
49, Anna Red, 4400.0
106, Bob Blue, 5000.0
```

## Conceitos Aplicados

- **Programação Orientada a Objetos**: Classes, objetos, encapsulamento
- **Collections**: Uso de `ArrayList` para armazenar objetos
- **Entrada de Dados**: Uso da classe `Scanner` para interação com usuário
- **Estruturas de Controle**: Loops `for` e `enhanced for`
- **Validação**: Verificação de percentual positivo
- **Métodos**: Sobrescrita do método `toString()`

## Recursos Técnicos

- **Linguagem**: Java
- **Estruturas de Dados**: ArrayList
- **Padrões**: Encapsulamento com getters/setters
- **Interface**: Console/Terminal

## Melhorias Possíveis

- [ ] Validação de ID duplicado
- [ ] Tratamento de exceções para entradas inválidas
- [ ] Persistência de dados em arquivo
- [ ] Interface gráfica (GUI)
- [ ] Opções de edição e remoção de funcionários
- [ ] Relatórios e estatísticas salariais

## Sobre o Exercício

Este exercício faz parte do curso de Java ministrado pelo professor **Nelio Alves** e está disponível em: https://github.com/acenelio/list1-java

O objetivo é praticar conceitos fundamentais de:
- Listas em Java
- Programação orientada a objetos
- Manipulação de dados
- Interação com usuário via console

## Autor

**Professor**: Nelio Alves  
**Repositório Original**: [acenelio/list1-java](https://github.com/acenelio/list1-java)

---

*Exercício desenvolvido para fins educacionais - Curso de Java Completo*