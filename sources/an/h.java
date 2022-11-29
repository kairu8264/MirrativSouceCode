package an;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class h implements u {

    /* renamed from: w  reason: collision with root package name */
    public final zm.c f13945w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f13946x;

    /* loaded from: classes4.dex */
    public final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final t<K> f13947a;

        /* renamed from: b  reason: collision with root package name */
        public final t<V> f13948b;

        /* renamed from: c  reason: collision with root package name */
        public final zm.i<? extends Map<K, V>> f13949c;

        public a(xm.e eVar, Type type, t<K> tVar, Type type2, t<V> tVar2, zm.i<? extends Map<K, V>> iVar) {
            this.f13947a = new m(eVar, tVar, type);
            this.f13948b = new m(eVar, tVar2, type2);
            this.f13949c = iVar;
        }

        public final String a(xm.k kVar) {
            if (kVar.p()) {
                xm.n g10 = kVar.g();
                if (g10.A()) {
                    return String.valueOf(g10.w());
                }
                if (g10.x()) {
                    return Boolean.toString(g10.r());
                }
                if (g10.B()) {
                    return g10.j();
                }
                throw new AssertionError();
            } else if (kVar.l()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> a10 = this.f13949c.a();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K read = this.f13947a.read(jsonReader);
                    if (a10.put(read, this.f13948b.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    zm.f.INSTANCE.promoteNameToValue(jsonReader);
                    K read2 = this.f13947a.read(jsonReader);
                    if (a10.put(read2, this.f13948b.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                jsonReader.endObject();
            }
            return a10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xm.t
        /* renamed from: c */
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!h.this.f13946x) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f13948b.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    xm.k jsonTree = this.f13947a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    z10 |= jsonTree.k() || jsonTree.m();
                }
                if (z10) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i10 < size) {
                        jsonWriter.beginArray();
                        zm.l.b((xm.k) arrayList.get(i10), jsonWriter);
                        this.f13948b.write(jsonWriter, arrayList2.get(i10));
                        jsonWriter.endArray();
                        i10++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    jsonWriter.name(a((xm.k) arrayList.get(i10)));
                    this.f13948b.write(jsonWriter, arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public h(zm.c cVar, boolean z10) {
        this.f13945w = cVar;
        this.f13946x = z10;
    }

    public final t<?> a(xm.e eVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return eVar.m(en.a.get(type));
        }
        return n.f13996f;
    }

    @Override // xm.u
    public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
        Type type = aVar.getType();
        if (Map.class.isAssignableFrom(aVar.getRawType())) {
            Type[] j10 = zm.b.j(type, zm.b.k(type));
            return new a(eVar, j10[0], a(eVar, j10[0]), j10[1], eVar.m(en.a.get(j10[1])), this.f13945w.a(aVar));
        }
        return null;
    }
}
