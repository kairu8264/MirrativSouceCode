package ai;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tg.e;

/* loaded from: classes3.dex */
public final class ca0 implements ah.s {

    /* renamed from: a  reason: collision with root package name */
    public final Date f2767a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2768b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f2769c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2770d;

    /* renamed from: e  reason: collision with root package name */
    public final Location f2771e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2772f;

    /* renamed from: g  reason: collision with root package name */
    public final a00 f2773g;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2775i;

    /* renamed from: k  reason: collision with root package name */
    public final String f2777k;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f2774h = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Boolean> f2776j = new HashMap();

    public ca0(Date date, int i10, Set<String> set, Location location, boolean z10, int i11, a00 a00Var, List<String> list, boolean z11, int i12, String str) {
        this.f2767a = date;
        this.f2768b = i10;
        this.f2769c = set;
        this.f2771e = location;
        this.f2770d = z10;
        this.f2772f = i11;
        this.f2773g = a00Var;
        this.f2775i = z11;
        this.f2777k = str;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f2776j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f2776j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f2774h.add(str2);
                }
            }
        }
    }

    @Override // ah.e
    @Deprecated
    public final Date a() {
        return this.f2767a;
    }

    @Override // ah.s
    public final dh.d b() {
        return a00.p(this.f2773g);
    }

    @Override // ah.e
    public final int c() {
        return this.f2772f;
    }

    @Override // ah.e
    @Deprecated
    public final boolean d() {
        return this.f2775i;
    }

    @Override // ah.e
    public final boolean e() {
        return this.f2770d;
    }

    @Override // ah.s
    public final tg.e f() {
        a00 a00Var = this.f2773g;
        e.a aVar = new e.a();
        if (a00Var == null) {
            return aVar.a();
        }
        int i10 = a00Var.f1654w;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(a00Var.C);
                    aVar.d(a00Var.D);
                }
                aVar.g(a00Var.f1655x);
                aVar.c(a00Var.f1656y);
                aVar.f(a00Var.f1657z);
                return aVar.a();
            }
            uw uwVar = a00Var.B;
            if (uwVar != null) {
                aVar.h(new rg.v(uwVar));
            }
        }
        aVar.b(a00Var.A);
        aVar.g(a00Var.f1655x);
        aVar.c(a00Var.f1656y);
        aVar.f(a00Var.f1657z);
        return aVar.a();
    }

    @Override // ah.e
    @Deprecated
    public final int g() {
        return this.f2768b;
    }

    @Override // ah.s
    public final boolean h() {
        return this.f2774h.contains("6");
    }

    @Override // ah.e
    public final Set<String> i() {
        return this.f2769c;
    }

    @Override // ah.e
    public final Location j() {
        return this.f2771e;
    }

    @Override // ah.s
    public final boolean zza() {
        return this.f2774h.contains("3");
    }

    @Override // ah.s
    public final Map<String, Boolean> zzb() {
        return this.f2776j;
    }
}
