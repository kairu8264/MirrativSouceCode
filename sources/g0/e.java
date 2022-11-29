package g0;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class e implements p2.h {

    /* renamed from: a  reason: collision with root package name */
    public final f f32231a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32232b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32233a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[f.TopLeft.ordinal()] = 1;
            iArr[f.TopRight.ordinal()] = 2;
            iArr[f.TopMiddle.ordinal()] = 3;
            f32233a = iArr;
        }
    }

    public e(f fVar, long j10) {
        this.f32231a = fVar;
        this.f32232b = j10;
    }

    public /* synthetic */ e(f fVar, long j10, jo.h hVar) {
        this(fVar, j10);
    }

    @Override // p2.h
    public long a(m2.m mVar, long j10, m2.q qVar, long j11) {
        jo.p.h(mVar, "anchorBounds");
        jo.p.h(qVar, "layoutDirection");
        int i10 = a.f32233a[this.f32231a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return m2.l.a((mVar.b() + m2.k.j(this.f32232b)) - (m2.o.g(j11) / 2), mVar.c() + m2.k.k(this.f32232b));
                }
                throw new NoWhenBranchMatchedException();
            }
            return m2.l.a((mVar.b() + m2.k.j(this.f32232b)) - m2.o.g(j11), mVar.c() + m2.k.k(this.f32232b));
        }
        return m2.l.a(mVar.b() + m2.k.j(this.f32232b), mVar.c() + m2.k.k(this.f32232b));
    }
}
