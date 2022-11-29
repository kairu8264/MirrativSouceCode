package be;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import sf.i;

/* loaded from: classes2.dex */
public final class w4 extends androidx.fragment.app.e implements uo.q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public x4 P0;
    public x4 Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w4 a(long j10) {
            w4 w4Var = new w4();
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_FORCE_MATCHING_AT", j10);
            w4Var.V2(bundle);
            return w4Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Long> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Long invoke() {
            return Long.valueOf(w4.this.M2().getLong("EXTRA_FORCE_MATCHING_AT", 0L));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements sf.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ae.s4 f18287a;

        public c(ae.s4 s4Var) {
            this.f18287a = s4Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18287a.D.setVisibility(8);
            this.f18287a.E.setVisibility(0);
            this.f18287a.E.r();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.ShooterMatchingDialogFragment$startForceCloseCountDownTimer$1", f = "ShooterMatchingDialogFragment.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public int B;
        public /* synthetic */ Object C;

        /* renamed from: w  reason: collision with root package name */
        public Object f18288w;

        /* renamed from: x  reason: collision with root package name */
        public long f18289x;

        /* renamed from: y  reason: collision with root package name */
        public long f18290y;

        /* renamed from: z  reason: collision with root package name */
        public int f18291z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.C = obj;
            return dVar2;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0061 -> B:13:0x0064). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.B
                r3 = 1
                if (r2 == 0) goto L2a
                if (r2 != r3) goto L22
                int r2 = r0.A
                int r4 = r0.f18291z
                long r5 = r0.f18290y
                long r7 = r0.f18289x
                java.lang.Object r9 = r0.f18288w
                be.w4 r9 = (be.w4) r9
                java.lang.Object r10 = r0.C
                uo.q0 r10 = (uo.q0) r10
                wn.m.b(r20)
                r11 = r0
                goto L64
            L22:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2a:
                wn.m.b(r20)
                java.lang.Object r2 = r0.C
                uo.q0 r2 = (uo.q0) r2
                r4 = 60000(0xea60, double:2.9644E-319)
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 + r4
                r4 = 500(0x1f4, double:2.47E-321)
                r8 = 120(0x78, double:5.93E-322)
                int r8 = (int) r8
                be.w4 r9 = be.w4.this
                r10 = 0
                r11 = r0
                r16 = r10
                r10 = r2
                r2 = r16
                r17 = r4
                r4 = r8
                r7 = r6
                r5 = r17
            L4d:
                if (r2 >= r4) goto La0
                r11.C = r10
                r11.f18288w = r9
                r11.f18289x = r7
                r11.f18290y = r5
                r11.f18291z = r4
                r11.A = r2
                r11.B = r3
                java.lang.Object r12 = uo.b1.a(r5, r11)
                if (r12 != r1) goto L64
                return r1
            L64:
                long r12 = java.lang.System.currentTimeMillis()
                int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r12 >= 0) goto L9e
                be.x4 r12 = be.w4.B3(r9)
                if (r12 == 0) goto L75
                r12.T()
            L75:
                be.x4 r12 = be.w4.D3(r9)
                if (r12 == 0) goto L7e
                r12.T()
            L7e:
                r9.n3()
                yd.t1$a r12 = yd.t1.f61795x
                android.content.Context r13 = r9.N2()
                java.lang.String r14 = "requireContext()"
                jo.p.g(r13, r14)
                int r14 = nd.f1.text_shooter_waiting_timeout
                java.lang.String r14 = r9.U0(r14)
                java.lang.String r15 = "getString(R.string.text_shooter_waiting_timeout)"
                jo.p.g(r14, r15)
                r12.a(r13, r14)
                r12 = 0
                uo.r0.d(r10, r12, r3, r12)
            L9e:
                int r2 = r2 + r3
                goto L4d
            La0:
                wn.v r1 = wn.v.f59242a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: be.w4.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.ShooterMatchingDialogFragment$startMatchingCountDownTimer$1", f = "ShooterMatchingDialogFragment.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ ae.s4 D;

        /* renamed from: w  reason: collision with root package name */
        public Object f18292w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18293x;

        /* renamed from: y  reason: collision with root package name */
        public int f18294y;

        /* renamed from: z  reason: collision with root package name */
        public int f18295z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ae.s4 s4Var, ao.d<? super e> dVar) {
            super(2, dVar);
            this.D = s4Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.D, dVar);
            eVar.B = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00db -> B:23:0x00de). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: be.w4.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w4() {
        super(nd.b1.dialog_fragment_shooter_matching);
        this.N0 = new da.j();
        this.O0 = wn.g.a(new b());
    }

    public final long F3() {
        return ((Number) this.O0.getValue()).longValue();
    }

    public final void G3() {
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void H3(ae.s4 s4Var) {
        uo.l.d(this, null, null, new e(s4Var, null), 3, null);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.P0 = null;
        this.Q0 = null;
        uo.r0.d(this, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.s4 T = ae.s4.T(view);
        T.D.setVisibility(0);
        T.D.setAnimation("ebd_matching_op/ebd_matching_op.json");
        T.D.setImageAssetsFolder("ebd_matching_op/images");
        T.E.setVisibility(8);
        T.E.setAnimation("ebd_matching_loop/ebd_matching_loop.json");
        T.E.setImageAssetsFolder("ebd_matching_loop/images");
        T.D.e(new c(T));
        T.D.r();
        jo.p.g(T, "binding");
        H3(T);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        w3(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.w0.Q0);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.clearFlags(2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof x4 ? (x4) context : null;
        Fragment H0 = H0();
        this.Q0 = H0 instanceof x4 ? (x4) H0 : null;
    }
}
