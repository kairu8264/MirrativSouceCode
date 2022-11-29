package ai;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbye;

/* loaded from: classes3.dex */
public final class ob0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AdOverlayInfoParcel f7705w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ zzbye f7706x;

    public ob0(zzbye zzbyeVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f7706x = zzbyeVar;
        this.f7705w = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        wg.t.c();
        activity = this.f7706x.f27267a;
        xg.o.a(activity, this.f7705w, true);
    }
}
