package com.google.protobuf;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: e  reason: collision with root package name */
    public static final l f28223e = l.b();

    /* renamed from: a  reason: collision with root package name */
    public f f28224a;

    /* renamed from: b  reason: collision with root package name */
    public l f28225b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d0 f28226c;

    /* renamed from: d  reason: collision with root package name */
    public volatile f f28227d;

    public void a(d0 d0Var) {
        if (this.f28226c != null) {
            return;
        }
        synchronized (this) {
            if (this.f28226c != null) {
                return;
            }
            try {
                if (this.f28224a != null) {
                    this.f28226c = d0Var.q().a(this.f28224a, this.f28225b);
                    this.f28227d = this.f28224a;
                } else {
                    this.f28226c = d0Var;
                    this.f28227d = f.f28094x;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f28226c = d0Var;
                this.f28227d = f.f28094x;
            }
        }
    }

    public int b() {
        if (this.f28227d != null) {
            return this.f28227d.size();
        }
        f fVar = this.f28224a;
        if (fVar != null) {
            return fVar.size();
        }
        if (this.f28226c != null) {
            return this.f28226c.h();
        }
        return 0;
    }

    public d0 c(d0 d0Var) {
        a(d0Var);
        return this.f28226c;
    }

    public d0 d(d0 d0Var) {
        d0 d0Var2 = this.f28226c;
        this.f28224a = null;
        this.f28227d = null;
        this.f28226c = d0Var;
        return d0Var2;
    }

    public f e() {
        if (this.f28227d != null) {
            return this.f28227d;
        }
        f fVar = this.f28224a;
        if (fVar != null) {
            return fVar;
        }
        synchronized (this) {
            if (this.f28227d != null) {
                return this.f28227d;
            }
            if (this.f28226c == null) {
                this.f28227d = f.f28094x;
            } else {
                this.f28227d = this.f28226c.e();
            }
            return this.f28227d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            d0 d0Var = this.f28226c;
            d0 d0Var2 = vVar.f28226c;
            if (d0Var == null && d0Var2 == null) {
                return e().equals(vVar.e());
            }
            if (d0Var == null || d0Var2 == null) {
                if (d0Var != null) {
                    return d0Var.equals(vVar.c(d0Var.k()));
                }
                return c(d0Var2.k()).equals(d0Var2);
            }
            return d0Var.equals(d0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
