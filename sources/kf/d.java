package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.c;

/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38718a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38719b;

    public d(Context context) {
        jo.p.h(context, "context");
        this.f38718a = context;
        this.f38719b = "CookiePref";
    }

    public void A5(String str, String str2) {
        c.a.b(this, str, str2);
    }

    public String B5(String str, String str2) {
        return c.a.c(this, str, str2);
    }

    @Override // kf.c
    public void J2(String str) {
        jo.p.h(str, "value");
        A5("cookie", str);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return c.a.a(this);
    }

    @Override // kf.c
    public String e0() {
        return B5("cookie", "{}");
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38718a;
    }

    @Override // kf.o
    public String z() {
        return this.f38719b;
    }
}
