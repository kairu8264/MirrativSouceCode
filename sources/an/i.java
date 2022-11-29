package an;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import xm.r;
import xm.s;
import xm.t;
import xm.u;

/* loaded from: classes4.dex */
public final class i extends t<Number> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f13951b = b(r.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    public final s f13952a;

    /* loaded from: classes4.dex */
    public class a implements u {
        public a() {
        }

        @Override // xm.u
        public <T> t<T> b(xm.e eVar, en.a<T> aVar) {
            if (aVar.getRawType() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13954a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f13954a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13954a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13954a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(s sVar) {
        this.f13952a = sVar;
    }

    public static u a(s sVar) {
        if (sVar == r.LAZILY_PARSED_NUMBER) {
            return f13951b;
        }
        return b(sVar);
    }

    public static u b(s sVar) {
        return new a();
    }

    @Override // xm.t
    /* renamed from: c */
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i10 = b.f13954a[peek.ordinal()];
        if (i10 == 1) {
            jsonReader.nextNull();
            return null;
        } else if (i10 != 2 && i10 != 3) {
            throw new JsonSyntaxException("Expecting number, got: " + peek);
        } else {
            return this.f13952a.a(jsonReader);
        }
    }

    @Override // xm.t
    /* renamed from: d */
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
