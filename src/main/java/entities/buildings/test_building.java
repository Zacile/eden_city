package entities.buildings;

import entities.city_stats.Stats;
import gfx.Assets;

import java.awt.*;

public class test_building extends Building{


    public test_building(Stats stats) {
        super(stats);
        init();

    }

    public void init(){
        add_Stats(this.getStats());
    }

    public void update() {

    }

    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(20,20,10,10);
    }

    public void add_Stats(Stats stats) {
        stats.getPopulation().add_pgr(0.05);
    }
}