package rp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class m extends i0 {

    /* renamed from: f  reason: collision with root package name */
    public i0 f51716f;

    public m(i0 i0Var) {
        jo.p.h(i0Var, "delegate");
        this.f51716f = i0Var;
    }

    @Override // rp.i0
    public i0 a() {
        return this.f51716f.a();
    }

    @Override // rp.i0
    public i0 b() {
        return this.f51716f.b();
    }

    @Override // rp.i0
    public long c() {
        return this.f51716f.c();
    }

    @Override // rp.i0
    public i0 d(long j10) {
        return this.f51716f.d(j10);
    }

    @Override // rp.i0
    public boolean e() {
        return this.f51716f.e();
    }

    @Override // rp.i0
    public void f() throws IOException {
        this.f51716f.f();
    }

    @Override // rp.i0
    public i0 g(long j10, TimeUnit timeUnit) {
        jo.p.h(timeUnit, "unit");
        return this.f51716f.g(j10, timeUnit);
    }

    public final i0 i() {
        return this.f51716f;
    }

    public final m j(i0 i0Var) {
        jo.p.h(i0Var, "delegate");
        this.f51716f = i0Var;
        return this;
    }
}
