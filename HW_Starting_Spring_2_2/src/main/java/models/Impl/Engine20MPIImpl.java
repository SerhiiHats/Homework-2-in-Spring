package models.Impl;

import models.Engine;

public class Engine20MPIImpl implements Engine {
    private String markEngine;
    private int volumeEngine;
    private int powerEngine;

    public Engine20MPIImpl(String markEngine, int volumeEngine, int powerEngine) {
        this.markEngine = markEngine;
        this.volumeEngine = volumeEngine;
        this.powerEngine = powerEngine;
    }

    @Override
    public String getMarkEngine() {
        return markEngine;
    }

    public void setMarkEngine(String markEngine) {
        this.markEngine = markEngine;
    }

    @Override
    public int getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(int volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    @Override
    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    @Override
    public String toString() {
        return "EngineImpl{" +
                "markEngine='" + markEngine + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", powerEngine=" + powerEngine +
                '}';
    }
}
