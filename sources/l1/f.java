package l1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import io.l;
import jo.p;
import jo.q;
import wn.v;
import x0.f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final r1.f<e> f39499a = r1.c.a(a.f39500w);

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<e> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f39500w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final e invoke() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f39501w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super(1);
            this.f39501w = lVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("onKeyEvent");
            c1Var.a().b("onKeyEvent", this.f39501w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f39502w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar) {
            super(1);
            this.f39502w = lVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("onPreviewKeyEvent");
            c1Var.a().b("onPreviewKeyEvent", this.f39502w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    public static final r1.f<e> a() {
        return f39499a;
    }

    public static final x0.f b(x0.f fVar, l<? super l1.b, Boolean> lVar) {
        p.h(fVar, "<this>");
        p.h(lVar, "onKeyEvent");
        l bVar = a1.c() ? new b(lVar) : a1.a();
        f.a aVar = x0.f.f59359u;
        return a1.b(fVar, bVar, new e(lVar, null));
    }

    public static final x0.f c(x0.f fVar, l<? super l1.b, Boolean> lVar) {
        p.h(fVar, "<this>");
        p.h(lVar, "onPreviewKeyEvent");
        l cVar = a1.c() ? new c(lVar) : a1.a();
        f.a aVar = x0.f.f59359u;
        return a1.b(fVar, cVar, new e(null, lVar));
    }
}
