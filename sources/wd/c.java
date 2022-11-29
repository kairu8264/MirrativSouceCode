package wd;

import co.l;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrorman.net.retrofit.MRClientLogRequest;
import ep.c0;
import ep.x;
import hf.e0;
import io.p;
import java.util.List;
import jo.f0;
import jo.q;
import oq.a;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.f;
import wn.g;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public abstract class c extends n8.b implements oq.a {
    public final f B;
    public final f C;

    @co.f(c = "com.dena.mirrorman.clientlog.plugins.OutBaseLogBuffer$emit$1", f = "OutBaseLogBuffer.kt", l = {37}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58651w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f58652x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c f58653y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ l8.a f58654z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, c cVar, l8.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f58652x = str;
            this.f58653y = cVar;
            this.f58654z = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f58652x, this.f58653y, this.f58654z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58651w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    c0 d10 = c0.f30798a.d(this.f58652x, x.f31036g.b("application/json; charset=utf-8"));
                    c cVar = this.f58653y;
                    MRClientLogRequest p10 = cVar.p();
                    this.f58651w = 1;
                    if (cVar.o(p10, d10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.f58654z.b();
            } catch (Throwable th2) {
                g9.a aVar = g9.a.f32826a;
                aVar.b("jsonString = " + this.f58652x + " error = " + th2.getMessage(), new Object[0]);
                this.f58654z.a();
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<e0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f58655w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f58656x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f58657y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f58655w = aVar;
            this.f58656x = aVar2;
            this.f58657y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.e0, java.lang.Object] */
        @Override // io.a
        public final e0 invoke() {
            xq.a b10;
            oq.a aVar = this.f58655w;
            vq.a aVar2 = this.f58656x;
            io.a<? extends uq.a> aVar3 = this.f58657y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(e0.class), aVar2, aVar3);
        }
    }

    /* renamed from: wd.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0979c extends q implements io.a<MRClientLogRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f58658w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f58659x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f58660y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0979c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f58658w = aVar;
            this.f58659x = aVar2;
            this.f58660y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRClientLogRequest, java.lang.Object] */
        @Override // io.a
        public final MRClientLogRequest invoke() {
            xq.a b10;
            oq.a aVar = this.f58658w;
            vq.a aVar2 = this.f58659x;
            io.a<? extends uq.a> aVar3 = this.f58660y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRClientLogRequest.class), aVar2, aVar3);
        }
    }

    public c() {
        cr.a aVar = cr.a.f28611a;
        this.B = g.b(aVar.b(), new b(this, null, null));
        this.C = g.b(aVar.b(), new C0979c(this, null, null));
    }

    @Override // n8.c
    public n8.a b(n8.a aVar) {
        jo.p.h(aVar, "conf");
        aVar.e(60000);
        aVar.f(1000);
        aVar.g(3);
        return aVar;
    }

    @Override // n8.b, n8.c
    public void d() {
        if (q().a()) {
            super.d();
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // n8.b
    public void j(List<String> list, l8.a aVar) {
        jo.p.h(list, "jsonLogs");
        jo.p.h(aVar, "result");
        if (list.isEmpty()) {
            return;
        }
        uo.l.d(r0.a(g1.c()), null, null, new a(list.toString(), this, aVar, null), 3, null);
    }

    public abstract Object o(MRClientLogRequest mRClientLogRequest, c0 c0Var, ao.d<? super StatusResponse> dVar);

    public final MRClientLogRequest p() {
        return (MRClientLogRequest) this.C.getValue();
    }

    public final e0 q() {
        return (e0) this.B.getValue();
    }
}
