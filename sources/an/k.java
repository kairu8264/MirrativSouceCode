package an;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class k implements u {
    public final cn.b A = cn.b.a();

    /* renamed from: w  reason: collision with root package name */
    public final zm.c f13960w;

    /* renamed from: x  reason: collision with root package name */
    public final xm.d f13961x;

    /* renamed from: y  reason: collision with root package name */
    public final zm.d f13962y;

    /* renamed from: z  reason: collision with root package name */
    public final e f13963z;

    /* loaded from: classes4.dex */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Field f13964d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f13965e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ t f13966f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ xm.e f13967g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ en.a f13968h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ boolean f13969i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, boolean z11, Field field, boolean z12, t tVar, xm.e eVar, en.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f13964d = field;
            this.f13965e = z12;
            this.f13966f = tVar;
            this.f13967g = eVar;
            this.f13968h = aVar;
            this.f13969i = z13;
        }

        @Override // an.k.c
        public void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object read = this.f13966f.read(jsonReader);
            if (read == null && this.f13969i) {
                return;
            }
            this.f13964d.set(obj, read);
        }

        @Override // an.k.c
        public void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            (this.f13965e ? this.f13966f : new m(this.f13967g, this.f13966f, this.f13968h.getType())).write(jsonWriter, this.f13964d.get(obj));
        }

        @Override // an.k.c
        public boolean c(Object obj) throws IOException, IllegalAccessException {
            return this.f13974b && this.f13964d.get(obj) != obj;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final zm.i<T> f13971a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, c> f13972b;

        public b(zm.i<T> iVar, Map<String, c> map) {
            this.f13971a = iVar;
            this.f13972b = map;
        }

        @Override // xm.t
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T a10 = this.f13971a.a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    c cVar = this.f13972b.get(jsonReader.nextName());
                    if (cVar != null && cVar.f13975c) {
                        cVar.a(jsonReader, a10);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a10;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (c cVar : this.f13972b.values()) {
                    if (cVar.c(t10)) {
                        jsonWriter.name(cVar.f13973a);
                        cVar.b(jsonWriter, t10);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f13973a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13974b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13975c;

        public c(String str, boolean z10, boolean z11) {
            this.f13973a = str;
            this.f13974b = z10;
            this.f13975c = z11;
        }

        public abstract void a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        public abstract void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public k(zm.c cVar, xm.d dVar, zm.d dVar2, e eVar) {
        this.f13960w = cVar;
        this.f13961x = dVar;
        this.f13962y = dVar2;
        this.f13963z = eVar;
    }

    public static boolean d(Field field, boolean z10, zm.d dVar) {
        return (dVar.e(field.getType(), z10) || dVar.h(field, z10)) ? false : true;
    }

    public final c a(xm.e eVar, Field field, String str, en.a<?> aVar, boolean z10, boolean z11) {
        boolean a10 = zm.k.a(aVar.getRawType());
        ym.b bVar = (ym.b) field.getAnnotation(ym.b.class);
        t<?> a11 = bVar != null ? this.f13963z.a(this.f13960w, eVar, aVar, bVar) : null;
        boolean z12 = a11 != null;
        if (a11 == null) {
            a11 = eVar.m(aVar);
        }
        return new a(str, z10, z11, field, z12, a11, eVar, aVar, a10);
    }

    @Override // xm.u
    public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new b(this.f13960w.a(aVar), e(eVar, aVar, rawType));
        }
        return null;
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f13962y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public final Map<String, c> e(xm.e eVar, en.a<?> aVar, Class<?> cls) {
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        en.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean c10 = c(field, true);
                boolean c11 = c(field, z10);
                if (c10 || c11) {
                    this.A.b(field);
                    Type p10 = zm.b.p(aVar2.getType(), cls2, field.getGenericType());
                    List<String> f10 = f(field);
                    int size = f10.size();
                    c cVar2 = null;
                    int i11 = z10;
                    while (i11 < size) {
                        String str = f10.get(i11);
                        boolean z11 = i11 != 0 ? z10 : c10;
                        int i12 = i11;
                        c cVar3 = cVar2;
                        int i13 = size;
                        List<String> list = f10;
                        Field field2 = field;
                        cVar2 = cVar3 == null ? (c) linkedHashMap.put(str, a(eVar, field, str, en.a.get(p10), z11, c11)) : cVar3;
                        c10 = z11;
                        f10 = list;
                        size = i13;
                        field = field2;
                        z10 = false;
                        i11 = i12 + 1;
                    }
                    if (cVar2 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar.f13973a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVar2 = en.a.get(zm.b.p(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    public final List<String> f(Field field) {
        ym.c cVar = (ym.c) field.getAnnotation(ym.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f13961x.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }
}
