package an;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class a<E> extends t<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final u f13924c = new C0041a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f13925a;

    /* renamed from: b  reason: collision with root package name */
    public final t<E> f13926b;

    /* renamed from: an.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0041a implements u {
        @Override // xm.u
        public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
            Type type = aVar.getType();
            if ((type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray())) {
                Type g10 = zm.b.g(type);
                return new a(eVar, eVar.m(en.a.get(g10)), zm.b.k(g10));
            }
            return null;
        }
    }

    public a(xm.e eVar, t<E> tVar, Class<E> cls) {
        this.f13926b = new m(eVar, tVar, cls);
        this.f13925a = cls;
    }

    @Override // xm.t
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f13926b.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f13925a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xm.t
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f13926b.write(jsonWriter, Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }
}
