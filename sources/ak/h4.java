package ak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h4 implements b {

    /* renamed from: m  reason: collision with root package name */
    public static final dk.f f13394m = new dk.f("AssetPackManager");

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13395a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.b0<u4> f13396b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f13397c;

    /* renamed from: d  reason: collision with root package name */
    public final ik.c f13398d;

    /* renamed from: e  reason: collision with root package name */
    public final k2 f13399e;

    /* renamed from: f  reason: collision with root package name */
    public final t1 f13400f;

    /* renamed from: g  reason: collision with root package name */
    public final b1 f13401g;

    /* renamed from: h  reason: collision with root package name */
    public final dk.b0<Executor> f13402h;

    /* renamed from: i  reason: collision with root package name */
    public final ck.b f13403i;

    /* renamed from: j  reason: collision with root package name */
    public final i3 f13404j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f13405k = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    public boolean f13406l;

    public h4(o0 o0Var, dk.b0<u4> b0Var, i0 i0Var, ik.c cVar, k2 k2Var, t1 t1Var, b1 b1Var, dk.b0<Executor> b0Var2, ck.b bVar, i3 i3Var) {
        this.f13395a = o0Var;
        this.f13396b = b0Var;
        this.f13397c = i0Var;
        this.f13398d = cVar;
        this.f13399e = k2Var;
        this.f13400f = t1Var;
        this.f13401g = b1Var;
        this.f13402h = b0Var2;
        this.f13403i = bVar;
        this.f13404j = i3Var;
    }

    @Override // ak.b
    public final jk.d<Integer> a(Activity activity) {
        if (activity == null) {
            return jk.f.b(new AssetPackException(-3));
        }
        if (this.f13401g.a() == null) {
            return jk.f.b(new AssetPackException(-12));
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", this.f13401g.a());
        jk.o oVar = new jk.o();
        intent.putExtra("result_receiver", new g4(this, this.f13405k, oVar));
        activity.startActivity(intent);
        return oVar.a();
    }

    @Override // ak.b
    public final jk.d<e> b(List<String> list) {
        Map<String, Long> H = this.f13395a.H();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        if (!this.f13403i.a("assetOnlyUpdates")) {
            arrayList.removeAll(H.keySet());
            arrayList2.addAll(list);
            arrayList2.removeAll(arrayList);
        }
        if (arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putInt("error_code", 0);
            for (String str : list) {
                bundle.putInt(bk.b.a("status", str), 4);
                bundle.putInt(bk.b.a("error_code", str), 0);
                bundle.putLong(bk.b.a("total_bytes_to_download", str), 0L);
                bundle.putLong(bk.b.a("bytes_downloaded", str), 0L);
            }
            bundle.putStringArrayList("pack_names", new ArrayList<>(list));
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putLong("bytes_downloaded", 0L);
            return jk.f.c(e.c(bundle, this.f13400f, this.f13404j));
        }
        return this.f13396b.zza().d(arrayList2, arrayList, H);
    }

    @Override // ak.b
    public final a c(String str) {
        if (!this.f13406l) {
            this.f13402h.zza().execute(new Runnable() { // from class: ak.d4
                @Override // java.lang.Runnable
                public final void run() {
                    h4.this.k();
                }
            });
            this.f13406l = true;
        }
        if (this.f13395a.g(str)) {
            try {
                return this.f13395a.t(str);
            } catch (IOException unused) {
                return null;
            }
        } else if (this.f13398d.a().contains(str)) {
            return a.d();
        } else {
            return null;
        }
    }

    @Override // ak.b
    public final void d(d dVar) {
        this.f13397c.e(dVar);
    }

    @Override // ak.b
    public final jk.d<Void> e(final String str) {
        final jk.o oVar = new jk.o();
        this.f13402h.zza().execute(new Runnable() { // from class: ak.f4
            @Override // java.lang.Runnable
            public final void run() {
                h4.this.l(str, oVar);
            }
        });
        return oVar.a();
    }

    @Override // ak.b
    public final e f(List<String> list) {
        Map<String, Integer> f10 = this.f13399e.f(list);
        HashMap hashMap = new HashMap();
        for (String str : list) {
            Integer num = f10.get(str);
            hashMap.put(str, AssetPackState.h(str, num == null ? 0 : num.intValue(), 0, 0L, 0L, 0.0d, 0, "", ""));
        }
        this.f13396b.zza().v0(list);
        return new u0(0L, hashMap);
    }

    @Override // ak.b
    public final jk.d<e> g(List<String> list) {
        return this.f13396b.zza().e(list, new g3(this), this.f13395a.H());
    }

    @Override // ak.b
    public final synchronized void h(d dVar) {
        boolean g10 = this.f13397c.g();
        this.f13397c.c(dVar);
        if (g10) {
            return;
        }
        p();
    }

    public final int i(int i10, String str) {
        if (this.f13395a.g(str) || i10 != 4) {
            if (!this.f13395a.g(str) || i10 == 4) {
                return i10;
            }
            return 4;
        }
        return 8;
    }

    public final /* synthetic */ void k() {
        this.f13395a.L();
        this.f13395a.J();
        this.f13395a.K();
    }

    public final /* synthetic */ void l(String str, jk.o oVar) {
        if (this.f13395a.d(str)) {
            oVar.c(null);
            this.f13396b.zza().h(str);
            return;
        }
        oVar.b(new IOException(String.format("Failed to remove pack %s.", str)));
    }

    public final /* synthetic */ void n() {
        jk.d<List<String>> g10 = this.f13396b.zza().g(this.f13395a.H());
        final o0 o0Var = this.f13395a;
        o0Var.getClass();
        g10.d(this.f13402h.zza(), new jk.c() { // from class: ak.c4
            @Override // jk.c
            public final void onSuccess(Object obj) {
                o0.this.c((List) obj);
            }
        });
        g10.b(this.f13402h.zza(), b4.f13317a);
    }

    public final void o(boolean z10) {
        boolean g10 = this.f13397c.g();
        this.f13397c.d(z10);
        if (!z10 || g10) {
            return;
        }
        p();
    }

    public final void p() {
        this.f13402h.zza().execute(new Runnable() { // from class: ak.e4
            @Override // java.lang.Runnable
            public final void run() {
                h4.this.n();
            }
        });
    }
}
