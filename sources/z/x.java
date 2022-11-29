package z;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements v, q1.d0 {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f62377a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62378b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62379c;

    /* renamed from: d  reason: collision with root package name */
    public final float f62380d;

    /* renamed from: e  reason: collision with root package name */
    public final List<n> f62381e;

    /* renamed from: f  reason: collision with root package name */
    public final int f62382f;

    /* renamed from: g  reason: collision with root package name */
    public final int f62383g;

    /* renamed from: h  reason: collision with root package name */
    public final int f62384h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f62385i;

    /* renamed from: j  reason: collision with root package name */
    public final w.q f62386j;

    /* renamed from: k  reason: collision with root package name */
    public final int f62387k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q1.d0 f62388l;

    /* JADX WARN: Multi-variable type inference failed */
    public x(i0 i0Var, int i10, boolean z10, float f10, q1.d0 d0Var, List<? extends n> list, int i11, int i12, int i13, boolean z11, w.q qVar, int i14) {
        jo.p.h(d0Var, "measureResult");
        jo.p.h(list, "visibleItemsInfo");
        jo.p.h(qVar, "orientation");
        this.f62377a = i0Var;
        this.f62378b = i10;
        this.f62379c = z10;
        this.f62380d = f10;
        this.f62381e = list;
        this.f62382f = i11;
        this.f62383g = i12;
        this.f62384h = i13;
        this.f62385i = z11;
        this.f62386j = qVar;
        this.f62387k = i14;
        this.f62388l = d0Var;
    }

    @Override // z.v
    public int a() {
        return this.f62384h;
    }

    @Override // z.v
    public List<n> b() {
        return this.f62381e;
    }

    @Override // q1.d0
    public void c() {
        this.f62388l.c();
    }

    @Override // z.v
    public int d() {
        return this.f62383g;
    }

    @Override // q1.d0
    public Map<q1.a, Integer> e() {
        return this.f62388l.e();
    }

    public final boolean f() {
        return this.f62379c;
    }

    public final float g() {
        return this.f62380d;
    }

    @Override // q1.d0
    public int getHeight() {
        return this.f62388l.getHeight();
    }

    @Override // q1.d0
    public int getWidth() {
        return this.f62388l.getWidth();
    }

    public final i0 h() {
        return this.f62377a;
    }

    public final int i() {
        return this.f62378b;
    }
}
