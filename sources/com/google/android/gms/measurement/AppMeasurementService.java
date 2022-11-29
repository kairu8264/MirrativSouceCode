package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import j4.a;
import pi.b9;
import pi.c9;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements b9 {

    /* renamed from: w  reason: collision with root package name */
    public c9<AppMeasurementService> f27293w;

    @Override // pi.b9
    public final boolean F(int i10) {
        return stopSelfResult(i10);
    }

    @Override // pi.b9
    public final void a(Intent intent) {
        a.b(intent);
    }

    @Override // pi.b9
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final c9<AppMeasurementService> c() {
        if (this.f27293w == null) {
            this.f27293w = new c9<>(this);
        }
        return this.f27293w;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        c().g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        c().a(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c().j(intent);
        return true;
    }
}
