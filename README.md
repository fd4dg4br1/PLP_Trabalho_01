***

```markdown
# PLP_Trabalho_01
**Docs:** [Acessar Documentação no Google Docs](https://docs.google.com/document/d/1amWXK72Z2iawIDgy8Hfxl6tF0aUG0-7-cL1-AS73tRY/edit?usp=sharing)

---

### Trabalho Prático: A IA Programa Melhor em Qual Paradigma? 🤖 vs 🧑‍💻

Este repositório contém a demonstração prática do trabalho de avaliação de paradigmas de programação. O objetivo é analisar como a Inteligência Artificial modela e resolve o mesmo problema computacional — **uma estrutura de dados do tipo Pilha (Stack)** — utilizando diferentes abordagens e paradigmas, e comparar essas soluções diretamente com implementações desenvolvidas por humanos.

## 👥 Integrantes do Grupo
* **Gabriel Alves Rodrigues** (Implementações Java e C)
* **Davi de Souza Lopes** (Implementação Prolog e Python)
* **Mariana Monteiro Bispo** (Documentação e Reflexão Analítica)

## 📂 Estrutura do Projeto e Comparação de Versões

O projeto está dividido em diretórios por linguagem/paradigma[cite: 3]. Durante a apresentação, vocês poderão comparar:
1. **O Gerenciador em Java:** Que unifica as versões de Pilha (Vetor, Nó e IA) em um único App interativo.
2. **A Versão C (Humana):** Uma implementação clássica do paradigma imperativo usando listas encadeadas, ponteiros (`struct Node *prox`) e alocação dinâmica (`malloc`/`free`).
3. **A Versão Python:** Abordagem imperativa mais moderna e enxuta gerada pela IA.
4. **A Versão Prolog:** A mudança radical de pensamento para o paradigma lógico usando fatos e regras.

---

## 💻 Como testar as implementações

Abaixo estão os comandos necessários para compilar e rodar a demonstração de cada linguagem. 

### 1. Java (Paradigma Orientado a Objetos - Comparador Unificado)
**Pré-requisito:** Ter o JDK (Java Development Kit) instalado.

Navegue até a pasta dos códigos fonte[cite: 3]:
```bash
cd Java/pilha/src/
```

Compile o código do aplicativo principal (isso compilará as dependências automaticamente):
```bash
javac App.java
```

Execute o programa interativo:
```bash
java App
```

---

### 2. C (Paradigma Imperativo - Versão Humana)
**Pré-requisito:** Ter o compilador GCC instalado.

Navegue até a pasta do C[cite: 3]:
```bash
cd C/
```

Compile o código gerando o executável:
```bash
gcc pilha.c -o pilha
```

Execute o programa:
```bash
./pilha
```

---

### 3. Python (Paradigma Imperativo - Versão IA)
**Pré-requisito:** Ter o Python 3 instalado.

Navegue até a pasta do Python[cite: 3]:
```bash
cd Python/
```

Execute o programa interativo diretamente:
```bash
python3 pilha.py
```
*(Nota: dependendo da sua instalação no Windows, o comando pode ser apenas `python pilha.py`)*

---

### 4. Prolog (Paradigma Lógico - Versão IA)
**Pré-requisito:** Ter o Docker instalado e rodando na máquina. 

Para não poluir o ambiente local com instalações do SWI-Prolog, esta implementação roda inteiramente dentro de um contêiner Docker através de um Shell Script automatizado[cite: 3].

Navegue até a pasta do Prolog[cite: 3]:
```bash
cd prolog/
```

Dê permissão de execução para o script (necessário apenas na primeira vez):
```bash
chmod +x ini.sh
```

Execute o simulador interativo:
```bash
./ini.sh
```
> **⚠️ IMPORTANTE PARA AVALIAÇÃO:** No paradigma lógico do Prolog, toda entrada de dados no terminal **deve terminar com um ponto final**. Exemplo: Se quiser escolher a opção 1 do menu, digite `1.` e aperte Enter.
```
