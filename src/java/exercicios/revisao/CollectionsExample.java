package exercicios.revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Exemplo prático baseado no artigo da DevMedia sobre Java Collections.
 * URL: https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450
 * 
 * Demonstra as principais interfaces do Collections Framework: List, Set e Map.
 */
public class CollectionsExample {

    public static void main(String[] args) {
        System.out.println("=== Revisão de Java Collections ===");

        demonstrarList();
        demonstrarSet();
        demonstrarMap();
    }

    /**
     * List: Uma coleção ordenada (também conhecida como sequência).
     * Permite elementos duplicados e oferece controle preciso sobre onde cada elemento é inserido.
     */
    private static void demonstrarList() {
        System.out.println("\n--- 1. Trabalhando com List (ArrayList) ---");
        List<String> linguagens = new ArrayList<>();
        
        // Adicionando elementos
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");
        linguagens.add("Java"); // List permite elementos duplicados
        
        System.out.println("Lista de linguagens: " + linguagens);
        
        // Acessando elemento pelo índice
        System.out.println("Elemento no índice 1: " + linguagens.get(1));
        
        // Removendo elemento
        linguagens.remove("C++");
        System.out.println("Lista após remover C++: " + linguagens);
    }

    /**
     * Set: Uma coleção que não contém elementos duplicados.
     * Modela a abstração matemática de um conjunto. A ordem de iteração pode não ser garantida (como no HashSet).
     */
    private static void demonstrarSet() {
        System.out.println("\n--- 2. Trabalhando com Set (HashSet) ---");
        Set<String> frameworks = new HashSet<>();
        
        // Adicionando elementos
        frameworks.add("Spring");
        frameworks.add("Hibernate");
        frameworks.add("JSF");
        
        // Tentativa de adicionar um elemento duplicado
        boolean adicionou = frameworks.add("Spring");
        System.out.println("Tentou adicionar 'Spring' novamente. Sucesso? " + adicionou);
        
        System.out.println("Conjunto de frameworks: " + frameworks);
    }

    /**
     * Map: Um objeto que mapeia chaves para valores.
     * Um mapa não pode conter chaves duplicadas; cada chave pode mapear para no máximo um valor.
     */
    private static void demonstrarMap() {
        System.out.println("\n--- 3. Trabalhando com Map (HashMap) ---");
        Map<Integer, String> alunos = new HashMap<>();
        
        // Adicionando pares chave-valor (Matrícula -> Nome)
        alunos.put(101, "Carlos");
        alunos.put(102, "Ana");
        alunos.put(103, "Beatriz");
        
        // Se a chave já existir, o valor é sobrescrito
        alunos.put(101, "Carlos Silva"); 
        
        System.out.println("Mapa de alunos: " + alunos);
        
        // Acessando valor através da chave
        System.out.println("Aluno com matrícula 102: " + alunos.get(102));
        
        // Iterando sobre as chaves e valores do Map
        System.out.println("Iterando sobre o Map:");
        for (Map.Entry<Integer, String> entry : alunos.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() + " | Nome: " + entry.getValue());
        }
    }
}
