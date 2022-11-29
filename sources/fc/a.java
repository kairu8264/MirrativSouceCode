package fc;

import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.retrofit.MRRequest;
import fc.b;
import hf.c;
import io.p;
import java.util.ArrayList;
import java.util.List;
import jf.w;
import uo.d2;
import uo.q0;
import wn.v;

/* loaded from: classes2.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f31896w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f31897x;

    /* renamed from: y  reason: collision with root package name */
    public final hf.c f31898y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ da.j f31899z;

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditActionCreator$fetchRankingFocusableEvents$1", f = "FloatingControlEditActionCreator.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: fc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0349a extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31900w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f31902y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0349a(String str, ao.d<? super C0349a> dVar) {
            super(2, dVar);
            this.f31902y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0349a(this.f31902y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0349a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31900w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f31897x;
                    String str = this.f31902y;
                    if (str == null) {
                        str = "";
                    }
                    this.f31900w = 1;
                    obj = mRRequest.getRankingFocusable(Referer.Broadcast.SETTING, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f31896w.a(new b.C0350b((RankingFocusableResponse) obj));
            } catch (Throwable unused) {
                a.this.f31896w.a(b.a.f31911a);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditActionCreator$search$1", f = "FloatingControlEditActionCreator.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31903w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f31905y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f31906z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f31905y = str;
            this.f31906z = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f31905y, this.f31906z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31903w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f31897x;
                    String str = this.f31905y;
                    String str2 = this.f31906z;
                    this.f31903w = 1;
                    obj = MRRequest.DefaultImpls.getAppSearch$default(mRRequest, str, str2, null, null, this, 8, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (App.AppParams appParams : ((App.Apps) obj).getApps()) {
                    arrayList.add(c.a.f35512h.a(appParams, a.this.f31898y.d(appParams.getAppId())));
                }
                a.this.f31896w.a(new b.d(arrayList));
            } catch (Throwable th2) {
                a.this.f31896w.a(new b.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditActionCreator$setRankingFocusedEvent$1", f = "FloatingControlEditActionCreator.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31907w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Integer f31909y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f31910z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer num, String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f31909y = num;
            this.f31910z = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f31909y, this.f31910z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31907w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f31897x;
                    Integer num = this.f31909y;
                    int intValue = num != null ? num.intValue() : 0;
                    String str = this.f31910z;
                    if (str == null) {
                        str = "";
                    }
                    this.f31907w = 1;
                    if (mRRequest.postRankingUpdateFocus(Referer.Broadcast.SETTING, intValue, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f31896w.a(new b.f(this.f31909y, this.f31910z));
            } catch (Throwable th2) {
                a.this.f31896w.a(new b.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest, hf.c cVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(cVar, "appManagementHelper");
        this.f31896w = aVar;
        this.f31897x = mRRequest;
        this.f31898y = cVar;
        this.f31899z = new da.j();
    }

    public final void d(String str) {
        uo.l.d(this, null, null, new C0349a(str, null), 3, null);
    }

    public final d2 e(String str, String str2) {
        d2 d10;
        jo.p.h(str, "referer");
        jo.p.h(str2, "text");
        d10 = uo.l.d(this, null, null, new b(str, str2, null), 3, null);
        return d10;
    }

    public final void f(c.a aVar) {
        if (aVar != null) {
            this.f31896w.a(new b.g(new w(aVar.d(), aVar.e(), aVar.g(), aVar.f())));
        } else {
            this.f31896w.a(new b.g(null));
        }
    }

    public final void g(w wVar) {
        this.f31896w.a(new b.g(wVar));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f31899z.getCoroutineContext();
    }

    public final void h(Integer num, String str) {
        uo.l.d(this, null, null, new c(num, str, null), 3, null);
    }

    public final void i(List<c.a> list) {
        jo.p.h(list, "items");
        this.f31896w.a(new b.d(list));
    }
}
