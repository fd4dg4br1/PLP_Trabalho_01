;; 1. Definição do estado inicial (uma lista vazia)
(def pilha-vazia '())

;; 2. Comportamentos (Funções Puras)
;; No paradigma funcional, as funções recebem dados e retornam novos dados, sem alterar o original.

;; Empilhar (Push): 'conj' adiciona o elemento no início da lista (topo da pilha)
(defn empilhar [pilha valor]
  (conj pilha valor))

;; Ver o Topo (Peek): retorna o primeiro elemento
(defn ver-topo [pilha]
  (peek pilha))

;; Desempilhar (Pop): retorna uma NOVA pilha sem o elemento do topo
(defn desempilhar [pilha]
  (pop pilha))

;; 3. Demonstração Prática
;; Usamos o bloco 'let' para criar um escopo onde cada operação gera uma nova versão da pilha
(defn executar-demonstracao []
  (println "=================================")
  (println "  SIMULADOR DE PILHA - CLOJURE")
  (println "     (PARADIGMA FUNCIONAL)")
  (println "=================================")
  
  (let [p1 (empilhar pilha-vazia 10)
        p2 (empilhar p1 20)
        p3 (empilhar p2 30)
        p4 (desempilhar p3)]
    
    (println "\n[OK] Empilhando 10 -> Nova Pilha p1:" p1)
    (println "[OK] Empilhando 20 -> Nova Pilha p2:" p2)
    (println "[OK] Empilhando 30 -> Nova Pilha p3:" p3)
    
    (println "\n=> O topo da p3 é:" (ver-topo p3))
    
    (println "\n[OK] Desempilhando de p3 -> Nova Pilha p4:" p4)
    
    (println "\n[!] PROVA DE IMUTABILIDADE:")
    (println "A pilha p3 original não foi alterada, ela ainda é:" p3)))

;; Chama a função para rodar o teste
(executar-demonstracao)