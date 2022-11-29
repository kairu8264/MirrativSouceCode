package kn;

import in.p;
import in.x;
import java.io.IOException;

/* loaded from: classes4.dex */
public class k implements h<x> {

    /* renamed from: a  reason: collision with root package name */
    public final a f38907a;

    /* loaded from: classes4.dex */
    public static class a {
        public on.a a(x xVar) {
            return new p(xVar).d();
        }
    }

    public k() {
        this(new a());
    }

    @Override // kn.h
    /* renamed from: b */
    public void a(x xVar) {
        on.a a10 = this.f38907a.a(xVar);
        try {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            a10.a(bool, bool2, bool2).d();
        } catch (IOException | RuntimeException unused) {
        }
    }

    public k(a aVar) {
        this.f38907a = aVar;
    }
}
