package gf;

import ae.q6;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import ia.a;
import kq.a;
import uo.b1;

/* loaded from: classes2.dex */
public final class i0 extends Fragment implements uo.q0 {
    public final wn.f A0;
    public final AutoClearedValue B0;
    public qd.a C0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f33330x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f33331y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f33332z0;
    public static final /* synthetic */ qo.h<Object>[] E0 = {jo.f0.d(new jo.s(i0.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/FragmentGiftboxGachaPreviewBinding;", 0))};
    public static final a D0 = new a(null);
    public static final int F0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i0 a() {
            return new i0();
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaPreviewFragment$onViewCreated$2", f = "GiftboxGachaPreviewFragment.kt", l = {81}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33333w;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i0 f33335a;

            /* renamed from: gf.i0$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0403a implements ia.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ i0 f33336a;

                public C0403a(i0 i0Var) {
                    this.f33336a = i0Var;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    a.C0469a.a(this, animation);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    a.C0469a.b(this, animation);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    this.f33336a.p3().E.setVisibility(0);
                }
            }

            public a(i0 i0Var) {
                this.f33335a = i0Var;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f33335a.N2(), nd.v0.giftbox_gacha_fade_in_view_animation);
                loadAnimation.setAnimationListener(new C0403a(this.f33335a));
                this.f33335a.p3().E.startAnimation(loadAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                a.C0469a.b(this, animation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                a.C0469a.c(this, animation);
            }
        }

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33333w;
            if (i10 == 0) {
                wn.m.b(obj);
                i0.this.p3().I.r();
                this.f33333w = 1;
                if (b1.a(800L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            i0.this.p3().D.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(i0.this.q0(), nd.v0.giftbox_gacha_content_elastic_bounce);
            loadAnimation.setInterpolator(new le.a(0.1d, 20.0d, 0.0d, 0.0d, 12, null));
            loadAnimation.setAnimationListener(new a(i0.this));
            i0.this.p3().D.startAnimation(loadAnimation);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaPreviewFragment$onViewCreated$4", f = "GiftboxGachaPreviewFragment.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f33337w;

        /* renamed from: x  reason: collision with root package name */
        public Object f33338x;

        /* renamed from: y  reason: collision with root package name */
        public Object f33339y;

        /* renamed from: z  reason: collision with root package name */
        public int f33340z;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #2 {all -> 0x008d, blocks: (B:17:0x0054, B:19:0x005c), top: B:34:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
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
                int r1 = r9.f33340z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f33339y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f33338x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f33337w
                gf.i0 r4 = (gf.i0) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L90
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
                gf.i0 r10 = gf.i0.this
                nf.n r10 = gf.i0.n3(r10)
                wo.x r3 = r10.q()
                gf.i0 r10 = gf.i0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L90
                r4 = r10
                r10 = r9
            L3d:
                r10.f33337w = r4     // Catch: java.lang.Throwable -> L90
                r10.f33338x = r3     // Catch: java.lang.Throwable -> L90
                r10.f33339y = r1     // Catch: java.lang.Throwable -> L90
                r10.f33340z = r2     // Catch: java.lang.Throwable -> L90
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L90
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8d
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8d
                if (r10 == 0) goto L87
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L8d
                com.dena.mirrorman.net.api.response.GiftboxGachaResponse r10 = (com.dena.mirrorman.net.api.response.GiftboxGachaResponse) r10     // Catch: java.lang.Throwable -> L8d
                ae.q6 r6 = gf.i0.l3(r5)     // Catch: java.lang.Throwable -> L8d
                androidx.appcompat.widget.AppCompatTextView r6 = r6.K     // Catch: java.lang.Throwable -> L8d
                java.lang.String r7 = r10.getTitle()     // Catch: java.lang.Throwable -> L8d
                r6.setText(r7)     // Catch: java.lang.Throwable -> L8d
                ae.q6 r6 = gf.i0.l3(r5)     // Catch: java.lang.Throwable -> L8d
                androidx.appcompat.widget.AppCompatImageView r6 = r6.C     // Catch: java.lang.Throwable -> L8d
                java.lang.String r7 = "binding.appImageView"
                jo.p.g(r6, r7)     // Catch: java.lang.Throwable -> L8d
                java.lang.String r10 = r10.getIconUrl()     // Catch: java.lang.Throwable -> L8d
                td.a.l(r6, r10)     // Catch: java.lang.Throwable -> L8d
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L87:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L8d:
                r10 = move-exception
                r3 = r4
                goto L91
            L90:
                r10 = move-exception
            L91:
                throw r10     // Catch: java.lang.Throwable -> L92
            L92:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.i0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaPreviewFragment$onViewCreated$5", f = "GiftboxGachaPreviewFragment.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public /* synthetic */ Object A;

        /* renamed from: w  reason: collision with root package name */
        public Object f33341w;

        /* renamed from: x  reason: collision with root package name */
        public Object f33342x;

        /* renamed from: y  reason: collision with root package name */
        public Object f33343y;

        /* renamed from: z  reason: collision with root package name */
        public int f33344z;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i0 f33345a;

            public a(i0 i0Var) {
                this.f33345a = i0Var;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f33345a.p3().D.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                a.C0469a.b(this, animation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                a.C0469a.c(this, animation);
            }
        }

        @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaPreviewFragment$onViewCreated$5$1$2", f = "GiftboxGachaPreviewFragment.kt", l = {139}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f33346w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i0 f33347x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i0 i0Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f33347x = i0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f33347x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f33346w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f33346w = 1;
                    if (b1.a(4000L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                qd.a aVar = this.f33347x.C0;
                if (aVar != null) {
                    aVar.h0();
                }
                return wn.v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.A = obj;
            return dVar2;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #0 {all -> 0x00d5, blocks: (B:16:0x0061, B:18:0x006a), top: B:29:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:29:0x0061). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.i0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaPreviewFragment$onViewCreated$6", f = "GiftboxGachaPreviewFragment.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f33348w;

        /* renamed from: x  reason: collision with root package name */
        public Object f33349x;

        /* renamed from: y  reason: collision with root package name */
        public Object f33350y;

        /* renamed from: z  reason: collision with root package name */
        public int f33351z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
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
                int r1 = r10.f33351z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f33350y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f33349x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f33348w
                gf.i0 r4 = (gf.i0) r4
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
                gf.i0 r11 = gf.i0.this
                nf.n r11 = gf.i0.n3(r11)
                wo.x r3 = r11.m()
                gf.i0 r11 = gf.i0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb3
                r4 = r11
                r11 = r10
            L3d:
                r11.f33348w = r4     // Catch: java.lang.Throwable -> Lb3
                r11.f33349x = r3     // Catch: java.lang.Throwable -> Lb3
                r11.f33350y = r1     // Catch: java.lang.Throwable -> Lb3
                r11.f33351z = r2     // Catch: java.lang.Throwable -> Lb3
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
            throw new UnsupportedOperationException("Method not decompiled: gf.i0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.GiftboxGachaPreviewFragment$onViewCreated$7", f = "GiftboxGachaPreviewFragment.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f33352w;

        /* renamed from: x  reason: collision with root package name */
        public Object f33353x;

        /* renamed from: y  reason: collision with root package name */
        public Object f33354y;

        /* renamed from: z  reason: collision with root package name */
        public int f33355z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:33:0x008a, B:34:0x0099, B:36:0x009d, B:31:0x0086, B:28:0x0080, B:22:0x0068), top: B:49:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.i0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33356w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33357x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33358y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33356w = componentCallbacks;
            this.f33357x = aVar;
            this.f33358y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f33356w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f33357x, this.f33358y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33359w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f33359w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f33359w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f33359w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33360w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f33360w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33360w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33361w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33362x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33363y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33364z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33361w = aVar;
            this.f33362x = aVar2;
            this.f33363y = aVar3;
            this.f33364z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33361w;
            vq.a aVar2 = this.f33362x;
            io.a aVar3 = this.f33363y;
            xq.a aVar4 = this.f33364z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.n.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33365w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f33365w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33365w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33366w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f33366w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f33366w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f33366w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33367w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f33367w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33367w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33368w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33369x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33370y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33371z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33368w = aVar;
            this.f33369x = aVar2;
            this.f33370y = aVar3;
            this.f33371z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33368w;
            vq.a aVar2 = this.f33369x;
            io.a aVar3 = this.f33370y;
            xq.a aVar4 = this.f33371z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.m.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33372w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f33372w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33372w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public i0() {
        h hVar = new h(this);
        xq.a a10 = gq.a.a(this);
        i iVar = new i(hVar);
        this.f33331y0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.n.class), new k(iVar), new j(hVar, null, null, a10));
        l lVar = new l(this);
        xq.a a11 = gq.a.a(this);
        m mVar = new m(lVar);
        this.f33332z0 = androidx.fragment.app.e0.a(this, jo.f0.b(od.m.class), new o(mVar), new n(lVar, null, null, a11));
        this.A0 = wn.g.b(wn.i.SYNCHRONIZED, new g(this, null, null));
        this.B0 = nd.a.a(this);
    }

    public static final void s3(i0 i0Var, View view) {
        jo.p.h(i0Var, "this$0");
        Drawable background = i0Var.p3().G.getBackground();
        jo.p.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) background).start();
        i0Var.o3().h(i0Var.r3().r(), i0Var.r3().t());
    }

    public static final void t3(i0 i0Var, Boolean bool) {
        jo.p.h(i0Var, "this$0");
        ConstraintLayout constraintLayout = i0Var.p3().H;
        jo.p.g(constraintLayout, "binding.mirrabitLoadingView");
        jo.p.g(bool, "it");
        constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        i0Var.p3().E.setEnabled(!bool.booleanValue());
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        q6 T = q6.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        u3(T);
        View u10 = p3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.C0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        MRLogger q32 = q3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GIFT_BOX_GACHA_GACHA_IMP);
        builder.setTargetId(r3().t());
        q32.sendLog(builder.build());
        uo.l.d(this, null, null, new b(null), 3, null);
        p3().E.setOnClickListener(new View.OnClickListener() { // from class: gf.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i0.s3(i0.this, view2);
            }
        });
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        r3().u().i(a1(), new androidx.lifecycle.f0() { // from class: gf.h0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i0.t3(i0.this, (Boolean) obj);
            }
        });
        o3().i(r3().t());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33330x0.getCoroutineContext();
    }

    public final od.m o3() {
        return (od.m) this.f33332z0.getValue();
    }

    public final q6 p3() {
        return (q6) this.B0.b(this, E0[0]);
    }

    public final MRLogger q3() {
        return (MRLogger) this.A0.getValue();
    }

    public final nf.n r3() {
        return (nf.n) this.f33331y0.getValue();
    }

    public final void u3(q6 q6Var) {
        this.B0.a(this, E0[0], q6Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.C0 = context instanceof qd.a ? (qd.a) context : null;
    }
}
