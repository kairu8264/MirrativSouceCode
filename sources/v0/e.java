package v0;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: g  reason: collision with root package name */
    public final h f56461g;

    /* renamed from: h  reason: collision with root package name */
    public final io.l<Object, wn.v> f56462h;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Object, wn.v> f56463w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Object, wn.v> f56464x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
            super(1);
            this.f56463w = lVar;
            this.f56464x = lVar2;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "state");
            this.f56463w.invoke(obj);
            this.f56464x.invoke(obj);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, k kVar, io.l<Object, wn.v> lVar, h hVar) {
        super(i10, kVar, null);
        jo.p.h(kVar, "invalid");
        jo.p.h(hVar, "parent");
        this.f56461g = hVar;
        hVar.l(this);
        if (lVar != null) {
            io.l<Object, wn.v> h10 = hVar.h();
            if (h10 != null) {
                lVar = new a(lVar, h10);
            }
        } else {
            lVar = hVar.h();
        }
        this.f56462h = lVar;
    }

    @Override // v0.h
    /* renamed from: A */
    public Void o(c0 c0Var) {
        jo.p.h(c0Var, "state");
        m.R();
        throw new KotlinNothingValueException();
    }

    @Override // v0.h
    /* renamed from: B */
    public e v(io.l<Object, wn.v> lVar) {
        return new e(f(), g(), lVar, this.f56461g);
    }

    @Override // v0.h
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.f56461g.f()) {
            b();
        }
        this.f56461g.m(this);
        super.d();
    }

    @Override // v0.h
    public io.l<Object, wn.v> h() {
        return this.f56462h;
    }

    @Override // v0.h
    public boolean i() {
        return true;
    }

    @Override // v0.h
    public io.l<Object, wn.v> j() {
        return null;
    }

    @Override // v0.h
    public void n() {
    }

    @Override // v0.h
    /* renamed from: y */
    public Void l(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.h
    /* renamed from: z */
    public Void m(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }
}
