package s1;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51957b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<k> f51958a = new m0.e<>(new k[16], 0);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: s1.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0792a implements Comparator<k> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0792a f51959w = new C0792a();

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(k kVar, k kVar2) {
                jo.p.h(kVar, TopicConstant.EXTEND_LIPMETA_A);
                jo.p.h(kVar2, "b");
                int j10 = jo.p.j(kVar2.Y(), kVar.Y());
                return j10 != 0 ? j10 : jo.p.j(kVar.hashCode(), kVar2.hashCode());
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public final void a() {
        this.f51958a.D(a.C0792a.f51959w);
        m0.e<k> eVar = this.f51958a;
        int p10 = eVar.p();
        if (p10 > 0) {
            int i10 = p10 - 1;
            k[] n10 = eVar.n();
            do {
                k kVar = n10[i10];
                if (kVar.q0()) {
                    b(kVar);
                }
                i10--;
            } while (i10 >= 0);
            this.f51958a.h();
        }
        this.f51958a.h();
    }

    public final void b(k kVar) {
        kVar.R();
        int i10 = 0;
        kVar.t1(false);
        m0.e<k> A0 = kVar.A0();
        int p10 = A0.p();
        if (p10 > 0) {
            k[] n10 = A0.n();
            do {
                b(n10[i10]);
                i10++;
            } while (i10 < p10);
        }
    }

    public final void c(k kVar) {
        jo.p.h(kVar, "node");
        this.f51958a.c(kVar);
        kVar.t1(true);
    }

    public final void d(k kVar) {
        jo.p.h(kVar, "rootNode");
        this.f51958a.h();
        this.f51958a.c(kVar);
        kVar.t1(true);
    }
}
