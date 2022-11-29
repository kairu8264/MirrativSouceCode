package pi;

import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes3.dex */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f47756a;

    /* renamed from: b  reason: collision with root package name */
    public final String f47757b;

    /* renamed from: c  reason: collision with root package name */
    public final String f47758c;

    /* renamed from: d  reason: collision with root package name */
    public final long f47759d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g4 f47760e;

    public /* synthetic */ d4(g4 g4Var, String str, long j10, c4 c4Var) {
        this.f47760e = g4Var;
        rh.p.e("health_monitor");
        rh.p.a(j10 > 0);
        this.f47756a = "health_monitor:start";
        this.f47757b = "health_monitor:count";
        this.f47758c = "health_monitor:value";
        this.f47759d = j10;
    }

    public final Pair<String, Long> a() {
        long abs;
        this.f47760e.f();
        this.f47760e.f();
        long c10 = c();
        if (c10 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c10 - this.f47760e.f48285a.c().currentTimeMillis());
        }
        long j10 = this.f47759d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            d();
            return null;
        }
        String string = this.f47760e.m().getString(this.f47758c, null);
        long j11 = this.f47760e.m().getLong(this.f47757b, 0L);
        d();
        if (string != null && j11 > 0) {
            return new Pair<>(string, Long.valueOf(j11));
        }
        return g4.f47822x;
    }

    public final void b(String str, long j10) {
        this.f47760e.f();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f47760e.m().getLong(this.f47757b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f47760e.m().edit();
            edit.putString(this.f47758c, str);
            edit.putLong(this.f47757b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f47760e.f48285a.N().s().nextLong();
        long j12 = j11 + 1;
        SharedPreferences.Editor edit2 = this.f47760e.m().edit();
        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j12) {
            edit2.putString(this.f47758c, str);
        }
        edit2.putLong(this.f47757b, j12);
        edit2.apply();
    }

    public final long c() {
        return this.f47760e.m().getLong(this.f47756a, 0L);
    }

    public final void d() {
        this.f47760e.f();
        long currentTimeMillis = this.f47760e.f48285a.c().currentTimeMillis();
        SharedPreferences.Editor edit = this.f47760e.m().edit();
        edit.remove(this.f47757b);
        edit.remove(this.f47758c);
        edit.putLong(this.f47756a, currentTimeMillis);
        edit.apply();
    }
}
