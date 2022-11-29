package an;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes4.dex */
public final class n {
    public static final xm.t<BigInteger> A;
    public static final xm.u B;
    public static final xm.t<StringBuilder> C;
    public static final xm.u D;
    public static final xm.t<StringBuffer> E;
    public static final xm.u F;
    public static final xm.t<URL> G;
    public static final xm.u H;
    public static final xm.t<URI> I;
    public static final xm.u J;
    public static final xm.t<InetAddress> K;
    public static final xm.u L;
    public static final xm.t<UUID> M;
    public static final xm.u N;
    public static final xm.t<Currency> O;
    public static final xm.u P;
    public static final xm.t<Calendar> Q;
    public static final xm.u R;
    public static final xm.t<Locale> S;
    public static final xm.u T;
    public static final xm.t<xm.k> U;
    public static final xm.u V;
    public static final xm.u W;

    /* renamed from: a  reason: collision with root package name */
    public static final xm.t<Class> f13991a;

    /* renamed from: b  reason: collision with root package name */
    public static final xm.u f13992b;

    /* renamed from: c  reason: collision with root package name */
    public static final xm.t<BitSet> f13993c;

    /* renamed from: d  reason: collision with root package name */
    public static final xm.u f13994d;

    /* renamed from: e  reason: collision with root package name */
    public static final xm.t<Boolean> f13995e;

    /* renamed from: f  reason: collision with root package name */
    public static final xm.t<Boolean> f13996f;

    /* renamed from: g  reason: collision with root package name */
    public static final xm.u f13997g;

    /* renamed from: h  reason: collision with root package name */
    public static final xm.t<Number> f13998h;

    /* renamed from: i  reason: collision with root package name */
    public static final xm.u f13999i;

    /* renamed from: j  reason: collision with root package name */
    public static final xm.t<Number> f14000j;

    /* renamed from: k  reason: collision with root package name */
    public static final xm.u f14001k;

    /* renamed from: l  reason: collision with root package name */
    public static final xm.t<Number> f14002l;

    /* renamed from: m  reason: collision with root package name */
    public static final xm.u f14003m;

    /* renamed from: n  reason: collision with root package name */
    public static final xm.t<AtomicInteger> f14004n;

    /* renamed from: o  reason: collision with root package name */
    public static final xm.u f14005o;

    /* renamed from: p  reason: collision with root package name */
    public static final xm.t<AtomicBoolean> f14006p;

    /* renamed from: q  reason: collision with root package name */
    public static final xm.u f14007q;

    /* renamed from: r  reason: collision with root package name */
    public static final xm.t<AtomicIntegerArray> f14008r;

    /* renamed from: s  reason: collision with root package name */
    public static final xm.u f14009s;

    /* renamed from: t  reason: collision with root package name */
    public static final xm.t<Number> f14010t;

    /* renamed from: u  reason: collision with root package name */
    public static final xm.t<Number> f14011u;

    /* renamed from: v  reason: collision with root package name */
    public static final xm.t<Number> f14012v;

    /* renamed from: w  reason: collision with root package name */
    public static final xm.t<Character> f14013w;

    /* renamed from: x  reason: collision with root package name */
    public static final xm.u f14014x;

    /* renamed from: y  reason: collision with root package name */
    public static final xm.t<String> f14015y;

    /* renamed from: z  reason: collision with root package name */
    public static final xm.t<BigDecimal> f14016z;

