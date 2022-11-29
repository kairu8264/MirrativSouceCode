package com.google.android.gms.ads;

import ai.dt;
import ai.uj0;
import ai.w80;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes3.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            dt.b().l(this, new w80()).I0(intent);
        } catch (RemoteException e10) {
            uj0.c("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
