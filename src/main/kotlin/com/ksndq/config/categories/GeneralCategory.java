package com.ksndq.config.categories;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class GeneralCategory {

    @Expose
    @ConfigOption(name = "Emerald Ring Sound", desc = "Mutes the sound of the Emerald Ring.")
    @ConfigEditorBoolean
    public boolean firstToggle = false;
}
