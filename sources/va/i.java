package va;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.notice.YourNotice;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import ha.a;
import jf.b0;
import jf.h0;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import kq.a;
import uo.q0;
import uo.r0;
import wn.v;
import xn.r;

/* loaded from: classes2.dex */
public final class i extends Fragment implements q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f57216x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f57217y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f57218z0;
    public static final /* synthetic */ qo.h<Object>[] F0 = {f0.d(new s(i.class, "binding", "getBinding()Lcom/dena/mirrativ/notification/databinding/FragmentNoticeYourBinding;", 0))};
    public static final a E0 = new a(null);
    public static final int G0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a() {
            return new i();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            Long f10 = i.this.x3().i().f();
            if (f10 == null) {
                return;
            }
            long longValue = f10.longValue();
            String f11 = i.this.x3().j().f();
            if (f11 == null) {
                return;
            }
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            ha.a f12 = i.this.x3().l().f();
            if (f12 != null && f12.a()) {
                return;
            }
            if ((f11.length() == 0) || linearLayoutManager.l2() + 5 < linearLayoutManager.j0()) {
                return;
            }
            i.this.t3().d(f11, longValue);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<v> {
        public c() {
            super(0);
        }

        public final void a() {
            i.this.t3().e();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.your.NoticeYourFragment$onCreateView$4", f = "NoticeYourFragment.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f57221w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57222x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57223y;

        /* renamed from: z  reason: collision with root package name */
        public int f57224z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f57224z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f57223y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f57222x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f57221w
                va.i r4 = (va.i) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L85
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                va.i r10 = va.i.this
                va.j r10 = va.i.r3(r10)
                wo.x r3 = r10.n()
                va.i r10 = va.i.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L85
                r4 = r10
                r10 = r9
            L3d:
                r10.f57221w = r4     // Catch: java.lang.Throwable -> L85
                r10.f57222x = r3     // Catch: java.lang.Throwable -> L85
                r10.f57223y = r1     // Catch: java.lang.Throwable -> L85
                r10.f57224z = r2     // Catch: java.lang.Throwable -> L85
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L85
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L82
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L82
                if (r10 == 0) goto L7c
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L82
                java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L82
                sa.k r6 = va.i.o3(r5)     // Catch: java.lang.Throwable -> L82
                androidx.recyclerview.widget.RecyclerView r6 = r6.C     // Catch: java.lang.Throwable -> L82
                androidx.recyclerview.widget.RecyclerView$h r6 = r6.getAdapter()     // Catch: java.lang.Throwable -> L82
                java.lang.String r7 = "null cannot be cast to non-null type com.dena.mirrativ.notification.your.NoticeYourAdapter"
                jo.p.f(r6, r7)     // Catch: java.lang.Throwable -> L82
                va.d r6 = (va.d) r6     // Catch: java.lang.Throwable -> L82
                r6.f(r10)     // Catch: java.lang.Throwable -> L82
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7c:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L82:
                r10 = move-exception
                r3 = r4
                goto L86
            L85:
                r10 = move-exception
            L86:
                throw r10     // Catch: java.lang.Throwable -> L87
            L87:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: va.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.your.NoticeYourFragment$onCreateView$5", f = "NoticeYourFragment.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f57225w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57226x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57227y;

        /* renamed from: z  reason: collision with root package name */
        public int f57228z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:33:0x008a, B:34:0x0099, B:36:0x009d, B:31:0x0086, B:28:0x0080, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f57228z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f57227y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f57226x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f57225w
                va.i r4 = (va.i) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb3
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                va.i r11 = va.i.this
                va.j r11 = va.i.r3(r11)
                wo.x r3 = r11.h()
                va.i r11 = va.i.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb3
                r4 = r11
                r11 = r10
            L3d:
                r11.f57225w = r4     // Catch: java.lang.Throwable -> Lb3
                r11.f57226x = r3     // Catch: java.lang.Throwable -> Lb3
                r11.f57227y = r1     // Catch: java.lang.Throwable -> Lb3
                r11.f57228z = r2     // Catch: java.lang.Throwable -> Lb3
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb3
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto Laa
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Lb0
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L7a:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L80
                r6 = r2
                goto L82
            L80:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Lb0
            L82:
                if (r6 == 0) goto L86
                r6 = r2
                goto L88
            L86:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Lb0
            L88:
                if (r6 == 0) goto L99
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lb0
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L99:
                boolean r11 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto La4
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                of.n.z(r11)     // Catch: java.lang.Throwable -> Lb0
            La4:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Laa:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb0:
                r11 = move-exception
                r3 = r4
                goto Lb4
            Lb3:
                r11 = move-exception
            Lb4:
                throw r11     // Catch: java.lang.Throwable -> Lb5
            Lb5:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: va.i.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.your.NoticeYourFragment$onCreateView$6", f = "NoticeYourFragment.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f57229w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57230x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57231y;

        /* renamed from: z  reason: collision with root package name */
        public int f57232z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
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
                int r1 = r8.f57232z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f57231y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f57230x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f57229w
                va.i r4 = (va.i) r4
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
                va.i r9 = va.i.this
                nf.o r9 = va.i.p3(r9)
                wo.x r3 = r9.v()
                va.i r9 = va.i.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
                r4 = r9
                r9 = r8
            L3d:
                r9.f57229w = r4     // Catch: java.lang.Throwable -> L7b
                r9.f57230x = r3     // Catch: java.lang.Throwable -> L7b
                r9.f57231y = r1     // Catch: java.lang.Throwable -> L7b
                r9.f57232z = r2     // Catch: java.lang.Throwable -> L7b
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
                sa.k r9 = va.i.o3(r5)     // Catch: java.lang.Throwable -> L78
                androidx.recyclerview.widget.RecyclerView r9 = r9.C     // Catch: java.lang.Throwable -> L78
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
            throw new UnsupportedOperationException("Method not decompiled: va.i.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.l<YourNotice, v> {
        public g() {
            super(1);
        }

        public final void a(YourNotice yourNotice) {
            p.h(yourNotice, "it");
            ha.a f10 = i.this.x3().l().f();
            if (f10 != null && f10.a()) {
                return;
            }
            i.this.t3().f(yourNotice.getId());
            if (yourNotice.getUrl().length() > 0) {
                b0 a10 = i.this.y3().a(yourNotice.getUrl());
                if (!(a10 instanceof b0.l0)) {
                    i iVar = i.this;
                    HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                    Context N2 = iVar.N2();
                    p.g(N2, "requireContext()");
                    iVar.f3(aVar.a(N2, Referer.Notice.YOURS, a10));
                }
            }
            MRLogger w32 = i.this.w3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_CLICK);
            builder.setTargetType("notice_category");
            builder.setTargetId("yours");
            builder.setPayload(r.d(wn.q.a("url", yourNotice.getUrl())));
            w32.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(YourNotice yourNotice) {
            a(yourNotice);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<od.f0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f57234w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f57235x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f57236y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f57234w = componentCallbacks;
            this.f57235x = aVar;
            this.f57236y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.f0, java.lang.Object] */
        @Override // io.a
        public final od.f0 invoke() {
            ComponentCallbacks componentCallbacks = this.f57234w;
            return gq.a.a(componentCallbacks).c(f0.b(od.f0.class), this.f57235x, this.f57236y);
        }
    }

    /* renamed from: va.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0926i extends q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f57237w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f57238x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f57239y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0926i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f57237w = componentCallbacks;
            this.f57238x = aVar;
            this.f57239y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f57237w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f57238x, this.f57239y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f57240w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f57241x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f57242y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f57240w = componentCallbacks;
            this.f57241x = aVar;
            this.f57242y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f57240w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f57241x, this.f57242y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f57243w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f57244x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f57245y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f57243w = componentCallbacks;
            this.f57244x = aVar;
            this.f57245y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f57243w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f57244x, this.f57245y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f57246w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f57246w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f57246w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f57247w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f57247w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f57247w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f57248w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f57249x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f57250y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f57251z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f57248w = aVar;
            this.f57249x = aVar2;
            this.f57250y = aVar3;
            this.f57251z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f57248w;
            vq.a aVar2 = this.f57249x;
            io.a aVar3 = this.f57250y;
            xq.a aVar4 = this.f57251z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(va.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f57252w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f57252w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f57252w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public i() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f57218z0 = wn.g.b(iVar, new h(this, null, null));
        l lVar = new l(this);
        xq.a a10 = gq.a.a(this);
        m mVar = new m(lVar);
        this.A0 = e0.a(this, f0.b(va.j.class), new o(mVar), new n(lVar, null, null, a10));
        this.B0 = wn.g.b(iVar, new C0926i(this, null, null));
        this.C0 = wn.g.b(iVar, new j(this, null, null));
        this.D0 = wn.g.b(iVar, new k(this, null, null));
    }

    public static final void A3(i iVar, ha.a aVar) {
        p.h(iVar, "this$0");
        if (aVar instanceof a.d) {
            iVar.u3().D.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            iVar.u3().D.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                iVar.u3().D.b(new StatusView.b.d(iVar.U0(qa.q.f48888f), 0.0f, 2, null));
            } else if ((aVar instanceof a.C0439a) && iVar.x3().m().isEmpty()) {
                StatusView statusView = iVar.u3().D;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = iVar.U0(qa.q.f48886a);
                    p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new c()));
            }
        }
    }

    public static final void B3(i iVar, Integer num) {
        Long f10;
        p.h(iVar, "this$0");
        int c10 = h0.YOUR.c();
        if (num != null && num.intValue() == c10 && (f10 = iVar.x3().k().f()) != null && f10.longValue() > 0) {
            iVar.t3().c(f10.longValue());
        }
    }

    public static final void C3(i iVar, Long l10) {
        p.h(iVar, "this$0");
        if (l10 != null && l10.longValue() == 0) {
            return;
        }
        Integer f10 = iVar.v3().p().f();
        int c10 = h0.YOUR.c();
        if (f10 != null && f10.intValue() == c10) {
            od.f0 t32 = iVar.t3();
            p.g(l10, "noticeLatestTime");
            t32.c(l10.longValue());
        }
    }

    public static final void z3(i iVar) {
        p.h(iVar, "this$0");
        boolean z10 = false;
        iVar.u3().B.setRefreshing(false);
        ha.a f10 = iVar.x3().l().f();
        if (f10 != null && f10.a()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        iVar.t3().e();
    }

    public final void D3(sa.k kVar) {
        this.f57217y0.a(this, F0[0], kVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        sa.k T = sa.k.T(LayoutInflater.from(N2()), viewGroup, false);
        p.g(T, "inflate(\n            Lay…          false\n        )");
        D3(T);
        u3().B.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: va.h
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                i.z3(i.this);
            }
        });
        u3().B.setSwipeableChildren(xn.s.m(Integer.valueOf(qa.o.f48885z), Integer.valueOf(qa.o.H)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(N2());
        u3().C.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = u3().C;
        Context N2 = N2();
        p.g(N2, "requireContext()");
        recyclerView.g(new n9.a(N2, linearLayoutManager.w2(), 0, 4, null));
        u3().C.g(new p001if.c(0, 0, 0, 0, O0().getDimensionPixelSize(qa.m.f48870a) / 2, 0, 47, null));
        va.d dVar = new va.d(new g());
        dVar.f(x3().m());
        u3().C.setAdapter(dVar);
        u3().C.k(new b());
        x3().l().i(a1(), new androidx.lifecycle.f0() { // from class: va.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i.A3(i.this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        v3().p().i(a1(), new androidx.lifecycle.f0() { // from class: va.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i.B3(i.this, (Integer) obj);
            }
        });
        x3().k().i(a1(), new androidx.lifecycle.f0() { // from class: va.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i.C3(i.this, (Long) obj);
            }
        });
        if (x3().m().isEmpty()) {
            t3().e();
        }
        View u10 = u3().u();
        p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        r0.d(this, null, 1, null);
        super.F1();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f57216x0.getCoroutineContext();
    }

    public final od.f0 t3() {
        return (od.f0) this.f57218z0.getValue();
    }

    public final sa.k u3() {
        return (sa.k) this.f57217y0.b(this, F0[0]);
    }

    public final nf.o v3() {
        return (nf.o) this.B0.getValue();
    }

    public final MRLogger w3() {
        return (MRLogger) this.C0.getValue();
    }

    public final va.j x3() {
        return (va.j) this.A0.getValue();
    }

    public final of.k y3() {
        return (of.k) this.D0.getValue();
    }
}
