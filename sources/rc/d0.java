package rc;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Chat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;
import uc.b;
import ud.f2;
import ud.g2;
import ud.k2;

/* loaded from: classes2.dex */
public final class d0 extends Fragment implements vb.c, vb.d, vb.e, vb.b, uo.q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final AutoClearedValue C0;
    public final k2 D0;
    public final androidx.activity.result.c<Intent> E0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f50770x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f50771y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f50772z0;
    public static final /* synthetic */ qo.h<Object>[] G0 = {jo.f0.d(new jo.s(d0.class, "binding", "getBinding()Lcom/dena/mirrativ/user/databinding/FragmentChatThreadsBinding;", 0))};
    public static final a F0 = new a(null);
    public static final int H0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a() {
            return new d0();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyChatThreadsFragment$observeStoreValues$5", f = "MyChatThreadsFragment.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50773w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50774x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50775y;

        /* renamed from: z  reason: collision with root package name */
        public int f50776z;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
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
                int r1 = r8.f50776z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f50775y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f50774x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f50773w
                rc.d0 r4 = (rc.d0) r4
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
                rc.d0 r9 = rc.d0.this
                nf.o r9 = rc.d0.q3(r9)
                wo.x r3 = r9.v()
                rc.d0 r9 = rc.d0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
                r4 = r9
                r9 = r8
            L3d:
                r9.f50773w = r4     // Catch: java.lang.Throwable -> L7b
                r9.f50774x = r3     // Catch: java.lang.Throwable -> L7b
                r9.f50775y = r1     // Catch: java.lang.Throwable -> L7b
                r9.f50776z = r2     // Catch: java.lang.Throwable -> L7b
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
                pc.m1 r9 = rc.d0.p3(r5)     // Catch: java.lang.Throwable -> L78
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
            throw new UnsupportedOperationException("Method not decompiled: rc.d0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.u {
        public c() {
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
            d0.this.D3(linearLayoutManager.l2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<Integer, wn.v> {
        public d() {
            super(1);
        }

        public final void a(int i10) {
            List<Chat.Thread> f10;
            Chat.Thread thread;
            List<Chat.Thread> f11 = d0.this.C3().m().f();
            if (!(f11 != null && (f11.isEmpty() ^ true)) || (f10 = d0.this.C3().m().f()) == null || (thread = f10.get(i10)) == null) {
                return;
            }
            d0.this.N3(ge.j.G.a(thread, thread.getPushEnabled() == 1, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<Integer, wn.v> {
        public e() {
            super(1);
        }

        public final void a(int i10) {
            List<Chat.Thread> f10;
            List<Chat.Thread> f11;
            Chat.Thread thread;
            boolean z10 = false;
            if (d0.this.C3().m().f() != null && (!f10.isEmpty())) {
                z10 = true;
            }
            if (!z10 || (f11 = d0.this.C3().m().f()) == null || (thread = f11.get(i10)) == null) {
                return;
            }
            d0 d0Var = d0.this;
            String userId = thread.getUserId();
            if (userId != null) {
                d0Var.O3(userId);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<wn.v> {
        public f() {
            super(0);
        }

        public final void a() {
            zc.a.Q0.a(Referer.MY_PAGE).z3(d0.this.p0(), "ChatConfirmationRequestDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50781w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50782x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50783y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50781w = componentCallbacks;
            this.f50782x = aVar;
            this.f50783y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f50781w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f50782x, this.f50783y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50784w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50785x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50786y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50784w = componentCallbacks;
            this.f50785x = aVar;
            this.f50786y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f50784w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f50785x, this.f50786y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50787w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f50787w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50787w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50787w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50788w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f50788w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50788w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50789w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50790x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50791y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50792z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50789w = aVar;
            this.f50790x = aVar2;
            this.f50791y = aVar3;
            this.f50792z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50789w;
            vq.a aVar2 = this.f50790x;
            io.a aVar3 = this.f50791y;
            xq.a aVar4 = this.f50792z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(r0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50793w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f50793w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50793w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50794w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f50794w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50794w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50794w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50795w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f50795w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50795w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50796w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50797x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50798y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50799z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50796w = aVar;
            this.f50797x = aVar2;
            this.f50798y = aVar3;
            this.f50799z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50796w;
            vq.a aVar2 = this.f50797x;
            io.a aVar3 = this.f50798y;
            xq.a aVar4 = this.f50799z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(u1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50800w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f50800w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50800w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public d0() {
        i iVar = new i(this);
        xq.a a10 = gq.a.a(this);
        j jVar = new j(iVar);
        this.f50771y0 = androidx.fragment.app.e0.a(this, jo.f0.b(r0.class), new l(jVar), new k(iVar, null, null, a10));
        m mVar = new m(this);
        xq.a a11 = gq.a.a(this);
        n nVar = new n(mVar);
        this.f50772z0 = androidx.fragment.app.e0.a(this, jo.f0.b(u1.class), new p(nVar), new o(mVar, null, null, a11));
        wn.i iVar2 = wn.i.SYNCHRONIZED;
        this.A0 = wn.g.b(iVar2, new g(this, null, null));
        this.B0 = wn.g.b(iVar2, new h(this, null, null));
        this.C0 = nd.a.a(this);
        this.D0 = new k2(null, 1, null);
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: rc.x
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                d0.x3(d0.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…        }\n        }\n    }");
        this.E0 = I2;
    }

    public static final void F3(d0 d0Var, Boolean bool) {
        jo.p.h(d0Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            List<Chat.Thread> f10 = d0Var.C3().m().f();
            if ((f10 != null ? f10.size() : 0) > 0) {
                androidx.lifecycle.e0<List<ud.a>> a10 = d0Var.D0.a();
                List<ud.a> f11 = d0Var.D0.a().f();
                if (f11 == null) {
                    f11 = xn.s.k();
                }
                a10.p(xn.a0.o0(f11, xn.r.d(new f2(null, 1, null))));
                return;
            }
            d0Var.D0.a().p(xn.r.d(new f2(null, 1, null)));
        }
    }

    public static final void G3(d0 d0Var, ChatStatus chatStatus) {
        jo.p.h(d0Var, "this$0");
        if (chatStatus == null || chatStatus.isEnabled()) {
            return;
        }
        if (!chatStatus.getRequireGeneration() && !chatStatus.getRequireBirthday() && !chatStatus.getRequireChatConfirmationAgreement()) {
            d0Var.D0.a().p(xn.r.d(new uc.d(null, 1, null)));
        } else {
            d0Var.D0.a().p(xn.r.d(new uc.a(null, 1, null)));
        }
    }

    public static final void H3(d0 d0Var, List list) {
        jo.p.h(d0Var, "this$0");
        if (jo.p.c(d0Var.C3().M().f(), Boolean.TRUE)) {
            return;
        }
        ChatStatus f10 = d0Var.C3().l().f();
        boolean z10 = false;
        if (f10 != null && f10.isEnabled()) {
            z10 = true;
        }
        if (z10) {
            if (list.isEmpty()) {
                d0Var.D0.a().p(xn.r.d(new uc.c(null, 1, null)));
                return;
            }
            androidx.lifecycle.e0<List<ud.a>> a10 = d0Var.D0.a();
            jo.p.g(list, "chatThreads");
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b.a aVar = uc.b.I;
                Context N2 = d0Var.N2();
                jo.p.g(N2, "requireContext()");
                arrayList.add(aVar.a((Chat.Thread) it.next(), N2));
            }
            a10.p(arrayList);
        }
    }

    public static final void I3(d0 d0Var, MRError mRError) {
        jo.p.h(d0Var, "this$0");
        if (mRError == null) {
            return;
        }
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(d0Var.N2(), mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned ? true : mRError instanceof MRError.Network) {
            androidx.lifecycle.e0<List<ud.a>> a10 = d0Var.D0.a();
            String message = mRError.getMessage();
            if (message == null) {
                message = d0Var.U0(nc.i.f41875e);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            a10.p(xn.r.d(new g2(message, null, 2, null)));
        }
    }

    public static final void w3(d0 d0Var, List list) {
        jo.p.h(d0Var, "this$0");
        RecyclerView.h adapter = d0Var.y3().B.getAdapter();
        w wVar = adapter instanceof w ? (w) adapter : null;
        if (wVar == null) {
            return;
        }
        jo.p.g(list, "bindModels");
        wVar.i(list);
    }

    public static final void x3(d0 d0Var, androidx.activity.result.a aVar) {
        Intent a10;
        jo.p.h(d0Var, "this$0");
        if (aVar.b() == -1 && (a10 = aVar.a()) != null) {
            Parcelable parcelableExtra = a10.getParcelableExtra("KEY_RESULT_THREAD");
            jo.p.e(parcelableExtra);
            ge.j jVar = (ge.j) parcelableExtra;
            String a11 = jVar.a();
            String b10 = jVar.b();
            if (a10.getBooleanExtra("KEY_RESULT_LEFT", false)) {
                d0Var.B3().u(a11, b10);
            } else if (a10.getBooleanExtra("KEY_RESULT_READ", false)) {
                if (!a10.getBooleanExtra("KEY_RESULT_POST_THREAD", false) && !a10.getBooleanExtra("KEY_RESULT_JOIN_THREAD", false)) {
                    d0Var.B3().C(a11, b10);
                } else {
                    d0Var.B3().E();
                }
            }
        }
    }

    public final tb.c A3() {
        return (tb.c) this.B0.getValue();
    }

    public final r0 B3() {
        return (r0) this.f50771y0.getValue();
    }

    public final u1 C3() {
        return (u1) this.f50772z0.getValue();
    }

    public final void D3(int i10) {
        Integer f10;
        List<ud.a> f11 = this.D0.a().f();
        if (f11 == null || (f10 = C3().D().f()) == null) {
            return;
        }
        int intValue = f10.intValue();
        if (jo.p.c(C3().M().f(), Boolean.TRUE)) {
            return;
        }
        boolean z10 = true;
        if (intValue < 1 || f11.size() > i10 + 5) {
            return;
        }
        ChatStatus f12 = C3().l().f();
        if (f12 == null || !f12.isEnabled()) {
            z10 = false;
        }
        if (z10) {
            B3().x(intValue);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        pc.m1 T = pc.m1.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        K3(T);
        L3();
        M3();
        v3();
        E3();
        View u10 = y3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void E3() {
        C3().M().i(a1(), new androidx.lifecycle.f0() { // from class: rc.a0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.F3(d0.this, (Boolean) obj);
            }
        });
        C3().l().i(a1(), new androidx.lifecycle.f0() { // from class: rc.z
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.G3(d0.this, (ChatStatus) obj);
            }
        });
        C3().m().i(a1(), new androidx.lifecycle.f0() { // from class: rc.c0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.H3(d0.this, (List) obj);
            }
        });
        C3().s().i(a1(), new androidx.lifecycle.f0() { // from class: rc.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.I3(d0.this, (MRError) obj);
            }
        });
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final void J3(ChatStatus chatStatus) {
        if (chatStatus.getRequireGeneration()) {
            yc.e.Q0.a(Referer.MY_PAGE).z3(p0(), "ChatConfirmationGenerationPickerDialog");
        } else if (chatStatus.getRequireBirthday()) {
            xc.d.R0.a(Referer.MY_PAGE).z3(p0(), "ChatConfirmationDatePickerDialog");
        } else if (chatStatus.getRequireChatConfirmationAgreement()) {
            wc.d.Q0.a(Referer.MY_PAGE).z3(p0(), "ChatConfirmationAgreementDialog");
        }
    }

    public final void K3(pc.m1 m1Var) {
        this.C0.a(this, G0[0], m1Var);
    }

    public final void L3() {
        y3().B.setAdapter(new w());
        y3().B.setLayoutManager(new LinearLayoutManager(q0()));
        y3().B.g(new p001if.c(0, 0, 0, 0, de.e.b(this, 88), 0, 32, null));
    }

    public final void M3() {
        y3().B.k(new c());
        RecyclerView.h adapter = y3().B.getAdapter();
        w wVar = adapter instanceof w ? (w) adapter : null;
        if (wVar != null) {
            wVar.h(new d());
            wVar.g(new e());
            wVar.f(new f());
        }
    }

    public final void N3(ge.j jVar) {
        androidx.activity.result.c<Intent> cVar = this.E0;
        tb.c A3 = A3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        cVar.a(A3.t(N2, null, jVar));
    }

    public final void O3(String str) {
        tb.c A3 = A3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(A3.s(N2, str, Referer.MY_PAGE));
    }

    @Override // vb.b
    public void P() {
        B3().E();
    }

    @Override // vb.e
    public void R1() {
        ChatStatus f10 = C3().l().f();
        if (f10 == null) {
            return;
        }
        J3(f10);
    }

    @Override // vb.c
    public void U1(boolean z10) {
        ChatStatus copy$default;
        ChatStatus f10 = C3().l().f();
        if (f10 == null || (copy$default = ChatStatus.copy$default(f10, false, false, z10, false, 10, null)) == null) {
            return;
        }
        B3().A(copy$default);
        J3(copy$default);
    }

    @Override // vb.d
    public void X(boolean z10, boolean z11) {
        ChatStatus copy$default;
        ChatStatus f10 = C3().l().f();
        if (f10 == null || (copy$default = ChatStatus.copy$default(f10, z10, false, z11, false, 8, null)) == null) {
            return;
        }
        B3().A(copy$default);
        J3(copy$default);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        B3().E();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f50770x0.getCoroutineContext();
    }

    public final void v3() {
        this.D0.a().i(a1(), new androidx.lifecycle.f0() { // from class: rc.b0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.w3(d0.this, (List) obj);
            }
        });
    }

    public final pc.m1 y3() {
        return (pc.m1) this.C0.b(this, G0[0]);
    }

    public final nf.o z3() {
        return (nf.o) this.A0.getValue();
    }
}
