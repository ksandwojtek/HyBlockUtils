package com.ksndq.config.categories;

import com.google.gson.annotations.Expose;
import com.ksndq.HyBlockMod;
import io.github.moulberry.moulconfig.Config;
import io.github.moulberry.moulconfig.annotations.Category;

public class HyBlockConfig extends Config {

    @Override
    public String getTitle() {
        return "HyBlockUtils " + HyBlockMod.getVersion() + " by §cksndq2§r, config by §5Moulberry §rand §5nea89";
    }

    @Override
    public void saveNow() {
        HyBlockMod.configManager.save();
    }

    @Expose
    @Category(name = "General", desc = "General utility settings.")
    public GeneralCategory generalCategory = new GeneralCategory();

//    @Expose
//    @Category(name = "Second Category", desc = "This is another category.")
//    public SecondCategory secondCategory = new SecondCategory();
}
