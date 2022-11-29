package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wb2 implements xc2<xb2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f11536a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f11537b;

    /* renamed from: c  reason: collision with root package name */
    public final w42 f11538c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f11539d;

    /* renamed from: e  reason: collision with root package name */
    public final yl2 f11540e;

    /* renamed from: f  reason: collision with root package name */
    public final q42 f11541f;

    /* renamed from: g  reason: collision with root package name */
    public final mn1 f11542g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11543h;

    public wb2(t43 t43Var, ScheduledExecutorService scheduledExecutorService, String str, w42 w42Var, Context context, yl2 yl2Var, q42 q42Var, mn1 mn1Var) {
        this.f11536a = t43Var;
        this.f11537b = scheduledExecutorService;
        this.f11543h = str;
        this.f11538c = w42Var;
        this.f11539d = context;
        this.f11540e = yl2Var;
        this.f11541f = q42Var;
        this.f11542g = mn1Var;
    }

    public final /* synthetic */ s43 a(String str, a52 a52Var, Bundle bundle) throws Exception {
        return d(str, Collections.singletonList(a52Var.f1751d), bundle, a52Var.f1749b, a52Var.f1750c);
    }

    public final /* synthetic */ s43 b(String str, List list, Bundle bundle) throws Exception {
        return d(str, list, bundle, true, true);
    }

    public final /* bridge */ /* synthetic */ s43 c() {
        Map<String, List<Bundle>> c10 = this.f11538c.c(this.f11543h, this.f11540e.f12652f);
        final ArrayList arrayList = new ArrayList();
        Iterator<E> it = ((d03) c10).entrySet().iterator();
        while (true) {
            final Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            final String str = (String) entry.getKey();
            final List list = (List) entry.getValue();
            Bundle bundle2 = this.f11540e.f12650d.I;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(j43.f((z33) j43.h(z33.E(j43.e(new o33(this, str, list, bundle) { // from class: ai.rb2

                /* renamed from: a  reason: collision with root package name */
                public final wb2 f9392a;

                /* renamed from: b  reason: collision with root package name */
                public final String f9393b;

                /* renamed from: c  reason: collision with root package name */
                public final List f9394c;

                /* renamed from: d  reason: collision with root package name */
                public final Bundle f9395d;

                {
                    this.f9392a = this;
                    this.f9393b = str;
                    this.f9394c = list;
                    this.f9395d = bundle;
                }

                @Override // ai.o33
                public final s43 zza() {
                    return this.f9392a.b(this.f9393b, this.f9394c, this.f9395d);
                }
            }, this.f11536a)), ((Long) ft.c().c(ox.X0)).longValue(), TimeUnit.MILLISECONDS, this.f11537b), Throwable.class, new bx2(str) { // from class: ai.sb2

                /* renamed from: a  reason: collision with root package name */
                public final String f9795a;

                {
                    this.f9795a = str;
                }

                @Override // ai.bx2
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    String valueOf = String.valueOf(this.f9795a);
                    uj0.c(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.f11536a));
        }
        for (Map.Entry entry2 : ((d03) this.f11538c.b()).entrySet()) {
            final a52 a52Var = (a52) entry2.getValue();
            final String str2 = a52Var.f1748a;
            Bundle bundle3 = this.f11540e.f12650d.I;
            final Bundle bundle4 = bundle3 != null ? bundle3.getBundle(str2) : null;
            arrayList.add(j43.f((z33) j43.h(z33.E(j43.e(new o33(this, str2, a52Var, bundle4) { // from class: ai.tb2

                /* renamed from: a  reason: collision with root package name */
                public final wb2 f10227a;

                /* renamed from: b  reason: collision with root package name */
                public final String f10228b;

                /* renamed from: c  reason: collision with root package name */
                public final a52 f10229c;

                /* renamed from: d  reason: collision with root package name */
                public final Bundle f10230d;

                {
                    this.f10227a = this;
                    this.f10228b = str2;
                    this.f10229c = a52Var;
                    this.f10230d = bundle4;
                }

                @Override // ai.o33
                public final s43 zza() {
                    return this.f10227a.a(this.f10228b, this.f10229c, this.f10230d);
                }
            }, this.f11536a)), ((Long) ft.c().c(ox.X0)).longValue(), TimeUnit.MILLISECONDS, this.f11537b), Throwable.class, new bx2(str2) { // from class: ai.ub2

                /* renamed from: a  reason: collision with root package name */
                public final String f10670a;

                {
                    this.f10670a = str2;
                }

                @Override // ai.bx2
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    String valueOf = String.valueOf(this.f10670a);
                    uj0.c(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.f11536a));
        }
        return j43.o(arrayList).a(new Callable(arrayList) { // from class: ai.vb2

            /* renamed from: a  reason: collision with root package name */
            public final List f11016a;

            {
                this.f11016a = arrayList;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<s43> list2 = this.f11016a;
                JSONArray jSONArray = new JSONArray();
                for (s43 s43Var : list2) {
                    if (((JSONObject) s43Var.get()) != null) {
                        jSONArray.put(s43Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new xb2(jSONArray.toString());
            }
        }, this.f11536a);
    }

    public final s43<JSONObject> d(String str, List<Bundle> list, Bundle bundle, boolean z10, boolean z11) throws RemoteException {
        ya0 ya0Var;
        mk0 mk0Var = new mk0();
        if (z11) {
            this.f11541f.a(str);
            ya0Var = this.f11541f.b(str);
        } else {
            try {
                ya0Var = this.f11542g.c(str);
            } catch (RemoteException e10) {
                uj0.d("Couldn't create RTB adapter : ", e10);
                ya0Var = null;
            }
        }
        ya0 ya0Var2 = ya0Var;
        Objects.requireNonNull(ya0Var2);
        z42 z42Var = new z42(str, ya0Var2, mk0Var);
        if (z10) {
            ya0Var2.X1(yh.b.h1(this.f11539d), this.f11543h, bundle, list.get(0), this.f11540e.f12651e, z42Var);
        } else {
            z42Var.zzb();
        }
        return mk0Var;
    }

    @Override // ai.xc2
    public final s43<xb2> zza() {
        return j43.e(new o33(this) { // from class: ai.qb2

            /* renamed from: a  reason: collision with root package name */
            public final wb2 f8866a;

            {
                this.f8866a = this;
            }

            @Override // ai.o33
            public final s43 zza() {
                return this.f8866a.c();
            }
        }, this.f11536a);
    }
}
