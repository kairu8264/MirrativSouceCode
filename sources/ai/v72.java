package ai;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v72 implements xc2<w72> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f10997a;

    /* renamed from: b  reason: collision with root package name */
    public final mn1 f10998b;

    /* renamed from: c  reason: collision with root package name */
    public final tr1 f10999c;

    /* renamed from: d  reason: collision with root package name */
    public final x72 f11000d;

    public v72(t43 t43Var, mn1 mn1Var, tr1 tr1Var, x72 x72Var) {
        this.f10997a = t43Var;
        this.f10998b = mn1Var;
        this.f10999c = tr1Var;
        this.f11000d = x72Var;
    }

    public final /* synthetic */ w72 a() throws Exception {
        List<String> asList = Arrays.asList(((String) ft.c().c(ox.W0)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                pm2 b10 = this.f10998b.b(str, new JSONObject());
                b10.q();
                Bundle bundle2 = new Bundle();
                try {
                    lb0 a10 = b10.a();
                    if (a10 != null) {
                        bundle2.putString("sdk_version", a10.toString());
                    }
                } catch (zzfaw unused) {
                }
                try {
                    lb0 C = b10.C();
                    if (C != null) {
                        bundle2.putString("adapter_version", C.toString());
                    }
                } catch (zzfaw unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfaw unused3) {
            }
        }
        return new w72(bundle, null);
    }

    @Override // ai.xc2
    public final s43<w72> zza() {
        if (!xx2.c((String) ft.c().c(ox.W0)) && !this.f11000d.b() && this.f10999c.m()) {
            this.f11000d.a(true);
            return this.f10997a.h(new Callable(this) { // from class: ai.t72

                /* renamed from: a  reason: collision with root package name */
                public final v72 f10169a;

                {
                    this.f10169a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10169a.a();
                }
            });
        }
        return j43.a(new w72(new Bundle(), null));
    }
}
