package xm;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class r implements s {
    private static final /* synthetic */ r[] $VALUES;
    public static final r BIG_DECIMAL;
    public static final r DOUBLE;
    public static final r LAZILY_PARSED_NUMBER;
    public static final r LONG_OR_DOUBLE;

    /* loaded from: classes4.dex */
    public enum a extends r {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // xm.s
        /* renamed from: c */
        public Double a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        r rVar = new r("LAZILY_PARSED_NUMBER", 1) { // from class: xm.r.b
            @Override // xm.s
            public Number a(JsonReader jsonReader) throws IOException {
                return new zm.g(jsonReader.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = rVar;
        r rVar2 = new r("LONG_OR_DOUBLE", 2) { // from class: xm.r.c
            @Override // xm.s
            public Number a(JsonReader jsonReader) throws IOException, JsonParseException {
                String nextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(nextString));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(nextString);
                        if ((valueOf.isInfinite() || valueOf.isNaN()) && !jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPath());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e10) {
                    throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPath(), e10);
                }
            }
        };
        LONG_OR_DOUBLE = rVar2;
        r rVar3 = new r("BIG_DECIMAL", 3) { // from class: xm.r.d
            @Override // xm.s
            /* renamed from: c */
            public BigDecimal a(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e10) {
                    throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPath(), e10);
                }
            }
        };
        BIG_DECIMAL = rVar3;
        $VALUES = new r[]{aVar, rVar, rVar2, rVar3};
    }

    public r(String str, int i10) {
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public /* synthetic */ r(String str, int i10, a aVar) {
        this(str, i10);
    }
}
