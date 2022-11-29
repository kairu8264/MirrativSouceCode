package com.google.android.play.core.assetpacks;

import ak.f2;
import ak.g0;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes3.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: w  reason: collision with root package name */
    public g0 f27923w;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f27923w;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f2.a(getApplicationContext()).a(this);
    }
}
