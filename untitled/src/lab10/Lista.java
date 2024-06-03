package lab10;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static <T> void showZduplikowane(List<T> lista) {
        List<T> zduplikowane = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            T element = lista.get(i);
            if (lista.subList(0, i).contains(element) || lista.subList(i + 1, lista.size()).contains(element)) {
                if (!zduplikowane.contains(element)) {
                    zduplikowane.add(element);
                }
            }
        }

        if (!zduplikowane.isEmpty()) {
            System.out.println("Zduplikowane elementy w liście: " + zduplikowane);
        } else {
            System.out.println("Brak zduplikowanych elementów w liście.");
        }
    }
    public static <T> void deleteZduplikowane(List<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            T element = lista.get(i);
            while (lista.subList(0, i).contains(element) || lista.subList(i + 1, lista.size()).contains(element)) {
                lista.remove(element);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(5);
        lista.add(5);
        lista.add(5);

        System.out.println("Lista przed usunięciem zduplikowanych elementów: " + lista);
        showZduplikowane(lista);
        deleteZduplikowane(lista);
        System.out.println("Lista po usunięciu zduplikowanych elementów: " + lista);
    }
}