package an;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import xm.o;
import xm.p;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class l<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final p<T> f13976a;

    /* renamed from: b  reason: collision with root package name */
    public final xm.j<T> f13977b;

    /* renamed from: c  reason: collision with root package name */
    public final xm.e f13978c;

    /* renamed from: d  reason: collision with root package name */
    public final en.a<T> f13979d;

    /* renamed from: e  reason: collision with root package name */
    public final u f13980e;

    /* renamed from: f  reason: collision with root package name */
    public final l<T>.b f13981f = new b();

    /* renamed from: g  reason: collision with root package name */
    public t<T> f13982g;

    /* loaded from: classes4.dex */
    public final class b implements o, xm.i {
        public b() {
        }

        @Override // xm.i
        public <R> R a(xm.k kVar, Type type) throws JsonParseException {
            return (R) l.this.f13978c.l(kVar, type);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements u {
        public final xm.j<?> A;

        /* renamed from: w  reason: collision with root package name */
        public final en.a<?> f13984w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f13985x;

        /* renamed from: y  reason: collision with root package name */
        public final Class<?> f13986y;

        /* renamed from: z  reason: collision with root package name */
        public final p<?> f13987z;

        public c(Object obj, en.a<?> aVar, boolean z10, Class<?> cls) {
            p<?> pVar = obj instanceof p ? (p) obj : null;
            this.f13987z = pVar;
            xm.j<?> jVar = obj instanceof xm.j ? (xm.j) obj : null;
            this.A = jVar;
            zm.a.a((pVar == null && jVar == null) ? false : true);
            this.f13984w = aVar;
            this.f13985x = z10;
            this.f13986y = cls;
        }

        @Override // xm.u
        public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
            boolean isAssignableFrom;
            en.a<?> aVar2 = this.f13984w;
            if (aVar2 != null) {
                isAssignableFrom = aVar2.equals(aVar) || (this.f13985x && this.f13984w.getType() == aVar.getRawType());
            } else {
                isAssignableFrom = this.f13986y.isAssignableFrom(aVar.getRawType());
            }
            if (isAssignableFrom) {
                return new l(this.f13987z, this.A, eVar, aVar, this);
            }
            return null;
        }
    }

    public l(p<T> pVar, xm.j<T> jVar, xm.e eVar, en.a<T> aVar, u uVar) {
        this.f13976a = pVar;
        this.f13977b = jVar;
        this.f13978c = eVar;
        this.f13979d = aVar;
        this.f13980e = uVar;
    }

    public static u b(en.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }

    public final t<T> a() {
        t<T> tVar = this.f13982g;
        if (tVar != null) {
            return tVar;
        }
        t<T> o10 = this.f13978c.o(this.f13980e, this.f13979d);
        this.f13982g = o10;
        return o10;
    }

    @Override // xm.t
    public T read(JsonReader jsonReader) throws IOException {
        if (this.f13977b == null) {
            return a().read(jsonReader);
        }
        xm.k a10 = zm.l.a(jsonReader);
        if (a10.l()) {
            return null;
        }
        return this.f13977b.b(a10, this.f13979d.getType(), this.f13981f);
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        p<T> pVar = this.f13976a;
        if (pVar == null) {
            a().write(jsonWriter, t10);
        } else if (t10 == null) {
            jsonWriter.nullValue();
        } else {
            zm.l.b(pVar.a(t10, this.f13979d.getType(), this.f13981f), jsonWriter);
        }
    }
}
