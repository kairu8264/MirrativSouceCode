package an;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class d<T extends Date> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f13932a;

    /* renamed from: b  reason: collision with root package name */
    public final List<DateFormat> f13933b;

    /* loaded from: classes4.dex */
    public static abstract class b<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final b<Date> f13934b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f13935a;

        /* loaded from: classes4.dex */
        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
            }

            @Override // an.d.b
            public Date d(Date date) {
                return date;
            }
        }

        public b(Class<T> cls) {
            this.f13935a = cls;
        }

        public final u a(int i10, int i11) {
            return c(new d<>(this, i10, i11));
        }

        public final u b(String str) {
            return c(new d<>(this, str));
        }

        public final u c(d<T> dVar) {
            return n.c(this.f13935a, dVar);
        }

        public abstract T d(Date date);
    }

    public final Date a(String str) {
        synchronized (this.f13933b) {
            for (DateFormat dateFormat : this.f13933b) {
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
    }

    @Override // xm.t
    /* renamed from: b */
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.f13932a.d(a(jsonReader.nextString()));
    }

    @Override // xm.t
    /* renamed from: c */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f13933b) {
            jsonWriter.value(this.f13933b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f13933b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f13933b = arrayList;
        this.f13932a = (b) zm.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public d(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f13933b = arrayList;
        this.f13932a = (b) zm.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (zm.e.e()) {
            arrayList.add(zm.j.c(i10, i11));
        }
    }
}
