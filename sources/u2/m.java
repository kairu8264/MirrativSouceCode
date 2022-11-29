package u2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f54321h;

    /* renamed from: c  reason: collision with root package name */
    public p f54324c;

    /* renamed from: d  reason: collision with root package name */
    public p f54325d;

    /* renamed from: f  reason: collision with root package name */
    public int f54327f;

    /* renamed from: g  reason: collision with root package name */
    public int f54328g;

    /* renamed from: a  reason: collision with root package name */
    public int f54322a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f54323b = false;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f54326e = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f54324c = null;
        this.f54325d = null;
        this.f54327f = 0;
        int i11 = f54321h;
        this.f54327f = i11;
        f54321h = i11 + 1;
        this.f54324c = pVar;
        this.f54325d = pVar;
        this.f54328g = i10;
    }

    public void a(p pVar) {
        this.f54326e.add(pVar);
        this.f54325d = pVar;
    }

    public long b(t2.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f54324c;
        if (pVar instanceof c) {
            if (((c) pVar).f54352f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f53061e : fVar.f53063f).f54354h;
        f fVar3 = (i10 == 0 ? fVar.f53061e : fVar.f53063f).f54355i;
        boolean contains = pVar.f54354h.f54314l.contains(fVar2);
        boolean contains2 = this.f54324c.f54355i.f54314l.contains(fVar3);
        long j11 = this.f54324c.j();
        if (contains && contains2) {
            long d10 = d(this.f54324c.f54354h, 0L);
            long c10 = c(this.f54324c.f54355i, 0L);
            long j12 = d10 - j11;
            p pVar2 = this.f54324c;
            int i12 = pVar2.f54355i.f54308f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f54354h.f54308f;
            long j13 = ((-c10) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float o10 = pVar2.f54348b.o(i10);
            float f10 = (float) (o10 > 0.0f ? (((float) j13) / o10) + (((float) j12) / (1.0f - o10)) : 0L);
            long j14 = (f10 * o10) + 0.5f + j11 + (f10 * (1.0f - o10)) + 0.5f;
            p pVar3 = this.f54324c;
            j10 = pVar3.f54354h.f54308f + j14;
            i11 = pVar3.f54355i.f54308f;
        } else if (contains) {
            f fVar4 = this.f54324c.f54354h;
            return Math.max(d(fVar4, fVar4.f54308f), this.f54324c.f54354h.f54308f + j11);
        } else if (contains2) {
            f fVar5 = this.f54324c.f54355i;
            return Math.max(-c(fVar5, fVar5.f54308f), (-this.f54324c.f54355i.f54308f) + j11);
        } else {
            p pVar4 = this.f54324c;
            j10 = pVar4.f54354h.f54308f + pVar4.j();
            i11 = this.f54324c.f54355i.f54308f;
        }
        return j10 - i11;
    }

    public final long c(f fVar, long j10) {
        p pVar = fVar.f54306d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f54313k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f54313k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f54306d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f54308f + j10));
                }
            }
        }
        if (fVar == pVar.f54355i) {
            long j12 = j10 - pVar.j();
            return Math.min(Math.min(j11, c(pVar.f54354h, j12)), j12 - pVar.f54354h.f54308f);
        }
        return j11;
    }

    public final long d(f fVar, long j10) {
        p pVar = fVar.f54306d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f54313k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f54313k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f54306d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f54308f + j10));
                }
            }
        }
        if (fVar == pVar.f54354h) {
            long j12 = j10 + pVar.j();
            return Math.max(Math.max(j11, d(pVar.f54355i, j12)), j12 - pVar.f54355i.f54308f);
        }
        return j11;
    }
}
