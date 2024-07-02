package Ordenamientos.HashTable;

import Modelo.Citas;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class OrdenamientoBurbujaCitasHashTable {

    private static void burbujaRecursivaASC(List<Citas> lista, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println("Comparando: " + lista.get(i).getNomDue() + " con " + lista.get(i + 1).getNomDue());
            if (lista.get(i).getNomDue().compareTo(lista.get(i + 1).getNomDue()) > 0) {
                System.out.println("Intercambiando: " + lista.get(i).getNomDue() + " con " + lista.get(i + 1).getNomDue());
                Citas temp = lista.get(i);
                lista.set(i, lista.get(i + 1));
                lista.set(i + 1, temp);
            }
        }

        burbujaRecursivaASC(lista, n - 1);
    }

    private static void burbujaRecursivaDESC(List<Citas> lista, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println("Comparando: " + lista.get(i).getNomDue() + " con " + lista.get(i + 1).getNomDue());
            if (lista.get(i).getNomDue().compareTo(lista.get(i + 1).getNomDue()) < 0) {
                System.out.println("Intercambiando: " + lista.get(i).getNomDue() + " con " + lista.get(i + 1).getNomDue());
                Citas temp = lista.get(i);
                lista.set(i, lista.get(i + 1));
                lista.set(i + 1, temp);
            }
        }

        burbujaRecursivaDESC(lista, n - 1);
    }

    public static List<Citas> ordenarPorNombreDueASC(Hashtable<String, Citas> citas) {
        System.out.println("Ordenando por nombre del dueño ascendente...");
        List<Citas> listaCitas = new ArrayList<>(citas.values());
        System.out.println("Lista antes de ordenar ascendente: " + listaCitas);
        burbujaRecursivaASC(listaCitas, listaCitas.size());
        System.out.println("Lista después de ordenar ascendente: " + listaCitas);

        return listaCitas;
    }

    public static List<Citas> ordenarPorNombreDueDESC(Hashtable<String, Citas> citas) {
        System.out.println("Ordenando por nombre del dueño descendente...");
        List<Citas> listaCitas = new ArrayList<>(citas.values());
        System.out.println("Lista antes de ordenar descendente: " + listaCitas);
        burbujaRecursivaDESC(listaCitas, listaCitas.size());
        System.out.println("Lista después de ordenar descendente: " + listaCitas);

        return listaCitas;
    }
}
