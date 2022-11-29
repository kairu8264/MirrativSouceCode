package coil.request;

import androidx.lifecycle.o;
import androidx.lifecycle.u;
import uo.d2;

/* loaded from: classes.dex */
public final class BaseRequestDelegate extends RequestDelegate {

    /* renamed from: w  reason: collision with root package name */
    public final o f20021w;

    /* renamed from: x  reason: collision with root package name */
    public final d2 f20022x;

    public BaseRequestDelegate(o oVar, d2 d2Var) {
        super(null);
        this.f20021w = oVar;
        this.f20022x = d2Var;
    }

    @Override // coil.request.RequestDelegate
    public void e() {
        this.f20021w.c(this);
    }

    @Override // androidx.lifecycle.h, androidx.lifecycle.m
    public void g(u uVar) {
        k();
    }

    @Override // coil.request.RequestDelegate
    public void j() {
        this.f20021w.a(this);
    }

    public void k() {
        d2.a.a(this.f20022x, null, 1, null);
    }
}
