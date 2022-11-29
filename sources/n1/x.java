package n1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Map<v, a> f41542a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f41543a;

        /* renamed from: b  reason: collision with root package name */
        public final long f41544b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f41545c;

        /* renamed from: d  reason: collision with root package name */
        public final int f41546d;

        public a(long j10, long j11, boolean z10, int i10) {
            this.f41543a = j10;
            this.f41544b = j11;
            this.f41545c = z10;
            this.f41546d = i10;
        }

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, jo.h hVar) {
            this(j10, j11, z10, i10);
        }

        public final boolean a() {
            return this.f41545c;
        }

        public final long b() {
            return this.f41544b;
        }

        public final long c() {
            return this.f41543a;
        }
    }

    public final void a() {
        this.f41542a.clear();
    }

    public final g b(y yVar, k0 k0Var) {
        long j10;
        boolean a10;
        long o10;
        jo.p.h(yVar, "pointerInputEvent");
        jo.p.h(k0Var, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(yVar.b().size());
        List<z> b10 = yVar.b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = b10.get(i10);
            a aVar = this.f41542a.get(v.a(zVar.c()));
            if (aVar == null) {
                j10 = zVar.i();
                o10 = zVar.e();
                a10 = false;
            } else {
                long c10 = aVar.c();
                j10 = c10;
                a10 = aVar.a();
                o10 = k0Var.o(aVar.b());
            }
            linkedHashMap.put(v.a(zVar.c()), new w(zVar.c(), zVar.i(), zVar.e(), zVar.a(), j10, o10, a10, false, zVar.h(), (List) zVar.b(), zVar.g(), (jo.h) null));
            if (zVar.a()) {
                this.f41542a.put(v.a(zVar.c()), new a(zVar.i(), zVar.f(), zVar.a(), zVar.h(), null));
            } else {
                this.f41542a.remove(v.a(zVar.c()));
            }
        }
        return new g(linkedHashMap, yVar);
    }
}
