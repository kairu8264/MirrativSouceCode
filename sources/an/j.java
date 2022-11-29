package an;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import xm.r;
import xm.s;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class j extends t<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final u f13955c = b(r.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    public final xm.e f13956a;

    /* renamed from: b  reason: collision with root package name */
    public final s f13957b;

    /* loaded from: classes4.dex */
    public class a implements u {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s f13958w;

        public a(s sVar) {
            this.f13958w = sVar;
        }

        @Override // xm.u
        public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new j(eVar, this.f13958w, null);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13959a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13959a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13959a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13959a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13959a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13959a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13959a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public /* synthetic */ j(xm.e eVar, s sVar, a aVar) {
        this(eVar, sVar);
    }

    public static u a(s sVar) {
        if (sVar == r.DOUBLE) {
            return f13955c;
        }
        return b(sVar);
    }

    public static u b(s sVar) {
        return new a(sVar);
    }

    @Override // xm.t
    public Object read(JsonReader jsonReader) throws IOException {
        switch (b.f13959a[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(read(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                zm.h hVar = new zm.h();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hVar.put(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return hVar;
            case 3:
                return jsonReader.nextString();
            case 4:
                return this.f13957b.a(jsonReader);
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        t n10 = this.f13956a.n(obj.getClass());
        if (n10 instanceof j) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        n10.write(jsonWriter, obj);
    }

    public j(xm.e eVar, s sVar) {
        this.f13956a = eVar;
        this.f13957b = sVar;
    }
}
