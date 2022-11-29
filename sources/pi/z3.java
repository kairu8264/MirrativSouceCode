package pi;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class z3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f48397a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f48398b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48399c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f48400d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g4 f48401e;

    public z3(g4 g4Var, String str, boolean z10) {
        this.f48401e = g4Var;
        rh.p.e(str);
        this.f48397a = str;
        this.f48398b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f48401e.m().edit();
        edit.putBoolean(this.f48397a, z10);
        edit.apply();
        this.f48400d = z10;
    }

    public final boolean b() {
        if (!this.f48399c) {
            this.f48399c = true;
            this.f48400d = this.f48401e.m().getBoolean(this.f48397a, this.f48398b);
        }
        return this.f48400d;
    }
}
