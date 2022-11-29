package z;

import wn.l;

/* loaded from: classes.dex */
public final class a implements q1.i0 {

    /* renamed from: w  reason: collision with root package name */
    public boolean f62149w;

    /* renamed from: x  reason: collision with root package name */
    public ao.d<? super wn.v> f62150x;

    @co.f(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", l = {417}, m = "waitForFirstLayout")
    /* renamed from: z.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1070a extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f62151w;

        /* renamed from: x  reason: collision with root package name */
        public Object f62152x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f62153y;

        public C1070a(ao.d<? super C1070a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f62153y = obj;
            this.A |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ao.d<? super wn.v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z.a.C1070a
            if (r0 == 0) goto L13
            r0 = r5
            z.a$a r0 = (z.a.C1070a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            z.a$a r0 = new z.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62153y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f62152x
            ao.d r1 = (ao.d) r1
            java.lang.Object r0 = r0.f62151w
            z.a r0 = (z.a) r0
            wn.m.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            wn.m.b(r5)
            boolean r5 = r4.f62149w
            if (r5 != 0) goto L71
            ao.d<? super wn.v> r5 = r4.f62150x
            r0.f62151w = r4
            r0.f62152x = r5
            r0.A = r3
            ao.i r2 = new ao.i
            ao.d r3 = bo.b.b(r0)
            r2.<init>(r3)
            r4.f62150x = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = bo.c.c()
            if (r2 != r3) goto L60
            co.h.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            wn.l$a r5 = wn.l.f59224w
            wn.v r5 = wn.v.f59242a
            java.lang.Object r5 = wn.l.a(r5)
            r1.resumeWith(r5)
        L71:
            wn.v r5 = wn.v.f59242a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.a.a(ao.d):java.lang.Object");
    }

    @Override // q1.i0
    public void a0(q1.q qVar) {
        jo.p.h(qVar, "coordinates");
        if (this.f62149w) {
            return;
        }
        this.f62149w = true;
        ao.d<? super wn.v> dVar = this.f62150x;
        if (dVar != null) {
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(wn.v.f59242a));
        }
        this.f62150x = null;
    }
}
