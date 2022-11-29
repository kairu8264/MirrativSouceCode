package lc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.q0;
import be.s0;
import be.v0;
import be.x0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class k extends androidx.fragment.app.e implements q0 {
    public lc.l P0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final androidx.recyclerview.widget.s W0;
    public static final /* synthetic */ qo.h<Object>[] Y0 = {jo.f0.d(new jo.s(k.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentFavoriteLiveSettingsBinding;", 0))};
    public static final a X0 = new a(null);
    public static final int Z0 = 8;
    public final /* synthetic */ da.j N0 = new da.j();
    public final AutoClearedValue O0 = nd.a.a(this);
    public final wn.f Q0 = wn.g.a(new b());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(String str) {
            jo.p.h(str, "referer");
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_REFERER", str);
            kVar.V2(bundle);
            return kVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = k.this.M2().getString("BUNDLE_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsDialog$setupObserveValues$1", f = "FavoriteLiveSettingsDialog.kt", l = {278}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f39875w;

        /* renamed from: x  reason: collision with root package name */
        public Object f39876x;

        /* renamed from: y  reason: collision with root package name */
        public Object f39877y;

        /* renamed from: z  reason: collision with root package name */
        public int f39878z;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:18:0x0081, B:20:0x0087, B:22:0x008f, B:23:0x0092, B:24:0x00b2, B:12:0x0041, B:11:0x0037), top: B:34:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
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
                int r2 = r1.f39878z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f39877y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f39876x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f39875w
                lc.k r5 = (lc.k) r5
                wn.m.b(r19)     // Catch: java.lang.Throwable -> Lbc
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
                lc.k r2 = lc.k.this
                lc.m r2 = lc.k.G3(r2)
                wo.x r4 = r2.k()
                lc.k r2 = lc.k.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> Lbc
                r6 = r1
                r17 = r5
                r5 = r2
                r2 = r17
            L41:
                r6.f39875w = r5     // Catch: java.lang.Throwable -> Lbc
                r6.f39876x = r4     // Catch: java.lang.Throwable -> Lbc
                r6.f39877y = r2     // Catch: java.lang.Throwable -> Lbc
                r6.f39878z = r3     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> Lbc
                if (r7 != r0) goto L50
                return r0
            L50:
                r8 = 0
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lbc
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lbc
                if (r7 == 0) goto Lb6
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> Lbc
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> Lbc
                ac.i0 r8 = lc.k.F3(r5)     // Catch: java.lang.Throwable -> Lbc
                androidx.recyclerview.widget.RecyclerView r8 = r8.D     // Catch: java.lang.Throwable -> Lbc
                androidx.recyclerview.widget.RecyclerView$h r8 = r8.getAdapter()     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r9 = "null cannot be cast to non-null type com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingAdapter"
                jo.p.f(r8, r9)     // Catch: java.lang.Throwable -> Lbc
                lc.a r8 = (lc.a) r8     // Catch: java.lang.Throwable -> Lbc
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbc
                r10 = 10
                int r10 = xn.t.u(r7, r10)     // Catch: java.lang.Throwable -> Lbc
                r9.<init>(r10)     // Catch: java.lang.Throwable -> Lbc
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lbc
                r10 = 0
                r11 = r10
            L81:
                boolean r12 = r7.hasNext()     // Catch: java.lang.Throwable -> Lbc
                if (r12 == 0) goto Lb2
                java.lang.Object r12 = r7.next()     // Catch: java.lang.Throwable -> Lbc
                int r13 = r11 + 1
                if (r11 >= 0) goto L92
                xn.s.t()     // Catch: java.lang.Throwable -> Lbc
            L92:
                com.dena.mirrorman.net.api.response.FavoriteLiveSetting r12 = (com.dena.mirrorman.net.api.response.FavoriteLiveSetting) r12     // Catch: java.lang.Throwable -> Lbc
                lc.b$a r11 = lc.b.f39829k     // Catch: java.lang.Throwable -> Lbc
                int r14 = xb.r.text_favorite_number     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object[] r15 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r16 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> Lbc
                r15[r10] = r16     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r14 = r5.V0(r14, r15)     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r15 = "getString(R.string.text_…, (index + 1).toString())"
                jo.p.g(r14, r15)     // Catch: java.lang.Throwable -> Lbc
                lc.b r11 = r11.a(r12, r14)     // Catch: java.lang.Throwable -> Lbc
                r9.add(r11)     // Catch: java.lang.Throwable -> Lbc
                r11 = r13
                goto L81
            Lb2:
                r8.f(r9)     // Catch: java.lang.Throwable -> Lbc
                goto L41
            Lb6:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            Lbc:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> Lbf
            Lbf:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: lc.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsDialog$setupObserveValues$2", f = "FavoriteLiveSettingsDialog.kt", l = {278}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f39879w;

        /* renamed from: x  reason: collision with root package name */
        public Object f39880x;

        /* renamed from: y  reason: collision with root package name */
        public Object f39881y;

        /* renamed from: z  reason: collision with root package name */
        public int f39882z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
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
                int r1 = r10.f39882z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f39881y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f39880x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f39879w
                lc.k r4 = (lc.k) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L84
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
                lc.k r11 = lc.k.this
                lc.m r11 = lc.k.G3(r11)
                wo.x r3 = r11.m()
                lc.k r11 = lc.k.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L84
                r4 = r11
                r11 = r10
            L3d:
                r11.f39879w = r4     // Catch: java.lang.Throwable -> L84
                r11.f39880x = r3     // Catch: java.lang.Throwable -> L84
                r11.f39881y = r1     // Catch: java.lang.Throwable -> L84
                r11.f39882z = r2     // Catch: java.lang.Throwable -> L84
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> L84
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
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L81
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L81
                if (r11 == 0) goto L7b
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L81
                wn.v r11 = (wn.v) r11     // Catch: java.lang.Throwable -> L81
                of.n r11 = of.n.f45411a     // Catch: java.lang.Throwable -> L81
                android.content.Context r6 = r5.N2()     // Catch: java.lang.Throwable -> L81
                int r7 = xb.r.text_save_to_favorite     // Catch: java.lang.Throwable -> L81
                java.lang.String r7 = r5.U0(r7)     // Catch: java.lang.Throwable -> L81
                r8 = 0
                r11.B(r6, r7, r8)     // Catch: java.lang.Throwable -> L81
                lc.k.H3(r5)     // Catch: java.lang.Throwable -> L81
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7b:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            L81:
                r11 = move-exception
                r3 = r4
                goto L85
            L84:
                r11 = move-exception
            L85:
                throw r11     // Catch: java.lang.Throwable -> L86
            L86:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lc.k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsDialog$setupObserveValues$3", f = "FavoriteLiveSettingsDialog.kt", l = {278}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f39883w;

        /* renamed from: x  reason: collision with root package name */
        public Object f39884x;

        /* renamed from: y  reason: collision with root package name */
        public Object f39885y;

        /* renamed from: z  reason: collision with root package name */
        public int f39886z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:27:0x007e, B:28:0x0086, B:30:0x0092, B:31:0x009d, B:22:0x0068), top: B:46:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
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
                int r1 = r10.f39886z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f39885y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f39884x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f39883w
                lc.k r4 = (lc.k) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb0
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
                lc.k r11 = lc.k.this
                lc.m r11 = lc.k.G3(r11)
                wo.x r3 = r11.i()
                lc.k r11 = lc.k.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb0
                r4 = r11
                r11 = r10
            L3d:
                r11.f39883w = r4     // Catch: java.lang.Throwable -> Lb0
                r11.f39884x = r3     // Catch: java.lang.Throwable -> Lb0
                r11.f39885y = r1     // Catch: java.lang.Throwable -> Lb0
                r11.f39886z = r2     // Catch: java.lang.Throwable -> Lb0
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb0
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
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lad
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lad
                if (r11 == 0) goto La7
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lad
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Lad
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lad
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lad
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Lad
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lad
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lad
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Lad
                goto La1
            L7a:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lad
                if (r6 == 0) goto L86
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lad
                of.n.z(r11)     // Catch: java.lang.Throwable -> Lad
                goto La1
            L86:
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lad
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lad
                if (r11 != 0) goto L9d
                int r11 = xb.r.f60070c     // Catch: java.lang.Throwable -> Lad
                java.lang.String r11 = r5.U0(r11)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r8 = "getString(R.string.error_access)"
                jo.p.g(r11, r8)     // Catch: java.lang.Throwable -> Lad
            L9d:
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> Lad
            La1:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La7:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Lad:
                r11 = move-exception
                r3 = r4
                goto Lb1
            Lb0:
                r11 = move-exception
            Lb1:
                throw r11     // Catch: java.lang.Throwable -> Lb2
            Lb2:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lc.k.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends RecyclerView.u {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            k.this.a4();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            k.this.Y3();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            k.this.K3().D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int width = (k.this.K3().D.getWidth() - de.e.b(k.this, 200)) / 2;
            k.this.K3().D.g(new p001if.c(de.e.b(k.this, 20), width, 0, width, 0, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<wn.v> {
        public h() {
            super(0);
        }

        public final void a() {
            k.this.Y3();
            k.this.a4();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<lc.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39890w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39891x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39890w = componentCallbacks;
            this.f39891x = aVar;
            this.f39892y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [lc.m, java.lang.Object] */
        @Override // io.a
        public final lc.m invoke() {
            ComponentCallbacks componentCallbacks = this.f39890w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(lc.m.class), this.f39891x, this.f39892y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<lc.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39893w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39894x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39893w = componentCallbacks;
            this.f39894x = aVar;
            this.f39895y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lc.e] */
        @Override // io.a
        public final lc.e invoke() {
            ComponentCallbacks componentCallbacks = this.f39893w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(lc.e.class), this.f39894x, this.f39895y);
        }
    }

    /* renamed from: lc.k$k  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0575k extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39896w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39897x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39898y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0575k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39896w = componentCallbacks;
            this.f39897x = aVar;
            this.f39898y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f39896w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f39897x, this.f39898y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39899w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39900x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39899w = componentCallbacks;
            this.f39900x = aVar;
            this.f39901y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f39899w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f39900x, this.f39901y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39902w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39903x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39904y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39902w = componentCallbacks;
            this.f39903x = aVar;
            this.f39904y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f39902w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f39903x, this.f39904y);
        }
    }

    public k() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R0 = wn.g.b(iVar, new i(this, null, null));
        this.S0 = wn.g.b(iVar, new j(this, null, null));
        this.T0 = wn.g.b(iVar, new C0575k(this, null, null));
        this.U0 = wn.g.b(iVar, new l(this, null, null));
        this.V0 = wn.g.b(iVar, new m(this, null, null));
        this.W0 = new androidx.recyclerview.widget.s();
    }

    public static final void S3(k kVar, StatusView.b bVar) {
        jo.p.h(kVar, "this$0");
        StatusView statusView = kVar.K3().E;
        jo.p.g(bVar, "it");
        statusView.b(bVar);
    }

    public static final void U3(k kVar, View view) {
        jo.p.h(kVar, "this$0");
        RecyclerView.p layoutManager = kVar.K3().D.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int e22 = ((LinearLayoutManager) layoutManager).e2();
        RecyclerView.h adapter = kVar.K3().D.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingAdapter");
        if (((lc.a) adapter).b().get(e22).j()) {
            kVar.Z3();
            return;
        }
        v0.a aVar = v0.O0;
        aVar.a().z3(kVar.O2(), aVar.b());
    }

    public static final void V3(k kVar, View view) {
        jo.p.h(kVar, "this$0");
        RecyclerView.p layoutManager = kVar.K3().D.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int e22 = ((LinearLayoutManager) layoutManager).e2();
        q0.a aVar = be.q0.O0;
        String V0 = kVar.V0(xb.r.text_confirm_use_favorite_setting, String.valueOf(e22 + 1));
        jo.p.g(V0, "getString(R.string.text_…Position + 1).toString())");
        String U0 = kVar.U0(xb.r.text_current_setting_will_discard);
        jo.p.g(U0, "getString(R.string.text_…ent_setting_will_discard)");
        aVar.a(V0, U0).z3(kVar.O2(), aVar.b());
    }

    public static final void W3(k kVar, View view) {
        jo.p.h(kVar, "this$0");
        kVar.m3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        r0.d(this, null, 1, null);
        dq.c.c().r(this);
        super.I1();
    }

    public final lc.e J3() {
        return (lc.e) this.S0.getValue();
    }

    public final ac.i0 K3() {
        return (ac.i0) this.O0.b(this, Y0[0]);
    }

    public final kf.m L3() {
        return (kf.m) this.U0.getValue();
    }

    public final MRLogger M3() {
        return (MRLogger) this.T0.getValue();
    }

    public final String N3() {
        return (String) this.Q0.getValue();
    }

    public final lc.m O3() {
        return (lc.m) this.R0.getValue();
    }

    public final kf.x P3() {
        return (kf.x) this.V0.getValue();
    }

    public final void Q3(ac.i0 i0Var) {
        this.O0.a(this, Y0[0], i0Var);
    }

    public final void R3() {
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        O3().l().i(this, new androidx.lifecycle.f0() { // from class: lc.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.S3(k.this, (StatusView.b) obj);
            }
        });
    }

    public final void T3() {
        K3().D.k(new f());
        K3().G.setOnClickListener(new View.OnClickListener() { // from class: lc.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.U3(k.this, view);
            }
        });
        K3().H.setOnClickListener(new View.OnClickListener() { // from class: lc.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.V3(k.this, view);
            }
        });
        K3().B.setOnClickListener(new View.OnClickListener() { // from class: lc.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.W3(k.this, view);
            }
        });
    }

    public final void X3() {
        K3().D.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        K3().D.getViewTreeObserver().addOnGlobalLayoutListener(new g());
        this.W0.b(K3().D);
        K3().D.setAdapter(new lc.a(new h()));
    }

    public final void Y3() {
        View h10;
        String U0;
        RecyclerView.p layoutManager = K3().D.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (h10 = this.W0.h(linearLayoutManager)) == null) {
            return;
        }
        int o02 = linearLayoutManager.o0(h10);
        RecyclerView.h adapter = K3().D.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingAdapter");
        lc.a aVar = (lc.a) adapter;
        RoundedButtonView roundedButtonView = K3().G;
        boolean z10 = true;
        if (!(L3().getTitle().length() > 0)) {
            if (!(L3().b1().length() > 0)) {
                if (!(P3().H3().length() > 0)) {
                    if (!(L3().h().length() > 0)) {
                        z10 = false;
                    }
                }
            }
        }
        roundedButtonView.setEnabled(z10);
        K3().H.setEnabled(aVar.b().get(o02).g());
        RoundedButtonView roundedButtonView2 = K3().G;
        if (aVar.b().get(o02).j()) {
            U0 = U0(xb.r.f60078i2);
        } else {
            U0 = U0(xb.r.text_overwrite_by_current_setting);
        }
        roundedButtonView2.setTitle(U0);
    }

    public final void Z3() {
        RecyclerView.p layoutManager = K3().D.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int e22 = ((LinearLayoutManager) layoutManager).e2();
        RecyclerView.h adapter = K3().D.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingAdapter");
        lc.b bVar = ((lc.a) adapter).b().get(e22);
        lc.e J3 = J3();
        String N3 = N3();
        jo.p.g(N3, "referer");
        J3.d(N3, bVar.b(), L3().getTitle(), L3().b1(), L3().h(), P3().H3());
        MRLogger M3 = M3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_PRESET_LOAD);
        builder.setTargetId(String.valueOf(bVar.b()));
        M3.sendLog(builder.build());
    }

    public final void a4() {
        View h10;
        RecyclerView.p layoutManager = K3().D.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (h10 = this.W0.h(linearLayoutManager)) == null) {
            return;
        }
        K3().C.a(linearLayoutManager.o0(h10), linearLayoutManager.j0());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @dq.l
    public final void on(s0 s0Var) {
        jo.p.h(s0Var, "event");
        RecyclerView.p layoutManager = K3().D.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int e22 = ((LinearLayoutManager) layoutManager).e2();
        lc.l lVar = this.P0;
        if (lVar != null) {
            lVar.K(O3().j().get(e22));
        }
        n3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), xb.p.dialog_fragment_favorite_live_settings, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        Q3((ac.i0) e10);
        MRLogger M3 = M3();
        MRLog.Companion companion = MRLog.Companion;
        M3.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_PRESET_CLICK).build());
        X3();
        T3();
        R3();
        lc.e J3 = J3();
        String N3 = N3();
        jo.p.g(N3, "referer");
        J3.c(N3);
        Dialog dialog = new Dialog(N2(), xb.s.f60097e);
        dialog.setContentView(K3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        dq.c.c().p(this);
        lc.l lVar = null;
        lc.l lVar2 = context instanceof lc.l ? (lc.l) context : null;
        if (lVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof lc.l) {
                lVar = (lc.l) H0;
            }
        } else {
            lVar = lVar2;
        }
        this.P0 = lVar;
    }

    @dq.l
    public final void on(x0 x0Var) {
        jo.p.h(x0Var, "event");
        Z3();
    }
}
