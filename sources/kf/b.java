package kf;

import android.content.Context;
import android.content.SharedPreferences;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import kf.a;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38716a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38717b;

    public b(Context context) {
        jo.p.h(context, "context");
        this.f38716a = context;
        this.f38717b = "AppRaterPref";
    }

    @Override // kf.a
    public void A3(boolean z10) {
        C5("hasBeenRated", z10);
    }

    public void A5(String str, int i10) {
        a.C0546a.c(this, str, i10);
    }

    public void B5(String str, String str2) {
        a.C0546a.d(this, str, str2);
    }

    public void C5(String str, boolean z10) {
        a.C0546a.e(this, str, z10);
    }

    public int D5(String str, int i10) {
        return a.C0546a.f(this, str, i10);
    }

    public String E5(String str, String str2) {
        return a.C0546a.g(this, str, str2);
    }

    public boolean F5(String str, boolean z10) {
        return a.C0546a.h(this, str, z10);
    }

    @Override // kf.a
    public void G(int i10) {
        A5("satisfiedWithBroadcast", i10);
    }

    @Override // kf.a
    public void X0(String str) {
        jo.p.h(str, "value");
        B5("doneOn", str);
    }

    @Override // kf.a
    public boolean a0() {
        return F5("hasBeenRated", false);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return a.C0546a.b(this);
    }

    @Override // kf.o
    public void clear() {
        a.C0546a.a(this);
    }

    @Override // kf.a
    public boolean f0() {
        return F5("hasBeenRejected", false);
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38716a;
    }

    @Override // kf.a
    public int k4() {
        return D5("satisfiedWithBroadcast", 0);
    }

    @Override // kf.a
    public String t0() {
        return E5("doneOn", BuildConfig.VERSION_NAME);
    }

    @Override // kf.o
    public String z() {
        return this.f38717b;
    }
}
