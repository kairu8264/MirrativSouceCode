package dn;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import xm.e;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public class c extends t<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f29733b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final t<Date> f29734a;

    /* loaded from: classes4.dex */
    public class a implements u {
        @Override // xm.u
        public <T> t<T> b(e eVar, en.a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new c(eVar.n(Date.class), null);
            }
            return null;
        }
    }

    public /* synthetic */ c(t tVar, a aVar) {
        this(tVar);
    }

    @Override // xm.t
    /* renamed from: a */
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date read = this.f29734a.read(jsonReader);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // xm.t
    /* renamed from: b */
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f29734a.write(jsonWriter, timestamp);
    }

    public c(t<Date> tVar) {
        this.f29734a = tVar;
    }
}
