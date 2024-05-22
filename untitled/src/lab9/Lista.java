package lab9;

public class Lista<E> {
    private E[] lista;

    public Lista(int rozmiar) {
        lista = (E[]) new Object[rozmiar];
    }

    public boolean dodaj(E element) {
        int wolnyIndeks = pierwszyWolnyIndeks();
        if (wolnyIndeks == -1) {
            return false;
        }
        lista[wolnyIndeks] = element;
        return true;
    }

    public boolean czyZawiera(E element) {
        return zwrocIndeks(element) != -1;
    }

    public int zwrocIndeks(E element) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int zwrocOstatniIndeks(E element) {
        for (int i = lista.length - 1; i >= 0; i--) {
            if (lista[i] != null && lista[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public E zwrocElement(int indeks) {
        if (indeks < 0 || indeks >= lista.length) {
            return null;
        }
        return lista[indeks];
    }

    public boolean podmienElement(int indeks, E element) {
        if (indeks < 0 || indeks >= lista.length) {
            return false;
        }
        lista[indeks] = element;
        return true;
    }

    private int pierwszyWolnyIndeks() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (E e : lista) {
            if (e != null) {
                buffer.append(e + ",");
            }
        }
        if (buffer.length() > 1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static void main(String[] args) {
        Lista<String> listaString = new Lista<>(5);
        System.out.println("Dodawanie elementów: ");
        System.out.println(listaString.dodaj("A")); // true
        System.out.println(listaString.dodaj("B")); // true
        System.out.println(listaString.dodaj("C")); // true
        System.out.println(listaString.dodaj("D")); // true
        System.out.println(listaString.dodaj("E")); // true
        System.out.println(listaString.dodaj("F")); // false, lista pełna

        System.out.println("Lista: " + listaString);

        System.out.println("Czy zawiera 'B': " + listaString.czyZawiera("B")); // true
        System.out.println("Czy zawiera 'F': " + listaString.czyZawiera("F")); // false

        System.out.println("Indeks 'C': " + listaString.zwrocIndeks("C")); // 2
        System.out.println("Ostatni indeks 'C': " + listaString.zwrocOstatniIndeks("C")); // 2

        System.out.println("Element na indeksie 3: " + listaString.zwrocElement(3)); // D
        System.out.println("Podmiana elementu na indeksie 2 na 'Z': " + listaString.podmienElement(2, "Z")); // true
        System.out.println("Lista: " + listaString);

        Lista<Integer> listaInteger = new Lista<>(3);
        System.out.println("Dodawanie elementów: ");
        System.out.println(listaInteger.dodaj(1)); // true
        System.out.println(listaInteger.dodaj(2)); // true
        System.out.println(listaInteger.dodaj(3)); // true
        System.out.println(listaInteger.dodaj(4)); // false, lista pełna

        System.out.println("Lista: " + listaInteger);

        System.out.println("Czy zawiera 2: " + listaInteger.czyZawiera(2)); // true
        System.out.println("Czy zawiera 4: " + listaInteger.czyZawiera(4)); // false

        System.out.println("Indeks 3: " + listaInteger.zwrocIndeks(3)); // 2
        System.out.println("Ostatni indeks 3: " + listaInteger.zwrocOstatniIndeks(3)); // 2

        System.out.println("Element na indeksie 1: " + listaInteger.zwrocElement(1)); // 2
        System.out.println("Podmiana elementu na indeksie 1 na 5: " + listaInteger.podmienElement(1, 5)); // true
        System.out.println("Lista: " + listaInteger);
    }
}
