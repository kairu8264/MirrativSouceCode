package an;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class b implements u {

    /* renamed from: w  reason: collision with root package name */
    public final zm.c f13927w;

    /* loaded from: classes4.dex */
    public static final class a<E> extends t<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final t<E> f13928a;

        /* renamed from: b  reason: collision with root package name */
        public final zm.i<? extends Collection<E>> f13929b;

        public a(xm.e eVar, Type type, t<E> tVar, zm.i<? extends Collection<E>> iVar) {
            this.f13928a = new m(eVar, tVar, type);
            this.f13929b = iVar;
        }

        @Override // xm.t
        /* renamed from: a */
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> a10 = this.f13929b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                a10.add(this.f13928a.read(jsonReader));
            }
            jsonReader.endArray();
            return a10;
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e10 : collection) {
                this.f13928a.write(jsonWriter, e10);
            }
            jsonWriter.endArray();
        }
    }

    public b(zm.c cVar) {
        this.f13927w = cVar;
    }

    @Override // xm.u
    public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (Collection.class.isAssignableFrom(rawType)) {
            Type h10 = zm.b.h(type, rawType);
            return new a(eVar, h10, eVar.m(en.a.get(h10)), this.f13927w.a(aVar));
        }
        return null;
    }
}
