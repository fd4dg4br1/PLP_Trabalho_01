# Usa a imagem oficial do SWI-Prolog baseada em Debian
FROM swipl:latest

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o seu arquivo Prolog para dentro do contêiner
COPY pilha.pl .

# Inicia o interpretador interativo do Prolog já carregando o seu arquivo
CMD ["swipl", "-s", "pilha.pl"]