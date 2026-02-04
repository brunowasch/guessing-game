# Jogo de Adivinhação em Java

Este projeto consiste em um **jogo de adivinhação** desenvolvido em **Java**, executado via **console**, onde o jogador deve descobrir um número secreto gerado aleatoriamente pelo sistema dentro de um limite de tentativas.

O jogo conta com **três níveis de dificuldade**, sistema de **pontuação**, **histórico de scores** e um **menu interativo** para navegação.

---

## Demonstração

> Execução via terminal / console:

- Menu principal com opções de jogo, regras e histórico  
- Escolha de dificuldade (Fácil, Médio ou Difícil)  
- Feedback a cada tentativa  
- Registro automático de pontuações  

*(Por se tratar de um projeto em console, não há interface gráfica.)*

---

## Funcionalidades

- Menu interativo no console  
- Três níveis de dificuldade:  
  - **Fácil**: número entre 1 e 50 (10 tentativas)  
  - **Médio**: número entre 1 e 100 (7 tentativas)  
  - **Difícil**: número entre 1 e 200 (5 tentativas)  
- Sistema de pontuação com bônus por tentativas restantes  
- Histórico das últimas 10 pontuações  
- Tratamento de erros para entradas inválidas  
- Regras do jogo acessíveis pelo menu  

---

## Sistema de Pontuação

- Pontuação base por dificuldade:  
  - Fácil: **100 pontos**  
  - Médio: **200 pontos**  
  - Difícil: **300 pontos**  
- Bônus:  
  - +50 pontos para cada tentativa **não utilizada**  
- As pontuações são salvas em um histórico com limite de 10 registros.

---

## Estrutura do Código
- main() → Menu principal
- game() → Seleção de dificuldade
- easyGame(), mediumGame(), hardGame() → Lógica do jogo por nível
- rules() → Exibição das regras
- saveScore() → Armazenamento das pontuações
- scoreHistory() → Exibição do histórico

## Como executar o projeto

### Pré-requisitos
- **Java (JDK 17 ou superior)**  
- IDE Java (IntelliJ, Eclipse, VS Code) ou terminal  

### Executando pelo terminal
```bash
# Compile o arquivo
javac GuessingGame.java

# Execute o jogo
java GuessingGame
```
## Autor
<table> <tr> <td align="center"> <a href="https://github.com/brunowasch"> <img src="https://avatars.githubusercontent.com/brunowasch" width="100px;" alt="Bruno Waschburger Silva"/><br /> <sub><b>Bruno Waschburger Silva</b></sub> </a> <br /> 📧 bwaschburger@gmail.com </td> </tr> </table>
