#!/bin/bash

echo "====================================================="
echo "   Iniciando o Ambiente Clojure (Paradigma Funcional)"
echo "====================================================="
echo "[!] Preparando o contêiner Docker..."
echo "[!] Isso garante a execução sem instalar o Clojure localmente."
echo ""

# Executa o código Clojure dentro do contêiner Docker
docker run --rm -v "$(pwd)":/app -w /app clojure clojure -M pilha.clj

echo ""
echo "====================================================="
echo "   Execução finalizada com sucesso!                  "
echo "====================================================="