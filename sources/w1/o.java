package w1;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: y  reason: collision with root package name */
    public static final a f57927y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static AtomicInteger f57928z = new AtomicInteger(0);

    /* renamed from: w  reason: collision with root package name */
    public final int f57929w;

    /* renamed from: x  reason: collision with root package name */
    public final k f57930x;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return o.f57928z.addAndGet(1);
        }
    }

    public o(int i10, boolean z10, boolean z11, io.l<? super y, wn.v> lVar) {
        jo.p.h(lVar, "properties");
        this.f57929w = i10;
        k kVar = new k();
        kVar.w(z10);
        kVar.u(z11);
        lVar.invoke(kVar);
        this.f57930x = kVar;
    }

    @Override // w1.n
    public k a1() {
        return this.f57930x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getId() == oVar.getId() && jo.p.c(a1(), oVar.a1());
        }
        return false;
    }

    @Override // w1.n
    public int getId() {
        return this.f57929w;
    }

    public int hashCode() {
        return (a1().hashCode() * 31) + Integer.hashCode(getId());
    }
}
