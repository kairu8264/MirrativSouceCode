package o6;

import k6.b;

/* loaded from: classes.dex */
public final class r extends o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f44113b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final s f44114a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public r(s sVar) {
        super(null);
        this.f44114a = sVar;
    }

    @Override // o6.o
    public boolean a(k6.h hVar) {
        k6.b b10 = hVar.b();
        if ((b10 instanceof b.C0535b ? ((b.C0535b) b10).f38438a : Integer.MAX_VALUE) > 100) {
            k6.b a10 = hVar.a();
            if ((a10 instanceof b.C0535b ? ((b.C0535b) a10).f38438a : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.o
    public boolean b() {
        return n.f44103a.b(this.f44114a);
    }
}
