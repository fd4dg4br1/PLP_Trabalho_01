

```markdown
# PLP_Trabalho_01
**Docs:** [Acessar Documentação no Google Docs](https://docs.google.com/document/d/1amWXK72Z2iawIDgy8Hfxl6tF0aUG0-7-cL1-AS73tRY/edit?usp=sharing)

---

### Trabalho Prático: A IA Programa Melhor em Qual Paradigma? 🤖

Este repositório contém a demonstração prática do trabalho de avaliação de paradigmas de programação. O objetivo é analisar como a Inteligência Artificial modela e resolve o mesmo problema computacional — **uma estrutura de dados do tipo Pilha (Stack)** — utilizando diferentes abordagens e paradigmas.

## 👥 Integrantes do Grupo
* **Gabriel Alves Rodrigues** (Implementações Java e C)
* **Integrante 2** (Implementação Prolog)
* **Integrante 3** (Documentação e Reflexão Analítica)

## 💻 Como testar as implementações

Abaixo estão os comandos necessários para rodar a demonstração interativa de cada linguagem. Copie e cole os comandos no terminal dentro da pasta raiz do projeto.

---

### 1. Java (Paradigma Orientado a Objetos)
**Pré-requisito:** Ter o JDK (Java Development Kit) instalado.

Para compilar o código fonte:
```bash
javac Pilha.java
```

Para executar o programa interativo:
```bash
java Pilha
```

---

### 2. C (Paradigma Imperativo)
**Pré-requisito:** Ter o compilador GCC instalado.

Para compilar o código C gerando o executável `pilha_c`:
```bash
gcc pilha.c -o pilha_c
```

Para executar o programa:
```bash
./pilha_c
```

---

### 3. Python (Paradigma Imperativo)
**Pré-requisito:** Ter o Python 3 instalado.

Como o Python é uma linguagem interpretada, não é necessário compilar. Para executar o programa interativo diretamente:
```bash
python3 pilha.py
```
*(Nota: dependendo da sua instalação no Windows, o comando pode ser apenas `python pilha.py`)*

---

### 4. Prolog (Paradigma Lógico)
**Pré-requisito:** Ter o Docker instalado e rodando na máquina. 

Para não poluir o ambiente local com instalações do SWI-Prolog, esta implementação roda inteiramente dentro de um contêiner Docker através de um Shell Script automatizado.

Primeiro, dê permissão de execução para o script (necessário apenas na primeira vez):
```bash
chmod +x testar_pilha.sh
```

Execute o simulador interativo:
```bash
./testar_pilha.sh
```
> **⚠️ IMPORTANTE PARA AVALIAÇÃO:** No paradigma lógico do Prolog, toda entrada de dados no terminal **deve terminar com um ponto final**. Exemplo: Se quiser escolher a opção 1 do menu, digite `1.` e aperte Enter.

---

## 📂 Estrutura de Arquivos Esperada
Para que os comandos acima funcionem perfeitamente, certifique-se de que os arquivos no repositório estejam com os seguintes nomes:
* `Pilha.java` (Código Java)
* `pilha.c` (Código C)
* `pilha.py` (Código Python)
* `pilha.pl` (Código lógico Prolog)
* `Dockerfile` (Configuração do contêiner Prolog)
* `testar_pilha.sh` (Script de automação do Docker)
```
