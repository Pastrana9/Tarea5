package com.company;

public class Alumnos extends Thread{
    int horal;
    int alumnos=0;
    int numeros=15;

    String alumno;

    private final Object Alumnos;

    public Alumnos(String s){

    }


    public void run() {

        while (true){

            try {
                synchronized (Main.class){
                    for (int i=0;i>= 15;i++){

                    }

                    horal=(int) (Math.random()) * (6000 -1000)) + 1000;
                }

                    if (horal>4000){
                        Main.alumnos.wait();
                    }

                System.out.println("Ha llegado el alumno")+alumno;
            }catch
                e
        }
    }







}
