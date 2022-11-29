package pi;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class b4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f47614a;

    /* renamed from: b  reason: collision with root package name */
    public final long f47615b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47616c;

    /* renamed from: d  reason: collision with root package name */
    public long f47617d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g4 f47618e;

    public b4(g4 g4Var, String str, long j10) {
        this.f47618e = g4Var;
        rh.p.e(str);
        this.f47614a = str;
        this.f47615b = j10;
    }

    public final long a() {
        if (!this.f47616c) {
            this.f47616c = true;
            this.f47617d = this.f47618e.m().getLong(this.f47614a, this.f47615b);
        }
        return this.f47617d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f47618e.m().edit();
        edit.putLong(this.f47614a, j10);
        edit.apply();
        this.f47617d = j10;
    }
}
