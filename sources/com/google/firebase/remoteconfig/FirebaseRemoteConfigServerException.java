package com.google.firebase.remoteconfig;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: w  reason: collision with root package name */
    public final int f28021w;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f28021w = i10;
    }

    public int a() {
        return this.f28021w;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f28021w = i10;
    }
}
