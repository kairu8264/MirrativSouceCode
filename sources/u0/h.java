package u0;

import io.l;
import java.util.List;
import java.util.Map;
import jo.p;
import jo.q;
import l0.c1;
import l0.r;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final c1<f> f54259a = r.d(a.f54260w);

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<f> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f54260w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final f invoke() {
            return null;
        }
    }

    public static final f a(Map<String, ? extends List<? extends Object>> map, l<Object, Boolean> lVar) {
        p.h(lVar, "canBeSaved");
        return new g(map, lVar);
    }

    public static final c1<f> b() {
        return f54259a;
    }
}
