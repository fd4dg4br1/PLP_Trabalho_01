% ---------------------------------------------------------
% Regras e Fatos Base (Lógica da Pilha)
% ---------------------------------------------------------
is_empty([]).
push(X, PilhaOriginal, [X | PilhaOriginal]).
pop([Topo | Resto], Topo, Resto).

% ---------------------------------------------------------
% Interface Interativa
% ---------------------------------------------------------
iniciar :-
    writeln('================================='),
    writeln('  SIMULADOR DE PILHA - PROLOG'),
    writeln('================================='),
    menu([]). % Inicia a recursão com a pilha (lista) vazia

menu(PilhaAtual) :-
    writeln('\nO que voce deseja fazer?'),
    writeln('1. Empilhar (Push)'),
    writeln('2. Desempilhar (Pop)'),
    writeln('3. Sair'),
    writeln('IMPORTANTE: No Prolog, toda entrada deve terminar com um PONTO (ex: 1. ou 10.)'),
    write('Opcao: '),
    read(Opcao),
    processar_opcao(Opcao, PilhaAtual).

% Se escolher 1, lê o valor, empilha e chama o menu de novo com a NovaPilha
processar_opcao(1, PilhaAtual) :-
    write('Digite o valor a empilhar (termine com "."): '),
    read(Valor),
    push(Valor, PilhaAtual, NovaPilha),
    format('\n[OK] ~w empilhado.~n', [Valor]),
    format('=> Estado atual da Pilha: ~w~n', [NovaPilha]),
    menu(NovaPilha).

% Se escolher 2 e a pilha estiver vazia
processar_opcao(2, []) :-
    writeln('\n[ERRO] A pilha esta vazia! Nao ha o que desempilhar.'),
    menu([]).

% Se escolher 2 e a pilha tiver itens, desempilha e chama o menu de novo com a NovaPilha
processar_opcao(2, PilhaAtual) :-
    pop(PilhaAtual, Desempilhado, NovaPilha),
    format('\n[OK] Valor desempilhado: ~w~n', [Desempilhado]),
    format('=> Estado atual da Pilha: ~w~n', [NovaPilha]),
    menu(NovaPilha).

% Se escolher 3, encerra a recursão e o programa fecha
processar_opcao(3, _) :-
    writeln('\nEncerrando a demonstracao...').

% Se digitar qualquer outra coisa
processar_opcao(_, PilhaAtual) :-
    writeln('\n[ERRO] Opcao invalida! Lembre-se do ponto no final.'),
    menu(PilhaAtual).