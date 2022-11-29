package an;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class c extends t<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f13930b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<DateFormat> f13931a;

    /* loaded from: classes4.dex */
    public class a implements u {
        @Override // xm.u
        public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f13931a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (zm.e.e()) {
            arrayList.add(zm.j.c(2, 2));
        }
    }

    public final synchronized Date a(String str) {
        for (DateFormat dateFormat : this.f13931a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return bn.a.c(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new JsonSyntaxException(str, e10);
        }
    }

    @Override // xm.t
    /* renamed from: b */
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return a(jsonReader.nextString());
    }

    @Override // xm.t
    /* renamed from: c */
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.f13931a.get(0).format(date));
        }
    }
}
