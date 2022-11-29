package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.e;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38720a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38721b;

    public f(Context context) {
        jo.p.h(context, "context");
        this.f38720a = context;
        this.f38721b = "DebugPref";
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return e.a.a(this);
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38720a;
    }

    @Override // kf.o
    public String z() {
        return this.f38721b;
    }
}
