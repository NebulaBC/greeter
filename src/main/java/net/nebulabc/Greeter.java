package net.nebulabc;

import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class Greeter extends Plugin
{
    public Greeter(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start()
    {
        // Plugin startup logic.
    }

    @Override
    public void stop()
    {
        // Plugin shutdown logic.
    }
}
