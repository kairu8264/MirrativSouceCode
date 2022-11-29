package l0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class x1 {

    @co.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<a1<R>, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39309w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f39310x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ao.g f39311y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xo.c<T> f39312z;

        /* renamed from: l0.x1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0557a implements xo.d<T> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a1<R> f39313w;

            public C0557a(a1<R> a1Var) {
                this.f39313w = a1Var;
            }

            @Override // xo.d
            public final Object emit(T t10, ao.d<? super wn.v> dVar) {
                this.f39313w.setValue(t10);
                return wn.v.f59242a;
            }
        }

        @co.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f39314w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ xo.c<T> f39315x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ a1<R> f39316y;

            /* renamed from: l0.x1$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0558a implements xo.d<T> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ a1<R> f39317w;

                public C0558a(a1<R> a1Var) {
                    this.f39317w = a1Var;
                }

                @Override // xo.d
                public final Object emit(T t10, ao.d<? super wn.v> dVar) {
                    this.f39317w.setValue(t10);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(xo.c<? extends T> cVar, a1<R> a1Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f39315x = cVar;
                this.f39316y = a1Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f39315x, this.f39316y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f39314w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.c<T> cVar = this.f39315x;
                    C0558a c0558a = new C0558a(this.f39316y);
                    this.f39314w = 1;
                    if (cVar.a(c0558a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ao.g gVar, xo.c<? extends T> cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f39311y = gVar;
            this.f39312z = cVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(a1<R> a1Var, ao.d<? super wn.v> dVar) {
            return ((a) create(a1Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f39311y, this.f39312z, dVar);
            aVar.f39310x = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39309w;
            if (i10 == 0) {
                wn.m.b(obj);
                a1 a1Var = (a1) this.f39310x;
                if (jo.p.c(this.f39311y, ao.h.f16651w)) {
                    xo.c<T> cVar = this.f39312z;
                    C0557a c0557a = new C0557a(a1Var);
                    this.f39309w = 1;
                    if (cVar.a(c0557a, this) == c10) {
                        return c10;
                    }
                } else {
                    ao.g gVar = this.f39311y;
                    b bVar = new b(this.f39312z, a1Var, null);
                    this.f39309w = 2;
                    if (uo.j.f(gVar, bVar, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_DTS, 160}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<xo.d<? super T>, ao.d<? super wn.v>, Object> {
        public Object A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public final /* synthetic */ io.a<T> E;

        /* renamed from: w  reason: collision with root package name */
        public Object f39318w;

        /* renamed from: x  reason: collision with root package name */
        public Object f39319x;

        /* renamed from: y  reason: collision with root package name */
        public Object f39320y;

        /* renamed from: z  reason: collision with root package name */
        public Object f39321z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<Object, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Set<Object> f39322w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Set<Object> set) {
                super(1);
                this.f39322w = set;
            }

            public final void a(Object obj) {
                jo.p.h(obj, "it");
                this.f39322w.add(obj);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
                a(obj);
                return wn.v.f59242a;
            }
        }

        /* renamed from: l0.x1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0559b extends jo.q implements io.p<Set<? extends Object>, v0.h, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ wo.i<Set<Object>> f39323w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0559b(wo.i<Set<Object>> iVar) {
                super(2);
                this.f39323w = iVar;
            }

            public final void a(Set<? extends Object> set, v0.h hVar) {
                jo.p.h(set, "changed");
                jo.p.h(hVar, "<anonymous parameter 1>");
                this.f39323w.l(set);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(Set<? extends Object> set, v0.h hVar) {
                a(set, hVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.a<? extends T> aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.E = aVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
            return ((b) create(dVar, dVar2)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.E, dVar);
            bVar.D = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #4 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:46:0x010f), top: B:75:0x004b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014c -> B:30:0x00c5). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.x1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T extends R, R> c2<R> b(xo.c<? extends T> cVar, R r10, ao.g gVar, i iVar, int i10, int i11) {
        jo.p.h(cVar, "<this>");
        iVar.x(-606625098);
        if ((i11 & 2) != 0) {
            gVar = ao.h.f16651w;
        }
        ao.g gVar2 = gVar;
        int i12 = i10 >> 3;
        c2<R> j10 = u1.j(r10, cVar, gVar2, new a(gVar2, cVar, null), iVar, (i12 & 8) | 576 | (i12 & 14));
        iVar.O();
        return j10;
    }

    public static final <T> boolean c(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                for (T t10 : set) {
                    if (set2.contains(t10)) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            for (T t11 : set2) {
                if (set.contains(t11)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final <T> xo.c<T> d(io.a<? extends T> aVar) {
        jo.p.h(aVar, "block");
        return xo.e.q(new b(aVar, null));
    }
}
