package fn;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DOUBLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e BOOL;
    public static final e BOOL_LIST;
    public static final e BOOL_LIST_PACKED;
    public static final e BYTES;
    public static final e BYTES_LIST;
    public static final e DOUBLE;
    public static final e DOUBLE_LIST;
    public static final e DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final e ENUM;
    public static final e ENUM_LIST;
    public static final e ENUM_LIST_PACKED;
    public static final e FIXED32;
    public static final e FIXED32_LIST;
    public static final e FIXED32_LIST_PACKED;
    public static final e FIXED64;
    public static final e FIXED64_LIST;
    public static final e FIXED64_LIST_PACKED;
    public static final e FLOAT;
    public static final e FLOAT_LIST;
    public static final e FLOAT_LIST_PACKED;
    public static final e GROUP;
    public static final e GROUP_LIST;
    public static final e INT32;
    public static final e INT32_LIST;
    public static final e INT32_LIST_PACKED;
    public static final e INT64;
    public static final e INT64_LIST;
    public static final e INT64_LIST_PACKED;
    public static final e MAP;
    public static final e MESSAGE;
    public static final e MESSAGE_LIST;
    public static final e SFIXED32;
    public static final e SFIXED32_LIST;
    public static final e SFIXED32_LIST_PACKED;
    public static final e SFIXED64;
    public static final e SFIXED64_LIST;
    public static final e SFIXED64_LIST_PACKED;
    public static final e SINT32;
    public static final e SINT32_LIST;
    public static final e SINT32_LIST_PACKED;
    public static final e SINT64;
    public static final e SINT64_LIST;
    public static final e SINT64_LIST_PACKED;
    public static final e STRING;
    public static final e STRING_LIST;
    public static final e UINT32;
    public static final e UINT32_LIST;
    public static final e UINT32_LIST_PACKED;
    public static final e UINT64;
    public static final e UINT64_LIST;
    public static final e UINT64_LIST_PACKED;
    private static final e[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id  reason: collision with root package name */
    private final int f32087id;
    private final h javaType;
    private final boolean primitiveScalar;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32088a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f32089b;

        static {
            int[] iArr = new int[h.values().length];
            f32089b = iArr;
            try {
                iArr[h.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32089b[h.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32089b[h.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f32088a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32088a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32088a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean isList;

        b(boolean z10) {
            this.isList = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        h hVar = h.DOUBLE;
        e eVar = new e("DOUBLE", 0, 0, bVar, hVar);
        DOUBLE = eVar;
        h hVar2 = h.FLOAT;
        e eVar2 = new e("FLOAT", 1, 1, bVar, hVar2);
        FLOAT = eVar2;
        h hVar3 = h.LONG;
        e eVar3 = new e("INT64", 2, 2, bVar, hVar3);
        INT64 = eVar3;
        e eVar4 = new e("UINT64", 3, 3, bVar, hVar3);
        UINT64 = eVar4;
        h hVar4 = h.INT;
        e eVar5 = new e("INT32", 4, 4, bVar, hVar4);
        INT32 = eVar5;
        e eVar6 = new e("FIXED64", 5, 5, bVar, hVar3);
        FIXED64 = eVar6;
        e eVar7 = new e("FIXED32", 6, 6, bVar, hVar4);
        FIXED32 = eVar7;
        h hVar5 = h.BOOLEAN;
        e eVar8 = new e("BOOL", 7, 7, bVar, hVar5);
        BOOL = eVar8;
        h hVar6 = h.STRING;
        e eVar9 = new e("STRING", 8, 8, bVar, hVar6);
        STRING = eVar9;
        h hVar7 = h.MESSAGE;
        e eVar10 = new e("MESSAGE", 9, 9, bVar, hVar7);
        MESSAGE = eVar10;
        h hVar8 = h.BYTE_STRING;
        e eVar11 = new e("BYTES", 10, 10, bVar, hVar8);
        BYTES = eVar11;
        e eVar12 = new e("UINT32", 11, 11, bVar, hVar4);
        UINT32 = eVar12;
        h hVar9 = h.ENUM;
        e eVar13 = new e("ENUM", 12, 12, bVar, hVar9);
        ENUM = eVar13;
        e eVar14 = new e("SFIXED32", 13, 13, bVar, hVar4);
        SFIXED32 = eVar14;
        e eVar15 = new e("SFIXED64", 14, 14, bVar, hVar3);
        SFIXED64 = eVar15;
        e eVar16 = new e("SINT32", 15, 15, bVar, hVar4);
        SINT32 = eVar16;
        e eVar17 = new e("SINT64", 16, 16, bVar, hVar3);
        SINT64 = eVar17;
        e eVar18 = new e("GROUP", 17, 17, bVar, hVar7);
        GROUP = eVar18;
        b bVar2 = b.VECTOR;
        e eVar19 = new e("DOUBLE_LIST", 18, 18, bVar2, hVar);
        DOUBLE_LIST = eVar19;
        e eVar20 = new e("FLOAT_LIST", 19, 19, bVar2, hVar2);
        FLOAT_LIST = eVar20;
        e eVar21 = new e("INT64_LIST", 20, 20, bVar2, hVar3);
        INT64_LIST = eVar21;
        e eVar22 = new e("UINT64_LIST", 21, 21, bVar2, hVar3);
        UINT64_LIST = eVar22;
        e eVar23 = new e("INT32_LIST", 22, 22, bVar2, hVar4);
        INT32_LIST = eVar23;
        e eVar24 = new e("FIXED64_LIST", 23, 23, bVar2, hVar3);
        FIXED64_LIST = eVar24;
        e eVar25 = new e("FIXED32_LIST", 24, 24, bVar2, hVar4);
        FIXED32_LIST = eVar25;
        e eVar26 = new e("BOOL_LIST", 25, 25, bVar2, hVar5);
        BOOL_LIST = eVar26;
        e eVar27 = new e("STRING_LIST", 26, 26, bVar2, hVar6);
        STRING_LIST = eVar27;
        e eVar28 = new e("MESSAGE_LIST", 27, 27, bVar2, hVar7);
        MESSAGE_LIST = eVar28;
        e eVar29 = new e("BYTES_LIST", 28, 28, bVar2, hVar8);
        BYTES_LIST = eVar29;
        e eVar30 = new e("UINT32_LIST", 29, 29, bVar2, hVar4);
        UINT32_LIST = eVar30;
        e eVar31 = new e("ENUM_LIST", 30, 30, bVar2, hVar9);
        ENUM_LIST = eVar31;
        e eVar32 = new e("SFIXED32_LIST", 31, 31, bVar2, hVar4);
        SFIXED32_LIST = eVar32;
        e eVar33 = new e("SFIXED64_LIST", 32, 32, bVar2, hVar3);
        SFIXED64_LIST = eVar33;
        e eVar34 = new e("SINT32_LIST", 33, 33, bVar2, hVar4);
        SINT32_LIST = eVar34;
        e eVar35 = new e("SINT64_LIST", 34, 34, bVar2, hVar3);
        SINT64_LIST = eVar35;
        b bVar3 = b.PACKED_VECTOR;
        e eVar36 = new e("DOUBLE_LIST_PACKED", 35, 35, bVar3, hVar);
        DOUBLE_LIST_PACKED = eVar36;
        e eVar37 = new e("FLOAT_LIST_PACKED", 36, 36, bVar3, hVar2);
        FLOAT_LIST_PACKED = eVar37;
        e eVar38 = new e("INT64_LIST_PACKED", 37, 37, bVar3, hVar3);
        INT64_LIST_PACKED = eVar38;
        e eVar39 = new e("UINT64_LIST_PACKED", 38, 38, bVar3, hVar3);
        UINT64_LIST_PACKED = eVar39;
        e eVar40 = new e("INT32_LIST_PACKED", 39, 39, bVar3, hVar4);
        INT32_LIST_PACKED = eVar40;
        e eVar41 = new e("FIXED64_LIST_PACKED", 40, 40, bVar3, hVar3);
        FIXED64_LIST_PACKED = eVar41;
        e eVar42 = new e("FIXED32_LIST_PACKED", 41, 41, bVar3, hVar4);
        FIXED32_LIST_PACKED = eVar42;
        e eVar43 = new e("BOOL_LIST_PACKED", 42, 42, bVar3, hVar5);
        BOOL_LIST_PACKED = eVar43;
        e eVar44 = new e("UINT32_LIST_PACKED", 43, 43, bVar3, hVar4);
        UINT32_LIST_PACKED = eVar44;
        e eVar45 = new e("ENUM_LIST_PACKED", 44, 44, bVar3, hVar9);
        ENUM_LIST_PACKED = eVar45;
        e eVar46 = new e("SFIXED32_LIST_PACKED", 45, 45, bVar3, hVar4);
        SFIXED32_LIST_PACKED = eVar46;
        e eVar47 = new e("SFIXED64_LIST_PACKED", 46, 46, bVar3, hVar3);
        SFIXED64_LIST_PACKED = eVar47;
        e eVar48 = new e("SINT32_LIST_PACKED", 47, 47, bVar3, hVar4);
        SINT32_LIST_PACKED = eVar48;
        e eVar49 = new e("SINT64_LIST_PACKED", 48, 48, bVar3, hVar3);
        SINT64_LIST_PACKED = eVar49;
        e eVar50 = new e("GROUP_LIST", 49, 49, bVar2, hVar7);
        GROUP_LIST = eVar50;
        e eVar51 = new e("MAP", 50, 50, b.MAP, h.VOID);
        MAP = eVar51;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar36, eVar37, eVar38, eVar39, eVar40, eVar41, eVar42, eVar43, eVar44, eVar45, eVar46, eVar47, eVar48, eVar49, eVar50, eVar51};
        EMPTY_TYPES = new Type[0];
        e[] values = values();
        VALUES = new e[values.length];
        for (e eVar52 : values) {
            VALUES[eVar52.f32087id] = eVar52;
        }
    }

    public e(String str, int i10, int i11, b bVar, h hVar) {
        int i12;
        this.f32087id = i11;
        this.collection = bVar;
        this.javaType = hVar;
        int i13 = a.f32088a[bVar.ordinal()];
        boolean z10 = true;
        if (i13 == 1) {
            this.elementType = hVar.a();
        } else if (i13 != 2) {
            this.elementType = null;
        } else {
            this.elementType = hVar.a();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f32089b[hVar.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : z10;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public int a() {
        return this.f32087id;
    }
}
