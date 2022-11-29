package ai;

/* loaded from: classes3.dex */
public final class qi {

    /* renamed from: a  reason: collision with root package name */
    public final ci f8962a;

    /* renamed from: b  reason: collision with root package name */
    public final ni f8963b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8964c;

    /* renamed from: d  reason: collision with root package name */
    public final tc[] f8965d;

    public qi(ci ciVar, ni niVar, Object obj, tc[] tcVarArr) {
        this.f8962a = ciVar;
        this.f8963b = niVar;
        this.f8964c = obj;
        this.f8965d = tcVarArr;
    }

    public final boolean a(qi qiVar, int i10) {
        return qiVar != null && vj.a(this.f8963b.a(i10), qiVar.f8963b.a(i10)) && vj.a(this.f8965d[i10], qiVar.f8965d[i10]);
    }
}
