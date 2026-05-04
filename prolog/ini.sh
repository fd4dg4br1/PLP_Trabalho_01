#!/bin/bash

IMAGE_NAME="prolog-pilha"

echo "==============================================="
echo "⚙️  Passo 1: Construindo a imagem Docker..."
echo "==============================================="
docker build -t $IMAGE_NAME .

if [ $? -ne 0 ]; then
  echo "❌ Erro ao construir a imagem Docker. Abortando."
  exit 1
fi

echo ""
echo "==============================================="
echo "🚀 Passo 2: Iniciando a Pilha Interativa..."
echo "==============================================="

# O -it mapeia o terminal para que você possa digitar.
# -g "iniciar" dispara a função inicial do código Prolog.
docker run -it --rm $IMAGE_NAME swipl -q -s pilha.pl -g "iniciar" -t halt