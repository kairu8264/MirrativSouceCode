package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import pi.b9;
import pi.c9;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements b9 {

    /* renamed from: w  reason: collision with root package name */
    public c9<AppMeasurementJobService> f27291w;

    @Override // pi.b9
    public final boolean F(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // pi.b9
    public final void a(Intent intent) {
    }

    @Override // pi.b9
    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    public final c9<AppMeasurementJobService> c() {
        if (this.f27291w == null) {
            this.f27291w = new c9<>(this);
        }
        return this.f27291w;
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        c().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c().j(intent);
        return true;
    }
}
