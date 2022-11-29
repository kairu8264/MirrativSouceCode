package com.dena.mirrorman.fragment;

import ae.e6;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.fragment.ChooseMyAppsFragment;
import com.dena.mirrorman.net.api.response.App;
import io.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jo.f0;
import jo.i0;
import jo.q;
import jo.s;
import kq.a;
import nd.f1;
import nd.w0;
import nd.x0;
import nd.y0;
import rd.s0;
import uo.q0;
import wn.v;
import xn.r;
import xn.t;

/* loaded from: classes2.dex */
public final class ChooseMyAppsFragment extends Fragment implements q0 {
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;

    /* renamed from: z0  reason: collision with root package name */
    public gf.j f25982z0;
    public static final /* synthetic */ qo.h<Object>[] G0 = {f0.d(new s(ChooseMyAppsFragment.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/FragmentChooseMyAppsBinding;", 0))};
    public static final a F0 = new a(null);
    public static final int H0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f25980x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f25981y0 = nd.a.a(this);
    public final wn.f A0 = wn.g.a(b.f25983w);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<ud.n> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f25983w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ud.n invoke() {
            return (ud.n) new t0.d().a(ud.n.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<Integer, v> {
        public c() {
            super(1);
        }

        public final void a(int i10) {
            ud.m mVar;
            List<App.AppParams> f10;
            App.AppParams appParams;
            String appId;
            List<ud.m> f11 = ChooseMyAppsFragment.this.z3().i().f();
            if (f11 == null || (mVar = f11.get(i10)) == null || (f10 = ChooseMyAppsFragment.this.C3().i().f()) == null || (appParams = f10.get(i10)) == null || (appId = appParams.getAppId()) == null) {
                return;
            }
            List<String> f12 = ChooseMyAppsFragment.this.C3().j().f();
            if (f12 != null ? f12.contains(appId) : false) {
                ChooseMyAppsFragment.this.B3().i(appId);
                mVar.c().p(Integer.valueOf(y0.ic_my_app_check));
                return;
            }
            ChooseMyAppsFragment.this.B3().c(appId);
            mVar.c().p(Integer.valueOf(y0.ic_my_app_checked));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.ChooseMyAppsFragment$observeStoreValues$5", f = "ChooseMyAppsFragment.kt", l = {317}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25985w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25986x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25987y;

        /* renamed from: z  reason: collision with root package name */
        public int f25988z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
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
                int r1 = r8.f25988z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f25987y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f25986x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f25985w
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r4 = (com.dena.mirrorman.fragment.ChooseMyAppsFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7a
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
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r9 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.this
                nf.d r9 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.v3(r9)
                wo.x r3 = r9.o()
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r9 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
                r4 = r9
                r9 = r8
            L3d:
                r9.f25985w = r4     // Catch: java.lang.Throwable -> L7a
                r9.f25986x = r3     // Catch: java.lang.Throwable -> L7a
                r9.f25987y = r1     // Catch: java.lang.Throwable -> L7a
                r9.f25988z = r2     // Catch: java.lang.Throwable -> L7a
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7a
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L77
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L71
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L77
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L77
                gf.j r9 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.w3(r5)     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L6b
                r9.Z()     // Catch: java.lang.Throwable -> L77
            L6b:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L71:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L77:
                r9 = move-exception
                r3 = r4
                goto L7b
            L7a:
                r9 = move-exception
            L7b:
                throw r9     // Catch: java.lang.Throwable -> L7c
            L7c:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.fragment.ChooseMyAppsFragment.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.ChooseMyAppsFragment$observeStoreValues$6", f = "ChooseMyAppsFragment.kt", l = {317}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25989w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25990x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25991y;

        /* renamed from: z  reason: collision with root package name */
        public int f25992z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:27:0x0086, B:28:0x0091, B:22:0x0068), top: B:39:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
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
                int r1 = r10.f25992z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f25991y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f25990x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f25989w
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r4 = (com.dena.mirrorman.fragment.ChooseMyAppsFragment) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> La4
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
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r11 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.this
                nf.d r11 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.v3(r11)
                wo.x r3 = r11.n()
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r11 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La4
                r4 = r11
                r11 = r10
            L3d:
                r11.f25989w = r4     // Catch: java.lang.Throwable -> La4
                r11.f25990x = r3     // Catch: java.lang.Throwable -> La4
                r11.f25991y = r1     // Catch: java.lang.Throwable -> La4
                r11.f25992z = r2     // Catch: java.lang.Throwable -> La4
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> La4
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
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La1
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r11 == 0) goto L9b
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> La1
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> La1
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Maintenance     // Catch: java.lang.Throwable -> La1
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$ForceUpdate r6 = com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate.INSTANCE     // Catch: java.lang.Throwable -> La1
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> La1
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La1
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> La1
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> La1
                goto L95
            L7a:
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La1
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> La1
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> La1
                if (r11 != 0) goto L91
                int r11 = nd.f1.f41966c     // Catch: java.lang.Throwable -> La1
                java.lang.String r11 = r5.U0(r11)     // Catch: java.lang.Throwable -> La1
                java.lang.String r8 = "getString(R.string.error_access)"
                jo.p.g(r11, r8)     // Catch: java.lang.Throwable -> La1
            L91:
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> La1
            L95:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9b:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            La1:
                r11 = move-exception
                r3 = r4
                goto La5
            La4:
                r11 = move-exception
            La5:
                throw r11     // Catch: java.lang.Throwable -> La6
            La6:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.fragment.ChooseMyAppsFragment.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.ChooseMyAppsFragment$observeStoreValues$7", f = "ChooseMyAppsFragment.kt", l = {317}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25993w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25994x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25995y;

        /* renamed from: z  reason: collision with root package name */
        public int f25996z;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ChooseMyAppsFragment f25997w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChooseMyAppsFragment chooseMyAppsFragment) {
                super(0);
                this.f25997w = chooseMyAppsFragment;
            }

            public final void a() {
                String f10 = this.f25997w.C3().k().f();
                if (f10 != null) {
                    this.f25997w.B3().g(f10);
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:27:0x0088, B:28:0x0093, B:22:0x0068), top: B:39:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
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
                int r1 = r10.f25996z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f25995y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f25994x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f25993w
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r4 = (com.dena.mirrorman.fragment.ChooseMyAppsFragment) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lad
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
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r11 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.this
                nf.d r11 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.v3(r11)
                wo.x r3 = r11.p()
                com.dena.mirrorman.fragment.ChooseMyAppsFragment r11 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lad
                r4 = r11
                r11 = r10
            L3d:
                r11.f25993w = r4     // Catch: java.lang.Throwable -> Lad
                r11.f25994x = r3     // Catch: java.lang.Throwable -> Lad
                r11.f25995y = r1     // Catch: java.lang.Throwable -> Lad
                r11.f25996z = r2     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lad
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
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Laa
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Laa
                if (r11 == 0) goto La4
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Laa
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Laa
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Maintenance     // Catch: java.lang.Throwable -> Laa
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$ForceUpdate r6 = com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate.INSTANCE     // Catch: java.lang.Throwable -> Laa
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Laa
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Laa
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Laa
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Laa
                goto L9e
            L7a:
                ae.e6 r6 = com.dena.mirrorman.fragment.ChooseMyAppsFragment.t3(r5)     // Catch: java.lang.Throwable -> Laa
                com.dena.mirrativ.customview.StatusView r6 = r6.P     // Catch: java.lang.Throwable -> Laa
                com.dena.mirrativ.customview.StatusView$b$a r7 = new com.dena.mirrativ.customview.StatusView$b$a     // Catch: java.lang.Throwable -> Laa
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Laa
                if (r11 != 0) goto L93
                int r11 = nd.f1.f41966c     // Catch: java.lang.Throwable -> Laa
                java.lang.String r11 = r5.U0(r11)     // Catch: java.lang.Throwable -> Laa
                java.lang.String r8 = "getString(R.string.error_access)"
                jo.p.g(r11, r8)     // Catch: java.lang.Throwable -> Laa
            L93:
                com.dena.mirrorman.fragment.ChooseMyAppsFragment$f$a r8 = new com.dena.mirrorman.fragment.ChooseMyAppsFragment$f$a     // Catch: java.lang.Throwable -> Laa
                r8.<init>(r5)     // Catch: java.lang.Throwable -> Laa
                r7.<init>(r11, r8)     // Catch: java.lang.Throwable -> Laa
                r6.b(r7)     // Catch: java.lang.Throwable -> Laa
            L9e:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La4:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Laa:
                r11 = move-exception
                r3 = r4
                goto Lae
            Lad:
                r11 = move-exception
            Lae:
                throw r11     // Catch: java.lang.Throwable -> Laf
            Laf:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.fragment.ChooseMyAppsFragment.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ChooseMyAppsFragment.this.z3().f().p(Boolean.valueOf(!(charSequence == null || so.n.r(charSequence))));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends RecyclerView.o {
        public h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            int g02 = recyclerView.g0(view) % 4;
            int width = (int) ((recyclerView.getWidth() - (ChooseMyAppsFragment.this.O0().getDimension(x0.tutorial_app_item_width) * 4)) / 5);
            rect.left = width - ((g02 * width) / 4);
            rect.right = ((g02 + 1) * width) / 4;
            rect.bottom = width;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26000w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26001x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26002y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26000w = componentCallbacks;
            this.f26001x = aVar;
            this.f26002y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f26000w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f26001x, this.f26002y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<kf.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26003w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26004x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26005y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26003w = componentCallbacks;
            this.f26004x = aVar;
            this.f26005y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.i, java.lang.Object] */
        @Override // io.a
        public final kf.i invoke() {
            ComponentCallbacks componentCallbacks = this.f26003w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.i.class), this.f26004x, this.f26005y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<od.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26006w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26007x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26008y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26006w = componentCallbacks;
            this.f26007x = aVar;
            this.f26008y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.c, java.lang.Object] */
        @Override // io.a
        public final od.c invoke() {
            ComponentCallbacks componentCallbacks = this.f26006w;
            return gq.a.a(componentCallbacks).c(f0.b(od.c.class), this.f26007x, this.f26008y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f26009w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f26009w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f26009w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26010w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f26010w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f26010w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26011w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26012x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26013y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f26014z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f26011w = aVar;
            this.f26012x = aVar2;
            this.f26013y = aVar3;
            this.f26014z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f26011w;
            vq.a aVar2 = this.f26012x;
            io.a aVar3 = this.f26013y;
            xq.a aVar4 = this.f26014z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.d.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26015w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f26015w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f26015w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public ChooseMyAppsFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B0 = wn.g.b(iVar, new i(this, null, null));
        this.C0 = wn.g.b(iVar, new j(this, null, null));
        this.D0 = wn.g.b(iVar, new k(this, null, null));
        l lVar = new l(this);
        xq.a a10 = gq.a.a(this);
        m mVar = new m(lVar);
        this.E0 = e0.a(this, f0.b(nf.d.class), new o(mVar), new n(lVar, null, null, a10));
    }

    public static final void G3(ChooseMyAppsFragment chooseMyAppsFragment, Boolean bool) {
        jo.p.h(chooseMyAppsFragment, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (bool.booleanValue()) {
            chooseMyAppsFragment.z3().h().p(Boolean.FALSE);
        }
        chooseMyAppsFragment.A3().P.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public static final void H3(ChooseMyAppsFragment chooseMyAppsFragment, List list) {
        List<ud.m> k10;
        Integer f10;
        jo.p.h(chooseMyAppsFragment, "this$0");
        if (list != null && !jo.p.c(list, chooseMyAppsFragment.C3().m().f()) && (f10 = chooseMyAppsFragment.C3().l().f()) != null && f10.intValue() == 0) {
            MRLogger E3 = chooseMyAppsFragment.E3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_MYAPP_REG_SEARCH);
            builder.setTargetId("result");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" \n                            {\"search_query\" :\"");
            String f11 = chooseMyAppsFragment.C3().k().f();
            if (f11 == null) {
                f11 = "";
            }
            sb2.append(f11);
            sb2.append("\", \"result_num\" :");
            sb2.append(list.size());
            sb2.append("} \n                            ");
            builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, so.g.f(sb2.toString()))));
            E3.sendLog(builder.build());
        }
        androidx.lifecycle.e0<List<ud.m>> i10 = chooseMyAppsFragment.z3().i();
        if (list != null) {
            k10 = new ArrayList<>(t.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                App.AppParams appParams = (App.AppParams) it.next();
                ud.m mVar = new ud.m(appParams.getIconUrl(), appParams.getTitle());
                List<String> f12 = chooseMyAppsFragment.C3().j().f();
                if (f12 != null && f12.contains(appParams.getAppId())) {
                    mVar.c().p(Integer.valueOf(y0.ic_my_app_checked));
                }
                k10.add(mVar);
            }
        } else {
            k10 = xn.s.k();
        }
        i10.p(k10);
        if (list != null && list.isEmpty()) {
            chooseMyAppsFragment.z3().h().p(Boolean.TRUE);
            androidx.lifecycle.e0<String> g10 = chooseMyAppsFragment.z3().g();
            i0 i0Var = i0.f38149a;
            String V0 = chooseMyAppsFragment.V0(f1.text_myapp_registration_no_search_results_description, chooseMyAppsFragment.C3().k().f());
            jo.p.g(V0, "getString(R.string.text_…e.latestSearchWord.value)");
            String format = String.format(V0, Arrays.copyOf(new Object[0], 0));
            jo.p.g(format, "format(format, *args)");
            g10.p(format);
            return;
        }
        chooseMyAppsFragment.z3().h().p(Boolean.FALSE);
    }

    public static final void I3(ChooseMyAppsFragment chooseMyAppsFragment, Integer num) {
        jo.p.h(chooseMyAppsFragment, "this$0");
        if ((num != null && num.intValue() == 0) || num == null) {
            return;
        }
        num.intValue();
        String f10 = chooseMyAppsFragment.C3().k().f();
        if (f10 != null) {
            chooseMyAppsFragment.B3().e(f10, num.intValue());
        }
    }

    public static final void J3(ChooseMyAppsFragment chooseMyAppsFragment, List list) {
        jo.p.h(chooseMyAppsFragment, "this$0");
        if (list == null || list.isEmpty()) {
            chooseMyAppsFragment.z3().n().p(Boolean.TRUE);
            chooseMyAppsFragment.z3().m().p(Integer.valueOf(y0.rectangle_corner24_disabled_choose_my_apps_to_next));
            chooseMyAppsFragment.z3().k().p(Integer.valueOf(c3.a.d(chooseMyAppsFragment.N2(), w0.X)));
            chooseMyAppsFragment.z3().j().p(Boolean.FALSE);
            return;
        }
        chooseMyAppsFragment.z3().n().p(Boolean.FALSE);
        chooseMyAppsFragment.z3().m().p(Integer.valueOf(y0.ripple_tealish30_rectangle_corner24_whitethree));
        chooseMyAppsFragment.z3().k().p(Integer.valueOf(c3.a.d(chooseMyAppsFragment.N2(), w0.f42242u0)));
        chooseMyAppsFragment.z3().j().p(Boolean.TRUE);
    }

    public static final void M3(ChooseMyAppsFragment chooseMyAppsFragment, View view) {
        jo.p.h(chooseMyAppsFragment, "this$0");
        gf.j jVar = chooseMyAppsFragment.f25982z0;
        if (jVar != null) {
            jVar.m1();
        }
    }

    public static final void N3(ChooseMyAppsFragment chooseMyAppsFragment, View view) {
        jo.p.h(chooseMyAppsFragment, "this$0");
        List<String> f10 = chooseMyAppsFragment.C3().j().f();
        if (f10 != null) {
            chooseMyAppsFragment.B3().f(f10);
            List<String> f11 = chooseMyAppsFragment.C3().j().f();
            if (f11 == null) {
                f11 = xn.s.k();
            } else {
                jo.p.g(f11, "chooseMyAppsStore.checke…ppId.value ?: emptyList()");
            }
            MRLogger E3 = chooseMyAppsFragment.E3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_MYAPP_REG);
            builder.setTargetId("tap_start");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{ \"select_apps_num\" :");
            sb2.append(f11.size());
            sb2.append(", \"select_apps_id\" : \"");
            ArrayList arrayList = new ArrayList(t.u(f11, 10));
            for (String str : f11) {
                arrayList.add(str);
            }
            sb2.append(so.q.N0(so.q.M0(arrayList.toString(), 1), 1));
            sb2.append("\" }");
            builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, sb2.toString())));
            E3.sendLog(builder.build());
        }
    }

    public static final boolean O3(ChooseMyAppsFragment chooseMyAppsFragment, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(chooseMyAppsFragment, "this$0");
        boolean z10 = false;
        if (i10 == 3) {
            of.j.f45405a.c(chooseMyAppsFragment.N2(), textView);
            String f10 = chooseMyAppsFragment.z3().l().f();
            if (f10 == null || so.n.r(f10)) {
                z10 = true;
            }
            if (z10) {
                chooseMyAppsFragment.B3().h();
                chooseMyAppsFragment.z3().l().p("");
            } else {
                od.c B3 = chooseMyAppsFragment.B3();
                String f11 = chooseMyAppsFragment.z3().l().f();
                jo.p.e(f11);
                B3.g(f11);
                MRLogger E3 = chooseMyAppsFragment.E3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_MYAPP_REG_SEARCH);
                builder.setTargetId("search");
                builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, "{\"search_query\" :'" + chooseMyAppsFragment.z3().l().f() + "'}")));
                E3.sendLog(builder.build());
            }
            return true;
        }
        return false;
    }

    public static final void P3(ChooseMyAppsFragment chooseMyAppsFragment, View view) {
        jo.p.h(chooseMyAppsFragment, "this$0");
        chooseMyAppsFragment.B3().h();
        chooseMyAppsFragment.z3().l().p("");
        of.j.f45405a.c(chooseMyAppsFragment.N2(), chooseMyAppsFragment.A3().M);
    }

    public static final void y3(s0 s0Var, ChooseMyAppsFragment chooseMyAppsFragment, List list) {
        jo.p.h(s0Var, "$recyclerAdapter");
        jo.p.h(chooseMyAppsFragment, "this$0");
        jo.p.g(list, "it");
        s0Var.f(list);
        List<App.AppParams> f10 = chooseMyAppsFragment.C3().m().f();
        if (f10 != null && list.size() == f10.size()) {
            chooseMyAppsFragment.A3().B.p1(0);
        }
    }

    public final e6 A3() {
        return (e6) this.f25981y0.b(this, G0[0]);
    }

    public final od.c B3() {
        return (od.c) this.D0.getValue();
    }

    public final nf.d C3() {
        return (nf.d) this.E0.getValue();
    }

    public final kf.i D3() {
        return (kf.i) this.C0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        e6 T = e6.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(\n            inf…          false\n        )");
        K3(T);
        View u10 = A3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final MRLogger E3() {
        return (MRLogger) this.B0.getValue();
    }

    public final void F3() {
        C3().q().i(a1(), new androidx.lifecycle.f0() { // from class: gf.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ChooseMyAppsFragment.G3(ChooseMyAppsFragment.this, (Boolean) obj);
            }
        });
        C3().i().i(a1(), new androidx.lifecycle.f0() { // from class: gf.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ChooseMyAppsFragment.H3(ChooseMyAppsFragment.this, (List) obj);
            }
        });
        C3().l().i(a1(), new androidx.lifecycle.f0() { // from class: gf.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ChooseMyAppsFragment.I3(ChooseMyAppsFragment.this, (Integer) obj);
            }
        });
        C3().j().i(a1(), new androidx.lifecycle.f0() { // from class: gf.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ChooseMyAppsFragment.J3(ChooseMyAppsFragment.this, (List) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.f25982z0 = null;
        super.I1();
    }

    public final void K3(e6 e6Var) {
        this.f25981y0.a(this, G0[0], e6Var);
    }

    public final void L3() {
        String U0;
        AppCompatTextView appCompatTextView = A3().O;
        appCompatTextView.setPaintFlags(A3().O.getPaintFlags() | 8);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: gf.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyAppsFragment.M3(ChooseMyAppsFragment.this, view);
            }
        });
        AppCompatButton appCompatButton = A3().Q;
        if (D3().r()) {
            U0 = U0(f1.text_myapp_registration_continue);
        } else {
            U0 = U0(f1.text_myapp_registration_start);
        }
        appCompatButton.setText(U0);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: gf.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyAppsFragment.N3(ChooseMyAppsFragment.this, view);
            }
        });
        A3().M.addTextChangedListener(new g());
        A3().M.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gf.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean O3;
                O3 = ChooseMyAppsFragment.O3(ChooseMyAppsFragment.this, textView, i10, keyEvent);
                return O3;
            }
        });
        A3().C.setOnClickListener(new View.OnClickListener() { // from class: gf.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseMyAppsFragment.P3(ChooseMyAppsFragment.this, view);
            }
        });
        A3().B.setLayoutManager(new GridLayoutManager(N2(), 4));
        A3().B.g(new h());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        MRLogger E3 = E3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_MYAPP_REG);
        builder.setTargetId(MRLog.TARGET_ID_IMP);
        E3.sendLog(builder.build());
        A3().M(a1());
        A3().V(z3());
        F3();
        L3();
        x3();
        B3().d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f25980x0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.f25982z0 = context instanceof gf.j ? (gf.j) context : null;
    }

    public final void x3() {
        u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        final s0 s0Var = new s0(a12, new c());
        A3().B.setAdapter(s0Var);
        z3().i().i(a1(), new androidx.lifecycle.f0() { // from class: gf.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ChooseMyAppsFragment.y3(rd.s0.this, this, (List) obj);
            }
        });
    }

    public final ud.n z3() {
        return (ud.n) this.A0.getValue();
    }
}
