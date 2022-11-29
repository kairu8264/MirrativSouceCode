package z0;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import wn.v;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f62402w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l lVar) {
            super(1);
            this.f62402w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("drawBehind");
            c1Var.a().b("onDraw", this.f62402w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f62403w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.l lVar) {
            super(1);
            this.f62403w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("drawWithCache");
            c1Var.a().b("onBuildDrawCache", this.f62403w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<z0.c, j> f62404w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super z0.c, j> lVar) {
            super(3);
            this.f62404w = lVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-1689569019);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = new z0.c();
                iVar.q(y10);
            }
            iVar.O();
            x0.f L = fVar.L(new g((z0.c) y10, this.f62404w));
            iVar.O();
            return L;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f62405w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.l lVar) {
            super(1);
            this.f62405w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("drawWithContent");
            c1Var.a().b("onDraw", this.f62405w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, io.l<? super e1.e, v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onDraw");
        return fVar.L(new e(lVar, a1.c() ? new a(lVar) : a1.a()));
    }

    public static final x0.f b(x0.f fVar, io.l<? super z0.c, j> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onBuildDrawCache");
        return x0.e.c(fVar, a1.c() ? new b(lVar) : a1.a(), new c(lVar));
    }

    public static final x0.f c(x0.f fVar, io.l<? super e1.c, v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onDraw");
        return fVar.L(new k(lVar, a1.c() ? new d(lVar) : a1.a()));
    }
}
