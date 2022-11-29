package nn;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public class g implements u {

    /* loaded from: classes4.dex */
    public class a extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f43719a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ en.a f43720b;

        public a(t tVar, en.a aVar) {
            this.f43719a = tVar;
            this.f43720b = aVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, T] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List, T] */
        @Override // xm.t
        public T read(JsonReader jsonReader) throws IOException {
            ?? read = this.f43719a.read(jsonReader);
            if (List.class.isAssignableFrom(this.f43720b.getRawType())) {
                if (read == 0) {
                    return Collections.EMPTY_LIST;
                }
                return Collections.unmodifiableList((List) read);
            }
            return read;
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            this.f43719a.write(jsonWriter, t10);
        }
    }

    @Override // xm.u
    public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
        return new a(eVar.o(this, aVar), aVar);
    }
}
