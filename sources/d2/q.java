package d2;

import d2.o0;
import java.util.List;
import uo.b3;
import uo.d2;
import uo.l0;
import uo.q0;
import uo.r0;
import uo.s0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final a f29128c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final t f29129d = new t();

    /* renamed from: e  reason: collision with root package name */
    public static final uo.l0 f29130e = new c(uo.l0.f56050r);

    /* renamed from: a  reason: collision with root package name */
    public final h f29131a;

    /* renamed from: b  reason: collision with root package name */
    public q0 f29132b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f29133w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g f29134x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f29134x = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f29134x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f29133w;
            if (i10 == 0) {
                wn.m.b(obj);
                g gVar = this.f29134x;
                this.f29133w = 1;
                if (gVar.k(this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ao.a implements uo.l0 {
        public c(l0.a aVar) {
            super(aVar);
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
        }
    }

    public q(h hVar, ao.g gVar) {
        jo.p.h(hVar, "asyncTypefaceCache");
        jo.p.h(gVar, "injectedContext");
        this.f29131a = hVar;
        this.f29132b = r0.a(f29130e.plus(gVar).plus(b3.a((d2) gVar.get(d2.f56001s))));
    }

    public o0 a(m0 m0Var, b0 b0Var, io.l<? super o0.b, wn.v> lVar, io.l<? super m0, ? extends Object> lVar2) {
        wn.k b10;
        jo.p.h(m0Var, "typefaceRequest");
        jo.p.h(b0Var, "platformFontLoader");
        jo.p.h(lVar, "onAsyncCompletion");
        jo.p.h(lVar2, "createDefaultTypeface");
        if (m0Var.c() instanceof p) {
            b10 = r.b(f29129d.a(((p) m0Var.c()).j(), m0Var.f(), m0Var.d()), m0Var, this.f29131a, b0Var, lVar2);
            List list = (List) b10.a();
            Object b11 = b10.b();
            if (list == null) {
                return new o0.b(b11, false, 2, null);
            }
            g gVar = new g(list, b11, m0Var, this.f29131a, lVar, b0Var);
            uo.l.d(this.f29132b, null, s0.UNDISPATCHED, new b(gVar, null), 1, null);
            return new o0.a(gVar);
        }
        return null;
    }

    public /* synthetic */ q(h hVar, ao.g gVar, int i10, jo.h hVar2) {
        this((i10 & 1) != 0 ? new h() : hVar, (i10 & 2) != 0 ? ao.h.f16651w : gVar);
    }
}
