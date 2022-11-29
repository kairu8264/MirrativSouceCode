package br;

import jo.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18590a = new a();

    public static final <T> T a(Class<?> cls, vq.a aVar, io.a<? extends uq.a> aVar2) {
        p.h(cls, "clazz");
        return (T) c().b(ho.a.c(cls), aVar, aVar2);
    }

    public static /* synthetic */ Object b(Class cls, vq.a aVar, io.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        return a(cls, aVar, aVar2);
    }

    public static final nq.a c() {
        return cr.a.f28611a.a().get();
    }
}
