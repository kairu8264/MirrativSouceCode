package lg;

/* loaded from: classes3.dex */
public final class n0 implements fg.b<m0> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<ng.a> f40181a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<ng.a> f40182b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<e> f40183c;

    /* renamed from: d  reason: collision with root package name */
    public final rn.a<t0> f40184d;

    /* renamed from: e  reason: collision with root package name */
    public final rn.a<String> f40185e;

    public n0(rn.a<ng.a> aVar, rn.a<ng.a> aVar2, rn.a<e> aVar3, rn.a<t0> aVar4, rn.a<String> aVar5) {
        this.f40181a = aVar;
        this.f40182b = aVar2;
        this.f40183c = aVar3;
        this.f40184d = aVar4;
        this.f40185e = aVar5;
    }

    public static n0 a(rn.a<ng.a> aVar, rn.a<ng.a> aVar2, rn.a<e> aVar3, rn.a<t0> aVar4, rn.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(ng.a aVar, ng.a aVar2, Object obj, Object obj2, eg.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // rn.a
    /* renamed from: b */
    public m0 get() {
        return c(this.f40181a.get(), this.f40182b.get(), this.f40183c.get(), this.f40184d.get(), fg.a.a(this.f40185e));
    }
}
