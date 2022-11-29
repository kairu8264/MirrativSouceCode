package w;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class o implements s, r {

    /* renamed from: a  reason: collision with root package name */
    public final l f57835a;

    /* renamed from: b  reason: collision with root package name */
    public j f57836b;

    @co.f(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", l = {478}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<j, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57837w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57838x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<r, ao.d<? super wn.v>, Object> f57840z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.p<? super r, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f57840z = pVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(j jVar, ao.d<? super wn.v> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f57840z, dVar);
            aVar.f57838x = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57837w;
            if (i10 == 0) {
                wn.m.b(obj);
                o.this.c((j) this.f57838x);
                io.p<r, ao.d<? super wn.v>, Object> pVar = this.f57840z;
                o oVar = o.this;
                this.f57837w = 1;
                if (pVar.invoke(oVar, this) == c10) {
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

    public o(l lVar) {
        jo.p.h(lVar, TtmlNode.ATTR_TTS_ORIGIN);
        this.f57835a = lVar;
    }

    @Override // w.s
    public Object a(v.d0 d0Var, io.p<? super r, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        Object a10 = this.f57835a.a(d0Var, new a(pVar, null), dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    @Override // w.r
    public void b(float f10, long j10) {
        j jVar = this.f57836b;
        if (jVar != null) {
            jVar.a(f10);
        }
    }

    public final void c(j jVar) {
        this.f57836b = jVar;
    }
}
