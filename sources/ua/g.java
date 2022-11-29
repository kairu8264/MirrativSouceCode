package ua;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
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
import com.dena.mirrorman.clientlog.logs.detail.NoticePresentButtonTapTargetDetail;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.notice.AttributedText;
import com.dena.mirrorman.net.api.response.notice.PresentBox;
import ha.a;
import jf.b0;
import jf.h0;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import kq.a;
import od.e0;
import uo.q0;
import uo.r0;
import wn.v;
import xn.a0;

/* loaded from: classes2.dex */
public final class g extends Fragment implements q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f54658x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f54659y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f54660z0;
    public static final /* synthetic */ qo.h<Object>[] F0 = {f0.d(new s(g.class, "binding", "getBinding()Lcom/dena/mirrativ/notification/databinding/FragmentNoticePresentBoxBinding;", 0))};
    public static final a E0 = new a(null);
    public static final int G0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a() {
            return new g();
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
            Long f10 = g.this.x3().i().f();
            if (f10 == null) {
                return;
            }
            long longValue = f10.longValue();
            String f11 = g.this.x3().j().f();
            if (f11 == null) {
                return;
            }
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            ha.a f12 = g.this.x3().n().f();
            if (f12 != null && f12.a()) {
                return;
            }
            if ((f11.length() == 0) || linearLayoutManager.l2() + 5 < linearLayoutManager.j0()) {
                return;
            }
            g.this.t3().e(f11, longValue);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<v> {
        public c() {
            super(0);
        }

        public final void a() {
            g.this.t3().f();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.present.NoticePresentBoxFragment$onCreateView$4", f = "NoticePresentBoxFragment.kt", l = {222}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f54663w;

        /* renamed from: x  reason: collision with root package name */
        public Object f54664x;

        /* renamed from: y  reason: collision with root package name */
        public Object f54665y;

        /* renamed from: z  reason: collision with root package name */
        public int f54666z;

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
                int r1 = r9.f54666z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f54665y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f54664x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f54663w
                ua.g r4 = (ua.g) r4
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
                ua.g r10 = ua.g.this
                ua.h r10 = ua.g.r3(r10)
                wo.x r3 = r10.m()
                ua.g r10 = ua.g.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L85
                r4 = r10
                r10 = r9
            L3d:
                r10.f54663w = r4     // Catch: java.lang.Throwable -> L85
                r10.f54664x = r3     // Catch: java.lang.Throwable -> L85
                r10.f54665y = r1     // Catch: java.lang.Throwable -> L85
                r10.f54666z = r2     // Catch: java.lang.Throwable -> L85
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
                sa.i r6 = ua.g.o3(r5)     // Catch: java.lang.Throwable -> L82
                androidx.recyclerview.widget.RecyclerView r6 = r6.C     // Catch: java.lang.Throwable -> L82
                androidx.recyclerview.widget.RecyclerView$h r6 = r6.getAdapter()     // Catch: java.lang.Throwable -> L82
                java.lang.String r7 = "null cannot be cast to non-null type com.dena.mirrativ.notification.present.NoticePresentAdapter"
                jo.p.f(r6, r7)     // Catch: java.lang.Throwable -> L82
                ua.b r6 = (ua.b) r6     // Catch: java.lang.Throwable -> L82
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
            throw new UnsupportedOperationException("Method not decompiled: ua.g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.present.NoticePresentBoxFragment$onCreateView$5", f = "NoticePresentBoxFragment.kt", l = {222}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f54667w;

        /* renamed from: x  reason: collision with root package name */
        public Object f54668x;

        /* renamed from: y  reason: collision with root package name */
        public Object f54669y;

        /* renamed from: z  reason: collision with root package name */
        public int f54670z;

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
                int r1 = r10.f54670z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f54669y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f54668x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f54667w
                ua.g r4 = (ua.g) r4
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
                ua.g r11 = ua.g.this
                ua.h r11 = ua.g.r3(r11)
                wo.x r3 = r11.h()
                ua.g r11 = ua.g.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb3
                r4 = r11
                r11 = r10
            L3d:
                r11.f54667w = r4     // Catch: java.lang.Throwable -> Lb3
                r11.f54668x = r3     // Catch: java.lang.Throwable -> Lb3
                r11.f54669y = r1     // Catch: java.lang.Throwable -> Lb3
                r11.f54670z = r2     // Catch: java.lang.Throwable -> Lb3
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
            throw new UnsupportedOperationException("Method not decompiled: ua.g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.present.NoticePresentBoxFragment$onCreateView$6", f = "NoticePresentBoxFragment.kt", l = {222}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f54671w;

        /* renamed from: x  reason: collision with root package name */
        public Object f54672x;

        /* renamed from: y  reason: collision with root package name */
        public Object f54673y;

        /* renamed from: z  reason: collision with root package name */
        public int f54674z;

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
                int r1 = r8.f54674z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f54673y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f54672x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f54671w
                ua.g r4 = (ua.g) r4
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
                ua.g r9 = ua.g.this
                nf.o r9 = ua.g.p3(r9)
                wo.x r3 = r9.v()
                ua.g r9 = ua.g.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
                r4 = r9
                r9 = r8
            L3d:
                r9.f54671w = r4     // Catch: java.lang.Throwable -> L7b
                r9.f54672x = r3     // Catch: java.lang.Throwable -> L7b
                r9.f54673y = r1     // Catch: java.lang.Throwable -> L7b
                r9.f54674z = r2     // Catch: java.lang.Throwable -> L7b
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
                sa.i r9 = ua.g.o3(r5)     // Catch: java.lang.Throwable -> L78
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
            throw new UnsupportedOperationException("Method not decompiled: ua.g.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ua.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0861g extends q implements io.l<PresentBox, v> {

        /* renamed from: ua.g$g$a */
        /* loaded from: classes2.dex */
        public static final class a extends q implements io.l<AttributedText, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f54676w = new a();

            public a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(AttributedText attributedText) {
                p.h(attributedText, "it");
                return attributedText.getText();
            }
        }

        public C0861g() {
            super(1);
        }

        public final void a(PresentBox presentBox) {
            p.h(presentBox, "presentBox");
            ha.a f10 = g.this.x3().n().f();
            if (f10 != null && f10.a()) {
                return;
            }
            String g02 = a0.g0(presentBox.getAttributedTexts(), "", null, null, 0, null, a.f54676w, 30, null);
            String link = presentBox.getLink();
            if (link == null) {
                link = "";
            }
            if (!presentBox.getDisabled()) {
                g.this.t3().g(presentBox.getUserPresentId());
                String link2 = presentBox.getLink();
                if (link2 != null) {
                    g gVar = g.this;
                    if (link2.length() == 0) {
                        return;
                    }
                    b0 a10 = gVar.y3().a(link2);
                    if (!(a10 instanceof b0.l0)) {
                        HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                        Context N2 = gVar.N2();
                        p.g(N2, "requireContext()");
                        gVar.f3(aVar.a(N2, Referer.Notice.PRESENT_BOX, a10));
                    } else {
                        sd.g.U0.a(presentBox.getLink(), Boolean.FALSE).z3(gVar.O2(), "WebViewDialogFragment");
                    }
                    MRLogger w32 = gVar.w3();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_PRESENT_BUTTON_TAP);
                    builder.setTargetType(presentBox.getType());
                    builder.setTargetId(String.valueOf(presentBox.getUserPresentId()));
                    builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new NoticePresentButtonTapTargetDetail(g02, "imp_gacha").toJson()), wn.q.a("url", link)));
                    w32.sendLog(builder.build());
                    return;
                }
                return;
            }
            of.n.A(g.this.q0(), qa.q.gacha_already_excuted, false);
            MRLogger w33 = g.this.w3();
            MRLog.Companion companion2 = MRLog.Companion;
            MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_PRESENT_BUTTON_TAP);
            builder2.setTargetType(presentBox.getType());
            builder2.setTargetId(String.valueOf(presentBox.getUserPresentId()));
            builder2.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new NoticePresentButtonTapTargetDetail(g02, "failed_executed").toJson()), wn.q.a("url", link)));
            w33.sendLog(builder2.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(PresentBox presentBox) {
            a(presentBox);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<e0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f54677w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f54678x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f54679y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f54677w = componentCallbacks;
            this.f54678x = aVar;
            this.f54679y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e0] */
        @Override // io.a
        public final e0 invoke() {
            ComponentCallbacks componentCallbacks = this.f54677w;
            return gq.a.a(componentCallbacks).c(f0.b(e0.class), this.f54678x, this.f54679y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f54680w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f54681x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f54682y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f54680w = componentCallbacks;
            this.f54681x = aVar;
            this.f54682y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f54680w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f54681x, this.f54682y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f54683w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f54684x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f54685y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f54683w = componentCallbacks;
            this.f54684x = aVar;
            this.f54685y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f54683w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f54684x, this.f54685y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f54686w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f54687x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f54688y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f54686w = componentCallbacks;
            this.f54687x = aVar;
            this.f54688y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f54686w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f54687x, this.f54688y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f54689w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f54689w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f54689w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f54690w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f54690w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f54690w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f54691w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f54692x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f54693y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f54694z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f54691w = aVar;
            this.f54692x = aVar2;
            this.f54693y = aVar3;
            this.f54694z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f54691w;
            vq.a aVar2 = this.f54692x;
            io.a aVar3 = this.f54693y;
            xq.a aVar4 = this.f54694z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(ua.h.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f54695w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f54695w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f54695w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public g() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f54660z0 = wn.g.b(iVar, new h(this, null, null));
        l lVar = new l(this);
        xq.a a10 = gq.a.a(this);
        m mVar = new m(lVar);
        this.A0 = androidx.fragment.app.e0.a(this, f0.b(ua.h.class), new o(mVar), new n(lVar, null, null, a10));
        this.B0 = wn.g.b(iVar, new i(this, null, null));
        this.C0 = wn.g.b(iVar, new j(this, null, null));
        this.D0 = wn.g.b(iVar, new k(this, null, null));
    }

    public static final void A3(g gVar, ha.a aVar) {
        p.h(gVar, "this$0");
        if (aVar instanceof a.d) {
            gVar.u3().D.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            gVar.u3().D.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                gVar.u3().D.b(new StatusView.b.d(gVar.U0(qa.q.f48888f), 0.0f, 2, null));
            } else if ((aVar instanceof a.C0439a) && gVar.x3().l().isEmpty()) {
                StatusView statusView = gVar.u3().D;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = gVar.U0(qa.q.f48886a);
                    p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new c()));
            }
        }
    }

    public static final void B3(g gVar, Integer num) {
        Long f10;
        p.h(gVar, "this$0");
        int c10 = h0.PRESENT_BOX.c();
        if (num != null && num.intValue() == c10 && (f10 = gVar.x3().k().f()) != null && f10.longValue() > 0) {
            gVar.t3().d(f10.longValue());
        }
    }

    public static final void C3(g gVar, Long l10) {
        p.h(gVar, "this$0");
        if (l10 != null && l10.longValue() == 0) {
            return;
        }
        Integer f10 = gVar.v3().p().f();
        int c10 = h0.PRESENT_BOX.c();
        if (f10 != null && f10.intValue() == c10) {
            e0 t32 = gVar.t3();
            p.g(l10, "noticeLatestTime");
            t32.d(l10.longValue());
        }
    }

    public static final void z3(g gVar) {
        p.h(gVar, "this$0");
        boolean z10 = false;
        gVar.u3().B.setRefreshing(false);
        ha.a f10 = gVar.x3().n().f();
        if (f10 != null && f10.a()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        gVar.t3().f();
    }

    public final void D3(sa.i iVar) {
        this.f54659y0.a(this, F0[0], iVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        sa.i T = sa.i.T(LayoutInflater.from(N2()), viewGroup, false);
        p.g(T, "inflate(\n            Lay…          false\n        )");
        D3(T);
        u3().B.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: ua.f
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                g.z3(g.this);
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
        ua.b bVar = new ua.b(new C0861g());
        bVar.f(x3().l());
        u3().C.setAdapter(bVar);
        u3().C.k(new b());
        x3().n().i(a1(), new androidx.lifecycle.f0() { // from class: ua.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                g.A3(g.this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        v3().p().i(a1(), new androidx.lifecycle.f0() { // from class: ua.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                g.B3(g.this, (Integer) obj);
            }
        });
        x3().k().i(a1(), new androidx.lifecycle.f0() { // from class: ua.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                g.C3(g.this, (Long) obj);
            }
        });
        if (x3().l().isEmpty()) {
            t3().f();
        }
        View u10 = u3().u();
        p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f54658x0.getCoroutineContext();
    }

    public final e0 t3() {
        return (e0) this.f54660z0.getValue();
    }

    public final sa.i u3() {
        return (sa.i) this.f54659y0.b(this, F0[0]);
    }

    public final nf.o v3() {
        return (nf.o) this.B0.getValue();
    }

    public final MRLogger w3() {
        return (MRLogger) this.C0.getValue();
    }

    public final ua.h x3() {
        return (ua.h) this.A0.getValue();
    }

    public final of.k y3() {
        return (of.k) this.D0.getValue();
    }
}
