package com.dena.showroom.flvplayback.higherLevel;

/* loaded from: classes3.dex */
public class MediaPlayerException extends Exception {

    /* renamed from: w  reason: collision with root package name */
    public final int f26479w;

    /* renamed from: x  reason: collision with root package name */
    public final int f26480x;

    public MediaPlayerException(int i10, int i11) {
        super("what/extra=" + i10 + "/" + i11);
        this.f26479w = i10;
        this.f26480x = i11;
    }

    public int getExtra() {
        return this.f26480x;
    }

    public int getWhat() {
        return this.f26479w;
    }
}
