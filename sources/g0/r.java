package g0;

import java.util.Map;
import l0.c1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final c1<q> f32271a = l0.r.c(null, a.f32272w, 1, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<q> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f32272w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final q invoke() {
            return null;
        }
    }

    public static final c1<q> a() {
        return f32271a;
    }

    public static final boolean b(q qVar, long j10) {
        Map<Long, j> e10;
        if (qVar == null || (e10 = qVar.e()) == null) {
            return false;
        }
        return e10.containsKey(Long.valueOf(j10));
    }
}
