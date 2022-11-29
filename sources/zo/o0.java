package zo;

import ao.g;
import java.util.Objects;
import uo.c3;

/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f63311a = new k0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final io.p<Object, g.b, Object> f63312b = a.f63315w;

    /* renamed from: c  reason: collision with root package name */
    public static final io.p<c3<?>, g.b, c3<?>> f63313c = b.f63316w;

    /* renamed from: d  reason: collision with root package name */
    public static final io.p<r0, g.b, r0> f63314d = c.f63317w;

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.p<Object, g.b, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f63315w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (bVar instanceof c3) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.p<c3<?>, g.b, c3<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f63316w = new b();

        public b() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final c3<?> invoke(c3<?> c3Var, g.b bVar) {
            if (c3Var != null) {
                return c3Var;
            }
            if (bVar instanceof c3) {
                return (c3) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends jo.q implements io.p<r0, g.b, r0> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f63317w = new c();

        public c() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final r0 invoke(r0 r0Var, g.b bVar) {
            if (bVar instanceof c3) {
                c3<?> c3Var = (c3) bVar;
                r0Var.a(c3Var, c3Var.N(r0Var.f63322a));
            }
            return r0Var;
        }
    }

    public static final void a(ao.g gVar, Object obj) {
        if (obj == f63311a) {
            return;
        }
        if (obj instanceof r0) {
            ((r0) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f63313c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((c3) fold).z(gVar, obj);
    }

    public static final Object b(ao.g gVar) {
        Object fold = gVar.fold(0, f63312b);
        jo.p.e(fold);
        return fold;
    }

    public static final Object c(ao.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f63311a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new r0(gVar, ((Number) obj).intValue()), f63314d);
        }
        return ((c3) obj).N(gVar);
    }
}
