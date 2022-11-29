package w;

import l0.s0;
import uo.q0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final io.q<q0, b1.f, ao.d<? super wn.v>, Object> f57762a;

    /* renamed from: b  reason: collision with root package name */
    public final io.q<q0, Float, ao.d<? super wn.v>, Object> f57763b;

    /* renamed from: c  reason: collision with root package name */
    public final s0<x.b> f57764c;

    /* renamed from: d  reason: collision with root package name */
    public final x.m f57765d;

    @co.f(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {408, 411}, m = "processDragCancel")
    /* loaded from: classes.dex */
    public static final class a extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f57766w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57767x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f57768y;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57768y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.a(null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {390, 393, 395}, m = "processDragStart")
    /* loaded from: classes.dex */
    public static final class b extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f57770w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57771x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57772y;

        /* renamed from: z  reason: collision with root package name */
        public Object f57773z;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return i.this.b(null, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {400, 403}, m = "processDragStop")
    /* loaded from: classes.dex */
    public static final class c extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f57774w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57775x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57776y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f57777z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57777z = obj;
            this.B |= Integer.MIN_VALUE;
            return i.this.c(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(io.q<? super q0, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, io.q<? super q0, ? super Float, ? super ao.d<? super wn.v>, ? extends Object> qVar2, s0<x.b> s0Var, x.m mVar) {
        jo.p.h(qVar, "onDragStarted");
        jo.p.h(qVar2, "onDragStopped");
        jo.p.h(s0Var, "dragStartInteraction");
        this.f57762a = qVar;
        this.f57763b = qVar2;
        this.f57764c = s0Var;
        this.f57765d = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(uo.q0 r8, ao.d<? super wn.v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof w.i.a
            if (r0 == 0) goto L13
            r0 = r9
            w.i$a r0 = (w.i.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w.i$a r0 = new w.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f57768y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            wn.m.b(r9)
            goto L80
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f57767x
            uo.q0 r8 = (uo.q0) r8
            java.lang.Object r2 = r0.f57766w
            w.i r2 = (w.i) r2
            wn.m.b(r9)
            goto L65
        L41:
            wn.m.b(r9)
            l0.s0<x.b> r9 = r7.f57764c
            java.lang.Object r9 = r9.getValue()
            x.b r9 = (x.b) r9
            if (r9 == 0) goto L6b
            x.m r2 = r7.f57765d
            if (r2 == 0) goto L64
            x.a r6 = new x.a
            r6.<init>(r9)
            r0.f57766w = r7
            r0.f57767x = r8
            r0.A = r4
            java.lang.Object r9 = r2.b(r6, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r2 = r7
        L65:
            l0.s0<x.b> r9 = r2.f57764c
            r9.setValue(r5)
            goto L6c
        L6b:
            r2 = r7
        L6c:
            io.q<uo.q0, java.lang.Float, ao.d<? super wn.v>, java.lang.Object> r9 = r2.f57763b
            r2 = 0
            java.lang.Float r2 = co.b.c(r2)
            r0.f57766w = r5
            r0.f57767x = r5
            r0.A = r3
            java.lang.Object r8 = r9.s0(r8, r2, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            wn.v r8 = wn.v.f59242a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.a(uo.q0, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(uo.q0 r9, w.g.c r10, ao.d<? super wn.v> r11) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.b(uo.q0, w.g$c, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(uo.q0 r9, w.g.d r10, ao.d<? super wn.v> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof w.i.c
            if (r0 == 0) goto L13
            r0 = r11
            w.i$c r0 = (w.i.c) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            w.i$c r0 = new w.i$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f57777z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.B
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            wn.m.b(r11)
            goto L8e
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.f57776y
            w.g$d r9 = (w.g.d) r9
            java.lang.Object r10 = r0.f57775x
            uo.q0 r10 = (uo.q0) r10
            java.lang.Object r2 = r0.f57774w
            w.i r2 = (w.i) r2
            wn.m.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L6e
        L48:
            wn.m.b(r11)
            l0.s0<x.b> r11 = r8.f57764c
            java.lang.Object r11 = r11.getValue()
            x.b r11 = (x.b) r11
            if (r11 == 0) goto L74
            x.m r2 = r8.f57765d
            if (r2 == 0) goto L6d
            x.c r6 = new x.c
            r6.<init>(r11)
            r0.f57774w = r8
            r0.f57775x = r9
            r0.f57776y = r10
            r0.B = r4
            java.lang.Object r11 = r2.b(r6, r0)
            if (r11 != r1) goto L6d
            return r1
        L6d:
            r2 = r8
        L6e:
            l0.s0<x.b> r11 = r2.f57764c
            r11.setValue(r5)
            goto L75
        L74:
            r2 = r8
        L75:
            io.q<uo.q0, java.lang.Float, ao.d<? super wn.v>, java.lang.Object> r11 = r2.f57763b
            float r10 = r10.a()
            java.lang.Float r10 = co.b.c(r10)
            r0.f57774w = r5
            r0.f57775x = r5
            r0.f57776y = r5
            r0.B = r3
            java.lang.Object r9 = r11.s0(r9, r10, r0)
            if (r9 != r1) goto L8e
            return r1
        L8e:
            wn.v r9 = wn.v.f59242a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.c(uo.q0, w.g$d, ao.d):java.lang.Object");
    }
}
