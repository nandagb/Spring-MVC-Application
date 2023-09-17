package com.example.demo.repositories;

import com.example.demo.domain.Papel;

import java.util.ArrayList;
import java.util.List;



public class PapelRepository {

    private static List<Papel> papeis = new ArrayList<Papel>();

    public static List<Papel> getPapeis(){
        return papeis;
    }

    public static Papel addPapel(Papel p) {
        papeis.add(p);
        return p;
    }

    public static Papel removePapel(Papel p) {
        papeis.remove(p);
        return p;
    }





}