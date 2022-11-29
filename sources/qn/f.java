package qn;

import io.l;
import io.q;
import jo.p;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f49650a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final u.i<Float> f49651b = u.j.g(0.0f, 400.0f, null, 5, null);

    /* renamed from: c  reason: collision with root package name */
    public static final l<h, Float> f49652c = a.f49655w;

    /* renamed from: d  reason: collision with root package name */
    public static final q<h, Integer, Integer, Integer> f49653d = b.f49656w;

    /* renamed from: e  reason: collision with root package name */
    public static final int f49654e = 8;

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements l<h, Float> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f49655w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Float invoke(h hVar) {
            p.h(hVar, "it");
            return Float.valueOf(Float.MAX_VALUE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements q<h, Integer, Integer, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f49656w = new b();

        public b() {
            super(3);
        }

        public final Integer a(h hVar, int i10, int i11) {
            p.h(hVar, "$noName_0");
            return Integer.valueOf(i11);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Integer s0(h hVar, Integer num, Integer num2) {
            return a(hVar, num.intValue(), num2.intValue());
        }
    }

    public final l<h, Float> a() {
        return f49652c;
    }

    public final u.i<Float> b() {
        return f49651b;
    }
}
