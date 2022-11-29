package xm;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes4.dex */
public abstract class t<T> {

    /* loaded from: classes4.dex */
    public class a extends t<T> {
        public a() {
        }

        @Override // xm.t
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (T) t.this.read(jsonReader);
        }

        @Override // xm.t
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
            } else {
                t.this.write(jsonWriter, t10);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(k kVar) {
        try {
            return read(new an.f(kVar));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final t<T> nullSafe() {
        return new a();
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t10) throws IOException {
        write(new JsonWriter(writer), t10);
    }

    public final k toJsonTree(T t10) {
        try {
            an.g gVar = new an.g();
            write(gVar, t10);
            return gVar.a();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t10) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
