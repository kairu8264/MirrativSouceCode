package a0;

import java.util.List;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final float f11a;

        public a(float f10) {
            this.f11a = f10;
            if (!(m2.g.i(f10, m2.g.l((float) 0)) > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public /* synthetic */ a(float f10, jo.h hVar) {
            this(f10);
        }

        @Override // a0.b
        public List<Integer> a(m2.d dVar, int i10, int i11) {
            List<Integer> c10;
            jo.p.h(dVar, "<this>");
            c10 = g.c(i10, Math.max((i10 + i11) / (dVar.X(this.f11a) + i11), 1), i11);
            return c10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && m2.g.n(this.f11a, ((a) obj).f11a);
        }

        public int hashCode() {
            return m2.g.o(this.f11a);
        }
    }

    /* renamed from: a0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0000b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12a;

        public C0000b(int i10) {
            this.f12a = i10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        @Override // a0.b
        public List<Integer> a(m2.d dVar, int i10, int i11) {
            List<Integer> c10;
            jo.p.h(dVar, "<this>");
            c10 = g.c(i10, this.f12a, i11);
            return c10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0000b) && this.f12a == ((C0000b) obj).f12a;
        }

        public int hashCode() {
            return -this.f12a;
        }
    }

    List<Integer> a(m2.d dVar, int i10, int i11);
}
