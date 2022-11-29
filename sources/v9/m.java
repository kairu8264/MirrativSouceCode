package v9;

import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import io.p;
import jo.q;
import l0.u1;
import u.b0;
import u.b1;
import u.i0;
import uo.q0;
import uo.y0;
import v9.b;
import w6.b;
import wn.v;

/* loaded from: classes.dex */
public final class m {

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {237}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57081w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57082x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f57083y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57084z;

        /* renamed from: v9.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0915a extends q implements io.a<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l f57085w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0915a(l lVar) {
                super(0);
                this.f57085w = lVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final b.a invoke() {
                return this.f57085w.a().getValue();
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57086w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f57087x;

            /* JADX WARN: Multi-variable type inference failed */
            public b(p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, q0 q0Var) {
                this.f57086w = pVar;
                this.f57087x = q0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(b.a aVar, ao.d<? super v> dVar) {
                Object invoke = this.f57086w.invoke(this.f57087x, dVar);
                return invoke == bo.c.c() ? invoke : v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements xo.c<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f57088w;

            /* renamed from: v9.m$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0916a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f57089w;

                @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$1$invokeSuspend$$inlined$filter$1$2", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {224}, m = "emit")
                /* renamed from: v9.m$a$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0917a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f57090w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f57091x;

                    public C0917a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f57090w = obj;
                        this.f57091x |= Integer.MIN_VALUE;
                        return C0916a.this.emit(null, this);
                    }
                }

                public C0916a(xo.d dVar) {
                    this.f57089w = dVar;
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
                        boolean r0 = r6 instanceof v9.m.a.c.C0916a.C0917a
                        if (r0 == 0) goto L13
                        r0 = r6
                        v9.m$a$c$a$a r0 = (v9.m.a.c.C0916a.C0917a) r0
                        int r1 = r0.f57091x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f57091x = r1
                        goto L18
                    L13:
                        v9.m$a$c$a$a r0 = new v9.m$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f57090w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f57091x
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
                        xo.d r6 = r4.f57089w
                        r2 = r5
                        v9.b$a r2 = (v9.b.a) r2
                        boolean r2 = r2.c()
                        if (r2 == 0) goto L48
                        r0.f57091x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v9.m.a.c.C0916a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public c(xo.c cVar) {
                this.f57088w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super b.a> dVar, ao.d dVar2) {
                Object a10 = this.f57088w.a(new C0916a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f57083y = lVar;
            this.f57084z = pVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f57083y, this.f57084z, dVar);
            aVar.f57082x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57081w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c j10 = xo.e.j(new c(u1.m(new C0915a(this.f57083y))));
                b bVar = new b(this.f57084z, (q0) this.f57082x);
                this.f57081w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$2", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {247}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ w6.b A;
        public final /* synthetic */ w6.i B;
        public final /* synthetic */ p<q0, ao.d<? super v>, Object> C;
        public final /* synthetic */ p<q0, ao.d<? super v>, Object> D;

        /* renamed from: w  reason: collision with root package name */
        public int f57093w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57094x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f57095y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57096z;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l f57097w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar) {
                super(0);
                this.f57097w = lVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final b.a invoke() {
                return this.f57097w.a().getValue();
            }
        }

        /* renamed from: v9.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0918b implements xo.d<b.a> {
            public final /* synthetic */ p<q0, ao.d<? super v>, Object> A;
            public final /* synthetic */ p<q0, ao.d<? super v>, Object> B;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57098w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q0 f57099x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ w6.b f57100y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ w6.i f57101z;

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$2$3", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {248, 249}, m = "emit")
            /* renamed from: v9.m$b$b$a */
            /* loaded from: classes.dex */
            public static final class a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f57102w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57103x;

                /* renamed from: z  reason: collision with root package name */
                public int f57105z;

                public a(ao.d<? super a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f57103x = obj;
                    this.f57105z |= Integer.MIN_VALUE;
                    return C0918b.this.emit(null, this);
                }
            }

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$2$3$emit$2", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {ListPopupWindow.EXPAND_LIST_TIMEOUT}, m = "invokeSuspend")
            /* renamed from: v9.m$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0919b extends co.l implements p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f57106w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ w6.b f57107x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ w6.i f57108y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0919b(w6.b bVar, w6.i iVar, ao.d<? super C0919b> dVar) {
                    super(2, dVar);
                    this.f57107x = bVar;
                    this.f57108y = iVar;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    return new C0919b(this.f57107x, this.f57108y, dVar);
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((C0919b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f57106w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        w6.b bVar = this.f57107x;
                        s6.d b10 = m.b(this.f57108y);
                        this.f57106w = 1;
                        if (b.a.a(bVar, b10, 0, 0, 0.0f, null, 0.0f, false, null, this, 254, null) == c10) {
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

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$2$3$emit$3", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {251}, m = "invokeSuspend")
            /* renamed from: v9.m$b$b$c */
            /* loaded from: classes.dex */
            public static final class c extends co.l implements p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f57109w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57110x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57111y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, ao.d<? super c> dVar) {
                    super(2, dVar);
                    this.f57111y = pVar;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    c cVar = new c(this.f57111y, dVar);
                    cVar.f57110x = obj;
                    return cVar;
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f57109w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        p<q0, ao.d<? super v>, Object> pVar = this.f57111y;
                        this.f57109w = 1;
                        if (pVar.invoke((q0) this.f57110x, this) == c10) {
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

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$2$3$emit$4", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {252}, m = "invokeSuspend")
            /* renamed from: v9.m$b$b$d */
            /* loaded from: classes.dex */
            public static final class d extends co.l implements p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f57112w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57113x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ p<q0, ao.d<? super v>, Object> f57114y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public d(p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, ao.d<? super d> dVar) {
                    super(2, dVar);
                    this.f57114y = pVar;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    d dVar2 = new d(this.f57114y, dVar);
                    dVar2.f57113x = obj;
                    return dVar2;
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f57112w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        p<q0, ao.d<? super v>, Object> pVar = this.f57114y;
                        this.f57112w = 1;
                        if (pVar.invoke((q0) this.f57113x, this) == c10) {
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
            public C0918b(p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, q0 q0Var, w6.b bVar, w6.i iVar, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar2, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar3) {
                this.f57098w = pVar;
                this.f57099x = q0Var;
                this.f57100y = bVar;
                this.f57101z = iVar;
                this.A = pVar2;
                this.B = pVar3;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[RETURN] */
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
                    boolean r2 = r1 instanceof v9.m.b.C0918b.a
                    if (r2 == 0) goto L17
                    r2 = r1
                    v9.m$b$b$a r2 = (v9.m.b.C0918b.a) r2
                    int r3 = r2.f57105z
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L17
                    int r3 = r3 - r4
                    r2.f57105z = r3
                    goto L1c
                L17:
                    v9.m$b$b$a r2 = new v9.m$b$b$a
                    r2.<init>(r1)
                L1c:
                    java.lang.Object r1 = r2.f57103x
                    java.lang.Object r3 = bo.c.c()
                    int r4 = r2.f57105z
                    r5 = 2
                    r6 = 1
                    if (r4 == 0) goto L40
                    if (r4 == r6) goto L38
                    if (r4 != r5) goto L30
                    wn.m.b(r1)
                    goto La0
                L30:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L38:
                    java.lang.Object r4 = r2.f57102w
                    v9.m$b$b r4 = (v9.m.b.C0918b) r4
                    wn.m.b(r1)
                    goto L53
                L40:
                    wn.m.b(r1)
                    io.p<uo.q0, ao.d<? super wn.v>, java.lang.Object> r1 = r0.f57098w
                    uo.q0 r4 = r0.f57099x
                    r2.f57102w = r0
                    r2.f57105z = r6
                    java.lang.Object r1 = r1.invoke(r4, r2)
                    if (r1 != r3) goto L52
                    return r3
                L52:
                    r4 = r0
                L53:
                    r1 = 3
                    uo.y0[] r1 = new uo.y0[r1]
                    r7 = 0
                    uo.q0 r8 = r4.f57099x
                    r9 = 0
                    r10 = 0
                    v9.m$b$b$b r11 = new v9.m$b$b$b
                    w6.b r12 = r4.f57100y
                    w6.i r13 = r4.f57101z
                    r14 = 0
                    r11.<init>(r12, r13, r14)
                    r12 = 3
                    r13 = 0
                    uo.y0 r8 = uo.j.b(r8, r9, r10, r11, r12, r13)
                    r1[r7] = r8
                    uo.q0 r15 = r4.f57099x
                    r16 = 0
                    r17 = 0
                    v9.m$b$b$c r7 = new v9.m$b$b$c
                    io.p<uo.q0, ao.d<? super wn.v>, java.lang.Object> r8 = r4.A
                    r7.<init>(r8, r14)
                    r19 = 3
                    r20 = 0
                    r18 = r7
                    uo.y0 r7 = uo.j.b(r15, r16, r17, r18, r19, r20)
                    r1[r6] = r7
                    uo.q0 r8 = r4.f57099x
                    v9.m$b$b$d r11 = new v9.m$b$b$d
                    io.p<uo.q0, ao.d<? super wn.v>, java.lang.Object> r4 = r4.B
                    r11.<init>(r4, r14)
                    uo.y0 r4 = uo.j.b(r8, r9, r10, r11, r12, r13)
                    r1[r5] = r4
                    r2.f57102w = r14
                    r2.f57105z = r5
                    java.lang.Object r1 = uo.f.b(r1, r2)
                    if (r1 != r3) goto La0
                    return r3
                La0:
                    wn.v r1 = wn.v.f59242a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: v9.m.b.C0918b.emit(v9.b$a, ao.d):java.lang.Object");
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements xo.c<b.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ xo.c f57115w;

            /* loaded from: classes.dex */
            public static final class a<T> implements xo.d {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ xo.d f57116w;

                @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$2$invokeSuspend$$inlined$filter$1$2", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {224}, m = "emit")
                /* renamed from: v9.m$b$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0920a extends co.d {

                    /* renamed from: w  reason: collision with root package name */
                    public /* synthetic */ Object f57117w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f57118x;

                    public C0920a(ao.d dVar) {
                        super(dVar);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        this.f57117w = obj;
                        this.f57118x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(xo.d dVar) {
                    this.f57116w = dVar;
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
                        boolean r0 = r6 instanceof v9.m.b.c.a.C0920a
                        if (r0 == 0) goto L13
                        r0 = r6
                        v9.m$b$c$a$a r0 = (v9.m.b.c.a.C0920a) r0
                        int r1 = r0.f57118x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f57118x = r1
                        goto L18
                    L13:
                        v9.m$b$c$a$a r0 = new v9.m$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f57117w
                        java.lang.Object r1 = bo.c.c()
                        int r2 = r0.f57118x
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
                        xo.d r6 = r4.f57116w
                        r2 = r5
                        v9.b$a r2 = (v9.b.a) r2
                        boolean r2 = r2.e()
                        if (r2 == 0) goto L48
                        r0.f57118x = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        wn.v r5 = wn.v.f59242a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: v9.m.b.c.a.emit(java.lang.Object, ao.d):java.lang.Object");
                }
            }

            public c(xo.c cVar) {
                this.f57115w = cVar;
            }

            @Override // xo.c
            public Object a(xo.d<? super b.a> dVar, ao.d dVar2) {
                Object a10 = this.f57115w.a(new a(dVar), dVar2);
                return a10 == bo.c.c() ? a10 : v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar, w6.b bVar, w6.i iVar, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar2, p<? super q0, ? super ao.d<? super v>, ? extends Object> pVar3, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f57095y = lVar;
            this.f57096z = pVar;
            this.A = bVar;
            this.B = iVar;
            this.C = pVar2;
            this.D = pVar3;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f57095y, this.f57096z, this.A, this.B, this.C, this.D, dVar);
            bVar.f57094x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57093w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f57094x;
                xo.c j10 = xo.e.j(new c(u1.m(new a(this.f57095y))));
                C0918b c0918b = new C0918b(this.f57096z, q0Var, this.A, this.B, this.C, this.D);
                this.f57093w = 1;
                if (j10.a(c0918b, this) == c10) {
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
    public static final class c extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ io.a<v> A;
        public final /* synthetic */ io.a<v> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f57120w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v9.f f57121x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f57122y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f57123z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x0.f fVar, v9.f fVar2, l lVar, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3, int i10, int i11) {
            super(2);
            this.f57120w = fVar;
            this.f57121x = fVar2;
            this.f57122y = lVar;
            this.f57123z = aVar;
            this.A = aVar2;
            this.B = aVar3;
            this.C = i10;
            this.D = i11;
        }

        public final void a(l0.i iVar, int i10) {
            m.a(this.f57120w, this.f57121x, this.f57122y, this.f57123z, this.A, this.B, iVar, this.C | 1, this.D);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$gachaImageAnimation$1$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {106, 114, 121, 128, TsExtractor.TS_STREAM_TYPE_E_AC3, 142, 149}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ l A;

        /* renamed from: w  reason: collision with root package name */
        public int f57124w;

        /* renamed from: x  reason: collision with root package name */
        public int f57125x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57126y;

        /* renamed from: z  reason: collision with root package name */
        public int f57127z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.A = lVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0126 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0154 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0182 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01c8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01c9 -> B:39:0x01ca). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 486
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v9.m.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$gachaImageDisappearAnimation$1$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57128w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57129x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f57130y;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$gachaImageDisappearAnimation$1$1$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {157}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57131w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57132x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57132x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f57132x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57131w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> d10 = this.f57132x.d();
                    Float c11 = co.b.c(1.75f);
                    b1 i11 = u.j.i(lo.c.c(66.8f), 0, b0.c(), 2, null);
                    this.f57131w = 1;
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

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$gachaImageDisappearAnimation$1$1$2", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {166}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57133w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57134x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f57134x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f57134x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57133w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> b10 = this.f57134x.b();
                    Float c11 = co.b.c(0.0f);
                    b1 i11 = u.j.i(lo.c.c(66.8f), 0, b0.c(), 2, null);
                    this.f57133w = 1;
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
        public e(l lVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f57130y = lVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f57130y, dVar);
            eVar.f57129x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            Object c10 = bo.c.c();
            int i10 = this.f57128w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f57129x;
                b10 = uo.l.b(q0Var, null, null, new a(this.f57130y, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(this.f57130y, null), 3, null);
                y0[] y0VarArr = {b10, b11};
                this.f57128w = 1;
                if (uo.f.b(y0VarArr, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f57130y.j().setValue(co.b.a(false));
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$itemImageAnimation$1$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {182, 203}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ io.a<v> A;

        /* renamed from: w  reason: collision with root package name */
        public int f57135w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57136x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f57137y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f57138z;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$itemImageAnimation$1$1$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {184}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57139w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57140x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57140x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f57140x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57139w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> e10 = this.f57140x.e();
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(lo.c.c(100.200005f), 0, b0.c(), 2, null);
                    this.f57139w = 1;
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

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$itemImageAnimation$1$1$2", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {193}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57141w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57142x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f57142x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f57142x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57141w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> f10 = this.f57142x.f();
                    Float c11 = co.b.c(1.3f);
                    b1 i11 = u.j.i(lo.c.c(100.200005f), 0, b0.d(), 2, null);
                    this.f57141w = 1;
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

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$itemImageAnimation$1$1$3", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {205, 212}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57143w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57144x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(l lVar, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f57144x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new c(this.f57144x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57143w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> f10 = this.f57144x.f();
                    Float c11 = co.b.c(0.7307692f);
                    b1 i11 = u.j.i(lo.c.c(83.5f), 0, b0.a(), 2, null);
                    this.f57143w = 1;
                    if (u.a.f(f10, c11, i11, null, null, this, 12, null) == c10) {
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
                u.a<Float, u.m> f11 = this.f57144x.f();
                Float c12 = co.b.c(1.0f);
                b1 i12 = u.j.i(lo.c.c(83.5f), 0, b0.a(), 2, null);
                this.f57143w = 2;
                Object f12 = u.a.f(f11, c12, i12, null, null, this, 12, null);
                return f12 == c10 ? c10 : f12;
            }
        }

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$itemImageAnimation$1$1$4", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {221}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class d extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57145w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57146x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(l lVar, ao.d<? super d> dVar) {
                super(2, dVar);
                this.f57146x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new d(this.f57146x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57145w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> g10 = this.f57146x.g();
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(lo.c.c(83.5f), 0, b0.c(), 2, null);
                    this.f57145w = 1;
                    obj = u.a.f(g10, c11, i11, null, null, this, 12, null);
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
        public f(l lVar, io.a<v> aVar, io.a<v> aVar2, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f57137y = lVar;
            this.f57138z = aVar;
            this.A = aVar2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            f fVar = new f(this.f57137y, this.f57138z, this.A, dVar);
            fVar.f57136x = obj;
            return fVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            y0 b10;
            y0 b11;
            y0 b12;
            y0 b13;
            Object c10 = bo.c.c();
            int i10 = this.f57135w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0Var = (q0) this.f57136x;
                this.f57137y.k().setValue(co.b.a(true));
                b10 = uo.l.b(q0Var, null, null, new a(this.f57137y, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(this.f57137y, null), 3, null);
                y0[] y0VarArr = {b10, b11};
                this.f57136x = q0Var;
                this.f57135w = 1;
                if (uo.f.b(y0VarArr, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                this.A.invoke();
                return v.f59242a;
            } else {
                q0Var = (q0) this.f57136x;
                wn.m.b(obj);
            }
            this.f57138z.invoke();
            b12 = uo.l.b(q0Var, null, null, new c(this.f57137y, null), 3, null);
            b13 = uo.l.b(q0Var, null, null, new d(this.f57137y, null), 3, null);
            y0[] y0VarArr2 = {b12, b13};
            this.f57136x = null;
            this.f57135w = 2;
            if (uo.f.b(y0VarArr2, this) == c10) {
                return c10;
            }
            this.A.invoke();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$kirakiraAnimation$1$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57147w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57148x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f57149y;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$kirakiraAnimation$1$1$1", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {84}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57150w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57151x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57151x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f57151x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57150w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> i11 = this.f57151x.i();
                    Float c11 = co.b.c(360.0f);
                    i0 d10 = u.j.d(u.j.i(24000, 0, b0.c(), 2, null), u.q0.Restart, 0L, 4, null);
                    this.f57150w = 1;
                    obj = u.a.f(i11, c11, d10, null, null, this, 12, null);
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

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.gacha.EmomoQuestEquipmentGachaRareItemViewKt$EmomoQuestEquipmentGachaRareItemView$kirakiraAnimation$1$1$2", f = "EmomoQuestEquipmentGachaRareItemView.kt", l = {93}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements p<q0, ao.d<? super u.g<Float, u.m>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f57152w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l f57153x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f57153x = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f57153x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super u.g<Float, u.m>> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57152w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    u.a<Float, u.m> h10 = this.f57153x.h();
                    Float c11 = co.b.c(1.0f);
                    b1 i11 = u.j.i(300, 0, b0.a(), 2, null);
                    this.f57152w = 1;
                    obj = u.a.f(h10, c11, i11, null, null, this, 12, null);
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
        public g(l lVar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f57149y = lVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            g gVar = new g(this.f57149y, dVar);
            gVar.f57148x = obj;
            return gVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            Object c10 = bo.c.c();
            int i10 = this.f57147w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f57148x;
                b10 = uo.l.b(q0Var, null, null, new a(this.f57149y, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(this.f57149y, null), 3, null);
                y0[] y0VarArr = {b10, b11};
                this.f57147w = 1;
                if (uo.f.b(y0VarArr, this) == c10) {
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x0.f r27, v9.f r28, v9.l r29, io.a<wn.v> r30, io.a<wn.v> r31, io.a<wn.v> r32, l0.i r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.m.a(x0.f, v9.f, v9.l, io.a, io.a, io.a, l0.i, int, int):void");
    }

    public static final s6.d b(w6.i iVar) {
        return iVar.getValue();
    }
}
