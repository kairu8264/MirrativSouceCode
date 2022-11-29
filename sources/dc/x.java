package dc;

import ac.l2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.UserProfileYellStatusConditionView;
import com.dena.mirrorman.net.MRUrl;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.unity.UnityStore;
import hf.d0;
import java.util.List;
import jo.f0;
import nf.i0;
import nf.o0;
import od.t0;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;
import ud.x4;
import ud.y4;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class x extends sd.a implements oq.a, q0 {

    /* renamed from: d0  reason: collision with root package name */
    public static final a f29457d0 = new a(null);

    /* renamed from: e0  reason: collision with root package name */
    public static final int f29458e0 = 8;
    public final od.a G;
    public final i0 H;
    public final String I;
    public final String J;
    public final boolean K;
    public final ao.g L;
    public final wn.f M;
    public final wn.f N;
    public final wn.f O;
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;

    /* renamed from: a0  reason: collision with root package name */
    public final x4 f29459a0;

    /* renamed from: b0  reason: collision with root package name */
    public final l2 f29460b0;

    /* renamed from: c0  reason: collision with root package name */
    public c f29461c0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            jo.p.h(view, "v");
            jo.p.h(motionEvent, "event");
            ScrollView scrollView = view instanceof ScrollView ? (ScrollView) view : null;
            if (scrollView == null) {
                return view.onTouchEvent(motionEvent);
            }
            if (scrollView.getMeasuredHeight() < scrollView.getChildAt(0).getHeight()) {
                return scrollView.onTouchEvent(motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                x.this.s((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    x.this.m((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked != 3) {
                    return false;
                } else {
                    x.this.setMoved(false);
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void j(String str);
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<uq.a> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(x.this.I);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.UserProfileFloatingView$observeStoreValues$1", f = "UserProfileFloatingView.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f29464w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29465x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29466y;

        /* renamed from: z  reason: collision with root package name */
        public int f29467z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #0 {all -> 0x010a, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:20:0x0070, B:22:0x00a0, B:23:0x00cd, B:25:0x00d3, B:26:0x00e1, B:28:0x00f5, B:29:0x00fe, B:12:0x0041, B:11:0x0037), top: B:39:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.x.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.UserProfileFloatingView$observeStoreValues$2", f = "UserProfileFloatingView.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f29468w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29469x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29470y;

        /* renamed from: z  reason: collision with root package name */
        public int f29471z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
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
                int r1 = r8.f29471z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f29470y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f29469x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f29468w
                dc.x r4 = (dc.x) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L77
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
                dc.x r9 = dc.x.this
                nf.b r9 = dc.x.L(r9)
                wo.x r3 = r9.p()
                dc.x r9 = dc.x.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L77
                r4 = r9
                r9 = r8
            L3d:
                r9.f29468w = r4     // Catch: java.lang.Throwable -> L77
                r9.f29469x = r3     // Catch: java.lang.Throwable -> L77
                r9.f29470y = r1     // Catch: java.lang.Throwable -> L77
                r9.f29471z = r2     // Catch: java.lang.Throwable -> L77
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L77
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L74
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L74
                if (r9 == 0) goto L6e
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L74
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L74
                dc.x.Q(r5, r9)     // Catch: java.lang.Throwable -> L74
                r5.l()     // Catch: java.lang.Throwable -> L74
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6e:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L74:
                r9 = move-exception
                r3 = r4
                goto L78
            L77:
                r9 = move-exception
            L78:
                throw r9     // Catch: java.lang.Throwable -> L79
            L79:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.x.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.UserProfileFloatingView$observeStoreValues$3", f = "UserProfileFloatingView.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f29472w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29473x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29474y;

        /* renamed from: z  reason: collision with root package name */
        public int f29475z;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:18:0x006e, B:20:0x0074, B:21:0x0093, B:25:0x00a0, B:27:0x00b1, B:12:0x0041, B:30:0x00b7, B:11:0x0037), top: B:40:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Object r0 = bo.c.c()
                int r2 = r1.f29475z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f29474y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f29473x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f29472w
                dc.x r5 = (dc.x) r5
                wn.m.b(r19)     // Catch: java.lang.Throwable -> Lc2
                r7 = r19
                r6 = r1
                goto L50
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L28:
                wn.m.b(r19)
                dc.x r2 = dc.x.this
                nf.b r2 = dc.x.L(r2)
                wo.x r4 = r2.m()
                dc.x r2 = dc.x.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> Lc2
                r6 = r1
                r17 = r5
                r5 = r2
                r2 = r17
            L41:
                r6.f29472w = r5     // Catch: java.lang.Throwable -> Lc2
                r6.f29473x = r4     // Catch: java.lang.Throwable -> Lc2
                r6.f29474y = r2     // Catch: java.lang.Throwable -> Lc2
                r6.f29475z = r3     // Catch: java.lang.Throwable -> Lc2
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> Lc2
                if (r7 != r0) goto L50
                return r0
            L50:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lc2
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lc2
                r8 = 0
                if (r7 == 0) goto Lbc
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> Lc2
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> Lc2
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc2
                r10 = 10
                int r10 = xn.t.u(r7, r10)     // Catch: java.lang.Throwable -> Lc2
                r9.<init>(r10)     // Catch: java.lang.Throwable -> Lc2
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lc2
            L6e:
                boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> Lc2
                if (r10 == 0) goto L93
                java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> Lc2
                com.dena.mirrorman.net.api.response.App$AppParams r10 = (com.dena.mirrorman.net.api.response.App.AppParams) r10     // Catch: java.lang.Throwable -> Lc2
                ud.c r15 = new ud.c     // Catch: java.lang.Throwable -> Lc2
                java.lang.String r12 = r10.getAppId()     // Catch: java.lang.Throwable -> Lc2
                java.lang.String r13 = r10.getIconUrl()     // Catch: java.lang.Throwable -> Lc2
                r14 = 0
                r10 = 4
                r16 = 0
                r11 = r15
                r3 = r15
                r15 = r10
                r11.<init>(r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lc2
                r9.add(r3)     // Catch: java.lang.Throwable -> Lc2
                r3 = 1
                goto L6e
            L93:
                ud.x4 r3 = dc.x.I(r5)     // Catch: java.lang.Throwable -> Lc2
                boolean r7 = r9.isEmpty()     // Catch: java.lang.Throwable -> Lc2
                if (r7 != 0) goto L9f
                r7 = 1
                goto La0
            L9f:
                r7 = 0
            La0:
                r3.c0(r7)     // Catch: java.lang.Throwable -> Lc2
                ac.l2 r3 = dc.x.J(r5)     // Catch: java.lang.Throwable -> Lc2
                androidx.recyclerview.widget.RecyclerView r3 = r3.B     // Catch: java.lang.Throwable -> Lc2
                androidx.recyclerview.widget.RecyclerView$h r3 = r3.getAdapter()     // Catch: java.lang.Throwable -> Lc2
                boolean r7 = r3 instanceof rd.c     // Catch: java.lang.Throwable -> Lc2
                if (r7 == 0) goto Lb4
                r8 = r3
                rd.c r8 = (rd.c) r8     // Catch: java.lang.Throwable -> Lc2
            Lb4:
                if (r8 != 0) goto Lb7
                goto Lba
            Lb7:
                r8.h(r9)     // Catch: java.lang.Throwable -> Lc2
            Lba:
                r3 = 1
                goto L41
            Lbc:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            Lc2:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> Lc5
            Lc5:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.x.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.UserProfileFloatingView$observeStoreValues$4", f = "UserProfileFloatingView.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f29476w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29477x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29478y;

        /* renamed from: z  reason: collision with root package name */
        public int f29479z;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007e, TryCatch #2 {all -> 0x007e, blocks: (B:17:0x0054, B:19:0x005c, B:23:0x006f), top: B:38:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
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
                int r1 = r8.f29479z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f29478y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f29477x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f29476w
                dc.x r4 = (dc.x) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L81
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
                dc.x r9 = dc.x.this
                nf.b r9 = dc.x.L(r9)
                wo.x r3 = r9.v()
                dc.x r9 = dc.x.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L81
                r4 = r9
                r9 = r8
            L3d:
                r9.f29476w = r4     // Catch: java.lang.Throwable -> L81
                r9.f29477x = r3     // Catch: java.lang.Throwable -> L81
                r9.f29478y = r1     // Catch: java.lang.Throwable -> L81
                r9.f29479z = r2     // Catch: java.lang.Throwable -> L81
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L81
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7e
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7e
                if (r9 == 0) goto L78
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L7e
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7e
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7e
                ud.x4 r6 = dc.x.I(r5)     // Catch: java.lang.Throwable -> L7e
                if (r9 == 0) goto L6e
                r9 = r2
                goto L6f
            L6e:
                r9 = 0
            L6f:
                r6.Q(r9)     // Catch: java.lang.Throwable -> L7e
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L78:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L7e:
                r9 = move-exception
                r3 = r4
                goto L82
            L81:
                r9 = move-exception
            L82:
                throw r9     // Catch: java.lang.Throwable -> L83
            L83:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.x.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.UserProfileFloatingView$observeStoreValues$5", f = "UserProfileFloatingView.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f29480w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29481x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29482y;

        /* renamed from: z  reason: collision with root package name */
        public int f29483z;

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
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
                int r1 = r8.f29483z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f29482y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f29481x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f29480w
                dc.x r4 = (dc.x) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                dc.x r9 = dc.x.this
                nf.b r9 = dc.x.L(r9)
                wo.x r3 = r9.n()
                dc.x r9 = dc.x.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f29480w = r4     // Catch: java.lang.Throwable -> L74
                r9.f29481x = r3     // Catch: java.lang.Throwable -> L74
                r9.f29482y = r1     // Catch: java.lang.Throwable -> L74
                r9.f29483z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                dc.x.Q(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.x.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.UserProfileFloatingView$observeStoreValues$6", f = "UserProfileFloatingView.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f29484w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29485x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29486y;

        /* renamed from: z  reason: collision with root package name */
        public int f29487z;

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
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
                int r1 = r8.f29487z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f29486y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f29485x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f29484w
                dc.x r4 = (dc.x) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                dc.x r9 = dc.x.this
                nf.b r9 = dc.x.L(r9)
                wo.x r3 = r9.o()
                dc.x r9 = dc.x.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f29484w = r4     // Catch: java.lang.Throwable -> L74
                r9.f29485x = r3     // Catch: java.lang.Throwable -> L74
                r9.f29486y = r1     // Catch: java.lang.Throwable -> L74
                r9.f29487z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                dc.x.Q(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.x.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.UserProfileFloatingView$observeStoreValues$7", f = "UserProfileFloatingView.kt", l = {455}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f29488w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29489x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29490y;

        /* renamed from: z  reason: collision with root package name */
        public int f29491z;

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x014b, TryCatch #1 {all -> 0x014b, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0075, B:23:0x00bb, B:27:0x00c4, B:28:0x00c6, B:30:0x00ce, B:29:0x00cb, B:31:0x00d2, B:33:0x0115, B:35:0x011b, B:37:0x0128, B:41:0x0131, B:42:0x0133, B:44:0x013b, B:43:0x0138), top: B:57:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 341
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.x.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<wn.v> {
        public l() {
            super(0);
        }

        public final void a() {
            MRLogger logger = x.this.getLogger();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CHEER_FUNCTION_LP_IMP);
            builder.setTargetId(MRLog.TARGET_ID_IMP);
            builder.setPageId("view_profile");
            logger.sendLog(builder.build());
            x.this.l();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends RecyclerView.u {
        public m() {
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
            List<App.AppParams> l10 = x.this.getBroadcastUserProfileStore().l();
            String q10 = x.this.getBroadcastUserProfileStore().q();
            if (x.this.getBroadcastUserProfileStore().w()) {
                return;
            }
            if ((q10.length() == 0) || l10.size() > linearLayoutManager.l2() + 10) {
                return;
            }
            x.this.G.j(x.this.I, q10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29494w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29495x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29494w = aVar;
            this.f29495x = aVar2;
            this.f29496y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29494w;
            vq.a aVar2 = this.f29495x;
            io.a<? extends uq.a> aVar3 = this.f29496y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29497w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29498x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29499y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29497w = aVar;
            this.f29498x = aVar2;
            this.f29499y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29497w;
            vq.a aVar2 = this.f29498x;
            io.a<? extends uq.a> aVar3 = this.f29499y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<nf.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29500w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29501x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29502y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29500w = aVar;
            this.f29501x = aVar2;
            this.f29502y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.b] */
        @Override // io.a
        public final nf.b invoke() {
            xq.a b10;
            oq.a aVar = this.f29500w;
            vq.a aVar2 = this.f29501x;
            io.a<? extends uq.a> aVar3 = this.f29502y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29503w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29504x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29505y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29503w = aVar;
            this.f29504x = aVar2;
            this.f29505y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f29503w;
            vq.a aVar2 = this.f29504x;
            io.a<? extends uq.a> aVar3 = this.f29505y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(od.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29506w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29507x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29508y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29506w = aVar;
            this.f29507x = aVar2;
            this.f29508y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29506w;
            vq.a aVar2 = this.f29507x;
            io.a<? extends uq.a> aVar3 = this.f29508y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29509w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29510x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29511y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29509w = aVar;
            this.f29510x = aVar2;
            this.f29511y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            xq.a b10;
            oq.a aVar = this.f29509w;
            vq.a aVar2 = this.f29510x;
            io.a<? extends uq.a> aVar3 = this.f29511y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(UnityStore.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29512w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29513x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29514y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29512w = aVar;
            this.f29513x = aVar2;
            this.f29514y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            xq.a b10;
            oq.a aVar = this.f29512w;
            vq.a aVar2 = this.f29513x;
            io.a<? extends uq.a> aVar3 = this.f29514y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(kf.x.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29515w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29516x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29517y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29515w = aVar;
            this.f29516x = aVar2;
            this.f29517y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final d0 invoke() {
            xq.a b10;
            oq.a aVar = this.f29515w;
            vq.a aVar2 = this.f29516x;
            io.a<? extends uq.a> aVar3 = this.f29517y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(d0.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29518w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29519x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29520y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29518w = aVar;
            this.f29519x = aVar2;
            this.f29520y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o0] */
        @Override // io.a
        public final o0 invoke() {
            xq.a b10;
            oq.a aVar = this.f29518w;
            vq.a aVar2 = this.f29519x;
            io.a<? extends uq.a> aVar3 = this.f29520y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(o0.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<t0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29521w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29522x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29523y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29521w = aVar;
            this.f29522x = aVar2;
            this.f29523y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.t0] */
        @Override // io.a
        public final t0 invoke() {
            xq.a b10;
            oq.a aVar = this.f29521w;
            vq.a aVar2 = this.f29522x;
            io.a<? extends uq.a> aVar3 = this.f29523y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(t0.class), aVar2, aVar3);
        }
    }

    /* renamed from: dc.x$x  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0283x extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29524w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29525x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29526y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0283x(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29524w = aVar;
            this.f29525x = aVar2;
            this.f29526y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f29524w;
            vq.a aVar2 = this.f29525x;
            io.a<? extends uq.a> aVar3 = this.f29526y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<uq.a> {
        public y() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(x.this.J, x.this.I);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<uq.a> {
        public z() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(x.this.I);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, od.a aVar, i0 i0Var, String str, String str2, boolean z10) {
        super(context);
        b0 b10;
        jo.p.h(context, "context");
        jo.p.h(aVar, "broadcastActionCreator");
        jo.p.h(i0Var, "streamStore");
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        this.G = aVar;
        this.H = i0Var;
        this.I = str;
        this.J = str2;
        this.K = z10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.L = c10.plus(b10);
        d dVar = new d();
        cr.a aVar2 = cr.a.f28611a;
        this.M = wn.g.b(aVar2.b(), new p(this, null, dVar));
        this.N = wn.g.b(aVar2.b(), new q(this, null, null));
        this.O = wn.g.b(aVar2.b(), new r(this, null, null));
        this.P = wn.g.b(aVar2.b(), new s(this, null, null));
        this.Q = wn.g.b(aVar2.b(), new t(this, null, null));
        this.R = wn.g.b(aVar2.b(), new u(this, null, null));
        this.S = wn.g.b(aVar2.b(), new v(this, null, new z()));
        this.T = wn.g.b(aVar2.b(), new w(this, null, new y()));
        this.U = wn.g.b(aVar2.b(), new C0283x(this, null, null));
        this.V = wn.g.b(aVar2.b(), new n(this, null, null));
        this.W = wn.g.b(aVar2.b(), new o(this, null, null));
        x4 x4Var = new x4();
        this.f29459a0 = x4Var;
        l2 l2Var = (l2) androidx.databinding.f.e(LayoutInflater.from(context), xb.p.floating_view_user_profile, this, true);
        l2Var.T(x4Var);
        this.f29460b0 = l2Var;
        getBroadcastUserProfileStore().j();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, q(), 520, -3);
        layoutParams.gravity = 17;
        layoutParams.windowAnimations = 0;
        layoutParams.rotationAnimation = 0;
        layoutParams.layoutAnimationParameters = null;
        setMLayoutParams(layoutParams);
        l2Var.B.setAdapter(new rd.c());
        W();
        X();
        U();
        aVar.k(str, str2);
        aVar.l(str);
        t0.q(getUserProfileActionCreator(), str2, str, getLiveHelper().c(), "", jo.p.c(str, getUserPreference().T4()), null, 32, null);
    }

    public static final void V(x xVar, y4 y4Var) {
        jo.p.h(xVar, "this$0");
        UserProfileYellStatusConditionView userProfileYellStatusConditionView = xVar.f29460b0.f910i0;
        jo.p.g(y4Var, "bindModel");
        userProfileYellStatusConditionView.a(y4Var, new l());
    }

    public static final void Y(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        xVar.f29460b0.f903b0.setVisibility(8);
        Context context = xVar.getContext();
        WebViewActivity.a aVar = WebViewActivity.X;
        Context context2 = xVar.getContext();
        jo.p.g(context2, "context");
        context.startActivity(WebViewActivity.a.b(aVar, context2, MRUrl.Moderator.INSTANCE.getUrl(), false, false, 12, null));
    }

    public static final void Z(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        if (jo.p.c(xVar.getCastServiceStore().I0().f(), Boolean.TRUE)) {
            return;
        }
        xVar.k0();
    }

    public static final void a0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        if (jo.p.c(xVar.getCastServiceStore().I0().f(), Boolean.TRUE)) {
            return;
        }
        xVar.k0();
    }

    public static final void b0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        if (jo.p.c(xVar.getCastServiceStore().I0().f(), Boolean.TRUE)) {
            return;
        }
        xVar.j0();
    }

    public static final void c0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        if (jo.p.c(xVar.getCastServiceStore().I0().f(), Boolean.TRUE)) {
            return;
        }
        xVar.i0();
    }

    public static final void d0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        String str = xVar.K ? Referer.LiveView.PROFILE_COLLAB_MATCHING : xVar.J;
        if (xVar.getBroadcastUserProfileStore().u()) {
            xVar.G.n(xVar.I, str);
        } else {
            xVar.G.h(xVar.I, str);
        }
    }

    public static final void e0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        int[] iArr = new int[2];
        xVar.f29460b0.U.getLocationOnScreen(iArr);
        fa.c floatViewManager = xVar.getFloatViewManager();
        Context context = xVar.getContext();
        jo.p.g(context, "context");
        UserProfile s10 = xVar.getBroadcastUserProfileStore().s();
        boolean z10 = true;
        if (s10 == null || !s10.isBlocking()) {
            z10 = false;
        }
        floatViewManager.f(new dc.y(context, iArr, z10, xVar.G, xVar.I, xVar.J));
    }

    public static final void f0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        xVar.l();
    }

    public static final void g0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        xVar.l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.b getBroadcastUserProfileStore() {
        return (nf.b) this.M.getValue();
    }

    private final od.b getCastActionCreator() {
        return (od.b) this.N.getValue();
    }

    private final nf.c getCastServiceStore() {
        return (nf.c) this.O.getValue();
    }

    private final fa.c getFloatViewManager() {
        return (fa.c) this.W.getValue();
    }

    private final tb.c getIntentResolver() {
        return (tb.c) this.V.getValue();
    }

    private final d0 getLiveHelper() {
        return (d0) this.R.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRLogger getLogger() {
        return (MRLogger) this.U.getValue();
    }

    private final UnityStore getUnityStore() {
        return (UnityStore) this.P.getValue();
    }

    private final kf.x getUserPreference() {
        return (kf.x) this.Q.getValue();
    }

    private final t0 getUserProfileActionCreator() {
        return (t0) this.T.getValue();
    }

    private final o0 getUserProfileStore() {
        return (o0) this.S.getValue();
    }

    public static final void h0(x xVar, View view) {
        jo.p.h(xVar, "this$0");
        xVar.f29460b0.R.setEnabled(false);
        c cVar = xVar.f29461c0;
        if (cVar != null) {
            cVar.j(xVar.I);
        }
        xVar.f29460b0.R.setEnabled(true);
    }

    public final void T(MRError mRError) {
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(getContext(), mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(getContext(), mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.z(getContext());
        }
    }

    public final void U() {
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        androidx.lifecycle.u c10 = de.n.c(this);
        if (c10 != null) {
            getUserProfileStore().A().i(c10, new androidx.lifecycle.f0() { // from class: dc.n
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    x.V(x.this, (y4) obj);
                }
            });
        }
        MRLogger logger = getLogger();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_PROFILE);
        builder.setTargetId(this.I);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, getLiveHelper().c())));
        logger.sendLog(builder.build());
    }

    public final void W() {
        this.f29460b0.f902a0.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        int b10 = de.n.b(this, 4);
        int b11 = de.n.b(this, 16);
        this.f29460b0.f902a0.g(new p001if.c(b10, b11, 0, b11, 0, 0));
        this.f29460b0.B.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        int b12 = de.n.b(this, 8);
        int b13 = de.n.b(this, 16);
        this.f29460b0.B.g(new p001if.c(b12, b13, 0, b13, 0, 0));
        if (this.K) {
            this.f29460b0.P.setVisibility(0);
        } else {
            this.f29460b0.P.setVisibility(8);
        }
        if (jo.p.c(this.I, getUserPreference().T4()) || this.K) {
            this.f29460b0.R.setVisibility(8);
        }
    }

    public final void X() {
        this.f29460b0.f903b0.setOnTouchListener(new b());
        this.f29460b0.B.k(new m());
        this.f29460b0.L.setOnClickListener(new View.OnClickListener() { // from class: dc.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.d0(x.this, view);
            }
        });
        this.f29460b0.U.setOnClickListener(new View.OnClickListener() { // from class: dc.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.e0(x.this, view);
            }
        });
        this.f29460b0.J.setOnClickListener(new View.OnClickListener() { // from class: dc.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.f0(x.this, view);
            }
        });
        this.f29460b0.f904c0.setOnClickListener(new View.OnClickListener() { // from class: dc.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.g0(x.this, view);
            }
        });
        this.f29460b0.R.setOnClickListener(new View.OnClickListener() { // from class: dc.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.h0(x.this, view);
            }
        });
        this.f29460b0.S.setOnClickListener(new View.OnClickListener() { // from class: dc.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.Y(x.this, view);
            }
        });
        this.f29460b0.W.setOnClickListener(new View.OnClickListener() { // from class: dc.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.Z(x.this, view);
            }
        });
        this.f29460b0.f907f0.setOnClickListener(new View.OnClickListener() { // from class: dc.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.a0(x.this, view);
            }
        });
        this.f29460b0.O.setOnClickListener(new View.OnClickListener() { // from class: dc.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.b0(x.this, view);
            }
        });
        this.f29460b0.N.setOnClickListener(new View.OnClickListener() { // from class: dc.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.c0(x.this, view);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.L;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void i0() {
        tb.c intentResolver = getIntentResolver();
        Context context = getContext();
        jo.p.g(context, "context");
        Intent I = intentResolver.I(context, this.I, 1);
        I.setFlags(268435456);
        getContext().startActivity(I);
        l();
    }

    public final void j0() {
        tb.c intentResolver = getIntentResolver();
        Context context = getContext();
        jo.p.g(context, "context");
        Intent I = intentResolver.I(context, this.I, 0);
        I.setFlags(268435456);
        getContext().startActivity(I);
        l();
    }

    public final void k0() {
        Intent s10;
        if (getUnityStore().isPlayingGame().getValue().booleanValue()) {
            od.b castActionCreator = getCastActionCreator();
            String string = getResources().getString(xb.r.f60074f);
            jo.p.g(string, "resources.getString(R.string.error_unable)");
            castActionCreator.P(string);
            return;
        }
        if (jo.p.c(this.I, getUserPreference().T4())) {
            tb.c intentResolver = getIntentResolver();
            Context context = getContext();
            jo.p.g(context, "context");
            s10 = intentResolver.z0(context);
        } else {
            tb.c intentResolver2 = getIntentResolver();
            Context context2 = getContext();
            jo.p.g(context2, "context");
            s10 = intentResolver2.s(context2, this.I, this.J);
        }
        s10.setFlags(268435456);
        getContext().startActivity(s10);
        l();
    }

    public final void l0() {
        String twitterScreenName;
        UserProfile s10 = getBroadcastUserProfileStore().s();
        if (s10 == null || (twitterScreenName = s10.getTwitterScreenName()) == null) {
            return;
        }
        if (twitterScreenName.length() == 0) {
            return;
        }
        Context context = getContext();
        of.n.r(context, "https://twitter.com/" + twitterScreenName);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dq.c.c().p(this);
        Context context = getContext();
        this.f29461c0 = context instanceof c ? (c) context : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dq.c.c().r(this);
        getBroadcastUserProfileStore().k();
        r0.d(this, null, 1, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onWebViewPaused(ce.v vVar) {
        jo.p.h(vVar, "event");
        this.f29460b0.f903b0.setVisibility(0);
    }
}
