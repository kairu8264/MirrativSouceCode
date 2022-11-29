package com.dena.showroom.flvplayback;

/* loaded from: classes3.dex */
public class FLVPlaybackConfig {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26406a;

    public FLVPlaybackConfig(boolean z10) {
        this.f26406a = z10;
    }

    public static FLVPlaybackConfig getDefaultConfig() {
        return new FLVPlaybackConfig(true);
    }

    public boolean playsAfterKeyframeCome() {
        return this.f26406a;
    }
}
