package fn;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h BOOLEAN;
    public static final h BYTE_STRING;
    public static final h DOUBLE;
    public static final h ENUM;
    public static final h FLOAT;
    public static final h INT;
    public static final h LONG;
    public static final h MESSAGE;
    public static final h STRING;
    public static final h VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        h hVar = new h("VOID", 0, Void.class, Void.class, null);
        VOID = hVar;
        Class cls = Integer.TYPE;
        h hVar2 = new h("INT", 1, cls, Integer.class, 0);
        INT = hVar2;
        h hVar3 = new h("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = hVar3;
        h hVar4 = new h("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = hVar4;
        h hVar5 = new h("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = hVar5;
        h hVar6 = new h("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = hVar6;
        h hVar7 = new h("STRING", 6, String.class, String.class, "");
        STRING = hVar7;
        h hVar8 = new h("BYTE_STRING", 7, com.google.protobuf.f.class, com.google.protobuf.f.class, com.google.protobuf.f.f28094x);
        BYTE_STRING = hVar8;
        h hVar9 = new h("ENUM", 8, cls, Integer.class, null);
        ENUM = hVar9;
        h hVar10 = new h("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = hVar10;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10};
    }

    public h(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public Class<?> a() {
        return this.boxedType;
    }
}
