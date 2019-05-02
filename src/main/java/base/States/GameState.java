package base.States;

import base.Game;
import entities.buildings.test_building;
import entities.city_stats.Population;
import entities.city_stats.Stats;
import gfx.Assets;

import java.awt.*;

public class GameState extends State{

    private Stats stats;
    test_building test;

    public GameState(Game game){
        super(game);
        init();

    }

    public void init(){
        Population pop = new Population(0,0,0,100);
        stats = new Stats(pop);
        test = new test_building(stats);
    }

    public void update() {
        stats.getPopulation().update();
        System.out.println(stats.getPopulation().getPopulation());
    }

    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0,0,640,480);
        test.render(g);

        //g.drawImage(Assets.house, 0,0,null);
    }
}
