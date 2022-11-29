package ak;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class i0 extends fk.d<AssetPackState> {

    /* renamed from: g  reason: collision with root package name */
    public final k2 f13410g;

    /* renamed from: h  reason: collision with root package name */
    public final q1 f13411h;

    /* renamed from: i  reason: collision with root package name */
    public final dk.b0<u4> f13412i;

    /* renamed from: j  reason: collision with root package name */
    public final b1 f13413j;

    /* renamed from: k  reason: collision with root package name */
    public final t1 f13414k;

    /* renamed from: l  reason: collision with root package name */
    public final dk.b0<Executor> f13415l;

    /* renamed from: m  reason: collision with root package name */
    public final dk.b0<Executor> f13416m;

    /* renamed from: n  reason: collision with root package name */
    public final i3 f13417n;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f13418o;

    public i0(Context context, k2 k2Var, q1 q1Var, dk.b0<u4> b0Var, t1 t1Var, b1 b1Var, dk.b0<Executor> b0Var2, dk.b0<Executor> b0Var3, i3 i3Var) {
        super(new dk.f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f13418o = new Handler(Looper.getMainLooper());
        this.f13410g = k2Var;
        this.f13411h = q1Var;
        this.f13412i = b0Var;
        this.f13414k = t1Var;
        this.f13413j = b1Var;
        this.f13415l = b0Var2;
        this.f13416m = b0Var3;
        this.f13417n = i3Var;
    }

    @Override // fk.d
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList != null && stringArrayList.size() == 1) {
                final AssetPackState i10 = AssetPackState.i(bundleExtra, stringArrayList.get(0), this.f13414k, this.f13417n, k0.f13494a);
                this.f31995a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", i10);
                PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
                if (pendingIntent != null) {
                    this.f13413j.b(pendingIntent);
                }
                this.f13416m.zza().execute(new Runnable() { // from class: ak.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.this.i(bundleExtra, i10);
                    }
                });
                this.f13415l.zza().execute(new Runnable() { // from class: ak.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.this.h(bundleExtra);
                    }
                });
                return;
            }
            this.f31995a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        this.f31995a.b("Empty bundle received from broadcast.", new Object[0]);
    }

    public final /* synthetic */ void h(Bundle bundle) {
        if (this.f13410g.p(bundle)) {
            this.f13411h.a();
        }
    }

    public final /* synthetic */ void i(Bundle bundle, AssetPackState assetPackState) {
        if (this.f13410g.o(bundle)) {
            j(assetPackState);
            this.f13412i.zza().a();
        }
    }

    public final void j(final AssetPackState assetPackState) {
        this.f13418o.post(new Runnable() { // from class: ak.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.f(assetPackState);
            }
        });
    }
}
