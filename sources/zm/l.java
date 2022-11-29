package zm;

import an.n;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes4.dex */
public final class l {
    public static xm.k a(JsonReader jsonReader) throws JsonParseException {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
                try {
                    return n.U.read(jsonReader);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return xm.l.f60418a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e11) {
                throw new JsonSyntaxException(e11);
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            } catch (NumberFormatException e13) {
                throw new JsonSyntaxException(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    public static void b(xm.k kVar, JsonWriter jsonWriter) throws IOException {
        n.U.write(jsonWriter, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* loaded from: classes4.dex */
    public static final class a extends Writer {

        /* renamed from: w  reason: collision with root package name */
        public final Appendable f63260w;

        /* renamed from: x  reason: collision with root package name */
        public final C1101a f63261x = new C1101a();

        /* renamed from: zm.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C1101a implements CharSequence {

            /* renamed from: w  reason: collision with root package name */
            public char[] f63262w;

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f63262w[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f63262w.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f63262w, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.f63260w = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            C1101a c1101a = this.f63261x;
            c1101a.f63262w = cArr;
            this.f63260w.append(c1101a, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f63260w.append((char) i10);
        }
    }
}
