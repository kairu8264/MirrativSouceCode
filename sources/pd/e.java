package pd;

import nf.e;
import od.d;

/* loaded from: classes2.dex */
public abstract class e {

    /* loaded from: classes2.dex */
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46720a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final d.a f46721a;

        public b(d.a aVar) {
            super(null);
            this.f46721a = aVar;
        }

        public final d.a a() {
            return this.f46721a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f46721a == ((b) obj).f46721a;
        }

        public int hashCode() {
            d.a aVar = this.f46721a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "UpdateGenderType(genderType=" + this.f46721a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final e.b f46722a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e.b bVar) {
            super(null);
            jo.p.h(bVar, "generation");
            this.f46722a = bVar;
        }

        public final e.b a() {
            return this.f46722a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46722a, ((c) obj).f46722a);
        }

        public int hashCode() {
            return this.f46722a.hashCode();
        }

        public String toString() {
            return "UpdateGeneration(generation=" + this.f46722a + ')';
        }
    }

    public e() {
    }

    public /* synthetic */ e(jo.h hVar) {
        this();
    }
}
