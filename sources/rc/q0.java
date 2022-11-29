package rc;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.ChooseReceiver;
import com.dena.mirrorman.clientlog.logs.Archive;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.LiveArchiveStatus;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncement;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import ie.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;
import org.json.JSONObject;
import pc.e2;
import ud.a2;
import ud.f2;
import ud.n2;
import ud.o2;

/* loaded from: classes2.dex */
public final class q0 extends Fragment implements f.b, uo.q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final AutoClearedValue E0;
    public final ud.z1 F0;
    public final wn.f G0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f50870x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f50871y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f50872z0;
    public static final /* synthetic */ qo.h<Object>[] I0 = {jo.f0.d(new jo.s(q0.class, "binding", "getBinding()Lcom/dena/mirrativ/user/databinding/FragmentLiveHistoriesBinding;", 0))};
    public static final a H0 = new a(null);
    public static final int J0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q0 a() {
            return new q0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<u1> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<kq.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Fragment f50874w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Fragment fragment) {
                super(0);
                this.f50874w = fragment;
            }

            @Override // io.a
            /* renamed from: a */
            public final kq.a invoke() {
                a.C0552a c0552a = kq.a.f38937c;
                Fragment fragment = this.f50874w;
                return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
            }
        }

        /* renamed from: rc.q0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0779b extends jo.q implements io.a<androidx.lifecycle.v0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a f50875w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0779b(io.a aVar) {
                super(0);
                this.f50875w = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final androidx.lifecycle.v0 invoke() {
                return ((kq.a) this.f50875w.invoke()).b();
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends jo.q implements io.a<t0.b> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a f50876w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ vq.a f50877x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a f50878y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ xq.a f50879z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
                super(0);
                this.f50876w = aVar;
                this.f50877x = aVar2;
                this.f50878y = aVar3;
                this.f50879z = aVar4;
            }

            @Override // io.a
            /* renamed from: a */
            public final t0.b invoke() {
                io.a aVar = this.f50876w;
                vq.a aVar2 = this.f50877x;
                io.a aVar3 = this.f50878y;
                xq.a aVar4 = this.f50879z;
                kq.a aVar5 = (kq.a) aVar.invoke();
                return kq.c.a(aVar4, new kq.b(jo.f0.b(u1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends jo.q implements io.a<androidx.lifecycle.u0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a f50880w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(io.a aVar) {
                super(0);
                this.f50880w = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final androidx.lifecycle.u0 invoke() {
                androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50880w.invoke()).U();
                jo.p.g(U, "ownerProducer().viewModelStore");
                return U;
            }
        }

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final u1 invoke() {
            Fragment P2 = q0.this.P2();
            jo.p.g(P2, "requireParentFragment()");
            a aVar = new a(P2);
            xq.a a10 = gq.a.a(P2);
            C0779b c0779b = new C0779b(aVar);
            return (u1) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(P2, jo.f0.b(u1.class), new d(c0779b), new c(aVar, null, null, a10)).getValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return q0.this.O3().T4();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyLiveHistoriesFragment$observeStoreValues$9", f = "MyLiveHistoriesFragment.kt", l = {448}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50882w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50883x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50884y;

        /* renamed from: z  reason: collision with root package name */
        public int f50885z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f50885z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f50884y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f50883x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f50882w
                rc.q0 r4 = (rc.q0) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7b
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                rc.q0 r9 = rc.q0.this
                nf.o r9 = rc.q0.w3(r9)
                wo.x r3 = r9.v()
                rc.q0 r9 = rc.q0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
                r4 = r9
                r9 = r8
            L3d:
                r9.f50882w = r4     // Catch: java.lang.Throwable -> L7b
                r9.f50883x = r3     // Catch: java.lang.Throwable -> L7b
                r9.f50884y = r1     // Catch: java.lang.Throwable -> L7b
                r9.f50885z = r2     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7b
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L78
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L78
                if (r9 == 0) goto L72
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L78
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L78
                pc.e2 r9 = rc.q0.v3(r5)     // Catch: java.lang.Throwable -> L78
                androidx.recyclerview.widget.RecyclerView r9 = r9.B     // Catch: java.lang.Throwable -> L78
                r6 = 0
                r9.x1(r6)     // Catch: java.lang.Throwable -> L78
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L72:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L78:
                r9 = move-exception
                r3 = r4
                goto L7c
            L7b:
                r9 = move-exception
            L7c:
                throw r9     // Catch: java.lang.Throwable -> L7d
            L7d:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.q0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<String, wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<Intent, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q0 f50887w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q0 q0Var) {
                super(1);
                this.f50887w = q0Var;
            }

            public final void a(Intent intent) {
                jo.p.h(intent, "intent");
                androidx.fragment.app.h j02 = this.f50887w.j0();
                if (j02 != null) {
                    j02.startActivityForResult(intent, 77);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Intent intent) {
                a(intent);
                return wn.v.f59242a;
            }
        }

        public e() {
            super(1);
        }

        public final void a(String str) {
            Object obj;
            jo.p.h(str, "liveId");
            List<LiveBasicParams> f10 = q0.this.M3().A().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((LiveBasicParams) obj).getLiveId(), str)) {
                        break;
                    }
                }
                LiveBasicParams liveBasicParams = (LiveBasicParams) obj;
                if (liveBasicParams != null) {
                    q0 q0Var = q0.this;
                    if (!liveBasicParams.isLive() && liveBasicParams.getArchiveStatus() == LiveArchiveStatus.PREPARING) {
                        of.n.A(q0Var.q0(), nc.i.text_archive_now_preparing, false);
                        return;
                    }
                    Context N2 = q0Var.N2();
                    jo.p.g(N2, "requireContext()");
                    new ce.x(N2, new a(q0Var)).a(liveBasicParams, Referer.MY_PAGE);
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<String, wn.v> {
        public f() {
            super(1);
        }

        public final void a(String str) {
            Object obj;
            jo.p.h(str, "liveId");
            List<LiveBasicParams> f10 = q0.this.M3().A().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((LiveBasicParams) obj).getLiveId(), str)) {
                        break;
                    }
                }
                LiveBasicParams liveBasicParams = (LiveBasicParams) obj;
                if (liveBasicParams != null) {
                    q0 q0Var = q0.this;
                    tb.c J3 = q0Var.J3();
                    Context N2 = q0Var.N2();
                    jo.p.g(N2, "requireContext()");
                    q0Var.f3(J3.d(N2, liveBasicParams.getLiveId(), new df.a(liveBasicParams), false, false));
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.p<String, View, wn.v> {
        public g() {
            super(2);
        }

        public final void a(String str, View view) {
            Object obj;
            jo.p.h(str, "liveId");
            jo.p.h(view, "menuView");
            List<LiveBasicParams> f10 = q0.this.M3().A().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((LiveBasicParams) obj).getLiveId(), str)) {
                        break;
                    }
                }
                LiveBasicParams liveBasicParams = (LiveBasicParams) obj;
                if (liveBasicParams != null) {
                    q0.this.i4(liveBasicParams, view);
                }
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(String str, View view) {
            a(str, view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<wn.v> {
        public h() {
            super(0);
        }

        public final void a() {
            tb.a z10 = q0.this.J3().z(Referer.MY_PAGE, q0.this.K3().h(), q0.this.K3().R(), q0.this.K3().D1(), q0.this.K3().e5());
            z10.a().z3(q0.this.p0(), z10.b());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<ud.u1, wn.v> {
        public i() {
            super(1);
        }

        public final void a(ud.u1 u1Var) {
            String d10;
            String b10;
            String a10;
            tb.c J3 = q0.this.J3();
            String str = (u1Var == null || (a10 = u1Var.a()) == null) ? "" : a10;
            String str2 = (u1Var == null || (b10 = u1Var.b()) == null) ? "" : b10;
            String str3 = (u1Var == null || (d10 = u1Var.d()) == null) ? "" : d10;
            String c10 = u1Var != null ? u1Var.c() : null;
            tb.a z10 = J3.z(Referer.MY_PAGE, str, str2, str3, c10 == null ? "" : c10);
            z10.a().z3(q0.this.p0(), z10.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.u1 u1Var) {
            a(u1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<wn.v> {
        public j() {
            super(0);
        }

        public final void a() {
            q0.this.h4();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends RecyclerView.u {
        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            q0.this.Q3(linearLayoutManager.l2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.p<MRLogger, String, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f50894w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f50895x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2) {
            super(2);
            this.f50894w = str;
            this.f50895x = str2;
        }

        public final void a(MRLogger mRLogger, String str) {
            jo.p.h(mRLogger, "logger");
            MRLog.Companion companion = MRLog.Companion;
            String str2 = this.f50894w;
            String str3 = this.f50895x;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SHARE_PANEL_PROCEED);
            builder.setPageId(Referer.LIVE_HISTORY);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogBase.SERVICE_NAME, str);
            wn.v vVar = wn.v.f59242a;
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str2), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, str3), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
            mRLogger.sendLog(builder.build());
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(MRLogger mRLogger, String str) {
            a(mRLogger, str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50896w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50897x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50898y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50896w = componentCallbacks;
            this.f50897x = aVar;
            this.f50898y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f50896w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f50897x, this.f50898y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50899w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50900x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50899w = componentCallbacks;
            this.f50900x = aVar;
            this.f50901y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f50899w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f50900x, this.f50901y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50902w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50903x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50904y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50902w = componentCallbacks;
            this.f50903x = aVar;
            this.f50904y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f50902w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f50903x, this.f50904y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50905w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50906x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50907y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50905w = componentCallbacks;
            this.f50906x = aVar;
            this.f50907y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f50905w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f50906x, this.f50907y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50908w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Fragment fragment) {
            super(0);
            this.f50908w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50908w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50908w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50909w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(io.a aVar) {
            super(0);
            this.f50909w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50909w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50910w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50911x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50912y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50913z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50910w = aVar;
            this.f50911x = aVar2;
            this.f50912y = aVar3;
            this.f50913z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50910w;
            vq.a aVar2 = this.f50911x;
            io.a aVar3 = this.f50912y;
            xq.a aVar4 = this.f50913z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(r0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50914w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar) {
            super(0);
            this.f50914w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50914w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public q0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f50871y0 = wn.g.b(iVar, new m(this, null, null));
        q qVar = new q(this);
        xq.a a10 = gq.a.a(this);
        r rVar = new r(qVar);
        this.f50872z0 = androidx.fragment.app.e0.a(this, jo.f0.b(r0.class), new t(rVar), new s(qVar, null, null, a10));
        this.A0 = wn.g.a(new b());
        this.B0 = wn.g.b(iVar, new n(this, null, null));
        this.C0 = wn.g.b(iVar, new o(this, null, null));
        this.D0 = wn.g.b(iVar, new p(this, null, null));
        this.E0 = nd.a.a(this);
        this.F0 = new ud.z1(null, 1, null);
        this.G0 = wn.g.a(new c());
    }

    public static final void F3(q0 q0Var, List list) {
        jo.p.h(q0Var, "this$0");
        RecyclerView.h adapter = q0Var.H3().B.getAdapter();
        rd.l0 l0Var = adapter instanceof rd.l0 ? (rd.l0) adapter : null;
        if (l0Var == null) {
            return;
        }
        jo.p.g(list, "it");
        l0Var.j(list);
    }

    public static final void S3(q0 q0Var, Boolean bool) {
        jo.p.h(q0Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            List<LiveBasicParams> f10 = q0Var.M3().A().f();
            if ((f10 != null ? f10.size() : 0) > 0) {
                androidx.lifecycle.e0<List<ud.a>> a10 = q0Var.F0.a();
                List<ud.a> f11 = q0Var.F0.a().f();
                if (f11 == null) {
                    f11 = xn.s.k();
                }
                a10.p(xn.a0.o0(f11, xn.r.d(new f2(null, 1, null))));
                return;
            }
            q0Var.F0.a().p(xn.r.d(new f2(null, 1, null)));
        }
    }

    public static final void T3(q0 q0Var, LiveAnnouncement liveAnnouncement) {
        jo.p.h(q0Var, "this$0");
        q0Var.l4();
    }

    public static final void U3(q0 q0Var, List list) {
        jo.p.h(q0Var, "this$0");
        q0Var.l4();
    }

    public static final void V3(q0 q0Var, wn.v vVar) {
        jo.p.h(q0Var, "this$0");
        if (vVar == null) {
            return;
        }
        of.n.A(q0Var.q0(), nc.i.toast_archive_download, false);
    }

    public static final void W3(q0 q0Var, LiveArchiveDownloadUrlResponse liveArchiveDownloadUrlResponse) {
        jo.p.h(q0Var, "this$0");
        if (liveArchiveDownloadUrlResponse == null) {
            return;
        }
        q0Var.k4(liveArchiveDownloadUrlResponse.getUrl(), liveArchiveDownloadUrlResponse.getFilename(), liveArchiveDownloadUrlResponse.getMimetype());
        of.n.f45411a.B(q0Var.q0(), q0Var.V0(nc.i.f41897x2, liveArchiveDownloadUrlResponse.getFilename()), false);
    }

    public static final void X3(q0 q0Var, MRError mRError) {
        jo.p.h(q0Var, "this$0");
        q0Var.P3(mRError);
    }

    public static final void Y3(q0 q0Var, MRError mRError) {
        jo.p.h(q0Var, "this$0");
        q0Var.P3(mRError);
    }

    public static final void Z3(q0 q0Var, MRError mRError) {
        jo.p.h(q0Var, "this$0");
        q0Var.P3(mRError);
    }

    public static final void f4(q0 q0Var, LiveBasicParams liveBasicParams, DialogInterface dialogInterface, int i10) {
        jo.p.h(q0Var, "this$0");
        jo.p.h(liveBasicParams, "$live");
        q0Var.L3().q(liveBasicParams.getLiveId());
    }

    public static final void g4(DialogInterface dialogInterface, int i10) {
    }

    public static final boolean j4(q0 q0Var, LiveBasicParams liveBasicParams, MenuItem menuItem) {
        jo.p.h(q0Var, "this$0");
        jo.p.h(liveBasicParams, "$live");
        int itemId = menuItem.getItemId();
        if (itemId == nc.e.menu_item_archive_hidden) {
            q0Var.L3().L(liveBasicParams);
            return true;
        } else if (itemId == nc.e.menu_item_share) {
            Puree.d(new Archive.Share(liveBasicParams, Referer.MY_PAGE));
            hf.b.f35490a.d().a();
            try {
                String liveId = liveBasicParams.getLiveId();
                String userId = liveBasicParams.getOwner().getUserId();
                Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", liveBasicParams.getShareUrl());
                jo.p.g(putExtra, "Intent(Intent.ACTION_SEN…XTRA_TEXT, live.shareUrl)");
                ChooseReceiver.a aVar = ChooseReceiver.f25051x;
                Context N2 = q0Var.N2();
                jo.p.g(N2, "requireContext()");
                q0Var.f3(Intent.createChooser(putExtra, q0Var.U0(nc.i.f41880l2), PendingIntent.getBroadcast(q0Var.N2(), 0, aVar.a(N2, new l(liveId, userId)), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()).addFlags(268435456));
                return true;
            } catch (ActivityNotFoundException e10) {
                g9.a.c(e10);
                return true;
            }
        } else if (itemId == nc.e.menu_item_download) {
            q0Var.G3(liveBasicParams);
            return true;
        } else if (itemId == nc.e.menu_item_delete) {
            q0Var.e4(liveBasicParams);
            return true;
        } else {
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        e2 T = e2.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        b4(T);
        View u10 = H3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void E3() {
        this.F0.a().i(a1(), new androidx.lifecycle.f0() { // from class: rc.f0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.F3(q0.this, (List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        uo.r0.d(this, null, 1, null);
        super.F1();
    }

    public final void G3(LiveBasicParams liveBasicParams) {
        if (Build.VERSION.SDK_INT <= 29 && c3.a.a(N2(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            K2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 200);
            return;
        }
        int archiveDownloadStatus = liveBasicParams.getArchiveDownloadStatus();
        if (archiveDownloadStatus == 1) {
            L3().J(liveBasicParams);
        } else if (archiveDownloadStatus == 2) {
            of.n.A(q0(), nc.i.toast_archive_download, false);
        } else if (archiveDownloadStatus != 3) {
        } else {
            L3().w(liveBasicParams.getLiveId());
        }
    }

    public final e2 H3() {
        return (e2) this.E0.b(this, I0[0]);
    }

    public final nf.o I3() {
        return (nf.o) this.B0.getValue();
    }

    public final tb.c J3() {
        return (tb.c) this.C0.getValue();
    }

    public final kf.m K3() {
        return (kf.m) this.D0.getValue();
    }

    public final r0 L3() {
        return (r0) this.f50872z0.getValue();
    }

    public final u1 M3() {
        return (u1) this.A0.getValue();
    }

    public final String N3() {
        return (String) this.G0.getValue();
    }

    public final kf.x O3() {
        return (kf.x) this.f50871y0.getValue();
    }

    public final void P3(MRError mRError) {
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(N2(), mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(N2(), mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.z(N2());
        }
    }

    public final void Q3(int i10) {
        Integer f10;
        List<ud.a> f11 = this.F0.a().f();
        if (f11 == null || (f10 = M3().E().f()) == null) {
            return;
        }
        int intValue = f10.intValue();
        if (jo.p.c(M3().N().f(), Boolean.TRUE) || intValue < 1 || f11.size() > i10 + 5) {
            return;
        }
        L3().y(N3(), intValue);
    }

    public final void R3() {
        M3().N().i(a1(), new androidx.lifecycle.f0() { // from class: rc.o0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.S3(q0.this, (Boolean) obj);
            }
        });
        M3().y().i(a1(), new androidx.lifecycle.f0() { // from class: rc.m0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.T3(q0.this, (LiveAnnouncement) obj);
            }
        });
        M3().A().i(a1(), new androidx.lifecycle.f0() { // from class: rc.p0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.U3(q0.this, (List) obj);
            }
        });
        M3().I().i(a1(), new androidx.lifecycle.f0() { // from class: rc.g0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.V3(q0.this, (wn.v) obj);
            }
        });
        M3().z().i(a1(), new androidx.lifecycle.f0() { // from class: rc.n0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.W3(q0.this, (LiveArchiveDownloadUrlResponse) obj);
            }
        });
        M3().t().i(a1(), new androidx.lifecycle.f0() { // from class: rc.l0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.X3(q0.this, (MRError) obj);
            }
        });
        M3().r().i(a1(), new androidx.lifecycle.f0() { // from class: rc.j0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.Y3(q0.this, (MRError) obj);
            }
        });
        M3().p().i(a1(), new androidx.lifecycle.f0() { // from class: rc.k0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q0.Z3(q0.this, (MRError) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void Y1(int i10, String[] strArr, int[] iArr) {
        jo.p.h(strArr, "permissions");
        jo.p.h(iArr, "grantResults");
        if (i10 == 200 && of.q.f45417a.e(this, strArr, iArr)) {
            of.n.A(q0(), nc.i.K4, false);
            a4();
            return;
        }
        super.Y1(i10, strArr, iArr);
    }

    public final void a4() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", N2().getPackageName(), null));
        intent.addFlags(268435456);
        f3(intent);
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "TAG_DELETE_NEXT_LIVE_ANNOUNCEMENT")) {
            L3().r();
        }
    }

    public final void b4(e2 e2Var) {
        this.E0.a(this, I0[0], e2Var);
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    public final void c4() {
        H3().B.setAdapter(new rd.l0());
        H3().B.setLayoutManager(new LinearLayoutManager(q0()));
        H3().B.g(new p001if.c(de.e.b(this, 1), 0, 0, 0, O0().getDimensionPixelSize(nc.c.f41807e) / 2, 0, 46, null));
    }

    public final void d4() {
        RecyclerView.h adapter = H3().B.getAdapter();
        rd.l0 l0Var = adapter instanceof rd.l0 ? (rd.l0) adapter : null;
        if (l0Var != null) {
            l0Var.i(new e());
            l0Var.h(new f());
            l0Var.l(new g());
            l0Var.k(new h());
            l0Var.m(new i());
            l0Var.n(new j());
        }
        H3().B.k(new k());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        c4();
        d4();
        E3();
        R3();
        L3().G(N3());
    }

    public final void e4(final LiveBasicParams liveBasicParams) {
        AlertDialog.Builder builder = new AlertDialog.Builder(j0());
        builder.setTitle(nc.i.f41876e1);
        builder.setCancelable(false);
        builder.setPositiveButton(nc.i.f41881m2, new DialogInterface.OnClickListener() { // from class: rc.e0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                q0.f4(q0.this, liveBasicParams, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(nc.i.B, h0.f50813w);
        builder.create().show();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f50870x0.getCoroutineContext();
    }

    public final void h4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nc.i.text_delete_schedule);
        jo.p.g(U0, "getString(R.string.text_delete_schedule)");
        f.a.b(aVar, U0, U0(nc.i.E4), U0(nc.i.B), null, false, 24, null).z3(p0(), "TAG_DELETE_NEXT_LIVE_ANNOUNCEMENT");
    }

    public final void i4(final LiveBasicParams liveBasicParams, View view) {
        PopupMenu popupMenu = new PopupMenu(N2(), view);
        popupMenu.getMenuInflater().inflate(nc.g.live_item_menu_mine, popupMenu.getMenu());
        MenuItem findItem = popupMenu.getMenu().findItem(nc.e.menu_item_archive_hidden);
        Integer archiveHidden = liveBasicParams.getArchiveHidden();
        findItem.setTitle((archiveHidden != null && archiveHidden.intValue() == 0) ? nc.i.text_hide_archive : nc.i.text_show_archive);
        findItem.setVisible(liveBasicParams.getArchiveStatus() == LiveArchiveStatus.PREPARED);
        popupMenu.getMenu().findItem(nc.e.menu_item_share).setVisible(liveBasicParams.isArchive());
        MenuItem findItem2 = popupMenu.getMenu().findItem(nc.e.menu_item_download);
        int archiveDownloadStatus = liveBasicParams.getArchiveDownloadStatus();
        if (archiveDownloadStatus == 1) {
            findItem2.setTitle(U0(nc.i.text_archive_download_reserve));
        } else if (archiveDownloadStatus == 2) {
            findItem2.setTitle(U0(nc.i.text_archive_download_preparing));
        } else if (archiveDownloadStatus == 3) {
            findItem2.setTitle(U0(nc.i.text_archive_download_available));
        } else if (archiveDownloadStatus == 4) {
            findItem2.setVisible(false);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: rc.i0
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean j42;
                j42 = q0.j4(q0.this, liveBasicParams, menuItem);
                return j42;
            }
        });
        popupMenu.show();
    }

    public final void k4(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Object systemService = N2().getSystemService("download");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(str2);
        request.setMimeType(str3);
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        ((DownloadManager) systemService).enqueue(request);
    }

    public final void l4() {
        ud.a n2Var;
        if (jo.p.c(M3().N().f(), Boolean.TRUE)) {
            return;
        }
        List<LiveBasicParams> f10 = M3().A().f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        LiveAnnouncement f11 = M3().y().f();
        if (f11 == null) {
            n2Var = new ud.y(null, null, null, 7, null);
        } else {
            String body = f11.getBody();
            int startAt = f11.getStartAt();
            App.AppParams app = f11.getApp();
            n2Var = new n2(body, startAt, app != null ? ud.u1.f55559e.a(app) : null, true, null, 16, null);
        }
        if (f10.isEmpty()) {
            androidx.lifecycle.e0<List<ud.a>> a10 = this.F0.a();
            o2.a aVar = o2.E;
            String U0 = U0(nc.i.empty_live_history);
            jo.p.g(U0, "getString(R.string.empty_live_history)");
            a10.p(xn.s.m(n2Var, o2.a.b(aVar, U0, null, de.e.b(this, 48), de.e.b(this, 48), 0, 0, 50, null)));
            return;
        }
        androidx.lifecycle.e0<List<ud.a>> a11 = this.F0.a();
        List d10 = xn.r.d(n2Var);
        ArrayList arrayList = new ArrayList(xn.t.u(f10, 10));
        for (LiveBasicParams liveBasicParams : f10) {
            a2.a aVar2 = ud.a2.V;
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            arrayList.add(aVar2.b(N2, liveBasicParams));
        }
        a11.p(xn.a0.o0(d10, arrayList));
    }
}
