package u;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g1 {

    /* loaded from: classes.dex */
    public static final class a implements r {

        /* renamed from: a */
        public final List<f0> f54006a;

        /* renamed from: b */
        public final /* synthetic */ p f54007b;

        /* renamed from: c */
        public final /* synthetic */ float f54008c;

        /* renamed from: d */
        public final /* synthetic */ float f54009d;

        public a(p pVar, float f10, float f11) {
            this.f54007b = pVar;
            this.f54008c = f10;
            this.f54009d = f11;
            po.i t10 = po.n.t(0, pVar.b());
            ArrayList arrayList = new ArrayList(xn.t.u(t10, 10));
            Iterator<Integer> it = t10.iterator();
            while (it.hasNext()) {
                arrayList.add(new f0(f10, f11, pVar.a(((xn.i0) it).b())));
            }
            this.f54006a = arrayList;
        }

        @Override // u.r
        /* renamed from: a */
        public f0 get(int i10) {
            return this.f54006a.get(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements r {

        /* renamed from: a */
        public final f0 f54010a;

        /* renamed from: b */
        public final /* synthetic */ float f54011b;

        /* renamed from: c */
        public final /* synthetic */ float f54012c;

        public b(float f10, float f11) {
            this.f54011b = f10;
            this.f54012c = f11;
            this.f54010a = new f0(f10, f11, 0.0f, 4, null);
        }

        @Override // u.r
        /* renamed from: a */
        public f0 get(int i10) {
            return this.f54010a;
        }
    }

    public static final /* synthetic */ r b(p pVar, float f10, float f11) {
        return d(pVar, f10, f11);
    }

    public static final long c(i1<?> i1Var, long j10) {
        return po.n.o(j10 - i1Var.b(), 0L, i1Var.c());
    }

    public static final <V extends p> r d(V v10, float f10, float f11) {
        if (v10 != null) {
            return new a(v10, f10, f11);
        }
        return new b(f10, f11);
    }

    public static final <V extends p> V e(f1<V> f1Var, long j10, V v10, V v11, V v12) {
        jo.p.h(f1Var, "<this>");
        jo.p.h(v10, TtmlNode.START);
        jo.p.h(v11, TtmlNode.END);
        jo.p.h(v12, "startVelocity");
        return f1Var.f(j10 * 1000000, v10, v11, v12);
    }
}
