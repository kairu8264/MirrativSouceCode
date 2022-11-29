package hi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zza uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class m8 {
    public static final m8 zzA;
    public static final m8 zzB;
    public static final m8 zzC;
    public static final m8 zzD;
    public static final m8 zzE;
    public static final m8 zzF;
    public static final m8 zzG;
    public static final m8 zzH;
    public static final m8 zzI;
    public static final m8 zzJ;
    public static final m8 zzK;
    public static final m8 zzL;
    public static final m8 zzM;
    public static final m8 zzN;
    public static final m8 zzO;
    public static final m8 zzP;
    public static final m8 zzQ;
    public static final m8 zzR;
    public static final m8 zzS;
    public static final m8 zzT;
    public static final m8 zzU;
    public static final m8 zzV;
    public static final m8 zzW;
    public static final m8 zzX;
    public static final m8 zzY;
    private static final m8[] zzZ;
    public static final m8 zza;
    private static final /* synthetic */ m8[] zzaa;
    public static final m8 zzb;
    public static final m8 zzc;
    public static final m8 zzd;
    public static final m8 zze;
    public static final m8 zzf;
    public static final m8 zzg;
    public static final m8 zzh;
    public static final m8 zzi;
    public static final m8 zzj;
    public static final m8 zzk;
    public static final m8 zzl;
    public static final m8 zzm;
    public static final m8 zzn;
    public static final m8 zzo;
    public static final m8 zzp;
    public static final m8 zzq;
    public static final m8 zzr;
    public static final m8 zzs;
    public static final m8 zzt;
    public static final m8 zzu;
    public static final m8 zzv;
    public static final m8 zzw;
    public static final m8 zzx;
    public static final m8 zzy;
    public static final m8 zzz;
    private final c9 zzab;
    private final int zzac;
    private final Class<?> zzad;

    static {
        c9 c9Var = c9.zze;
        m8 m8Var = new m8("DOUBLE", 0, 0, 1, c9Var);
        zza = m8Var;
        c9 c9Var2 = c9.zzd;
        m8 m8Var2 = new m8("FLOAT", 1, 1, 1, c9Var2);
        zzb = m8Var2;
        c9 c9Var3 = c9.zzc;
        m8 m8Var3 = new m8("INT64", 2, 2, 1, c9Var3);
        zzc = m8Var3;
        m8 m8Var4 = new m8("UINT64", 3, 3, 1, c9Var3);
        zzd = m8Var4;
        c9 c9Var4 = c9.zzb;
        m8 m8Var5 = new m8("INT32", 4, 4, 1, c9Var4);
        zze = m8Var5;
        m8 m8Var6 = new m8("FIXED64", 5, 5, 1, c9Var3);
        zzf = m8Var6;
        m8 m8Var7 = new m8("FIXED32", 6, 6, 1, c9Var4);
        zzg = m8Var7;
        c9 c9Var5 = c9.zzf;
        m8 m8Var8 = new m8("BOOL", 7, 7, 1, c9Var5);
        zzh = m8Var8;
        c9 c9Var6 = c9.zzg;
        m8 m8Var9 = new m8("STRING", 8, 8, 1, c9Var6);
        zzi = m8Var9;
        c9 c9Var7 = c9.zzj;
        m8 m8Var10 = new m8("MESSAGE", 9, 9, 1, c9Var7);
        zzj = m8Var10;
        c9 c9Var8 = c9.zzh;
        m8 m8Var11 = new m8("BYTES", 10, 10, 1, c9Var8);
        zzk = m8Var11;
        m8 m8Var12 = new m8("UINT32", 11, 11, 1, c9Var4);
        zzl = m8Var12;
        c9 c9Var9 = c9.zzi;
        m8 m8Var13 = new m8("ENUM", 12, 12, 1, c9Var9);
        zzm = m8Var13;
        m8 m8Var14 = new m8("SFIXED32", 13, 13, 1, c9Var4);
        zzn = m8Var14;
        m8 m8Var15 = new m8("SFIXED64", 14, 14, 1, c9Var3);
        zzo = m8Var15;
        m8 m8Var16 = new m8("SINT32", 15, 15, 1, c9Var4);
        zzp = m8Var16;
        m8 m8Var17 = new m8("SINT64", 16, 16, 1, c9Var3);
        zzq = m8Var17;
        m8 m8Var18 = new m8("GROUP", 17, 17, 1, c9Var7);
        zzr = m8Var18;
        m8 m8Var19 = new m8("DOUBLE_LIST", 18, 18, 2, c9Var);
        zzs = m8Var19;
        m8 m8Var20 = new m8("FLOAT_LIST", 19, 19, 2, c9Var2);
        zzt = m8Var20;
        m8 m8Var21 = new m8("INT64_LIST", 20, 20, 2, c9Var3);
        zzu = m8Var21;
        m8 m8Var22 = new m8("UINT64_LIST", 21, 21, 2, c9Var3);
        zzv = m8Var22;
        m8 m8Var23 = new m8("INT32_LIST", 22, 22, 2, c9Var4);
        zzw = m8Var23;
        m8 m8Var24 = new m8("FIXED64_LIST", 23, 23, 2, c9Var3);
        zzx = m8Var24;
        m8 m8Var25 = new m8("FIXED32_LIST", 24, 24, 2, c9Var4);
        zzy = m8Var25;
        m8 m8Var26 = new m8("BOOL_LIST", 25, 25, 2, c9Var5);
        zzz = m8Var26;
        m8 m8Var27 = new m8("STRING_LIST", 26, 26, 2, c9Var6);
        zzA = m8Var27;
        m8 m8Var28 = new m8("MESSAGE_LIST", 27, 27, 2, c9Var7);
        zzB = m8Var28;
        m8 m8Var29 = new m8("BYTES_LIST", 28, 28, 2, c9Var8);
        zzC = m8Var29;
        m8 m8Var30 = new m8("UINT32_LIST", 29, 29, 2, c9Var4);
        zzD = m8Var30;
        m8 m8Var31 = new m8("ENUM_LIST", 30, 30, 2, c9Var9);
        zzE = m8Var31;
        m8 m8Var32 = new m8("SFIXED32_LIST", 31, 31, 2, c9Var4);
        zzF = m8Var32;
        m8 m8Var33 = new m8("SFIXED64_LIST", 32, 32, 2, c9Var3);
        zzG = m8Var33;
        m8 m8Var34 = new m8("SINT32_LIST", 33, 33, 2, c9Var4);
        zzH = m8Var34;
        m8 m8Var35 = new m8("SINT64_LIST", 34, 34, 2, c9Var3);
        zzI = m8Var35;
        m8 m8Var36 = new m8("DOUBLE_LIST_PACKED", 35, 35, 3, c9Var);
        zzJ = m8Var36;
        m8 m8Var37 = new m8("FLOAT_LIST_PACKED", 36, 36, 3, c9Var2);
        zzK = m8Var37;
        m8 m8Var38 = new m8("INT64_LIST_PACKED", 37, 37, 3, c9Var3);
        zzL = m8Var38;
        m8 m8Var39 = new m8("UINT64_LIST_PACKED", 38, 38, 3, c9Var3);
        zzM = m8Var39;
        m8 m8Var40 = new m8("INT32_LIST_PACKED", 39, 39, 3, c9Var4);
        zzN = m8Var40;
        m8 m8Var41 = new m8("FIXED64_LIST_PACKED", 40, 40, 3, c9Var3);
        zzO = m8Var41;
        m8 m8Var42 = new m8("FIXED32_LIST_PACKED", 41, 41, 3, c9Var4);
        zzP = m8Var42;
        m8 m8Var43 = new m8("BOOL_LIST_PACKED", 42, 42, 3, c9Var5);
        zzQ = m8Var43;
        m8 m8Var44 = new m8("UINT32_LIST_PACKED", 43, 43, 3, c9Var4);
        zzR = m8Var44;
        m8 m8Var45 = new m8("ENUM_LIST_PACKED", 44, 44, 3, c9Var9);
        zzS = m8Var45;
        m8 m8Var46 = new m8("SFIXED32_LIST_PACKED", 45, 45, 3, c9Var4);
        zzT = m8Var46;
        m8 m8Var47 = new m8("SFIXED64_LIST_PACKED", 46, 46, 3, c9Var3);
        zzU = m8Var47;
        m8 m8Var48 = new m8("SINT32_LIST_PACKED", 47, 47, 3, c9Var4);
        zzV = m8Var48;
        m8 m8Var49 = new m8("SINT64_LIST_PACKED", 48, 48, 3, c9Var3);
        zzW = m8Var49;
        m8 m8Var50 = new m8("GROUP_LIST", 49, 49, 2, c9Var7);
        zzX = m8Var50;
        m8 m8Var51 = new m8("MAP", 50, 50, 4, c9.zza);
        zzY = m8Var51;
        zzaa = new m8[]{m8Var, m8Var2, m8Var3, m8Var4, m8Var5, m8Var6, m8Var7, m8Var8, m8Var9, m8Var10, m8Var11, m8Var12, m8Var13, m8Var14, m8Var15, m8Var16, m8Var17, m8Var18, m8Var19, m8Var20, m8Var21, m8Var22, m8Var23, m8Var24, m8Var25, m8Var26, m8Var27, m8Var28, m8Var29, m8Var30, m8Var31, m8Var32, m8Var33, m8Var34, m8Var35, m8Var36, m8Var37, m8Var38, m8Var39, m8Var40, m8Var41, m8Var42, m8Var43, m8Var44, m8Var45, m8Var46, m8Var47, m8Var48, m8Var49, m8Var50, m8Var51};
        m8[] values = values();
        zzZ = new m8[values.length];
        for (m8 m8Var52 : values) {
            zzZ[m8Var52.zzac] = m8Var52;
        }
    }

    public m8(String str, int i10, int i11, int i12, c9 c9Var) {
        this.zzac = i11;
        this.zzab = c9Var;
        c9 c9Var2 = c9.zza;
        int i13 = i12 - 1;
        if (i13 == 1) {
            this.zzad = c9Var.a();
        } else if (i13 != 3) {
            this.zzad = null;
        } else {
            this.zzad = c9Var.a();
        }
        if (i12 == 1) {
            c9Var.ordinal();
        }
    }

    public static m8[] values() {
        return (m8[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
