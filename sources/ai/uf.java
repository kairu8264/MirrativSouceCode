package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class uf {

    /* renamed from: a  reason: collision with root package name */
    public final dg f10686a = new dg();

    /* renamed from: b  reason: collision with root package name */
    public final ve f10687b;

    /* renamed from: c  reason: collision with root package name */
    public bg f10688c;

    /* renamed from: d  reason: collision with root package name */
    public rf f10689d;

    /* renamed from: e  reason: collision with root package name */
    public int f10690e;

    /* renamed from: f  reason: collision with root package name */
    public int f10691f;

    /* renamed from: g  reason: collision with root package name */
    public int f10692g;

    /* renamed from: h  reason: collision with root package name */
    public ue f10693h;

    /* renamed from: i  reason: collision with root package name */
    public cg f10694i;

    public uf(ve veVar) {
        this.f10687b = veVar;
    }

    public final void a(bg bgVar, rf rfVar) {
        Objects.requireNonNull(bgVar);
        this.f10688c = bgVar;
        Objects.requireNonNull(rfVar);
        this.f10689d = rfVar;
        this.f10687b.a(bgVar.f2332f);
        b();
    }

    public final void b() {
        dg dgVar = this.f10686a;
        dgVar.f3266d = 0;
        dgVar.f3280r = 0L;
        dgVar.f3274l = false;
        dgVar.f3279q = false;
        dgVar.f3276n = null;
        this.f10690e = 0;
        this.f10692g = 0;
        this.f10691f = 0;
        this.f10693h = null;
        this.f10694i = null;
    }
}
