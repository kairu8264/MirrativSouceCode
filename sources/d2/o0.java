package d2;

import l0.c2;

/* loaded from: classes.dex */
public interface o0 extends c2<Object> {

    /* loaded from: classes.dex */
    public static final class a implements o0, c2<Object> {

        /* renamed from: w  reason: collision with root package name */
        public final g f29125w;

        public a(g gVar) {
            jo.p.h(gVar, "current");
            this.f29125w = gVar;
        }

        @Override // d2.o0
        public boolean b() {
            return this.f29125w.j();
        }

        @Override // l0.c2
        public Object getValue() {
            return this.f29125w.getValue();
        }
    }

    boolean b();

    /* loaded from: classes.dex */
    public static final class b implements o0 {

        /* renamed from: w  reason: collision with root package name */
        public final Object f29126w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f29127x;

        public b(Object obj, boolean z10) {
            jo.p.h(obj, "value");
            this.f29126w = obj;
            this.f29127x = z10;
        }

        @Override // d2.o0
        public boolean b() {
            return this.f29127x;
        }

        @Override // l0.c2
        public Object getValue() {
            return this.f29126w;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, jo.h hVar) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }
}
