package Ordenamientos.HashTable;

import Modelo.Citas;
import java.util.List;
import java.util.ArrayList;

public class OrdenamientoMergesortCitas {

    private static void mergeSort(List<Citas> citas, int izq, int der, boolean ascendente) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergeSort(citas, izq, m, ascendente);
            mergeSort(citas, m + 1, der, ascendente);
            merge(citas, izq, m, der, ascendente);
        }
    }

    private static void merge(List<Citas> citas, int izq, int m, int der, boolean ascendente) {
        List<Citas> temp = new ArrayList<>(citas.subList(izq, der + 1));
        int i = 0, j = m - izq + 1, k = izq;

        while (i <= m - izq && j < temp.size()) {
            if (ascendente ? temp.get(i).getFecha().compareTo(temp.get(j).getFecha()) <= 0 : temp.get(i).getFecha().compareTo(temp.get(j).getFecha()) >= 0) {
                citas.set(k++, temp.get(i++));
            } else {
                citas.set(k++, temp.get(j++));
            }
        }

        while (i <= m - izq) {
            citas.set(k++, temp.get(i++));
        }

        while (j < temp.size()) {
            citas.set(k++, temp.get(j++));
        }
    }

    public static List<Citas> ordenarPorFechaASC(List<Citas> citas) {
        System.out.println("Ordenando por fecha ascendente...");
        List<Citas> copia = new ArrayList<>(citas);
        mergeSort(copia, 0, copia.size() - 1, true);
        for (Citas c : copia) {
            System.out.println("Fecha: " + c.getFecha());
        }
        return copia;
    }

    public static List<Citas> ordenarPorFechaDESC(List<Citas> citas) {
        System.out.println("Ordenando por fecha descendente...");
        List<Citas> copia = new ArrayList<>(citas);
        mergeSort(copia, 0, copia.size() - 1, false);
        for (Citas c : copia) {
            System.out.println("Fecha: " + c.getFecha());
        }
        return copia;
    }
}
