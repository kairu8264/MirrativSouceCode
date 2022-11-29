package a7;

/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f598a;

    /* renamed from: b  reason: collision with root package name */
    public final z6.b f599b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.b f600c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.l f601d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f602e;

    public l(String str, z6.b bVar, z6.b bVar2, z6.l lVar, boolean z10) {
        this.f598a = str;
        this.f599b = bVar;
        this.f600c = bVar2;
        this.f601d = lVar;
        this.f602e = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.p(fVar, bVar, this);
    }

    public z6.b b() {
        return this.f599b;
    }

    public String c() {
        return this.f598a;
    }

    public z6.b d() {
        return this.f600c;
    }

    public z6.l e() {
        return this.f601d;
    }

    public boolean f() {
        return this.f602e;
    }
}
