package com.google.android.gms.ads.internal.util;

import ai.uj0;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.work.a;
import androidx.work.b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import k5.b;
import k5.k;
import k5.l;
import k5.t;
import yg.u0;
import yh.b;

/* loaded from: classes3.dex */
public class WorkManagerUtil extends u0 {
    public static void R5(Context context) {
        try {
            t.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // yg.v0
    public final boolean zze(@RecentlyNonNull yh.a aVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Context context = (Context) b.z0(aVar);
        R5(context);
        k5.b a10 = new b.a().b(k.CONNECTED).a();
        try {
            t.d(context).c(new l.a(OfflineNotificationPoster.class).e(a10).f(new b.a().e("uri", str).e("gws_query_id", str2).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e10) {
            uj0.g("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }

    @Override // yg.v0
    public final void zzf(@RecentlyNonNull yh.a aVar) {
        Context context = (Context) yh.b.z0(aVar);
        R5(context);
        try {
            t d10 = t.d(context);
            d10.a("offline_ping_sender_work");
            d10.c(new l.a(OfflinePingSender.class).e(new b.a().b(k.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e10) {
            uj0.g("Failed to instantiate WorkManager.", e10);
        }
    }
}
