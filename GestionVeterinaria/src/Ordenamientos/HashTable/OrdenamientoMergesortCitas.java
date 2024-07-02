package Ordenamientos.HashTable;

import Modelo.Citas;
import java.util.List;
import java.util.ArrayList;

public class OrdenamientoMergesortCitas {

    public static List<Citas> ordenarPorDueñoASC(List<Citas> lista) {
        if (lista.size() <= 1) {
            return lista;
        }

        int mitad = lista.size() / 2;
        List<Citas> izquierda = new ArrayList<>(lista.subList(0, mitad));
        List<Citas> derecha = new ArrayList<>(lista.subList(mitad, lista.size()));

        return merge(ordenarPorDueñoASC(izquierda), ordenarPorDueñoASC(derecha), true);
    }

    public static List<Citas> ordenarPorDueñoDESC(List<Citas> lista) {
        if (lista.size() <= 1) {
            return lista;
        }

        int mitad = lista.size() / 2;
        List<Citas> izquierda = new ArrayList<>(lista.subList(0, mitad));
        List<Citas> derecha = new ArrayList<>(lista.subList(mitad, lista.size()));

        return merge(ordenarPorDueñoDESC(izquierda), ordenarPorDueñoDESC(derecha), false);
    }

    private static List<Citas> merge(List<Citas> izquierda, List<Citas> derecha, boolean ascendente) {
        List<Citas> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < izquierda.size() && j < derecha.size()) {
            if ((ascendente && izquierda.get(i).getNomDue().compareTo(derecha.get(j).getNomDue()) <= 0) ||
                (!ascendente && izquierda.get(i).getNomDue().compareTo(derecha.get(j).getNomDue()) >= 0)) {
                result.add(izquierda.get(i));
                i++;
            } else {
                result.add(derecha.get(j));
                j++;
            }
        }

        while (i < izquierda.size()) {
            result.add(izquierda.get(i));
            i++;
        }

        while (j < derecha.size()) {
            result.add(derecha.get(j));
            j++;
        }

        return result;
    }
}
