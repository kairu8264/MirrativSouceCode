package zm;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class d implements u, Cloneable {
    public static final d C = new d();

    /* renamed from: z  reason: collision with root package name */
    public boolean f63237z;

    /* renamed from: w  reason: collision with root package name */
    public double f63234w = -1.0d;

    /* renamed from: x  reason: collision with root package name */
    public int f63235x = 136;

    /* renamed from: y  reason: collision with root package name */
    public boolean f63236y = true;
    public List<xm.a> A = Collections.emptyList();
    public List<xm.a> B = Collections.emptyList();

    /* loaded from: classes4.dex */
    public class a extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public t<T> f63238a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f63239b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f63240c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ xm.e f63241d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ en.a f63242e;

        public a(boolean z10, boolean z11, xm.e eVar, en.a aVar) {
            this.f63239b = z10;
            this.f63240c = z11;
            this.f63241d = eVar;
            this.f63242e = aVar;
        }

        public final t<T> a() {
            t<T> tVar = this.f63238a;
            if (tVar != 0) {
                return tVar;
            }
            t<T> o10 = this.f63241d.o(d.this, this.f63242e);
            this.f63238a = o10;
            return o10;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // xm.t
        public T read(JsonReader jsonReader) throws IOException {
            if (this.f63239b) {
                jsonReader.skipValue();
                return null;
            }
            return a().read(jsonReader);
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (this.f63240c) {
                jsonWriter.nullValue();
            } else {
                a().write(jsonWriter, t10);
            }
        }
    }

    @Override // xm.u
    public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean f10 = f(rawType);
        boolean z10 = f10 || g(rawType, true);
        boolean z11 = f10 || g(rawType, false);
        if (z10 || z11) {
            return new a(z11, z10, eVar, aVar);
        }
        return null;
    }

    /* renamed from: c */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean e(Class<?> cls, boolean z10) {
        return f(cls) || g(cls, z10);
    }

    public final boolean f(Class<?> cls) {
        if (this.f63234w == -1.0d || o((ym.d) cls.getAnnotation(ym.d.class), (ym.e) cls.getAnnotation(ym.e.class))) {
            return (!this.f63236y && k(cls)) || i(cls);
        }
        return true;
    }

    public final boolean g(Class<?> cls, boolean z10) {
        for (xm.a aVar : z10 ? this.A : this.B) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(Field field, boolean z10) {
        ym.a aVar;
        if ((this.f63235x & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f63234w == -1.0d || o((ym.d) field.getAnnotation(ym.d.class), (ym.e) field.getAnnotation(ym.e.class))) && !field.isSynthetic()) {
            if (!this.f63237z || ((aVar = (ym.a) field.getAnnotation(ym.a.class)) != null && (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
                if ((this.f63236y || !k(field.getType())) && !i(field.getType())) {
                    List<xm.a> list = z10 ? this.A : this.B;
                    if (list.isEmpty()) {
                        return false;
                    }
                    xm.b bVar = new xm.b(field);
                    for (xm.a aVar2 : list) {
                        if (aVar2.b(bVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean i(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || l(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    public final boolean k(Class<?> cls) {
        return cls.isMemberClass() && !l(cls);
    }

    public final boolean l(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean m(ym.d dVar) {
        return dVar == null || dVar.value() <= this.f63234w;
    }

    public final boolean n(ym.e eVar) {
        return eVar == null || eVar.value() > this.f63234w;
    }

    public final boolean o(ym.d dVar, ym.e eVar) {
        return m(dVar) && n(eVar);
    }
}
