package entities.buildings;

import entities.city_stats.Stats;
import gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Building {

   /* private BufferedImage background;
    private Assets textures;*/


    private Stats stats;

    public  Building(Stats stats) {
        // this.textures = textures;
        this.stats = stats;

    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    //********************************************************************************

    public abstract void  init();


    public abstract void update();

    public abstract void render(Graphics g);

    public abstract void add_Stats(Stats stats);

}
