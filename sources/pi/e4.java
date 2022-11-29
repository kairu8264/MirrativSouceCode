package pi;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class e4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f47776a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47777b;

    /* renamed from: c  reason: collision with root package name */
    public String f47778c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g4 f47779d;

    public e4(g4 g4Var, String str, String str2) {
        this.f47779d = g4Var;
        rh.p.e(str);
        this.f47776a = str;
    }

    public final String a() {
        if (!this.f47777b) {
            this.f47777b = true;
            this.f47778c = this.f47779d.m().getString(this.f47776a, null);
        }
        return this.f47778c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f47779d.m().edit();
        edit.putString(this.f47776a, str);
        edit.apply();
        this.f47778c = str;
    }
}
