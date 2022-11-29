package k0;

import c1.c0;
import c1.e0;

/* loaded from: classes.dex */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38340a = a.f38341a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f38341a = new a();

        public final f a(long j10, boolean z10) {
            f fVar;
            f fVar2;
            f fVar3;
            if (z10) {
                if (e0.g(j10) > 0.5d) {
                    fVar3 = p.f38343b;
                    return fVar3;
                }
                fVar2 = p.f38344c;
                return fVar2;
            }
            fVar = p.f38345d;
            return fVar;
        }

        public final long b(long j10, boolean z10) {
            return (z10 || ((double) e0.g(j10)) >= 0.5d) ? j10 : c0.f18634b.f();
        }
    }

    long a(l0.i iVar, int i10);

    f b(l0.i iVar, int i10);
}
