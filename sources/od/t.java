package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pd.z;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class t extends androidx.lifecycle.q0 implements uo.q0 {
    public uo.b0 A;
    public final ao.g B;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f45230y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f45231z;

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveAppSettingActionCreator$deleteAppDetailId$1", f = "LiveAppSettingActionCreator.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45232w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45234y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45234y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45234y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45232w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t.this.f45231z;
                    String str = this.f45234y;
                    this.f45232w = 1;
                    if (mRRequest.deleteAppUserDetail(Referer.Broadcast.SETTING, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t.this.f45230y.a(new z.h(this.f45234y));
            } catch (Throwable th2) {
                t.this.f45230y.a(new z.g(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveAppSettingActionCreator$loadNextApp$1", f = "LiveAppSettingActionCreator.kt", l = {89}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f45235w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45237y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f45238z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45237y = str;
            this.f45238z = i10;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45237y, this.f45238z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45235w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t.this.f45231z;
                    String str = this.f45237y;
                    Integer d10 = co.b.d(this.f45238z);
                    this.f45235w = 1;
                    obj = mRRequest.getAppSearch(Referer.Broadcast.SETTING, str, null, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                App.Apps apps = (App.Apps) obj;
                q8.a aVar = t.this.f45230y;
                List<App.AppParams> apps2 = apps.getApps();
                String str2 = this.A;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : apps2) {
                    if (!jo.p.c(((App.AppParams) obj2).getAppId(), str2)) {
                        arrayList.add(obj2);
                    }
                }
                aVar.a(new z.c(arrayList, apps.getNextPage()));
            } catch (Throwable th2) {
                t.this.f45230y.a(new z.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveAppSettingActionCreator$postAppUserDetail$1", f = "LiveAppSettingActionCreator.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f45239w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45241y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jf.a f45242z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, jf.a aVar, String str2, boolean z10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45241y = str;
            this.f45242z = aVar;
            this.A = str2;
            this.B = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45241y, this.f45242z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45239w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t.this.f45231z;
                    String str = this.f45241y;
                    int c11 = this.f45242z.c();
                    String str2 = this.A;
                    int i11 = this.B ? 1 : 0;
                    this.f45239w = 1;
                    obj = mRRequest.postAppUserDetail(Referer.Broadcast.SETTING, str, c11, str2, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t.this.f45230y.a(new z.l(this.f45241y, (AppUserDetailResponse) obj));
            } catch (Throwable th2) {
                t.this.f45230y.a(new z.k(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveAppSettingActionCreator$publishAppUserDetail$1", f = "LiveAppSettingActionCreator.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public int f45243w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45245y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jf.a f45246z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, jf.a aVar, boolean z10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f45245y = str;
            this.f45246z = aVar;
            this.A = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f45245y, this.f45246z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45243w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = t.this.f45231z;
                    String str = this.f45245y;
                    int c11 = this.f45246z.c();
                    int i11 = this.A ? 1 : 0;
                    this.f45243w = 1;
                    obj = mRRequest.publishAppUserDetail(Referer.Broadcast.SETTING, str, c11, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t.this.f45230y.a(new z.n(this.f45245y, (AppUserDetailResponse) obj));
            } catch (Throwable th2) {
                t.this.f45230y.a(new z.m(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveAppSettingActionCreator$reloadApp$1", f = "LiveAppSettingActionCreator.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public Object f45247w;

        /* renamed from: x  reason: collision with root package name */
        public int f45248x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45250z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f45250z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f45250z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            List list;
            Object obj2;
            Object c10 = bo.c.c();
            int i10 = this.f45248x;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    ArrayList arrayList = new ArrayList();
                    MRRequest mRRequest = t.this.f45231z;
                    String str = this.f45250z;
                    String str2 = this.A;
                    this.f45247w = arrayList;
                    this.f45248x = 1;
                    Object appSearch$default = MRRequest.DefaultImpls.getAppSearch$default(mRRequest, Referer.Broadcast.SETTING, str, str2, null, this, 8, null);
                    if (appSearch$default == c10) {
                        return c10;
                    }
                    list = arrayList;
                    obj = appSearch$default;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) this.f45247w;
                    wn.m.b(obj);
                }
                App.Apps apps = (App.Apps) obj;
                list.addAll(apps.getApps());
                String str3 = this.A;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jo.p.c(((App.AppParams) obj2).getAppId(), str3)) {
                        break;
                    }
                }
                t.this.f45230y.a(new z.e(list, (App.AppParams) obj2, apps.getNextPage()));
            } catch (Throwable th2) {
                t.this.f45230y.a(new z.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public t(q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45230y = aVar;
        this.f45231z = mRRequest;
        b10 = i2.b(null, 1, null);
        this.A = b10;
        this.B = g1.b().plus(this.A);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B;
    }

    public final void h(String str) {
        jo.p.h(str, "appId");
        uo.l.d(uo.r0.a(g1.b()), null, null, new a(str, null), 3, null);
    }

    public final void i(String str, int i10, String str2) {
        jo.p.h(str, "q");
        this.f45230y.a(z.b.f47362a);
        uo.l.d(this, null, null, new b(str, i10, str2, null), 3, null);
    }

    public final void j(String str, jf.a aVar, String str2, boolean z10) {
        jo.p.h(str, "appId");
        jo.p.h(aVar, "appUserDetailType");
        jo.p.h(str2, "value");
        this.f45230y.a(z.o.f47378a);
        uo.l.d(this, null, null, new c(str, aVar, str2, z10, null), 3, null);
    }

    public final void k(String str, jf.a aVar, boolean z10) {
        jo.p.h(str, "appId");
        jo.p.h(aVar, "appUserDetailType");
        uo.l.d(this, null, null, new d(str, aVar, z10, null), 3, null);
    }

    public final void l(String str, String str2) {
        jo.p.h(str, "searchText");
        this.f45230y.a(new z.d(str2));
        uo.l.d(this, null, null, new e(str, str2, null), 3, null);
    }

    public final void m(App.AppParams appParams) {
        this.f45230y.a(new z.f(appParams));
    }
}
