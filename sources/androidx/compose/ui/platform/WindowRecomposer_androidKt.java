package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import xo.c0;

/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Context, xo.g0<Float>> f14335a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f14336w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.g1 f14337x;

        public a(View view, l0.g1 g1Var) {
            this.f14336w = view;
            this.f14337x = g1Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            jo.p.h(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            jo.p.h(view, "v");
            this.f14336w.removeOnAttachStateChangeListener(this);
            this.f14337x.T();
        }
    }

    @co.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {116, 122}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<xo.d<? super Float>, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Uri A;
        public final /* synthetic */ c B;
        public final /* synthetic */ wo.i<wn.v> C;
        public final /* synthetic */ Context D;

        /* renamed from: w  reason: collision with root package name */
        public Object f14338w;

        /* renamed from: x  reason: collision with root package name */
        public int f14339x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f14340y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ContentResolver f14341z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ContentResolver contentResolver, Uri uri, c cVar, wo.i<wn.v> iVar, Context context, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f14341z = contentResolver;
            this.A = uri;
            this.B = cVar;
            this.C = iVar;
            this.D = context;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(xo.d<? super Float> dVar, ao.d<? super wn.v> dVar2) {
            return ((b) create(dVar, dVar2)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f14341z, this.A, this.B, this.C, this.D, dVar);
            bVar.f14340y = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:17:0x0049, B:21:0x0059, B:23:0x0061), top: B:36:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:36:0x0049). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f14339x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.f14338w
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r9.f14340y
                xo.d r4 = (xo.d) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L91
                r10 = r4
                goto L48
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f14338w
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r9.f14340y
                xo.d r4 = (xo.d) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L91
                r5 = r4
                r4 = r9
                goto L59
            L31:
                wn.m.b(r10)
                java.lang.Object r10 = r9.f14340y
                xo.d r10 = (xo.d) r10
                android.content.ContentResolver r1 = r9.f14341z
                android.net.Uri r4 = r9.A
                r5 = 0
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r6 = r9.B
                r1.registerContentObserver(r4, r5, r6)
                wo.i<wn.v> r1 = r9.C     // Catch: java.lang.Throwable -> L91
                wo.k r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
            L48:
                r4 = r9
            L49:
                r4.f14340y = r10     // Catch: java.lang.Throwable -> L8f
                r4.f14338w = r1     // Catch: java.lang.Throwable -> L8f
                r4.f14339x = r3     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L8f
                if (r5 != r0) goto L56
                return r0
            L56:
                r8 = r5
                r5 = r10
                r10 = r8
            L59:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8f
                if (r10 == 0) goto L85
                r1.next()     // Catch: java.lang.Throwable -> L8f
                android.content.Context r10 = r4.D     // Catch: java.lang.Throwable -> L8f
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L8f
                java.lang.String r6 = "animator_duration_scale"
                r7 = 1065353216(0x3f800000, float:1.0)
                float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L8f
                java.lang.Float r10 = co.b.c(r10)     // Catch: java.lang.Throwable -> L8f
                r4.f14340y = r5     // Catch: java.lang.Throwable -> L8f
                r4.f14338w = r1     // Catch: java.lang.Throwable -> L8f
                r4.f14339x = r2     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r10 = r5.emit(r10, r4)     // Catch: java.lang.Throwable -> L8f
                if (r10 != r0) goto L83
                return r0
            L83:
                r10 = r5
                goto L49
            L85:
                android.content.ContentResolver r10 = r4.f14341z
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r0 = r4.B
                r10.unregisterContentObserver(r0)
                wn.v r10 = wn.v.f59242a
                return r10
            L8f:
                r10 = move-exception
                goto L93
            L91:
                r10 = move-exception
                r4 = r9
            L93:
                android.content.ContentResolver r0 = r4.f14341z
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r1 = r4.B
                r0.unregisterContentObserver(r1)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wo.i<wn.v> f14342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wo.i<wn.v> iVar, Handler handler) {
            super(handler);
            this.f14342a = iVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            this.f14342a.l(wn.v.f59242a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.platform.i1] */
    public static final l0.g1 b(final View view, ao.g gVar, androidx.lifecycle.o oVar) {
        final l0.x0 x0Var;
        jo.p.h(view, "<this>");
        jo.p.h(gVar, "coroutineContext");
        if (gVar.get(ao.e.f16648d) == null || gVar.get(l0.n0.f39207n) == null) {
            gVar = c0.H.a().plus(gVar);
        }
        l0.n0 n0Var = (l0.n0) gVar.get(l0.n0.f39207n);
        if (n0Var != null) {
            l0.x0 x0Var2 = new l0.x0(n0Var);
            x0Var2.b();
            x0Var = x0Var2;
        } else {
            x0Var = null;
        }
        final jo.e0 e0Var = new jo.e0();
        x0.g gVar2 = (x0.g) gVar.get(x0.g.f59361v);
        x0.g gVar3 = gVar2;
        if (gVar2 == null) {
            ?? i1Var = new i1();
            e0Var.f38136w = i1Var;
            gVar3 = i1Var;
        }
        ao.g plus = gVar.plus(x0Var != null ? x0Var : ao.h.f16651w).plus(gVar3);
        final l0.g1 g1Var = new l0.g1(plus);
        final uo.q0 a10 = uo.r0.a(plus);
        if (oVar == null) {
            androidx.lifecycle.u a11 = androidx.lifecycle.w0.a(view);
            oVar = a11 != null ? a11.g() : null;
        }
        if (oVar != null) {
            view.addOnAttachStateChangeListener(new a(view, g1Var));
            oVar.a(new androidx.lifecycle.r() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* loaded from: classes.dex */
                public /* synthetic */ class a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f14347a;

                    static {
                        int[] iArr = new int[o.b.values().length];
                        iArr[o.b.ON_CREATE.ordinal()] = 1;
                        iArr[o.b.ON_START.ordinal()] = 2;
                        iArr[o.b.ON_STOP.ordinal()] = 3;
                        iArr[o.b.ON_DESTROY.ordinal()] = 4;
                        iArr[o.b.ON_PAUSE.ordinal()] = 5;
                        iArr[o.b.ON_RESUME.ordinal()] = 6;
                        iArr[o.b.ON_ANY.ordinal()] = 7;
                        f14347a = iArr;
                    }
                }

                @co.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
                /* loaded from: classes.dex */
                public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
                    public final /* synthetic */ androidx.lifecycle.u A;
                    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 B;
                    public final /* synthetic */ View C;

                    /* renamed from: w  reason: collision with root package name */
                    public int f14348w;

                    /* renamed from: x  reason: collision with root package name */
                    public /* synthetic */ Object f14349x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ jo.e0<i1> f14350y;

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ l0.g1 f14351z;

                    @co.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {386}, m = "invokeSuspend")
                    /* loaded from: classes.dex */
                    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                        /* renamed from: w  reason: collision with root package name */
                        public int f14352w;

                        /* renamed from: x  reason: collision with root package name */
                        public final /* synthetic */ xo.g0<Float> f14353x;

                        /* renamed from: y  reason: collision with root package name */
                        public final /* synthetic */ i1 f14354y;

                        /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a  reason: collision with other inner class name */
                        /* loaded from: classes.dex */
                        public static final class C0047a implements xo.d<Float> {

                            /* renamed from: w  reason: collision with root package name */
                            public final /* synthetic */ i1 f14355w;

                            public C0047a(i1 i1Var) {
                                this.f14355w = i1Var;
                            }

                            public final Object a(float f10, ao.d<? super wn.v> dVar) {
                                this.f14355w.b(f10);
                                return wn.v.f59242a;
                            }

                            @Override // xo.d
                            public /* bridge */ /* synthetic */ Object emit(Float f10, ao.d dVar) {
                                return a(f10.floatValue(), dVar);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(xo.g0<Float> g0Var, i1 i1Var, ao.d<? super a> dVar) {
                            super(2, dVar);
                            this.f14353x = g0Var;
                            this.f14354y = i1Var;
                        }

                        @Override // co.a
                        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                            return new a(this.f14353x, this.f14354y, dVar);
                        }

                        @Override // io.p
                        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                        }

                        @Override // co.a
                        public final Object invokeSuspend(Object obj) {
                            Object c10 = bo.c.c();
                            int i10 = this.f14352w;
                            if (i10 == 0) {
                                wn.m.b(obj);
                                xo.g0<Float> g0Var = this.f14353x;
                                C0047a c0047a = new C0047a(this.f14354y);
                                this.f14352w = 1;
                                if (g0Var.a(c0047a, this) == c10) {
                                    return c10;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                wn.m.b(obj);
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(jo.e0<i1> e0Var, l0.g1 g1Var, androidx.lifecycle.u uVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, ao.d<? super b> dVar) {
                        super(2, dVar);
                        this.f14350y = e0Var;
                        this.f14351z = g1Var;
                        this.A = uVar;
                        this.B = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
                        this.C = view;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        b bVar = new b(this.f14350y, this.f14351z, this.A, this.B, this.C, dVar);
                        bVar.f14349x = obj;
                        return bVar;
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
                    @Override // co.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            java.lang.Object r0 = bo.c.c()
                            int r1 = r11.f14348w
                            r2 = 1
                            r3 = 0
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r0 = r11.f14349x
                            uo.d2 r0 = (uo.d2) r0
                            wn.m.b(r12)     // Catch: java.lang.Throwable -> L14
                            goto L6c
                        L14:
                            r12 = move-exception
                            goto L86
                        L17:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1f:
                            wn.m.b(r12)
                            java.lang.Object r12 = r11.f14349x
                            r4 = r12
                            uo.q0 r4 = (uo.q0) r4
                            jo.e0<androidx.compose.ui.platform.i1> r12 = r11.f14350y     // Catch: java.lang.Throwable -> L84
                            T r12 = r12.f38136w     // Catch: java.lang.Throwable -> L84
                            androidx.compose.ui.platform.i1 r12 = (androidx.compose.ui.platform.i1) r12     // Catch: java.lang.Throwable -> L84
                            if (r12 == 0) goto L5d
                            android.view.View r1 = r11.C     // Catch: java.lang.Throwable -> L84
                            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L84
                            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L84
                            java.lang.String r5 = "context.applicationContext"
                            jo.p.g(r1, r5)     // Catch: java.lang.Throwable -> L84
                            xo.g0 r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.a(r1)     // Catch: java.lang.Throwable -> L84
                            java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L84
                            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L84
                            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L84
                            r12.b(r5)     // Catch: java.lang.Throwable -> L84
                            r5 = 0
                            r6 = 0
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a     // Catch: java.lang.Throwable -> L84
                            r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L84
                            r8 = 3
                            r9 = 0
                            uo.d2 r12 = uo.j.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L84
                            goto L5e
                        L5d:
                            r12 = r3
                        L5e:
                            l0.g1 r1 = r11.f14351z     // Catch: java.lang.Throwable -> L7f
                            r11.f14349x = r12     // Catch: java.lang.Throwable -> L7f
                            r11.f14348w = r2     // Catch: java.lang.Throwable -> L7f
                            java.lang.Object r1 = r1.k0(r11)     // Catch: java.lang.Throwable -> L7f
                            if (r1 != r0) goto L6b
                            return r0
                        L6b:
                            r0 = r12
                        L6c:
                            if (r0 == 0) goto L71
                            uo.d2.a.a(r0, r3, r2, r3)
                        L71:
                            androidx.lifecycle.u r12 = r11.A
                            androidx.lifecycle.o r12 = r12.g()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.B
                            r12.c(r0)
                            wn.v r12 = wn.v.f59242a
                            return r12
                        L7f:
                            r0 = move-exception
                            r10 = r0
                            r0 = r12
                            r12 = r10
                            goto L86
                        L84:
                            r12 = move-exception
                            r0 = r3
                        L86:
                            if (r0 == 0) goto L8b
                            uo.d2.a.a(r0, r3, r2, r3)
                        L8b:
                            androidx.lifecycle.u r0 = r11.A
                            androidx.lifecycle.o r0 = r0.g()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.B
                            r0.c(r1)
                            throw r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // androidx.lifecycle.r
                public void i(androidx.lifecycle.u uVar, o.b bVar) {
                    jo.p.h(uVar, "lifecycleOwner");
                    jo.p.h(bVar, "event");
                    int i10 = a.f14347a[bVar.ordinal()];
                    if (i10 == 1) {
                        uo.l.d(uo.q0.this, null, uo.s0.UNDISPATCHED, new b(e0Var, g1Var, uVar, this, view, null), 1, null);
                    } else if (i10 == 2) {
                        l0.x0 x0Var3 = x0Var;
                        if (x0Var3 != null) {
                            x0Var3.d();
                        }
                    } else if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        g1Var.T();
                    } else {
                        l0.x0 x0Var4 = x0Var;
                        if (x0Var4 != null) {
                            x0Var4.b();
                        }
                    }
                }
            });
            return g1Var;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ l0.g1 c(View view, ao.g gVar, androidx.lifecycle.o oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = ao.h.f16651w;
        }
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        return b(view, gVar, oVar);
    }

    public static final l0.m d(View view) {
        jo.p.h(view, "<this>");
        l0.m f10 = f(view);
        if (f10 != null) {
            return f10;
        }
        for (ViewParent parent = view.getParent(); f10 == null && (parent instanceof View); parent = parent.getParent()) {
            f10 = f((View) parent);
        }
        return f10;
    }

    public static final xo.g0<Float> e(Context context) {
        xo.g0<Float> g0Var;
        Map<Context, xo.g0<Float>> map = f14335a;
        synchronized (map) {
            xo.g0<Float> g0Var2 = map.get(context);
            if (g0Var2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                wo.i b10 = wo.l.b(-1, null, null, 6, null);
                g0Var2 = xo.e.x(xo.e.q(new b(contentResolver, uriFor, new c(b10, k3.e.a(Looper.getMainLooper())), b10, context, null)), uo.r0.b(), c0.a.b(xo.c0.f60480a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, g0Var2);
            }
            g0Var = g0Var2;
        }
        return g0Var;
    }

    public static final l0.m f(View view) {
        jo.p.h(view, "<this>");
        Object tag = view.getTag(x0.h.G);
        if (tag instanceof l0.m) {
            return (l0.m) tag;
        }
        return null;
    }

    public static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final l0.g1 h(View view) {
        jo.p.h(view, "<this>");
        if (view.isAttachedToWindow()) {
            View g10 = g(view);
            l0.m f10 = f(g10);
            if (f10 == null) {
                return r2.f14594a.a(g10);
            }
            if (f10 instanceof l0.g1) {
                return (l0.g1) f10;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static final void i(View view, l0.m mVar) {
        jo.p.h(view, "<this>");
        view.setTag(x0.h.G, mVar);
    }
}
