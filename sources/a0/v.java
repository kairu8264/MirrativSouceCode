package a0;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v implements t, q1.d0 {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f237a;

    /* renamed from: b  reason: collision with root package name */
    public final int f238b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f239c;

    /* renamed from: d  reason: collision with root package name */
    public final float f240d;

    /* renamed from: e  reason: collision with root package name */
    public final List<i> f241e;

    /* renamed from: f  reason: collision with root package name */
    public final int f242f;

    /* renamed from: g  reason: collision with root package name */
    public final int f243g;

    /* renamed from: h  reason: collision with root package name */
    public final int f244h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f245i;

    /* renamed from: j  reason: collision with root package name */
    public final w.q f246j;

    /* renamed from: k  reason: collision with root package name */
    public final int f247k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q1.d0 f248l;

    /* JADX WARN: Multi-variable type inference failed */
    public v(i0 i0Var, int i10, boolean z10, float f10, q1.d0 d0Var, List<? extends i> list, int i11, int i12, int i13, boolean z11, w.q qVar, int i14) {
        jo.p.h(d0Var, "measureResult");
        jo.p.h(list, "visibleItemsInfo");
        jo.p.h(qVar, "orientation");
        this.f237a = i0Var;
        this.f238b = i10;
        this.f239c = z10;
        this.f240d = f10;
        this.f241e = list;
        this.f242f = i11;
        this.f243g = i12;
        this.f244h = i13;
        this.f245i = z11;
        this.f246j = qVar;
        this.f247k = i14;
        this.f248l = d0Var;
    }

    @Override // a0.t
    public int a() {
        return this.f244h;
    }

    @Override // a0.t
    public List<i> b() {
        return this.f241e;
    }

    @Override // q1.d0
    public void c() {
        this.f248l.c();
    }

    public final boolean d() {
        return this.f239c;
    }

    @Override // q1.d0
    public Map<q1.a, Integer> e() {
        return this.f248l.e();
    }

    public final float f() {
        return this.f240d;
    }

    public final i0 g() {
        return this.f237a;
    }

    @Override // q1.d0
    public int getHeight() {
        return this.f248l.getHeight();
    }

    @Override // q1.d0
    public int getWidth() {
        return this.f248l.getWidth();
    }

    public final int h() {
        return this.f238b;
    }
}
