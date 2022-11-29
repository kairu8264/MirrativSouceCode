package com.google.android.play.core.assetpacks;

import ak.m1;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes3.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: w  reason: collision with root package name */
    public final IBinder f27924w = new m1(this);

    public final synchronized void a() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f27924w;
    }
}
