package an;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f extends JsonReader {
    public static final Reader A = new a();
    public static final Object B = new Object();

    /* renamed from: w  reason: collision with root package name */
    public Object[] f13937w;

    /* renamed from: x  reason: collision with root package name */
    public int f13938x;

    /* renamed from: y  reason: collision with root package name */
    public String[] f13939y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f13940z;

    /* loaded from: classes4.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    public f(xm.k kVar) {
        super(A);
        this.f13937w = new Object[32];
        this.f13938x = 0;
        this.f13939y = new String[32];
        this.f13940z = new int[32];
        i(kVar);
    }

    private String locationString() {
        return " at path " + getPath();
    }

    public final void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        i(((xm.h) d()).iterator());
        this.f13940z[this.f13938x - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        i(((xm.m) d()).t().iterator());
    }

    public xm.k c() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
            xm.k kVar = (xm.k) d();
            skipValue();
            return kVar;
        }
        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13937w = new Object[]{B};
        this.f13938x = 1;
    }

    public final Object d() {
        return this.f13937w[this.f13938x - 1];
    }

    public final Object e() {
        Object[] objArr = this.f13937w;
        int i10 = this.f13938x - 1;
        this.f13938x = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        e();
        e();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        e();
        e();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f13938x;
            if (i10 < i11) {
                Object[] objArr = this.f13937w;
                if (objArr[i10] instanceof xm.h) {
                    i10++;
                    if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                        sb2.append('[');
                        sb2.append(this.f13940z[i10]);
                        sb2.append(']');
                    }
                } else if ((objArr[i10] instanceof xm.m) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                    sb2.append('.');
                    String[] strArr = this.f13939y;
                    if (strArr[i10] != null) {
                        sb2.append(strArr[i10]);
                    }
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    public void h() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        i(entry.getValue());
        i(new xm.n((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public final void i(Object obj) {
        int i10 = this.f13938x;
        Object[] objArr = this.f13937w;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f13937w = Arrays.copyOf(objArr, i11);
            this.f13940z = Arrays.copyOf(this.f13940z, i11);
            this.f13939y = (String[]) Arrays.copyOf(this.f13939y, i11);
        }
        Object[] objArr2 = this.f13937w;
        int i12 = this.f13938x;
        this.f13938x = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean r10 = ((xm.n) e()).r();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return r10;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double s10 = ((xm.n) d()).s();
        if (!isLenient() && (Double.isNaN(s10) || Double.isInfinite(s10))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + s10);
        }
        e();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return s10;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int t10 = ((xm.n) d()).t();
        e();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return t10;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long u10 = ((xm.n) d()).u();
        e();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return u10;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        String str = (String) entry.getKey();
        this.f13939y[this.f13938x - 1] = str;
        i(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        e();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String j10 = ((xm.n) e()).j();
        int i10 = this.f13938x;
        if (i10 > 0) {
            int[] iArr = this.f13940z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return j10;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f13938x == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object d10 = d();
        if (d10 instanceof Iterator) {
            boolean z10 = this.f13937w[this.f13938x - 2] instanceof xm.m;
            Iterator it = (Iterator) d10;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            } else if (z10) {
                return JsonToken.NAME;
            } else {
                i(it.next());
                return peek();
            }
        } else if (d10 instanceof xm.m) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (d10 instanceof xm.h) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (d10 instanceof xm.n) {
                xm.n nVar = (xm.n) d10;
                if (nVar.B()) {
                    return JsonToken.STRING;
                }
                if (nVar.x()) {
                    return JsonToken.BOOLEAN;
                }
                if (nVar.A()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (d10 instanceof xm.l) {
                return JsonToken.NULL;
            } else {
                if (d10 == B) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f13939y[this.f13938x - 2] = "null";
        } else {
            e();
            int i10 = this.f13938x;
            if (i10 > 0) {
                this.f13939y[i10 - 1] = "null";
            }
        }
        int i11 = this.f13938x;
        if (i11 > 0) {
            int[] iArr = this.f13940z;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return f.class.getSimpleName() + locationString();
    }
}
