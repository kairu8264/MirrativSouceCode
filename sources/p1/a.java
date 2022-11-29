package p1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import i7.e;
import io.l;
import jo.p;
import jo.q;
import r1.f;
import wn.v;
import x0.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final f<k1.b<p1.b>> f45681a = r1.c.a(C0690a.f45682w);

    /* renamed from: p1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0690a extends q implements io.a<k1.b<p1.b>> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0690a f45682w = new C0690a();

        public C0690a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final k1.b<p1.b> invoke() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<k1.a, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<p1.b, Boolean> f45683w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super p1.b, Boolean> lVar) {
            super(1);
            this.f45683w = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(k1.a aVar) {
            p.h(aVar, e.f36387u);
            if (aVar instanceof p1.b) {
                return this.f45683w.invoke(aVar);
            }
            throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f45684w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar) {
            super(1);
            this.f45684w = lVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("onRotaryScrollEvent");
            c1Var.a().b("onRotaryScrollEvent", this.f45684w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    public static final l<k1.a, Boolean> a(l<? super p1.b, Boolean> lVar) {
        return new b(lVar);
    }

    public static final f<k1.b<p1.b>> b() {
        return f45681a;
    }

    public static final x0.f c(x0.f fVar, l<? super p1.b, Boolean> lVar) {
        p.h(fVar, "<this>");
        p.h(lVar, "onRotaryScrollEvent");
        l cVar = a1.c() ? new c(lVar) : a1.a();
        f.a aVar = x0.f.f59359u;
        return a1.b(fVar, cVar, new k1.b(a(lVar), null, f45681a));
    }
}
