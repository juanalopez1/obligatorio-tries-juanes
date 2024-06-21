package uy.edu.ucu.aed;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasclave = { "are", "area", "base", "cat", "ju", "juanaaaaaaaaa", "jujix", "cater", "children",
                "basement",
                "areas", "jean" };
        for (String p : palabrasclave) {
            trie.insertar(p);
        }
        trie.imprimir();
        System.out.println("Palabra mas larga del prefijo 'jua': " + trie.raiz.LPM("jua"));
    }
}
