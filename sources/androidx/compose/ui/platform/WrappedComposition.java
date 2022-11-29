package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.o;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrappedComposition implements l0.l, androidx.lifecycle.r {
    public io.p<? super l0.i, ? super Integer, wn.v> A;

    /* renamed from: w  reason: collision with root package name */
    public final AndroidComposeView f14356w;

    /* renamed from: x  reason: collision with root package name */
    public final l0.l f14357x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14358y;

    /* renamed from: z  reason: collision with root package name */
    public androidx.lifecycle.o f14359z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<AndroidComposeView.b, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f14361x;

        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0048a extends jo.q implements io.p<l0.i, Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ WrappedComposition f14362w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.p<l0.i, Integer, wn.v> f14363x;

            @co.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {153}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0049a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f14364w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ WrappedComposition f14365x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0049a(WrappedComposition wrappedComposition, ao.d<? super C0049a> dVar) {
                    super(2, dVar);
                    this.f14365x = wrappedComposition;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C0049a(this.f14365x, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C0049a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f14364w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        AndroidComposeView E = this.f14365x.E();
                        this.f14364w = 1;
                        if (E.h0(this) == c10) {
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

            @co.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", l = {154}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f14366w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ WrappedComposition f14367x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WrappedComposition wrappedComposition, ao.d<? super b> dVar) {
                    super(2, dVar);
                    this.f14367x = wrappedComposition;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new b(this.f14367x, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f14366w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        AndroidComposeView E = this.f14367x.E();
                        this.f14366w = 1;
                        if (E.P(this) == c10) {
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

            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$c */
            /* loaded from: classes.dex */
            public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ WrappedComposition f14368w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ io.p<l0.i, Integer, wn.v> f14369x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(WrappedComposition wrappedComposition, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
                    super(2);
                    this.f14368w = wrappedComposition;
                    this.f14369x = pVar;
                }

                public final void a(l0.i iVar, int i10) {
                    if ((i10 & 11) == 2 && iVar.j()) {
                        iVar.I();
                    } else {
                        z.a(this.f14368w.E(), this.f14369x, iVar, 8);
                    }
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                    a(iVar, num.intValue());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0048a(WrappedComposition wrappedComposition, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
                super(2);
                this.f14362w = wrappedComposition;
                this.f14363x = pVar;
            }

            public final void a(l0.i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                    return;
                }
                AndroidComposeView E = this.f14362w.E();
                int i11 = x0.h.K;
                Object tag = E.getTag(i11);
                Set<w0.a> set = jo.j0.m(tag) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.f14362w.E().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i11) : null;
                    set = jo.j0.m(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(iVar.z());
                    iVar.u();
                }
                l0.c0.c(this.f14362w.E(), new C0049a(this.f14362w, null), iVar, 8);
                l0.c0.c(this.f14362w.E(), new b(this.f14362w, null), iVar, 8);
                l0.r.a(new l0.d1[]{w0.c.a().c(set)}, s0.c.b(iVar, -1193460702, true, new c(this.f14362w, this.f14363x)), iVar, 56);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
                a(iVar, num.intValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super l0.i, ? super Integer, wn.v> pVar) {
            super(1);
            this.f14361x = pVar;
        }

        public final void a(AndroidComposeView.b bVar) {
            jo.p.h(bVar, "it");
            if (WrappedComposition.this.f14358y) {
                return;
            }
            androidx.lifecycle.o g10 = bVar.a().g();
            jo.p.g(g10, "it.lifecycleOwner.lifecycle");
            WrappedComposition.this.A = this.f14361x;
            if (WrappedComposition.this.f14359z == null) {
                WrappedComposition.this.f14359z = g10;
                g10.a(WrappedComposition.this);
            } else if (g10.b().a(o.c.CREATED)) {
                WrappedComposition.this.D().n(s0.c.c(-2000640158, true, new C0048a(WrappedComposition.this, this.f14361x)));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(AndroidComposeView.b bVar) {
            a(bVar);
            return wn.v.f59242a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, l0.l lVar) {
        jo.p.h(androidComposeView, "owner");
        jo.p.h(lVar, "original");
        this.f14356w = androidComposeView;
        this.f14357x = lVar;
        this.A = n0.f14530a.a();
    }

    public final l0.l D() {
        return this.f14357x;
    }

    public final AndroidComposeView E() {
        return this.f14356w;
    }

    @Override // l0.l
    public void dispose() {
        if (!this.f14358y) {
            this.f14358y = true;
            this.f14356w.getView().setTag(x0.h.L, null);
            androidx.lifecycle.o oVar = this.f14359z;
            if (oVar != null) {
                oVar.c(this);
            }
        }
        this.f14357x.dispose();
    }

    @Override // androidx.lifecycle.r
    public void i(androidx.lifecycle.u uVar, o.b bVar) {
        jo.p.h(uVar, "source");
        jo.p.h(bVar, "event");
        if (bVar == o.b.ON_DESTROY) {
            dispose();
        } else if (bVar != o.b.ON_CREATE || this.f14358y) {
        } else {
            n(this.A);
        }
    }

    @Override // l0.l
    public boolean j() {
        return this.f14357x.j();
    }

    @Override // l0.l
    public void n(io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "content");
        this.f14356w.setOnViewTreeOwnersAvailable(new a(pVar));
    }

    @Override // l0.l
    public boolean t() {
        return this.f14357x.t();
    }
}
