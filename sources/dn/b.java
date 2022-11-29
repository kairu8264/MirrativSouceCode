package dn;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import xm.e;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class b extends t<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f29731b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f29732a;

    /* loaded from: classes4.dex */
    public class a implements u {
        @Override // xm.u
        public <T> t<T> b(e eVar, en.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new b(null);
            }
            return null;
        }
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    @Override // xm.t
    /* renamed from: a */
    public synchronized Time read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f29732a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // xm.t
    /* renamed from: b */
    public synchronized void write(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.f29732a.format((Date) time));
    }

    public b() {
        this.f29732a = new SimpleDateFormat("hh:mm:ss a");
    }
}
