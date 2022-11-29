package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;

/* loaded from: classes.dex */
public class d0 implements y4.e, v0 {

    /* renamed from: w  reason: collision with root package name */
    public final Fragment f15319w;

    /* renamed from: x  reason: collision with root package name */
    public final u0 f15320x;

    /* renamed from: y  reason: collision with root package name */
    public androidx.lifecycle.w f15321y = null;

    /* renamed from: z  reason: collision with root package name */
    public y4.d f15322z = null;

    public d0(Fragment fragment, u0 u0Var) {
        this.f15319w = fragment;
        this.f15320x = u0Var;
    }

    @Override // androidx.lifecycle.v0
    public u0 U() {
        b();
        return this.f15320x;
    }

    public void a(o.b bVar) {
        this.f15321y.h(bVar);
    }

    @Override // y4.e
    public y4.c a0() {
        b();
        return this.f15322z.b();
    }

    public void b() {
        if (this.f15321y == null) {
            this.f15321y = new androidx.lifecycle.w(this);
            this.f15322z = y4.d.a(this);
        }
    }

    public boolean c() {
        return this.f15321y != null;
    }

    public void d(Bundle bundle) {
        this.f15322z.d(bundle);
    }

    public void e(Bundle bundle) {
        this.f15322z.e(bundle);
    }

    public void f(o.c cVar) {
        this.f15321y.o(cVar);
    }

    @Override // androidx.lifecycle.u
    public androidx.lifecycle.o g() {
        b();
        return this.f15321y;
    }
}
