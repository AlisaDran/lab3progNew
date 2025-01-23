import Characters.*;
import Exceptions.deadException;
import Exceptions.goodmoodException;
import Moves.*;
import stuff.*;
import types.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        HP neznHealth = new HP(100);
        HP kozlicHealth = new HP(100);
        Charact vrigl = new Policeman("Вригль");
        Charact migl = new Policeman("Мигль");
        Charact drigl = new Policeman("Дригль");
        Charact neznika = new Neznaika("Незнайка", neznHealth );
        Charact kozlic = new Kozlic("Козлик", kozlicHealth);
        Charact door = new Entity("Дверь полицесйского управления");
        Charact window = new Entity("обе створки");

        ArrayList<Action> actionList = new ArrayList<>();
        actionList.add(new ActLean());
        actionList.add(new ActWhisper());
        actionList.add(new ActInterrupted());
        actionList.add(new ActOpenedsmth());
        actionList.add(new ActPutin());
        actionList.add(new ActWaved());
        actionList.add(new ActTurned());
        actionList.add(new ActGrabbed());
        actionList.add(new ActPlaced());
        actionList.add(new ActPunch());
        actionList.add(new ActBounced());
        actionList.add(new ActHit());
        actionList.add(new ActOpened());
        actionList.add(new ActFlyout());
        actionList.add(new ActCrashed());
        actionList.add(new ActRegain());
        actionList.add(new ActSencecameback());
        actionList.add(new ActWantstandup());
        actionList.add(new ActSaw());
        actionList.add(new ActOpenedtwo());
        actionList.add(new ActRollout());
        actionList.add(new ActJumped());
        actionList.add(new ActRan());
        actionList.add(new ActHelp());
        actionList.add(new ActStandup());
        actionList.add(new ActEndanger());
        actionList.add(new ActTocomfort());
        int indexAct = 0;

        if (rand.nextInt(0, 100) < 20) {
            throw new goodmoodException("happy");
        }

        System.out.print(migl.writeActDuo(actionList.get(indexAct), vrigl));
        indexAct++;
        System.out.println(", и " + migl.writeActDuo(actionList.get(indexAct), neznika));
        indexAct++;
        System.out.println(vrigl.writeActSolo(actionList.get(indexAct))); // Обартил внимания
        indexAct++;
        System.out.println(migl.writeActSolo(actionList.get(indexAct))); // Совать под нос папку
        indexAct++;
        System.out.println(migl.writeActDuo(actionList.get(indexAct), vrigl)); // Совать под нос папку
        indexAct++;
        System.out.println(vrigl.writeActDuo(actionList.get(indexAct), neznika)); //
        indexAct++;
        System.out.println(vrigl.writeActDuo(actionList.get(indexAct), neznika)); // Искоса повернулся к незнайке
        indexAct++;
        System.out.println(vrigl.writeActDuo(actionList.get(indexAct), neznika) + ", "); // Схватил незнайку
        indexAct++;
        System.out.println(vrigl.writeActDuo(actionList.get(indexAct), neznika));
        indexAct++;
        System.out.print(vrigl.writeActSolo(actionList.get(indexAct)));
        indexAct++;
        neznika.setHealth(neznHealth.takeHp(rand.nextInt(0, 200)));
        try {
            if(neznika.getHealth() <= 0){
                throw new deadException("Dead");
            } else {
                System.out.println(neznika.writeActSolo(actionList.get(indexAct))); // Незайка полетел/ плюхнул
                indexAct++;
            }
        }
        catch (deadException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.print(neznika.writeActSolo(actionList.get(indexAct)) + ", ");
        indexAct++;
        System.out.println("отчего " + window.writeActSolo(actionList.get(indexAct)));
        indexAct++;
        System.out.println(neznika.writeActSolo(actionList.get(indexAct)));
        indexAct++;
        System.out.println(neznika.writeActSolo(actionList.get(indexAct))); // Грохнулся
        indexAct++;
        if (neznika.getHealth() < 30){
            System.out.println(neznika.writeActSolo(actionList.get(indexAct)));
            indexAct++;
            System.out.println(neznika.writeActSolo(actionList.get(indexAct)));
            indexAct++;
        } else{
            indexAct += 2;
        }
        System.out.print(neznika.writeActSolo(actionList.get(indexAct))); // Пытался подняться
        indexAct++;
        System.out.print(actionList.get(indexAct).doAct());
        indexAct++;
        System.out.print(door.writeActSolo(actionList.get(indexAct))); // Дверь распахнулась
        indexAct++;
        System.out.println(", и " + actionList.get(indexAct).doAct() + kozlic.name); // Выкатился козлик
        indexAct++;
        kozlic.setHealth(kozlicHealth.takeHp(rand.nextInt(0, 150)));
        try {
            if(kozlic.getHealth() <= 0){
                throw new deadException("Dead");
            }
        }
        catch (deadException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println(neznika.writeActSolo(actionList.get(indexAct)));
        indexAct++;
        System.out.println(neznika.writeActSolo(actionList.get(indexAct)));
        indexAct++;
        System.out.println(neznika.writeActDuo(actionList.get(indexAct), kozlic));
        indexAct++;
        System.out.println(kozlic.writeActSolo(actionList.get(indexAct)));
        indexAct++;
        System.out.println(kozlic.writeActDuo(actionList.get(indexAct), door));
        indexAct++;
        System.out.println(neznika.writeActDuo(actionList.get(indexAct), kozlic));
        indexAct++;
    }
}