package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.g;

/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38722a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38723b;

    public h(Context context) {
        jo.p.h(context, "context");
        this.f38722a = context;
        this.f38723b = "EmokaraPref";
    }

    public void A5(String str, String str2) {
        g.a.b(this, str, str2);
    }

    public String B5(String str, String str2) {
        return g.a.c(this, str, str2);
    }

    @Override // kf.g
    public void D4(String str) {
        jo.p.h(str, "value");
        A5("searchHistory", str);
    }

    @Override // kf.g
    public String M0() {
        return B5("searchHistory", "");
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return g.a.a(this);
    }

    @Override // kf.g
    public String b4() {
        return B5("songSetting", "");
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38722a;
    }

    @Override // kf.g
    public void x3(String str) {
        jo.p.h(str, "value");
        A5("songSetting", str);
    }

    @Override // kf.o
    public String z() {
        return this.f38723b;
    }
}
