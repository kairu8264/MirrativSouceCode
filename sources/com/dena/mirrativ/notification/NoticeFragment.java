package com.dena.mirrativ.notification;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.navigation.NavController;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrativ.notification.NoticeFragment;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.google.android.material.tabs.TabLayout;
import jf.g0;
import jf.h0;
import jo.f0;
import kq.a;
import nd.w0;
import od.i0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class NoticeFragment extends Fragment implements q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public static final int T0 = qa.l.f48868e;
    public static final int U0 = qa.l.f48865b;
    public static final Typeface V0 = Typeface.DEFAULT_BOLD;
    public static final Typeface W0 = Typeface.DEFAULT;
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final wn.f G0;
    public final wn.f H0;
    public final wn.f I0;
    public final wn.f J0;
    public final wn.f K0;
    public sa.a L0;
    public sa.m M0;
    public sa.m N0;
    public sa.m O0;
    public sa.m P0;
    public int Q0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f21662x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final ao.g f21663y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f21664z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21665w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(io.a aVar) {
            super(0);
            this.f21665w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f21665w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<NavController> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final NavController invoke() {
            return androidx.navigation.fragment.a.a(NoticeFragment.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21667w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21668x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21669y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21670z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21667w = aVar;
            this.f21668x = aVar2;
            this.f21669y = aVar3;
            this.f21670z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21667w;
            vq.a aVar2 = this.f21668x;
            io.a aVar3 = this.f21669y;
            xq.a aVar4 = this.f21670z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(od.z.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<Integer, Fragment> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f21671w = new c();

        public c() {
            super(1);
        }

        public final Fragment a(int i10) {
            if (i10 == h0.PRESENT_BOX.c()) {
                return ua.g.E0.a();
            }
            if (i10 == h0.YOUR.c()) {
                return va.i.E0.a();
            }
            if (i10 == h0.CAMPAIGN.c()) {
                return ra.e.F0.a();
            }
            if (i10 == h0.NEWS.c()) {
                return ta.g.F0.a();
            }
            throw new IllegalArgumentException("存在しないindex= " + i10 + " です");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Fragment invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21672w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar) {
            super(0);
            this.f21672w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f21672w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ViewPager.j {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            NoticeFragment.this.P3(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f21674w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(Fragment fragment) {
            super(0);
            this.f21674w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f21674w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (NoticeFragment.this.q0() == null) {
                return;
            }
            NoticeFragment.this.D3().m(qa.o.K);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.NoticeFragment$onCreateView$5", f = "NoticeFragment.kt", l = {363}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f21676w;

        /* renamed from: x  reason: collision with root package name */
        public Object f21677x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21678y;

        /* renamed from: z  reason: collision with root package name */
        public int f21679z;

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
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f), top: B:33:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:33:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f21679z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f21678y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f21677x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f21676w
                com.dena.mirrativ.notification.NoticeFragment r4 = (com.dena.mirrativ.notification.NoticeFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L83
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
                com.dena.mirrativ.notification.NoticeFragment r9 = com.dena.mirrativ.notification.NoticeFragment.this
                nf.o r9 = com.dena.mirrativ.notification.NoticeFragment.s3(r9)
                wo.x r3 = r9.v()
                com.dena.mirrativ.notification.NoticeFragment r9 = com.dena.mirrativ.notification.NoticeFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L83
                r4 = r9
                r9 = r8
            L3d:
                r9.f21676w = r4     // Catch: java.lang.Throwable -> L83
                r9.f21677x = r3     // Catch: java.lang.Throwable -> L83
                r9.f21678y = r1     // Catch: java.lang.Throwable -> L83
                r9.f21679z = r2     // Catch: java.lang.Throwable -> L83
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L83
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L80
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L80
                r6 = 0
                if (r9 == 0) goto L7a
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L80
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L80
                sa.a r9 = com.dena.mirrativ.notification.NoticeFragment.r3(r5)     // Catch: java.lang.Throwable -> L80
                if (r9 != 0) goto L6e
                java.lang.String r9 = "binding"
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L80
                goto L6f
            L6e:
                r6 = r9
            L6f:
                com.google.android.material.appbar.AppBarLayout r9 = r6.B     // Catch: java.lang.Throwable -> L80
                r9.r(r2, r2)     // Catch: java.lang.Throwable -> L80
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7a:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L80:
                r9 = move-exception
                r3 = r4
                goto L84
            L83:
                r9 = move-exception
            L84:
                throw r9     // Catch: java.lang.Throwable -> L85
            L85:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.notification.NoticeFragment.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f21681x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.f21681x = str;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            NoticeFragment noticeFragment = NoticeFragment.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = noticeFragment.N2();
            jo.p.g(N2, "requireContext()");
            String str = this.f21681x;
            jo.p.g(str, "url");
            noticeFragment.f3(WebViewActivity.a.b(aVar, N2, str, false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<od.a0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21682w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21683x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21684y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21682w = componentCallbacks;
            this.f21683x = aVar;
            this.f21684y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.a0, java.lang.Object] */
        @Override // io.a
        public final od.a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21682w;
            return gq.a.a(componentCallbacks).c(f0.b(od.a0.class), this.f21683x, this.f21684y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21685w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21686x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21687y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21685w = componentCallbacks;
            this.f21686x = aVar;
            this.f21687y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f21685w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f21686x, this.f21687y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21688w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21689x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21690y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21688w = componentCallbacks;
            this.f21689x = aVar;
            this.f21690y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f21688w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f21689x, this.f21690y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21691w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21692x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21693y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21691w = componentCallbacks;
            this.f21692x = aVar;
            this.f21693y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21691w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.k.class), this.f21692x, this.f21693y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<i0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21694w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21695x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21696y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21694w = componentCallbacks;
            this.f21695x = aVar;
            this.f21696y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.i0] */
        @Override // io.a
        public final i0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21694w;
            return gq.a.a(componentCallbacks).c(f0.b(i0.class), this.f21695x, this.f21696y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21697w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21698x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21699y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21697w = componentCallbacks;
            this.f21698x = aVar;
            this.f21699y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21697w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f21698x, this.f21699y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21700w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21701x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21702y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21700w = componentCallbacks;
            this.f21701x = aVar;
            this.f21702y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21700w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f21701x, this.f21702y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f21703w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Fragment fragment) {
            super(0);
            this.f21703w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f21703w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f21703w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21704w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f21704w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f21704w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21705w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21706x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21707y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21708z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21705w = aVar;
            this.f21706x = aVar2;
            this.f21707y = aVar3;
            this.f21708z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21705w;
            vq.a aVar2 = this.f21706x;
            io.a aVar3 = this.f21707y;
            xq.a aVar4 = this.f21708z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.y.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21709w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(io.a aVar) {
            super(0);
            this.f21709w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f21709w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21710w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(io.a aVar) {
            super(0);
            this.f21710w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f21710w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21711w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21712x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21713y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21714z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21711w = aVar;
            this.f21712x = aVar2;
            this.f21713y = aVar3;
            this.f21714z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21711w;
            vq.a aVar2 = this.f21712x;
            io.a aVar3 = this.f21713y;
            xq.a aVar4 = this.f21714z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.c0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21715w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar) {
            super(0);
            this.f21715w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f21715w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f21716w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Fragment fragment) {
            super(0);
            this.f21716w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f21716w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21717w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(io.a aVar) {
            super(0);
            this.f21717w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f21717w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21718w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21719x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21720y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21721z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21718w = aVar;
            this.f21719x = aVar2;
            this.f21720y = aVar3;
            this.f21721z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21718w;
            vq.a aVar2 = this.f21719x;
            io.a aVar3 = this.f21720y;
            xq.a aVar4 = this.f21721z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(qa.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21722w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar) {
            super(0);
            this.f21722w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f21722w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f21723w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Fragment fragment) {
            super(0);
            this.f21723w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f21723w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    public NoticeFragment() {
        uo.b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f21663y0 = c10.plus(b10);
        v vVar = new v(this);
        xq.a a10 = gq.a.a(this);
        w wVar = new w(vVar);
        this.f21664z0 = e0.a(this, f0.b(qa.j.class), new y(wVar), new x(vVar, null, null, a10));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.A0 = wn.g.b(iVar, new h(this, null, null));
        this.B0 = wn.g.b(iVar, new i(this, null, null));
        z zVar = new z(this);
        xq.a a11 = gq.a.a(this);
        a0 a0Var = new a0(zVar);
        this.C0 = e0.a(this, f0.b(od.z.class), new c0(a0Var), new b0(zVar, null, null, a11));
        this.D0 = wn.g.b(iVar, new j(this, null, null));
        this.E0 = wn.g.b(iVar, new k(this, null, null));
        o oVar = new o(this);
        xq.a a12 = gq.a.a(this);
        p pVar = new p(oVar);
        this.F0 = e0.a(this, f0.b(nf.y.class), new r(pVar), new q(oVar, null, null, a12));
        this.G0 = wn.g.b(iVar, new l(this, null, null));
        d0 d0Var = new d0(this);
        xq.a a13 = gq.a.a(this);
        s sVar = new s(d0Var);
        this.H0 = e0.a(this, f0.b(nf.c0.class), new u(sVar), new t(d0Var, null, null, a13));
        this.I0 = wn.g.b(iVar, new m(this, null, null));
        this.J0 = wn.g.b(iVar, new n(this, null, null));
        this.K0 = wn.g.a(new b());
        this.Q0 = -1;
    }

    public static final void H3(NoticeFragment noticeFragment, View view) {
        jo.p.h(noticeFragment, "this$0");
        tb.c z32 = noticeFragment.z3();
        Context N2 = noticeFragment.N2();
        jo.p.g(N2, "requireContext()");
        noticeFragment.f3(z32.x0(N2));
    }

    public static final void I3(NoticeFragment noticeFragment, Boolean bool) {
        jo.p.h(noticeFragment, "this$0");
        sa.m mVar = noticeFragment.M0;
        if (mVar == null) {
            jo.p.v("presentBoxTabBinding");
            mVar = null;
        }
        View view = mVar.C;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void J3(NoticeFragment noticeFragment, Boolean bool) {
        jo.p.h(noticeFragment, "this$0");
        sa.m mVar = noticeFragment.N0;
        if (mVar == null) {
            jo.p.v("yourTabBinding");
            mVar = null;
        }
        View view = mVar.C;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void K3(NoticeFragment noticeFragment, Boolean bool) {
        jo.p.h(noticeFragment, "this$0");
        sa.m mVar = noticeFragment.O0;
        if (mVar == null) {
            jo.p.v("campaignTabBinding");
            mVar = null;
        }
        View view = mVar.C;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void L3(NoticeFragment noticeFragment, Boolean bool) {
        jo.p.h(noticeFragment, "this$0");
        sa.m mVar = noticeFragment.P0;
        if (mVar == null) {
            jo.p.v("newsTabBinding");
            mVar = null;
        }
        View view = mVar.C;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void M3(com.dena.mirrativ.notification.NoticeFragment r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "this$0"
            jo.p.h(r6, r0)
            r0 = 1
            r1 = 0
            java.lang.String r2 = "binding"
            if (r7 == 0) goto L16
            int r3 = r7.length()     // Catch: java.lang.Exception -> L14
            if (r3 != 0) goto L12
            goto L16
        L12:
            r3 = 0
            goto L17
        L14:
            r7 = move-exception
            goto L54
        L16:
            r3 = r0
        L17:
            if (r3 == 0) goto L31
            sa.a r7 = r6.L0     // Catch: java.lang.Exception -> L14
            if (r7 != 0) goto L21
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r7 = r1
        L21:
            androidx.appcompat.widget.AppCompatImageView r7 = r7.E     // Catch: java.lang.Exception -> L14
            android.content.Context r0 = r6.N2()     // Catch: java.lang.Exception -> L14
            int r3 = qa.n.f48872c     // Catch: java.lang.Exception -> L14
            android.graphics.drawable.Drawable r0 = c3.a.f(r0, r3)     // Catch: java.lang.Exception -> L14
            r7.setImageDrawable(r0)     // Catch: java.lang.Exception -> L14
            goto L6f
        L31:
            sa.a r3 = r6.L0     // Catch: java.lang.Exception -> L14
            if (r3 != 0) goto L39
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r3 = r1
        L39:
            androidx.appcompat.widget.AppCompatImageView r3 = r3.E     // Catch: java.lang.Exception -> L14
            java.lang.String r4 = "binding.myPageButtonImageView"
            jo.p.g(r3, r4)     // Catch: java.lang.Exception -> L14
            r4 = 13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L14
            int r5 = qa.l.f48869f     // Catch: java.lang.Exception -> L14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L14
            td.a.t(r3, r7, r4, r0, r5)     // Catch: java.lang.Exception -> L14
            goto L6f
        L54:
            g9.a.c(r7)
            sa.a r7 = r6.L0
            if (r7 != 0) goto L5f
            jo.p.v(r2)
            goto L60
        L5f:
            r1 = r7
        L60:
            androidx.appcompat.widget.AppCompatImageView r7 = r1.E
            android.content.Context r6 = r6.N2()
            int r0 = qa.n.f48872c
            android.graphics.drawable.Drawable r6 = c3.a.f(r6, r0)
            r7.setImageDrawable(r6)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.notification.NoticeFragment.M3(com.dena.mirrativ.notification.NoticeFragment, java.lang.String):void");
    }

    public static final void N3(NoticeFragment noticeFragment, Boolean bool) {
        jo.p.h(noticeFragment, "this$0");
        sa.a aVar = noticeFragment.L0;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        View view = aVar.C;
        jo.p.g(bool, "shouldShow");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void O3(NoticeFragment noticeFragment, wn.p pVar) {
        jo.p.h(noticeFragment, "this$0");
        int intValue = ((Number) pVar.a()).intValue();
        int intValue2 = ((Number) pVar.b()).intValue();
        h9.a aVar = (h9.a) pVar.c();
        int i10 = (intValue == h0.CAMPAIGN.c() && intValue2 == g0.RECOMMEND.e() && aVar.h()) ? 0 : 8;
        sa.a aVar2 = noticeFragment.L0;
        sa.a aVar3 = null;
        if (aVar2 == null) {
            jo.p.v("binding");
            aVar2 = null;
        }
        aVar2.G.g(aVar);
        sa.a aVar4 = noticeFragment.L0;
        if (aVar4 == null) {
            jo.p.v("binding");
            aVar4 = null;
        }
        AppCompatTextView appCompatTextView = aVar4.K;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(noticeFragment.U0(qa.q.text_notice_campaign_season_rating_popup_text));
        String U02 = noticeFragment.U0(qa.q.text_notice_campaign_season_rating_popup_highlighted_text);
        jo.p.g(U02, "getString(R.string.text_…g_popup_highlighted_text)");
        int U = so.o.U(spannableStringBuilder, U02, 0, false, 6, null);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(noticeFragment.N2(), w0.S)), U, U02.length() + U, 33);
        appCompatTextView.setText(spannableStringBuilder);
        sa.a aVar5 = noticeFragment.L0;
        if (aVar5 == null) {
            jo.p.v("binding");
        } else {
            aVar3 = aVar5;
        }
        aVar3.L.setVisibility(i10);
    }

    public final MRLogger A3() {
        return (MRLogger) this.I0.getValue();
    }

    public final od.z B3() {
        return (od.z) this.C0.getValue();
    }

    public final nf.y C3() {
        return (nf.y) this.F0.getValue();
    }

    public final NavController D3() {
        return (NavController) this.K0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        int i10 = qa.p.tab_item_notice;
        sa.a aVar = null;
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, i10, null, false);
        jo.p.g(e10, "inflate(inflater, R.layo…item_notice, null, false)");
        this.M0 = (sa.m) e10;
        ViewDataBinding e11 = androidx.databinding.f.e(layoutInflater, i10, null, false);
        jo.p.g(e11, "inflate(inflater, R.layo…item_notice, null, false)");
        this.N0 = (sa.m) e11;
        ViewDataBinding e12 = androidx.databinding.f.e(layoutInflater, i10, null, false);
        jo.p.g(e12, "inflate(inflater, R.layo…item_notice, null, false)");
        this.O0 = (sa.m) e12;
        ViewDataBinding e13 = androidx.databinding.f.e(layoutInflater, i10, null, false);
        jo.p.g(e13, "inflate(inflater, R.layo…item_notice, null, false)");
        this.P0 = (sa.m) e13;
        sa.m mVar = this.M0;
        if (mVar == null) {
            jo.p.v("presentBoxTabBinding");
            mVar = null;
        }
        mVar.D.setText(U0(qa.q.text_todays_list));
        sa.m mVar2 = this.N0;
        if (mVar2 == null) {
            jo.p.v("yourTabBinding");
            mVar2 = null;
        }
        mVar2.D.setText(U0(qa.q.text_dear_you));
        sa.m mVar3 = this.O0;
        if (mVar3 == null) {
            jo.p.v("campaignTabBinding");
            mVar3 = null;
        }
        mVar3.D.setText(U0(qa.q.f48887c));
        sa.m mVar4 = this.P0;
        if (mVar4 == null) {
            jo.p.v("newsTabBinding");
            mVar4 = null;
        }
        mVar4.D.setText(U0(qa.q.text_news));
        sa.a T = sa.a.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        this.L0 = T;
        if (T == null) {
            jo.p.v("binding");
            T = null;
        }
        ViewPager viewPager = T.P;
        FragmentManager p02 = p0();
        jo.p.g(p02, "childFragmentManager");
        viewPager.setAdapter(new qa.i(p02, 4, c.f21671w));
        sa.a aVar2 = this.L0;
        if (aVar2 == null) {
            jo.p.v("binding");
            aVar2 = null;
        }
        TabLayout tabLayout = aVar2.M;
        sa.a aVar3 = this.L0;
        if (aVar3 == null) {
            jo.p.v("binding");
            aVar3 = null;
        }
        tabLayout.setupWithViewPager(aVar3.P);
        sa.a aVar4 = this.L0;
        if (aVar4 == null) {
            jo.p.v("binding");
            aVar4 = null;
        }
        aVar4.P.c(new d());
        sa.a aVar5 = this.L0;
        if (aVar5 == null) {
            jo.p.v("binding");
            aVar5 = null;
        }
        aVar5.F.setOnClickListener(new View.OnClickListener() { // from class: qa.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeFragment.H3(NoticeFragment.this, view);
            }
        });
        sa.a aVar6 = this.L0;
        if (aVar6 == null) {
            jo.p.v("binding");
            aVar6 = null;
        }
        AppCompatImageView appCompatImageView = aVar6.E;
        jo.p.g(appCompatImageView, "binding.myPageButtonImageView");
        yd.g1.a(appCompatImageView, new e());
        uo.l.d(this, null, null, new f(null), 3, null);
        sa.a aVar7 = this.L0;
        if (aVar7 == null) {
            jo.p.v("binding");
            aVar7 = null;
        }
        TabLayout.g x10 = aVar7.M.x(h0.PRESENT_BOX.c());
        if (x10 != null) {
            sa.m mVar5 = this.M0;
            if (mVar5 == null) {
                jo.p.v("presentBoxTabBinding");
                mVar5 = null;
            }
            x10.p(mVar5.u());
        }
        sa.a aVar8 = this.L0;
        if (aVar8 == null) {
            jo.p.v("binding");
            aVar8 = null;
        }
        TabLayout.g x11 = aVar8.M.x(h0.YOUR.c());
        if (x11 != null) {
            sa.m mVar6 = this.N0;
            if (mVar6 == null) {
                jo.p.v("yourTabBinding");
                mVar6 = null;
            }
            x11.p(mVar6.u());
        }
        sa.a aVar9 = this.L0;
        if (aVar9 == null) {
            jo.p.v("binding");
            aVar9 = null;
        }
        TabLayout.g x12 = aVar9.M.x(h0.CAMPAIGN.c());
        if (x12 != null) {
            sa.m mVar7 = this.O0;
            if (mVar7 == null) {
                jo.p.v("campaignTabBinding");
                mVar7 = null;
            }
            x12.p(mVar7.u());
        }
        sa.a aVar10 = this.L0;
        if (aVar10 == null) {
            jo.p.v("binding");
            aVar10 = null;
        }
        TabLayout.g x13 = aVar10.M.x(h0.NEWS.c());
        if (x13 != null) {
            sa.m mVar8 = this.P0;
            if (mVar8 == null) {
                jo.p.v("newsTabBinding");
                mVar8 = null;
            }
            x13.p(mVar8.u());
        }
        sa.a aVar11 = this.L0;
        if (aVar11 == null) {
            jo.p.v("binding");
        } else {
            aVar = aVar11;
        }
        View u10 = aVar.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final i0 E3() {
        return (i0) this.G0.getValue();
    }

    public final nf.c0 F3() {
        return (nf.c0) this.H0.getValue();
    }

    public final qa.j G3() {
        return (qa.j) this.f21664z0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final void P3(int i10) {
        boolean booleanValue;
        boolean booleanValue2;
        boolean c10;
        String str;
        if (this.Q0 != i10) {
            h0 h0Var = h0.PRESENT_BOX;
            if (i10 == h0Var.c()) {
                c10 = jo.p.c(G3().h().f(), Boolean.TRUE);
            } else if (i10 == h0.YOUR.c()) {
                c10 = jo.p.c(G3().i().f(), Boolean.TRUE);
            } else if (i10 == h0.CAMPAIGN.c()) {
                c10 = jo.p.c(G3().g().f(), Boolean.TRUE);
            } else if (i10 != h0.NEWS.c()) {
                throw new IllegalArgumentException("存在しないindex= " + i10 + " です");
            } else {
                c10 = jo.p.c(G3().f().f(), Boolean.TRUE);
            }
            MRLogger A3 = A3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_TAB_VIEW);
            builder.setTargetType("notice_category");
            if (i10 == h0Var.c()) {
                str = "present_boxes";
            } else if (i10 == h0.YOUR.c()) {
                str = "yours";
            } else if (i10 == h0.CAMPAIGN.c()) {
                str = "campaigns";
            } else if (i10 != h0.NEWS.c()) {
                throw new IllegalArgumentException("存在しないindex= " + i10 + " です");
            } else {
                str = "news";
            }
            builder.setTargetId(str);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, c10 ? "new" : "")));
            A3.sendLog(builder.build());
            this.Q0 = i10;
            x3().o(i10);
        }
        h0 h0Var2 = h0.PRESENT_BOX;
        boolean z10 = false;
        if (i10 == h0Var2.c()) {
            booleanValue = false;
        } else {
            Boolean f10 = G3().h().f();
            if (f10 == null) {
                f10 = Boolean.FALSE;
            }
            booleanValue = f10.booleanValue();
        }
        h0 h0Var3 = h0.YOUR;
        if (i10 == h0Var3.c()) {
            booleanValue2 = false;
        } else {
            Boolean f11 = G3().i().f();
            if (f11 == null) {
                f11 = Boolean.FALSE;
            }
            booleanValue2 = f11.booleanValue();
        }
        h0 h0Var4 = h0.NEWS;
        if (i10 != h0Var4.c()) {
            Boolean f12 = G3().f().f();
            if (f12 == null) {
                f12 = Boolean.FALSE;
            }
            z10 = f12.booleanValue();
        }
        v3().b(booleanValue, booleanValue2, z10);
        sa.m mVar = null;
        if (i10 == h0Var2.c()) {
            sa.m mVar2 = this.M0;
            if (mVar2 == null) {
                jo.p.v("presentBoxTabBinding");
                mVar2 = null;
            }
            mVar2.B.setImageResource(qa.n.ic_notice_present_box_selected);
            sa.m mVar3 = this.M0;
            if (mVar3 == null) {
                jo.p.v("presentBoxTabBinding");
                mVar3 = null;
            }
            mVar3.D.setTypeface(V0);
            sa.m mVar4 = this.M0;
            if (mVar4 == null) {
                jo.p.v("presentBoxTabBinding");
                mVar4 = null;
            }
            mVar4.D.setTextColor(c3.a.d(N2(), T0));
        } else {
            sa.m mVar5 = this.M0;
            if (mVar5 == null) {
                jo.p.v("presentBoxTabBinding");
                mVar5 = null;
            }
            mVar5.B.setImageResource(qa.n.ic_notice_present_box_unselected);
            sa.m mVar6 = this.M0;
            if (mVar6 == null) {
                jo.p.v("presentBoxTabBinding");
                mVar6 = null;
            }
            mVar6.D.setTypeface(W0);
            sa.m mVar7 = this.M0;
            if (mVar7 == null) {
                jo.p.v("presentBoxTabBinding");
                mVar7 = null;
            }
            mVar7.D.setTextColor(c3.a.d(N2(), U0));
        }
        if (i10 == h0Var3.c()) {
            sa.m mVar8 = this.N0;
            if (mVar8 == null) {
                jo.p.v("yourTabBinding");
                mVar8 = null;
            }
            mVar8.B.setImageResource(qa.n.ic_notice_your_selected);
            sa.m mVar9 = this.N0;
            if (mVar9 == null) {
                jo.p.v("yourTabBinding");
                mVar9 = null;
            }
            mVar9.D.setTypeface(V0);
            sa.m mVar10 = this.N0;
            if (mVar10 == null) {
                jo.p.v("yourTabBinding");
                mVar10 = null;
            }
            mVar10.D.setTextColor(c3.a.d(N2(), T0));
        } else {
            sa.m mVar11 = this.N0;
            if (mVar11 == null) {
                jo.p.v("yourTabBinding");
                mVar11 = null;
            }
            mVar11.B.setImageResource(qa.n.ic_notice_your_unselected);
            sa.m mVar12 = this.N0;
            if (mVar12 == null) {
                jo.p.v("yourTabBinding");
                mVar12 = null;
            }
            mVar12.D.setTypeface(W0);
            sa.m mVar13 = this.N0;
            if (mVar13 == null) {
                jo.p.v("yourTabBinding");
                mVar13 = null;
            }
            mVar13.D.setTextColor(c3.a.d(N2(), U0));
        }
        if (i10 == h0.CAMPAIGN.c()) {
            sa.m mVar14 = this.O0;
            if (mVar14 == null) {
                jo.p.v("campaignTabBinding");
                mVar14 = null;
            }
            mVar14.B.setImageResource(qa.n.f48873e);
            sa.m mVar15 = this.O0;
            if (mVar15 == null) {
                jo.p.v("campaignTabBinding");
                mVar15 = null;
            }
            mVar15.D.setTypeface(V0);
            sa.m mVar16 = this.O0;
            if (mVar16 == null) {
                jo.p.v("campaignTabBinding");
                mVar16 = null;
            }
            mVar16.D.setTextColor(c3.a.d(N2(), T0));
        } else {
            sa.m mVar17 = this.O0;
            if (mVar17 == null) {
                jo.p.v("campaignTabBinding");
                mVar17 = null;
            }
            mVar17.B.setImageResource(qa.n.f48874f);
            sa.m mVar18 = this.O0;
            if (mVar18 == null) {
                jo.p.v("campaignTabBinding");
                mVar18 = null;
            }
            mVar18.D.setTypeface(W0);
            sa.m mVar19 = this.O0;
            if (mVar19 == null) {
                jo.p.v("campaignTabBinding");
                mVar19 = null;
            }
            mVar19.D.setTextColor(c3.a.d(N2(), U0));
        }
        if (i10 == h0Var4.c()) {
            sa.m mVar20 = this.P0;
            if (mVar20 == null) {
                jo.p.v("newsTabBinding");
                mVar20 = null;
            }
            mVar20.B.setImageResource(qa.n.ic_notice_news_selected);
            sa.m mVar21 = this.P0;
            if (mVar21 == null) {
                jo.p.v("newsTabBinding");
                mVar21 = null;
            }
            mVar21.D.setTypeface(V0);
            sa.m mVar22 = this.P0;
            if (mVar22 == null) {
                jo.p.v("newsTabBinding");
            } else {
                mVar = mVar22;
            }
            mVar.D.setTextColor(c3.a.d(N2(), T0));
            return;
        }
        sa.m mVar23 = this.P0;
        if (mVar23 == null) {
            jo.p.v("newsTabBinding");
            mVar23 = null;
        }
        mVar23.B.setImageResource(qa.n.ic_notice_news_unselected);
        sa.m mVar24 = this.P0;
        if (mVar24 == null) {
            jo.p.v("newsTabBinding");
            mVar24 = null;
        }
        mVar24.D.setTypeface(W0);
        sa.m mVar25 = this.P0;
        if (mVar25 == null) {
            jo.p.v("newsTabBinding");
        } else {
            mVar = mVar25;
        }
        mVar.D.setTextColor(c3.a.d(N2(), U0));
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        int intValue;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        G3().h().i(a1(), new androidx.lifecycle.f0() { // from class: qa.b
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                NoticeFragment.I3(NoticeFragment.this, (Boolean) obj);
            }
        });
        G3().i().i(a1(), new androidx.lifecycle.f0() { // from class: qa.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                NoticeFragment.J3(NoticeFragment.this, (Boolean) obj);
            }
        });
        G3().g().i(a1(), new androidx.lifecycle.f0() { // from class: qa.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                NoticeFragment.K3(NoticeFragment.this, (Boolean) obj);
            }
        });
        G3().f().i(a1(), new androidx.lifecycle.f0() { // from class: qa.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                NoticeFragment.L3(NoticeFragment.this, (Boolean) obj);
            }
        });
        C3().k().i(a1(), new androidx.lifecycle.f0() { // from class: qa.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                NoticeFragment.M3(NoticeFragment.this, (String) obj);
            }
        });
        y3().y().i(a1(), new androidx.lifecycle.f0() { // from class: qa.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                NoticeFragment.N3(NoticeFragment.this, (Boolean) obj);
            }
        });
        v3().a();
        nd.t0.b(y3().p(), y3().o(), F3().i()).i(a1(), new androidx.lifecycle.f0() { // from class: qa.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                NoticeFragment.O3(NoticeFragment.this, (wn.p) obj);
            }
        });
        E3().d(Referer.Notice.Campaign.RECOMMEND);
        String f10 = w3().q().f();
        sa.a aVar = null;
        if (f10 != null) {
            sa.a aVar2 = this.L0;
            if (aVar2 == null) {
                jo.p.v("binding");
                aVar2 = null;
            }
            MirraClassSeasonRatingCardView mirraClassSeasonRatingCardView = aVar2.G;
            jo.p.g(mirraClassSeasonRatingCardView, "binding.seasonRatingCardView");
            yd.g1.a(mirraClassSeasonRatingCardView, new g(f10));
        }
        Boolean f11 = G3().h().f();
        Boolean bool = Boolean.TRUE;
        if (jo.p.c(f11, bool)) {
            intValue = h0.PRESENT_BOX.c();
        } else if (jo.p.c(G3().i().f(), bool)) {
            intValue = h0.YOUR.c();
        } else if (jo.p.c(G3().g().f(), bool)) {
            intValue = h0.CAMPAIGN.c();
        } else if (jo.p.c(G3().f().f(), bool)) {
            intValue = h0.NEWS.c();
        } else {
            Integer f12 = y3().p().f();
            if (f12 == null) {
                f12 = Integer.valueOf(h0.CAMPAIGN.c());
            }
            intValue = f12.intValue();
        }
        P3(intValue);
        sa.a aVar3 = this.L0;
        if (aVar3 == null) {
            jo.p.v("binding");
        } else {
            aVar = aVar3;
        }
        aVar.P.setCurrentItem(intValue);
        boolean z10 = jo.p.c(G3().h().f(), bool) || jo.p.c(G3().i().f(), bool) || jo.p.c(G3().g().f(), bool) || jo.p.c(G3().f().f(), bool);
        MRLogger A3 = A3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_LAUNCH);
        builder.setTargetType("notice_category");
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, z10 ? "new" : "")));
        A3.sendLog(builder.build());
        B3().t();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f21663y0;
    }

    public final od.a0 v3() {
        return (od.a0) this.A0.getValue();
    }

    public final nf.k w3() {
        return (nf.k) this.E0.getValue();
    }

    public final od.p x3() {
        return (od.p) this.B0.getValue();
    }

    public final nf.o y3() {
        return (nf.o) this.D0.getValue();
    }

    public final tb.c z3() {
        return (tb.c) this.J0.getValue();
    }
}
