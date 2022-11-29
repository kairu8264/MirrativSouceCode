package nn;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public class h implements u {

    /* loaded from: classes4.dex */
    public class a extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f43722a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ en.a f43723b;

        public a(t tVar, en.a aVar) {
            this.f43722a = tVar;
            this.f43723b = aVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v3, types: [T, java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v4, types: [T, java.util.Map] */
        @Override // xm.t
        public T read(JsonReader jsonReader) throws IOException {
            ?? read = this.f43722a.read(jsonReader);
            if (Map.class.isAssignableFrom(this.f43723b.getRawType())) {
                if (read == 0) {
                    return Collections.EMPTY_MAP;
                }
                return Collections.unmodifiableMap((Map) read);
            }
            return read;
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            this.f43722a.write(jsonWriter, t10);
        }
    }

    @Override // xm.u
    public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
        return new a(eVar.o(this, aVar), aVar);
    }
}
