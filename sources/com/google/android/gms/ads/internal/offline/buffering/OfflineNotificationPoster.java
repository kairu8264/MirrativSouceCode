package com.google.android.gms.ads.internal.offline.buffering;

import ai.dt;
import ai.ec0;
import ai.w80;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import yh.b;

/* loaded from: classes3.dex */
public class OfflineNotificationPoster extends Worker {
    public final ec0 C;

    public OfflineNotificationPoster(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.C = dt.b().l(context, new w80());
    }

    @Override // androidx.work.Worker
    @RecentlyNonNull
    public final ListenableWorker.a doWork() {
        try {
            this.C.I2(b.h1(getApplicationContext()), getInputData().i("uri"), getInputData().i("gws_query_id"));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