    /* loaded from: classes4.dex */
    public class a extends xm.t<AtomicIntegerArray> {
        @Override // xm.t
        /* renamed from: a */
        public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value(atomicIntegerArray.get(i10));
            }
            jsonWriter.endArray();
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a0 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14017a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f14017a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14017a[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14017a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14017a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14017a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14017a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14017a[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14017a[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14017a[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14017a[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b extends xm.t<Number> {
        @Override // xm.t
        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class b0 extends xm.t<Boolean> {
        @Override // xm.t
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public Boolean read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            } else {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c extends xm.t<Number> {
        @Override // xm.t
        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class c0 extends xm.t<Boolean> {
        @Override // xm.t
        /* renamed from: a */
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xm.t
        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextString());
        }
    }

    /* loaded from: classes4.dex */
    public class d extends xm.t<Number> {
        @Override // xm.t
        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class d0 extends xm.t<Number> {
        @Override // xm.t
        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class e extends xm.t<Character> {
        @Override // xm.t
        /* renamed from: a */
        public Character read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + nextString);
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Character ch2) throws IOException {
            jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* loaded from: classes4.dex */
    public class e0 extends xm.t<Number> {
        @Override // xm.t
        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class f extends xm.t<String> {
        @Override // xm.t
        /* renamed from: a */
        public String read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            } else {
                return jsonReader.nextString();
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    /* loaded from: classes4.dex */
    public class f0 extends xm.t<Number> {
        @Override // xm.t
        /* renamed from: a */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    /* loaded from: classes4.dex */
    public class g extends xm.t<BigDecimal> {
        @Override // xm.t
        /* renamed from: a */
        public BigDecimal read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    /* loaded from: classes4.dex */
    public class g0 extends xm.t<AtomicInteger> {
        @Override // xm.t
        /* renamed from: a */
        public AtomicInteger read(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    /* loaded from: classes4.dex */
    public class h extends xm.t<BigInteger> {
        @Override // xm.t
        /* renamed from: a */
        public BigInteger read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    /* loaded from: classes4.dex */
    public class h0 extends xm.t<AtomicBoolean> {
        @Override // xm.t
        /* renamed from: a */
        public AtomicBoolean read(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    /* loaded from: classes4.dex */
    public class i extends xm.t<StringBuilder> {
        @Override // xm.t
        /* renamed from: a */
        public StringBuilder read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuilder(jsonReader.nextString());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
            jsonWriter.value(sb2 == null ? null : sb2.toString());
        }
    }

    /* loaded from: classes4.dex */
    public static final class i0<T extends Enum<T>> extends xm.t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, T> f14018a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<T, String> f14019b = new HashMap();

        /* loaded from: classes4.dex */
        public class a implements PrivilegedAction<Void> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Field f14020a;

            public a(Field field) {
                this.f14020a = field;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Void run() {
                this.f14020a.setAccessible(true);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i0(Class<T> cls) {
            Field[] declaredFields;
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum r42 = (Enum) field.get(null);
                        String name = r42.name();
                        ym.c cVar = (ym.c) field.getAnnotation(ym.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String str : cVar.alternate()) {
                                this.f14018a.put(str, r42);
                            }
                        }
                        this.f14018a.put(name, r42);
                        this.f14019b.put(r42, name);
                    }
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // xm.t
        /* renamed from: a */
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.f14018a.get(jsonReader.nextString());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            jsonWriter.value(t10 == null ? null : this.f14019b.get(t10));
        }
    }

    /* loaded from: classes4.dex */
    public class j extends xm.t<StringBuffer> {
        @Override // xm.t
        /* renamed from: a */
        public StringBuffer read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuffer(jsonReader.nextString());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: classes4.dex */
    public class k extends xm.t<Class> {
        @Override // xm.t
        /* renamed from: a */
        public Class read(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes4.dex */
    public class l extends xm.t<URL> {
        @Override // xm.t
        /* renamed from: a */
        public URL read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if ("null".equals(nextString)) {
                return null;
            }
            return new URL(nextString);
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    }

    /* loaded from: classes4.dex */
    public class m extends xm.t<URI> {
        @Override // xm.t
        /* renamed from: a */
        public URI read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URI(nextString);
            } catch (URISyntaxException e10) {
                throw new JsonIOException(e10);
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: an.n$n  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0042n extends xm.t<InetAddress> {
        @Override // xm.t
        /* renamed from: a */
        public InetAddress read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return InetAddress.getByName(jsonReader.nextString());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: classes4.dex */
    public class o extends xm.t<UUID> {
        @Override // xm.t
        /* renamed from: a */
        public UUID read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return UUID.fromString(jsonReader.nextString());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: classes4.dex */
    public class p extends xm.t<Currency> {
        @Override // xm.t
        /* renamed from: a */
        public Currency read(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes4.dex */
    public class q extends xm.t<Calendar> {
        @Override // xm.t
        /* renamed from: a */
        public Calendar read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if ("year".equals(nextName)) {
                    i10 = nextInt;
                } else if ("month".equals(nextName)) {
                    i11 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i12 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i13 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i14 = nextInt;
                } else if ("second".equals(nextName)) {
                    i15 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value(calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value(calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value(calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value(calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value(calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value(calendar.get(13));
            jsonWriter.endObject();
        }
    }

    /* loaded from: classes4.dex */
    public class r extends xm.t<Locale> {
        @Override // xm.t
        /* renamed from: a */
        public Locale read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: classes4.dex */
    public class s extends xm.t<xm.k> {
        @Override // xm.t
        /* renamed from: a */
        public xm.k read(JsonReader jsonReader) throws IOException {
            if (jsonReader instanceof an.f) {
                return ((an.f) jsonReader).c();
            }
            switch (a0.f14017a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new xm.n(new zm.g(jsonReader.nextString()));
                case 2:
                    return new xm.n(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new xm.n(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return xm.l.f60418a;
                case 5:
                    xm.h hVar = new xm.h();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        hVar.r(read(jsonReader));
                    }
                    jsonReader.endArray();
                    return hVar;
                case 6:
                    xm.m mVar = new xm.m();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        mVar.r(jsonReader.nextName(), read(jsonReader));
                    }
                    jsonReader.endObject();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, xm.k kVar) throws IOException {
            if (kVar != null && !kVar.l()) {
                if (kVar.p()) {
                    xm.n g10 = kVar.g();
                    if (g10.A()) {
                        jsonWriter.value(g10.w());
                        return;
                    } else if (g10.x()) {
                        jsonWriter.value(g10.r());
                        return;
                    } else {
                        jsonWriter.value(g10.j());
                        return;
                    }
                } else if (kVar.k()) {
                    jsonWriter.beginArray();
                    Iterator<xm.k> it = kVar.d().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                } else if (kVar.m()) {
                    jsonWriter.beginObject();
                    for (Map.Entry<String, xm.k> entry : kVar.f().t()) {
                        jsonWriter.name(entry.getKey());
                        write(jsonWriter, entry.getValue());
                    }
                    jsonWriter.endObject();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
                }
            }
            jsonWriter.nullValue();
        }
    }

    /* loaded from: classes4.dex */
    public class t implements xm.u {
        @Override // xm.u
        public <T> xm.t<T> b(xm.e eVar, en.a<T> aVar) {
            Class rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = (Class<? super Object>) rawType.getSuperclass();
            }
            return new i0(rawType);
        }
    }

    /* loaded from: classes4.dex */
    public class u implements xm.u {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ en.a f14022w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ xm.t f14023x;

        public u(en.a aVar, xm.t tVar) {
            this.f14022w = aVar;
            this.f14023x = tVar;
        }

        @Override // xm.u
        public <T> xm.t<T> b(xm.e eVar, en.a<T> aVar) {
            if (aVar.equals(this.f14022w)) {
                return this.f14023x;
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public class v extends xm.t<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
            if (r8.nextInt() != 0) goto L15;
         */
        @Override // xm.t
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.beginArray()
                com.google.gson.stream.JsonToken r1 = r8.peek()
                r2 = 0
                r3 = r2
            Le:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = an.n.a0.f14017a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.nextBoolean()
                goto L69
            L63:
                int r1 = r8.nextInt()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r8.peek()
                goto Le
            L75:
                r8.endArray()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: an.n.v.read(com.google.gson.stream.JsonReader):java.util.BitSet");
        }

        @Override // xm.t
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    /* loaded from: classes4.dex */
    public class w implements xm.u {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Class f14024w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ xm.t f14025x;

        public w(Class cls, xm.t tVar) {
            this.f14024w = cls;
            this.f14025x = tVar;
        }

        @Override // xm.u
        public <T> xm.t<T> b(xm.e eVar, en.a<T> aVar) {
            if (aVar.getRawType() == this.f14024w) {
                return this.f14025x;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f14024w.getName() + ",adapter=" + this.f14025x + "]";
        }
    }

    /* loaded from: classes4.dex */
    public class x implements xm.u {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Class f14026w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Class f14027x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xm.t f14028y;

        public x(Class cls, Class cls2, xm.t tVar) {
            this.f14026w = cls;
            this.f14027x = cls2;
            this.f14028y = tVar;
        }

        @Override // xm.u
        public <T> xm.t<T> b(xm.e eVar, en.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f14026w || rawType == this.f14027x) {
                return this.f14028y;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f14027x.getName() + "+" + this.f14026w.getName() + ",adapter=" + this.f14028y + "]";
        }
    }

    /* loaded from: classes4.dex */
    public class y implements xm.u {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Class f14029w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Class f14030x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xm.t f14031y;

        public y(Class cls, Class cls2, xm.t tVar) {
            this.f14029w = cls;
            this.f14030x = cls2;
            this.f14031y = tVar;
        }

        @Override // xm.u
        public <T> xm.t<T> b(xm.e eVar, en.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f14029w || rawType == this.f14030x) {
                return this.f14031y;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f14029w.getName() + "+" + this.f14030x.getName() + ",adapter=" + this.f14031y + "]";
        }
    }

    /* loaded from: classes4.dex */
    public class z implements xm.u {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Class f14032w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ xm.t f14033x;

        /* loaded from: classes4.dex */
        public class a extends xm.t<T1> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f14034a;

            public a(Class cls) {
                this.f14034a = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
            @Override // xm.t
            public T1 read(JsonReader jsonReader) throws IOException {
                ?? read = z.this.f14033x.read(jsonReader);
                if (read == 0 || this.f14034a.isInstance(read)) {
                    return read;
                }
                throw new JsonSyntaxException("Expected a " + this.f14034a.getName() + " but was " + read.getClass().getName());
            }

            @Override // xm.t
            public void write(JsonWriter jsonWriter, T1 t12) throws IOException {
                z.this.f14033x.write(jsonWriter, t12);
            }
        }

        public z(Class cls, xm.t tVar) {
            this.f14032w = cls;
            this.f14033x = tVar;
        }

        @Override // xm.u
        public <T2> xm.t<T2> b(xm.e eVar, en.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.f14032w.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f14032w.getName() + ",adapter=" + this.f14033x + "]";
        }
    }

    static {
        xm.t<Class> nullSafe = new k().nullSafe();
        f13991a = nullSafe;
        f13992b = c(Class.class, nullSafe);
        xm.t<BitSet> nullSafe2 = new v().nullSafe();
        f13993c = nullSafe2;
        f13994d = c(BitSet.class, nullSafe2);
        b0 b0Var = new b0();
        f13995e = b0Var;
        f13996f = new c0();
        f13997g = b(Boolean.TYPE, Boolean.class, b0Var);
        d0 d0Var = new d0();
        f13998h = d0Var;
        f13999i = b(Byte.TYPE, Byte.class, d0Var);
        e0 e0Var = new e0();
        f14000j = e0Var;
        f14001k = b(Short.TYPE, Short.class, e0Var);
        f0 f0Var = new f0();
        f14002l = f0Var;
        f14003m = b(Integer.TYPE, Integer.class, f0Var);
        xm.t<AtomicInteger> nullSafe3 = new g0().nullSafe();
        f14004n = nullSafe3;
        f14005o = c(AtomicInteger.class, nullSafe3);
        xm.t<AtomicBoolean> nullSafe4 = new h0().nullSafe();
        f14006p = nullSafe4;
        f14007q = c(AtomicBoolean.class, nullSafe4);
        xm.t<AtomicIntegerArray> nullSafe5 = new a().nullSafe();
        f14008r = nullSafe5;
        f14009s = c(AtomicIntegerArray.class, nullSafe5);
        f14010t = new b();
        f14011u = new c();
        f14012v = new d();
        e eVar = new e();
        f14013w = eVar;
        f14014x = b(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f14015y = fVar;
        f14016z = new g();
        A = new h();
        B = c(String.class, fVar);
        i iVar = new i();
        C = iVar;
        D = c(StringBuilder.class, iVar);
        j jVar = new j();
        E = jVar;
        F = c(StringBuffer.class, jVar);
        l lVar = new l();
        G = lVar;
        H = c(URL.class, lVar);
        m mVar = new m();
        I = mVar;
        J = c(URI.class, mVar);
        C0042n c0042n = new C0042n();
        K = c0042n;
        L = e(InetAddress.class, c0042n);
        o oVar = new o();
        M = oVar;
        N = c(UUID.class, oVar);
        xm.t<Currency> nullSafe6 = new p().nullSafe();
        O = nullSafe6;
        P = c(Currency.class, nullSafe6);
        q qVar = new q();
        Q = qVar;
        R = d(Calendar.class, GregorianCalendar.class, qVar);
        r rVar = new r();
        S = rVar;
        T = c(Locale.class, rVar);
        s sVar = new s();
        U = sVar;
        V = e(xm.k.class, sVar);
        W = new t();
    }

    public static <TT> xm.u a(en.a<TT> aVar, xm.t<TT> tVar) {
        return new u(aVar, tVar);
    }

    public static <TT> xm.u b(Class<TT> cls, Class<TT> cls2, xm.t<? super TT> tVar) {
        return new x(cls, cls2, tVar);
    }

    public static <TT> xm.u c(Class<TT> cls, xm.t<TT> tVar) {
        return new w(cls, tVar);
    }

    public static <TT> xm.u d(Class<TT> cls, Class<? extends TT> cls2, xm.t<? super TT> tVar) {
        return new y(cls, cls2, tVar);
    }

    public static <T1> xm.u e(Class<T1> cls, xm.t<T1> tVar) {
        return new z(cls, tVar);
    }
}
