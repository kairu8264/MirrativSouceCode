package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.t0;

/* loaded from: classes.dex */
public abstract class a extends t0.c {

    /* renamed from: a  reason: collision with root package name */
    public final y4.c f15500a;

    /* renamed from: b  reason: collision with root package name */
    public final o f15501b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f15502c;

    public a(y4.e eVar, Bundle bundle) {
        this.f15500a = eVar.a0();
        this.f15501b = eVar.g();
        this.f15502c = bundle;
    }

    @Override // androidx.lifecycle.t0.c, androidx.lifecycle.t0.b
    public final <T extends q0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.t0.e
    public void b(q0 q0Var) {
        SavedStateHandleController.a(q0Var, this.f15500a, this.f15501b);
    }

    @Override // androidx.lifecycle.t0.c
    public final <T extends q0> T c(String str, Class<T> cls) {
        SavedStateHandleController j10 = SavedStateHandleController.j(this.f15500a, this.f15501b, str, this.f15502c);
        T t10 = (T) d(str, cls, j10.k());
        t10.e("androidx.lifecycle.savedstate.vm.tag", j10);
        return t10;
    }

    public abstract <T extends q0> T d(String str, Class<T> cls, l0 l0Var);
}
