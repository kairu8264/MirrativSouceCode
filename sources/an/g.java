package an;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class g extends JsonWriter {

    /* renamed from: w  reason: collision with root package name */
    public final List<xm.k> f13942w;

    /* renamed from: x  reason: collision with root package name */
    public String f13943x;

    /* renamed from: y  reason: collision with root package name */
    public xm.k f13944y;

    /* renamed from: z  reason: collision with root package name */
    public static final Writer f13941z = new a();
    public static final xm.n A = new xm.n("closed");

    /* loaded from: classes4.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f13941z);
        this.f13942w = new ArrayList();
        this.f13944y = xm.l.f60418a;
    }

    public xm.k a() {
        if (this.f13942w.isEmpty()) {
            return this.f13944y;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f13942w);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        xm.h hVar = new xm.h();
        d(hVar);
        this.f13942w.add(hVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        xm.m mVar = new xm.m();
        d(mVar);
        this.f13942w.add(mVar);
        return this;
    }

    public final xm.k c() {
        List<xm.k> list = this.f13942w;
        return list.get(list.size() - 1);
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f13942w.isEmpty()) {
            this.f13942w.add(A);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(xm.k kVar) {
        if (this.f13943x != null) {
            if (!kVar.l() || getSerializeNulls()) {
                ((xm.m) c()).r(this.f13943x, kVar);
            }
            this.f13943x = null;
        } else if (this.f13942w.isEmpty()) {
            this.f13944y = kVar;
        } else {
            xm.k c10 = c();
            if (c10 instanceof xm.h) {
                ((xm.h) c10).r(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (!this.f13942w.isEmpty() && this.f13943x == null) {
            if (c() instanceof xm.h) {
                List<xm.k> list = this.f13942w;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (!this.f13942w.isEmpty() && this.f13943x == null) {
            if (c() instanceof xm.m) {
                List<xm.k> list = this.f13942w;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (!this.f13942w.isEmpty() && this.f13943x == null) {
            if (c() instanceof xm.m) {
                this.f13943x = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        d(xm.l.f60418a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        d(new xm.n(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) throws IOException {
        d(new xm.n(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        d(new xm.n(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) throws IOException {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        d(new xm.n(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) throws IOException {
        d(new xm.n(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        d(new xm.n(number));
        return this;
    }
}
