package f0;

/* loaded from: classes.dex */
public final class i0 {

    @co.f(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31491w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f31492x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0 f31493y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f31493y = e0Var;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f31493y, dVar);
            aVar.f31492x = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31491w;
            if (i10 == 0) {
                wn.m.b(obj);
                e0 e0Var = this.f31493y;
                this.f31491w = 1;
                if (w.d((n1.e0) this.f31492x, e0Var, this) == c10) {
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

    @co.f(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", f = "TextFieldGestureModifiers.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31494w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f31495x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0.g f31496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g0.g gVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f31496y = gVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f31496y, dVar);
            bVar.f31495x = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31494w;
            if (i10 == 0) {
                wn.m.b(obj);
                g0.g gVar = this.f31496y;
                this.f31494w = 1;
                if (g0.c0.c((n1.e0) this.f31495x, gVar, this) == c10) {
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

    public static final x0.f a(x0.f fVar, e0 e0Var, boolean z10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(e0Var, "observer");
        return z10 ? n1.o0.b(fVar, e0Var, new a(e0Var, null)) : fVar;
    }

    public static final x0.f b(x0.f fVar, g0.g gVar, boolean z10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(gVar, "observer");
        return z10 ? n1.o0.b(x0.f.f59359u, gVar, new b(gVar, null)) : fVar;
    }

    public static final x0.f c(x0.f fVar, boolean z10, a1.t tVar, x.m mVar, io.l<? super a1.x, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(tVar, "focusRequester");
        jo.p.h(lVar, "onFocusChanged");
        return v.r.c(a1.b.a(a1.v.a(fVar, tVar), lVar), z10, mVar);
    }
}
