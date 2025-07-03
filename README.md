---
# ⚽ Sistema de Gerenciamento de Campeonato Amador de Futebol 🏆

Este é um sistema em Java para gerenciar um campeonato amador de futebol, permitindo o cadastro e a gestão de times, jogadores e partidas. É perfeito para organizar aquela pelada com os amigos! 🥅

---
## ✨ Funcionalidades

O sistema oferece as seguintes funcionalidades, acessíveis através de um menu interativo no console:

### ⏱️ Menu de Time
* **Adicionar Time**: Crie um novo time no campeonato, informando nome, divisão, cor e data de fundação. Você pode até adicionar 11 jogadores titulares e 7 reservas para sua equipe! 👕
* **Remover Time**: Tire um time do campeonato pelo nome. 👋
* **Atualizar Time**: Mude as informações do seu time, como nome, divisão, cor e data de fundação. 🔄

### 🧍 Menu de Jogadores
* **Editar Jogador**: Altere o nome, idade e número da camisa de um jogador específico de um time. ✍️
* **Listar Jogadores**: Veja a lista de todos os craques cadastrados em cada time. 📋

### 🗓️ Menu de Partidas
* **Adicionar Partida**: Agende um novo jogo, informando o local, a data e hora, e os nomes dos dois times participantes. O sistema verifica se os times existem antes de agendar a partida. ✅
* **Remover Partida**: Cancele uma partida agendada. ❌
* **Listar Partida**: Veja todos os jogos que já foram agendados. 📆

### 🚪 Sair
* Encerre o programa a qualquer momento. 👋

---
## 🚀 Como Compilar e Rodar

1.  **Pré-requisitos**: Garanta que você tem o **Java Development Kit (JDK)** instalado na sua máquina. ☕
2.  **Estrutura de Pastas**: Organize seus arquivos `.java` nas seguintes pastas:
    * `src/application/Program.java`
    * `src/entities/Campeonato.java`
    * `src/entities/Jogador.java`
    * `src/entities/Partida.java`
    * `src/entities/Time.java`
    * `src/entities/enums/Cor.java`
    * `src/entities/enums/Divisao.java`
    * `src/util/GerenciadorDoCampeonato.java`
3.  **Compilar**: Abra o terminal na raiz do projeto (onde está a pasta `src`) e compile os arquivos Java:
    ```bash
    javac -d bin src/application/*.java src/entities/*.java src/entities/enums/*.java src/util/*.java
    ```
    Isso vai criar os arquivos `.class` na pasta `bin`.
4.  **Rodar**: Depois de compilar, execute o programa a partir da pasta `bin`:
    ```bash
    java -cp bin application.Program
    ```

---
## 📝 Exemplo de Uso

Ao iniciar o programa, você será guiado por menus interativos para realizar as operações. É bem intuitivo!

```
Sistema de Gerenciamento de Campeonato Amador de Futebol
Qual o nome do campeonato? Campeonato de Verão
Descrição do campeonato: Campeonato de futebol amador de verão
Menu:
1 - Menu de Time
2 - Menu de Jogadores
3 - Menu de Partidas
4 - Sair
1
Menu de Time:
1 - Adicionar Time
2 - Remover Time
3 - Atualizar Time
4 - Sair
1
Qual o nome do time? Gremio
Qual a divisão do time? SERIE_A
Qual a cor do time? AZUL
Qual a data de fundação do time (dd/MM/yyyy)? 01/01/1903
Cadastro dos 11 titulares
Nome do 1° jogador: Joao
Idade do 1° jogador: 25
Camisa do 1° jogador: 10
... (e assim por diante para os outros jogadores)
Time cadastrado com sucesso! ✅
 ```

---
## 🛠️ Estrutura do Código

* **`application/Program.java`**: É o coração do programa, com o método `main` e toda a lógica dos menus e interação com o usuário. 🖥️
* **`entities/`**:
    * **`Campeonato.java`**: Representa o campeonato em si, gerenciando a lista de times. 🏆
    * **`Jogador.java`**: Representa um jogador de futebol. ⚽
    * **`Partida.java`**: Representa uma partida, com data, local e os times envolvidos. 🏟️
    * **`Time.java`**: Representa um time de futebol, incluindo seus jogadores (titulares e reservas). 🥅
* **`entities/enums/`**:
    * **`Cor.java`**: Uma lista de cores para os times. 🌈
    * **`Divisao.java`**: As divisões do campeonato. ⬆️
* **`util/GerenciadorDoCampeonato.java`**: Uma classe auxiliar que cuida das partidas do campeonato, incluindo a adição, remoção, listagem e algumas validações. 📊

---
