package net.lzsb.SexLingzhou.event;

/**
 * Project: SexLingzhou
 * -----------------------------------------------------------
 * Copyright © 2017 | lzsb | All rights reserved.
 */
public class CancellableEvent extends Event {

    private boolean cancel;

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancelled() {
        return cancel;
    }
}