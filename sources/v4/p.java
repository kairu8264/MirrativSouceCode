package v4;

import z4.h;

/* loaded from: classes.dex */
public final class p implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f56647a;

    /* renamed from: b  reason: collision with root package name */
    public final a f56648b;

    public p(h.c cVar, a aVar) {
        this.f56647a = cVar;
        this.f56648b = aVar;
    }

    @Override // z4.h.c
    /* renamed from: b */
    public l a(h.b bVar) {
        return new l(this.f56647a.a(bVar), this.f56648b);
    }
}
