package h6;

import h6.c;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final h f34544a;

    /* renamed from: b  reason: collision with root package name */
    public final i f34545b;

    public e(h hVar, i iVar) {
        this.f34544a = hVar;
        this.f34545b = iVar;
    }

    @Override // h6.c
    public void a(int i10) {
        this.f34544a.a(i10);
        this.f34545b.a(i10);
    }

    @Override // h6.c
    public c.C0436c b(c.b bVar) {
        c.C0436c b10 = this.f34544a.b(bVar);
        return b10 == null ? this.f34545b.b(bVar) : b10;
    }

    @Override // h6.c
    public void c(c.b bVar, c.C0436c c0436c) {
        this.f34544a.c(c.b.b(bVar, null, o6.c.b(bVar.c()), 1, null), c0436c.a(), o6.c.b(c0436c.b()));
    }
}
