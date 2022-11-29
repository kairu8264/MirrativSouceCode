package g1;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends q implements Iterable<q>, ko.a {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final List<f> E;
    public final List<q> F;

    /* renamed from: w  reason: collision with root package name */
    public final String f32523w;

    /* renamed from: x  reason: collision with root package name */
    public final float f32524x;

    /* renamed from: y  reason: collision with root package name */
    public final float f32525y;

    /* renamed from: z  reason: collision with root package name */
    public final float f32526z;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<q>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final Iterator<q> f32527w;

        public a(o oVar) {
            this.f32527w = oVar.F.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public q next() {
            return this.f32527w.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32527w.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, null);
    }

    public /* synthetic */ o(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & 256) != 0 ? p.e() : list, (i10 & 512) != 0 ? xn.s.k() : list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (jo.p.c(this.f32523w, oVar.f32523w)) {
            if (this.f32524x == oVar.f32524x) {
                if (this.f32525y == oVar.f32525y) {
                    if (this.f32526z == oVar.f32526z) {
                        if (this.A == oVar.A) {
                            if (this.B == oVar.B) {
                                if (this.C == oVar.C) {
                                    return ((this.D > oVar.D ? 1 : (this.D == oVar.D ? 0 : -1)) == 0) && jo.p.c(this.E, oVar.E) && jo.p.c(this.F, oVar.F);
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final List<f> f() {
        return this.E;
    }

    public final String g() {
        return this.f32523w;
    }

    public int hashCode() {
        return (((((((((((((((((this.f32523w.hashCode() * 31) + Float.hashCode(this.f32524x)) * 31) + Float.hashCode(this.f32525y)) * 31) + Float.hashCode(this.f32526z)) * 31) + Float.hashCode(this.A)) * 31) + Float.hashCode(this.B)) * 31) + Float.hashCode(this.C)) * 31) + Float.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<q> iterator() {
        return new a(this);
    }

    public final float j() {
        return this.f32525y;
    }

    public final float k() {
        return this.f32526z;
    }

    public final float m() {
        return this.f32524x;
    }

    public final float p() {
        return this.A;
    }

    public final float r() {
        return this.B;
    }

    public final float s() {
        return this.C;
    }

    public final float t() {
        return this.D;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends f> list, List<? extends q> list2) {
        super(null);
        jo.p.h(str, "name");
        jo.p.h(list, "clipPathData");
        jo.p.h(list2, "children");
        this.f32523w = str;
        this.f32524x = f10;
        this.f32525y = f11;
        this.f32526z = f12;
        this.A = f13;
        this.B = f14;
        this.C = f15;
        this.D = f16;
        this.E = list;
        this.F = list2;
    }
}
