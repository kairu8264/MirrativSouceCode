package dn;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import xm.e;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class a extends t<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f29729b = new C0288a();

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f29730a;

    /* renamed from: dn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0288a implements u {
        @Override // xm.u
        public <T> t<T> b(e eVar, en.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new a(null);
            }
            return null;
        }
    }

    public /* synthetic */ a(C0288a c0288a) {
        this();
    }

    @Override // xm.t
    /* renamed from: a */
    public synchronized Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f29730a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // xm.t
    /* renamed from: b */
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.f29730a.format((java.util.Date) date));
    }

    public a() {
        this.f29730a = new SimpleDateFormat("MMM d, yyyy");
    }
}
