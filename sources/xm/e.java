package xm;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: x  reason: collision with root package name */
    public static final en.a<?> f60370x = en.a.get(Object.class);

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<en.a<?>, f<?>>> f60371a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<en.a<?>, t<?>> f60372b;

    /* renamed from: c  reason: collision with root package name */
    public final zm.c f60373c;

    /* renamed from: d  reason: collision with root package name */
    public final an.e f60374d;

    /* renamed from: e  reason: collision with root package name */
    public final List<u> f60375e;

    /* renamed from: f  reason: collision with root package name */
    public final zm.d f60376f;

    /* renamed from: g  reason: collision with root package name */
    public final xm.d f60377g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Type, g<?>> f60378h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f60379i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f60380j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f60381k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f60382l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f60383m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f60384n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f60385o;

    /* renamed from: p  reason: collision with root package name */
    public final String f60386p;

    /* renamed from: q  reason: collision with root package name */
    public final int f60387q;

    /* renamed from: r  reason: collision with root package name */
    public final int f60388r;

    /* renamed from: s  reason: collision with root package name */
    public final q f60389s;

    /* renamed from: t  reason: collision with root package name */
    public final List<u> f60390t;

    /* renamed from: u  reason: collision with root package name */
    public final List<u> f60391u;

    /* renamed from: v  reason: collision with root package name */
    public final s f60392v;

    /* renamed from: w  reason: collision with root package name */
    public final s f60393w;

    /* loaded from: classes4.dex */
    public class a extends t<Number> {
        public a() {
        }

        @Override // xm.t
        /* renamed from: a */
        public Double read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            e.d(number.doubleValue());
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class b extends t<Number> {
        public b() {
        }

        @Override // xm.t
        /* renamed from: a */
        public Float read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            e.d(number.floatValue());
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class c extends t<Number> {
        @Override // xm.t
        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Long.valueOf(jsonReader.nextLong());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d extends t<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f60396a;

        public d(t tVar) {
            this.f60396a = tVar;
        }

        @Override // xm.t
        /* renamed from: a */
        public AtomicLong read(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f60396a.read(jsonReader)).longValue());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f60396a.write(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: xm.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C1011e extends t<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f60397a;

        public C1011e(t tVar) {
            this.f60397a = tVar;
        }

        @Override // xm.t
        /* renamed from: a */
        public AtomicLongArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f60397a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f60397a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    /* loaded from: classes4.dex */
    public static class f<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public t<T> f60398a;

        public void a(t<T> tVar) {
            if (this.f60398a == null) {
                this.f60398a = tVar;
                return;
            }
            throw new AssertionError();
        }

        @Override // xm.t
        public T read(JsonReader jsonReader) throws IOException {
            t<T> tVar = this.f60398a;
            if (tVar != null) {
                return tVar.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            t<T> tVar = this.f60398a;
            if (tVar != null) {
                tVar.write(jsonWriter, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public e() {
        this(zm.d.C, xm.c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, q.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), r.DOUBLE, r.LAZILY_PARSED_NUMBER);
    }

    public static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                    return;
                }
                throw new JsonIOException("JSON document was not fully consumed.");
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    public static t<AtomicLong> b(t<Number> tVar) {
        return new d(tVar).nullSafe();
    }

    public static t<AtomicLongArray> c(t<Number> tVar) {
        return new C1011e(tVar).nullSafe();
    }

    public static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static t<Number> p(q qVar) {
        if (qVar == q.DEFAULT) {
            return an.n.f14010t;
        }
        return new c();
    }

    public k A(Object obj, Type type) {
        an.g gVar = new an.g();
        v(obj, type, gVar);
        return gVar.a();
    }

    public final t<Number> e(boolean z10) {
        if (z10) {
            return an.n.f14012v;
        }
        return new a();
    }

    public final t<Number> f(boolean z10) {
        if (z10) {
            return an.n.f14011u;
        }
        return new b();
    }

    public <T> T g(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        boolean z10 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z10 = false;
                    T read = m(en.a.get(type)).read(jsonReader);
                    jsonReader.setLenient(isLenient);
                    return read;
                } catch (EOFException e10) {
                    if (z10) {
                        jsonReader.setLenient(isLenient);
                        return null;
                    }
                    throw new JsonSyntaxException(e10);
                } catch (IOException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            } catch (IllegalStateException e13) {
                throw new JsonSyntaxException(e13);
            }
        } catch (Throwable th2) {
            jsonReader.setLenient(isLenient);
            throw th2;
        }
    }

    public <T> T h(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader q10 = q(reader);
        T t10 = (T) g(q10, type);
        a(t10, q10);
        return t10;
    }

    public <T> T i(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) zm.k.b(cls).cast(j(str, cls));
    }

    public <T> T j(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), type);
    }

    public <T> T k(k kVar, Class<T> cls) throws JsonSyntaxException {
        return (T) zm.k.b(cls).cast(l(kVar, cls));
    }

    public <T> T l(k kVar, Type type) throws JsonSyntaxException {
        if (kVar == null) {
            return null;
        }
        return (T) g(new an.f(kVar), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> t<T> m(en.a<T> aVar) {
        t<T> tVar = (t<T>) this.f60372b.get(aVar == null ? f60370x : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<en.a<?>, f<?>> map = this.f60371a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f60371a.set(map);
            z10 = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (u uVar : this.f60375e) {
                t tVar2 = (t<T>) uVar.b(this, aVar);
                if (tVar2 != null) {
                    fVar2.a(tVar2);
                    this.f60372b.put(aVar, tVar2);
                    return tVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f60371a.remove();
            }
        }
    }

    public <T> t<T> n(Class<T> cls) {
        return m(en.a.get((Class) cls));
    }

    public <T> t<T> o(u uVar, en.a<T> aVar) {
        if (!this.f60375e.contains(uVar)) {
            uVar = this.f60374d;
        }
        boolean z10 = false;
        for (u uVar2 : this.f60375e) {
            if (z10) {
                t<T> b10 = uVar2.b(this, aVar);
                if (b10 != null) {
                    return b10;
                }
            } else if (uVar2 == uVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public JsonReader q(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f60384n);
        return jsonReader;
    }

    public JsonWriter r(Writer writer) throws IOException {
        if (this.f60381k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f60383m) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f60379i);
        return jsonWriter;
    }

    public String s(Object obj) {
        if (obj == null) {
            return u(l.f60418a);
        }
        return t(obj, obj.getClass());
    }

    public String t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f60379i + ",factories:" + this.f60375e + ",instanceCreators:" + this.f60373c + "}";
    }

    public String u(k kVar) {
        StringWriter stringWriter = new StringWriter();
        y(kVar, stringWriter);
        return stringWriter.toString();
    }

    public void v(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        t m10 = m(en.a.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f60382l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f60379i);
        try {
            try {
                m10.write(jsonWriter, obj);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void w(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            v(obj, type, r(zm.l.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public void x(k kVar, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f60382l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f60379i);
        try {
            try {
                zm.l.b(kVar, jsonWriter);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void y(k kVar, Appendable appendable) throws JsonIOException {
        try {
            x(kVar, r(zm.l.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public k z(Object obj) {
        if (obj == null) {
            return l.f60418a;
        }
        return A(obj, obj.getClass());
    }

    public e(zm.d dVar, xm.d dVar2, Map<Type, g<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, q qVar, String str, int i10, int i11, List<u> list, List<u> list2, List<u> list3, s sVar, s sVar2) {
        this.f60371a = new ThreadLocal<>();
        this.f60372b = new ConcurrentHashMap();
        this.f60376f = dVar;
        this.f60377g = dVar2;
        this.f60378h = map;
        zm.c cVar = new zm.c(map);
        this.f60373c = cVar;
        this.f60379i = z10;
        this.f60380j = z11;
        this.f60381k = z12;
        this.f60382l = z13;
        this.f60383m = z14;
        this.f60384n = z15;
        this.f60385o = z16;
        this.f60389s = qVar;
        this.f60386p = str;
        this.f60387q = i10;
        this.f60388r = i11;
        this.f60390t = list;
        this.f60391u = list2;
        this.f60392v = sVar;
        this.f60393w = sVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(an.n.V);
        arrayList.add(an.j.a(sVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(an.n.B);
        arrayList.add(an.n.f14003m);
        arrayList.add(an.n.f13997g);
        arrayList.add(an.n.f13999i);
        arrayList.add(an.n.f14001k);
        t<Number> p10 = p(qVar);
        arrayList.add(an.n.b(Long.TYPE, Long.class, p10));
        arrayList.add(an.n.b(Double.TYPE, Double.class, e(z16)));
        arrayList.add(an.n.b(Float.TYPE, Float.class, f(z16)));
        arrayList.add(an.i.a(sVar2));
        arrayList.add(an.n.f14005o);
        arrayList.add(an.n.f14007q);
        arrayList.add(an.n.c(AtomicLong.class, b(p10)));
        arrayList.add(an.n.c(AtomicLongArray.class, c(p10)));
        arrayList.add(an.n.f14009s);
        arrayList.add(an.n.f14014x);
        arrayList.add(an.n.D);
        arrayList.add(an.n.F);
        arrayList.add(an.n.c(BigDecimal.class, an.n.f14016z));
        arrayList.add(an.n.c(BigInteger.class, an.n.A));
        arrayList.add(an.n.H);
        arrayList.add(an.n.J);
        arrayList.add(an.n.N);
        arrayList.add(an.n.P);
        arrayList.add(an.n.T);
        arrayList.add(an.n.L);
        arrayList.add(an.n.f13994d);
        arrayList.add(an.c.f13930b);
        arrayList.add(an.n.R);
        if (dn.d.f29735a) {
            arrayList.add(dn.d.f29739e);
            arrayList.add(dn.d.f29738d);
            arrayList.add(dn.d.f29740f);
        }
        arrayList.add(an.a.f13924c);
        arrayList.add(an.n.f13992b);
        arrayList.add(new an.b(cVar));
        arrayList.add(new an.h(cVar, z11));
        an.e eVar = new an.e(cVar);
        this.f60374d = eVar;
        arrayList.add(eVar);
        arrayList.add(an.n.W);
        arrayList.add(new an.k(cVar, dVar2, dVar, eVar));
        this.f60375e = Collections.unmodifiableList(arrayList);
    }
}
