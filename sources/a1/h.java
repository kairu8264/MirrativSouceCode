package a1;

import a1.c;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final j f313a;

    /* renamed from: b  reason: collision with root package name */
    public final x0.f f314b;

    /* renamed from: c  reason: collision with root package name */
    public m2.q f315c;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f316a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.Active.ordinal()] = 1;
            iArr[y.ActiveParent.ordinal()] = 2;
            iArr[y.Captured.ordinal()] = 3;
            iArr[y.Deactivated.ordinal()] = 4;
            iArr[y.DeactivatedParent.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f316a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<j, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f317w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(1);
            this.f317w = jVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(j jVar) {
            jo.p.h(jVar, "destination");
            if (jo.p.c(jVar, this.f317w)) {
                return Boolean.FALSE;
            }
            if (jVar.s() != null) {
                z.h(jVar);
                return Boolean.TRUE;
            }
            throw new IllegalStateException("Move focus landed at the root.".toString());
        }
    }

    public h(j jVar) {
        jo.p.h(jVar, "focusModifier");
        this.f313a = jVar;
        this.f314b = k.b(x0.f.f59359u, jVar);
    }

    @Override // a1.g
    public boolean a(int i10) {
        j b10 = a0.b(this.f313a);
        if (b10 == null) {
            return false;
        }
        t a10 = n.a(b10, i10, f());
        if (jo.p.c(a10, t.f348b.a())) {
            return a0.f(this.f313a, i10, f(), new b(b10)) || k(i10);
        }
        a10.c();
        return true;
    }

    @Override // a1.g
    public void c(boolean z10) {
        y yVar;
        y l10 = this.f313a.l();
        if (z.c(this.f313a, z10)) {
            j jVar = this.f313a;
            switch (a.f316a[l10.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    yVar = y.Active;
                    break;
                case 4:
                case 5:
                    yVar = y.Deactivated;
                    break;
                case 6:
                    yVar = y.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            jVar.y(yVar);
        }
    }

    public final void d() {
        i.d(this.f313a);
    }

    public final j e() {
        j c10;
        c10 = i.c(this.f313a);
        return c10;
    }

    public final m2.q f() {
        m2.q qVar = this.f315c;
        if (qVar != null) {
            return qVar;
        }
        jo.p.v("layoutDirection");
        return null;
    }

    public final x0.f g() {
        return this.f314b;
    }

    public final void h() {
        z.c(this.f313a, true);
    }

    public final void i(m2.q qVar) {
        jo.p.h(qVar, "<set-?>");
        this.f315c = qVar;
    }

    public final void j() {
        if (this.f313a.l() == y.Inactive) {
            this.f313a.y(y.Active);
        }
    }

    public final boolean k(int i10) {
        if (this.f313a.l().e() && !this.f313a.l().a()) {
            c.a aVar = c.f288b;
            if (c.l(i10, aVar.d()) ? true : c.l(i10, aVar.f())) {
                c(false);
                if (this.f313a.l().a()) {
                    return a(i10);
                }
                return false;
            }
        }
        return false;
    }

    public /* synthetic */ h(j jVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new j(y.Inactive, null, 2, null) : jVar);
    }
}
