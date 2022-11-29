package com.dena.mirrorman.net.api.response;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class AnnouncementUrls implements Serializable {
    public static final int $stable = 8;
    private List<String> avatar;
    private List<String> catalog;
    private List<String> player;
    private List<String> setup;

    public List<String> getAvatar() {
        return this.avatar;
    }

    public List<String> getCatalog() {
        return this.catalog;
    }

    public List<String> getPlayer() {
        return this.player;
    }

    public List<String> getSetup() {
        return this.setup;
    }

    public void setAvatar(List<String> list) {
        this.avatar = list;
    }

    public void setCatalog(List<String> list) {
        this.catalog = list;
    }

    public void setPlayer(List<String> list) {
        this.player = list;
    }

    public void setSetup(List<String> list) {
        this.setup = list;
    }
}
