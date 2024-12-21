package de.damcraft.serverseeker.gui;

import de.damcraft.serverseeker.DiscordAuth;
import meteordevelopment.meteorclient.gui.GuiThemes;
import meteordevelopment.meteorclient.gui.WindowScreen;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;

import static meteordevelopment.meteorclient.MeteorClient.mc;

public class LoginWithDiscordScreen extends WindowScreen {

    private boolean canClose = false;

    WindowScreen parent;

    @Override
    public void tick() {}

    @Override
    public boolean shouldCloseOnEsc() {
        return this.canClose;
    }
}
