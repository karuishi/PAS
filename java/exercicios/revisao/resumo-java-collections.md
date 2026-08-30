# Java Collections: Como Utilizar Collections — Resumo

> Resumo do artigo original da DevMedia: [Java Collections: Como utilizar Collections](https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450)

O artigo explica o **Java Collections Framework** (pacote `java.util`, introduzido no Java 1.2), que reúne interfaces, implementações e algoritmos para trabalhar com grupos de dados de forma padronizada, evitando que cada desenvolvedor tenha que criar suas próprias estruturas.

## Interfaces principais

- **Collection** — interface no topo da hierarquia, define operações básicas (adicionar, remover, etc.), mas não tem implementação direta.
- **List** — coleção ordenada que permite elementos duplicados e acesso pelo índice.
- **Set** — coleção que não permite elementos duplicados.
- **Queue** — usada para filas/pilhas, onde a ordem dos elementos define prioridade.
- **Map** — mapeia chaves (únicas) para valores (que podem repetir). Não estende `Collection`.
- **SortedSet** e **SortedMap** — variações que garantem classificação (ordem natural ou definida) dos elementos/chaves.

O artigo também distingue **ordenação** (percorrer numa certa sequência) de **classificação** (ordem baseada no valor dos dados, como ordem alfabética ou numérica).

## Implementações e suas definições

| Implementação | Definição |
|---|---|
| **ArrayList** | Como um array que cresce dinamicamente. Busca rápida, mas inserções/exclusões são lentas (lineares). |
| **LinkedList** | Lista ligada: cada nó guarda o dado e uma referência ao próximo. Busca lenta, mas inserções/exclusões são rápidas. |
| **HashSet** | Baseado em tabela de espalhamento (hash). Acesso rápido, mas sem garantia de ordem. |
| **TreeSet** | Mantém os elementos classificados, mas com acesso mais lento que o HashSet. |
| **LinkedHashSet** | Deriva do HashSet, mas mantém lista duplamente ligada — itera na ordem de inserção. |
| **HashMap** | Baseado em hash, aceita chaves e valores nulos, sem garantia de ordem. |
| **TreeMap** | Implementa `SortedMap` — mantém as chaves em ordem ascendente (ou ordem customizada). |
| **LinkedHashMap** | Mantém lista duplamente ligada — itera na ordem em que as chaves foram inseridas. |

Todas essas implementações aceitam elementos/chaves/valores `null` (exceto onde indicado), não são thread-safe (diferente de `Vector` e `Hashtable`), e são serializáveis.

## Interfaces auxiliares de iteração

- **Iterator** — percorre uma coleção e permite remover elementos.
- **ListIterator** — estende Iterator, permite navegação bidirecional (métodos `hasPrevious()`/`previous()`) e inserção de elementos.

## Ordenação de objetos

- **Comparable** — interface com o método `compareTo()`, usada para definir a "ordenação natural" de uma classe.
- **Comparator** — interface com o método `compare()`, usada quando se precisa de uma ordenação diferente da natural, ou quando a classe não implementa `Comparable`.

## Exemplo prático do artigo

O texto usa um caso de uso incremental (uma lista de alunos) para mostrar na prática quando trocar `List` por `Set` (evitar duplicados) ou por `Map` (buscar por chave/nome), destacando que classes usadas em `HashSet` ou como chave de `Map` precisam sobrescrever corretamente `hashCode()` e `equals()`.

## Conclusão do artigo

Não existe uma implementação "melhor" universal — a escolha depende dos requisitos de cada problema (necessidade de ordem, duplicidade, velocidade de busca vs. inserção, etc.), e o autor recomenda sempre programar voltado às **interfaces**, não às implementações, para manter baixo acoplamento.
