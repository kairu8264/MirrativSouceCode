package v9;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import io.p;
import jo.q;
import l0.u1;
import u.b0;
import u.b1;
import uo.q0;
import uo.y0;
import v9.b;
import wn.v;

/* loaded from: classes.dex */
public final class j {

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$1", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ p<q0, ao.d<? super v>, Object> A;
        public final /* synthetic */ p<q0, ao.d<? super v>, Object> B;

        /* renamed from: w  reason: collision with root package name */
        public int f57008w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57009x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f57010y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57011z;

        /* renamed from: v9.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0910a extends q implements io.a<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ i f57012w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0910a(i iVar) {
                super(0);
                this.f57012w = iVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final b.a invoke() {
                return this.f57012w.a().getValue();
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57013w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f57014x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57015y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57016z;

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$1$3", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {156, 157}, m = "emit")
            /* renamed from: v9.j$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0911a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f57017w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57018x;

                /* renamed from: z  reason: collision with root package name */
                public int f57020z;

                public C0911a(ao.d<? super C0911a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f57018x = obj;
                    this.f57020z |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$1$3$emit$2", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {158}, m = "invokeSuspend")
            /* renamed from: v9.j$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0912b extends co.l implements p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f57021w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57022x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57023y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0912b(p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, ao.d<? super C0912b> dVar) {
                    super(2, dVar);
                    this.f57023y = pVar;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    C0912b c0912b = new C0912b(this.f57023y, dVar);
                    c0912b.f57022x = obj;
                    return c0912b;
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((C0912b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f57021w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        p<q0, ao.d<? super v>, Object> pVar = this.f57023y;
                        this.f57021w = 1;
                        if (pVar.invoke((q0) this.f57022x, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    return v.f59242a;
                }
            }

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$1$3$emit$3", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {159}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class c extends co.l implements p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f57024w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57025x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57026y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, ao.d<? super c> dVar) {
                    super(2, dVar);
                    this.f57026y = pVar;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    c cVar = new c(this.f57026y, dVar);
                    cVar.f57025x = obj;
                    return cVar;
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f57024w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        p<q0, ao.d<? super v>, Object> pVar = this.f57026y;
                        this.f57024w = 1;
                        if (pVar.invoke((q0) this.f57025x, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    return v.f59242a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, q0 q0Var, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar2, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar3) {
                this.f57013w = pVar;
                this.f57014x = q0Var;
                this.f57015y = pVar2;
                this.f57016z = pVar3;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[RETURN] */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(v9.b.a r22, ao.d<? super wn.v> r23) {
                /*
                    r21 = this;
                    r0 = r21
                    r1 = r23
                    boolean r2 = r1 instanceof v9.j.a.b.C0911a
                    if (r2 == 0) goto L17
                    r2 = r1
                    v9.j$a$b$a r2 = (v9.j.a.b.C0911a) r2
                    int r3 = r2.f57020z
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L17
                    int r3 = r3 - r4
                    r2.f57020z = r3
                    goto L1c
                L17:
                    v9.j$a$b$a r2 = new v9.j$a$b$a
                    r2.<init>(r1)
                L1c:
                    java.lang.Object r1 = r2.f57018x
                    java.lang.Object r3 = bo.c.c()
                    int r4 = r2.f57020z
                    r5 = 2
                    r6 = 1
                    if (r4 == 0) goto L40
                    if (r4 == r6) goto L38
                    if (r4 != r5) goto L30
                    wn.m.b(r1)
                    goto L8e
                L30:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L38:
                    java.lang.Object r4 = r2.f57017w
                    v9.j$a$b r4 = (v9.j.a.b) r4
                    wn.m.b(r1)
                    goto L53
                L40:
                    wn.m.b(r1)
                    io.p<uo.q0, ao.d<? super wn.v>, java.lang.Object> r1 = r0.f57013w
                    uo.q0 r4 = r0.f57014x
                    r2.f57017w = r0
                    r2.f57020z = r6
                    java.lang.Object r1 = r1.invoke(r4, r2)
                    if (r1 != r3) goto L52
                    return r3
                L52:
                    r4 = r0
                L53:
                    uo.y0[] r1 = new uo.y0[r5]
                    r7 = 0
                    uo.q0 r8 = r4.f57014x
                    r9 = 0
                    r10 = 0
                    v9.j$a$b$b r11 = new v9.j$a$b$b
                    io.p<uo.q0, ao.d<? super wn.v>, java.lang.Object> r12 = r4.f57015y
                    r14 = 0
                    r11.<init>(r12, r14)
                    r12 = 3
                    r13 = 0
                    uo.y0 r8 = uo.j.b(r8, r9, r10, r11, r12, r13)
                    r1[r7] = r8
                    uo.q0 r15 = r4.f57014x
                    r16 = 0
                    r17 = 0
                    v9.j$a$b$c r7 = new v9.j$a$b$c
                    io.p<uo.q0, ao.d<? super wn.v>, java.lang.Object> r4 = r4.f57016z
                    r7.<init>(r4, r14)
                    r19 = 3
                    r20 = 0
                    r18 = r7
                    uo.y0 r4 = uo.j.b(r15, r16, r17, r18, r19, r20)
                    r1[r6] = r4
                    r2.f57017w = r14
                    r2.f57020z = r5
                    java.lang.Object r1 = uo.f.b(r1, r2)
                    if (r1 != r3) goto L8e
                    return r3
                L8e:
                    wn.v r1 = wn.v.f59242a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: v9.j.a.b.emit(v9.b$a, ao.d):java.lang.Object");
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements xo.c<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f57027w;

            /* renamed from: v9.j$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0913a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f57028w;

                @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$1$invokeSuspend$$inlined$filter$1$2", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {224}, m = "emit")
                /* renamed from: v9.j$a$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0914a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f57029w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f57030x;

                    public C0914a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f57029w = obj;
                        this.f57030x |= Integer.MIN_VALUE;
                        return C0913a.this.emit(null, this);
                    }
                }

                public C0913a(xo.d dVar) {
                    this.f57028w = dVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // xo.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, ao.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof v9.j.a.c.C0913a.C0914a
                        if (r0 == 0) goto L13
                        r0 = r6
                        v9.j$a$c$a$a r0 = (v9.j.a.c.C0913a.C0914a) r0
                        int r1 = r0.f57030x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f57030x = r1
                        goto L18
                    L13:
                        v9.j$a$c$a$a r0 = new v9.j$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f57029w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f57030x
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        wn.m.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        wn.m.b(r6)
                        xo.d r6 = r4.f57028w
                        r2 = r5
                        v9.b$a r2 = (v9.b.a) r2
                        boolean r2 = r2.e()
                        if (r2 == 0) goto L48
                        r0.f57030x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v9.j.a.c.C0913a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public c(xo.c cVar) {
                this.f57027w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super b.a> dVar, ao.d dVar2) {
                Object a10 = this.f57027w.a(new C0913a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i iVar, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar2, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar3, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f57010y = iVar;
            this.f57011z = pVar;
            this.A = pVar2;
            this.B = pVar3;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f57010y, this.f57011z, this.A, this.B, dVar);
            aVar.f57009x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57008w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c j10 = xo.e.j(new c(u1.m(new C0910a(this.f57010y))));
                b bVar = new b(this.f57011z, (q0) this.f57009x, this.A, this.B);
                this.f57008w = 1;
                if (j10.a(bVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ io.a<v> A;
        public final /* synthetic */ io.a<v> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f57032w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f f57033x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f57034y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f57035z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0.f fVar, f fVar2, i iVar, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3, int i10, int i11) {
            super(2);
            this.f57032w = fVar;
            this.f57033x = fVar2;
            this.f57034y = iVar;
            this.f57035z = aVar;
            this.A = aVar2;
            this.B = aVar3;
            this.C = i10;
            this.D = i11;
        }

        public final void a(l0.i iVar, int i10) {
            j.a(this.f57032w, this.f57033x, this.f57034y, this.f57035z, this.A, this.B, iVar, this.C | 1, this.D);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$gachaImageAnimation$1$1", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57036w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ i f57037x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f57038y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, io.a<v> aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f57037x = iVar;
            this.f57038y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f57037x, this.f57038y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57036w;
            if (i10 == 0) {
                wn.m.b(obj);
                u.a<Float, u.m> c11 = this.f57037x.c();
                Float c12 = co.b.c(0.8f);
                b1 i11 = u.j.i(lo.c.c(233.80002f), 0, b0.d(), 2, null);
                this.f57036w = 1;
                if (u.a.f(c11, c12, i11, null, null, this, 12, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f57038y.invoke();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$gachaImageDisappearAnimation$1$1", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57039w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57040x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f57041y;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$gachaImageDisappearAnimation$1$1$1", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {77}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57042w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i f57043x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57043x = iVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f57043x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57042w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> c11 = this.f57043x.c();
                    Float c12 = co.b.c(1.75f);
                    b1 i11 = u.j.i(lo.c.c(83.5f), 0, b0.d(), 2, null);
                    this.f57042w = 1;
                    obj = u.a.f(c11, c12, i11, null, null, this, 12, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$gachaImageDisappearAnimation$1$1$2", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {86}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57044w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i f57045x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f57045x = iVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f57045x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57044w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> b10 = this.f57045x.b();
                    Float c11 = co.b.c(0.0f);
                    b1 i11 = u.j.i(lo.c.c(66.8f), 0, b0.c(), 2, null);
                    this.f57044w = 1;
                    obj = u.a.f(b10, c11, i11, null, null, this, 12, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f57041y = iVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            d dVar2 = new d(this.f57041y, dVar);
            dVar2.f57040x = obj;
            return dVar2;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            Object c10 = bo.c.c();
            int i10 = this.f57039w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f57040x;
                b10 = uo.l.b(q0Var, null, null, new a(this.f57041y, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(this.f57041y, null), 3, null);
                y0[] y0VarArr = {b10, b11};
                this.f57039w = 1;
                if (uo.f.b(y0VarArr, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f57041y.g().setValue(co.b.a(false));
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$itemImageAnimation$1$1", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {101, 121}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57046w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57047x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f57048y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f57049z;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$itemImageAnimation$1$1$1", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {103}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57050w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i f57051x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57051x = iVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f57051x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57050w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> d10 = this.f57051x.d();
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(lo.c.c(100.200005f), 0, b0.c(), 2, null);
                    this.f57050w = 1;
                    obj = u.a.f(d10, c11, i11, null, null, this, 12, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$itemImageAnimation$1$1$2", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {112}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57052w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i f57053x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f57053x = iVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f57053x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57052w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> e10 = this.f57053x.e();
                    Float c11 = co.b.c(1.3f);
                    b1 i11 = u.j.i(lo.c.c(100.200005f), 0, b0.d(), 2, null);
                    this.f57052w = 1;
                    obj = u.a.f(e10, c11, i11, null, null, this, 12, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$itemImageAnimation$1$1$3", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {123, TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57054w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i f57055x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(i iVar, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f57055x = iVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new c(this.f57055x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57054w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> e10 = this.f57055x.e();
                    Float c11 = co.b.c(0.7307692f);
                    b1 i11 = u.j.i(lo.c.c(83.5f), 0, b0.a(), 2, null);
                    this.f57054w = 1;
                    if (u.a.f(e10, c11, i11, null, null, this, 12, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        wn.m.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                u.a<Float, u.m> e11 = this.f57055x.e();
                Float c12 = co.b.c(1.0f);
                b1 i12 = u.j.i(lo.c.c(83.5f), 0, b0.a(), 2, null);
                this.f57054w = 2;
                Object f10 = u.a.f(e11, c12, i12, null, null, this, 12, null);
                return f10 == c10 ? c10 : f10;
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaNormalItemViewKt$EmomoQuestEquipmentGachaNormalItemView$itemImageAnimation$1$1$4", f = "EmomoQuestEquipmentGachaNormalItemView.kt", l = {139}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class d extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57056w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ i f57057x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(i iVar, ao.d<? super d> dVar) {
                super(2, dVar);
                this.f57057x = iVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new d(this.f57057x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57056w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> f10 = this.f57057x.f();
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(lo.c.c(83.5f), 0, b0.c(), 2, null);
                    this.f57056w = 1;
                    obj = u.a.f(f10, c11, i11, null, null, this, 12, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i iVar, io.a<v> aVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f57048y = iVar;
            this.f57049z = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f57048y, this.f57049z, dVar);
            eVar.f57047x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            y0 b10;
            y0 b11;
            y0 b12;
            y0 b13;
            Object c10 = bo.c.c();
            int i10 = this.f57046w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0Var = (q0) this.f57047x;
                this.f57048y.h().setValue(co.b.a(true));
                b10 = uo.l.b(q0Var, null, null, new a(this.f57048y, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(this.f57048y, null), 3, null);
                y0[] y0VarArr = {b10, b11};
                this.f57047x = q0Var;
                this.f57046w = 1;
                if (uo.f.b(y0VarArr, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                this.f57049z.invoke();
                return v.f59242a;
            } else {
                q0Var = (q0) this.f57047x;
                wn.m.b(obj);
            }
            b12 = uo.l.b(q0Var, null, null, new c(this.f57048y, null), 3, null);
            b13 = uo.l.b(q0Var, null, null, new d(this.f57048y, null), 3, null);
            y0[] y0VarArr2 = {b12, b13};
            this.f57047x = null;
            this.f57046w = 2;
            if (uo.f.b(y0VarArr2, this) == c10) {
                return c10;
            }
            this.f57049z.invoke();
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x0.f r26, v9.f r27, v9.i r28, io.a<wn.v> r29, io.a<wn.v> r30, io.a<wn.v> r31, l0.i r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.j.a(x0.f, v9.f, v9.i, io.a, io.a, io.a, l0.i, int, int):void");
    }
}
