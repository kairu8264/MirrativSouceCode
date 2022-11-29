package ai;

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
public final class ji3 {
    public static final ji3 zzA;
    public static final ji3 zzB;
    public static final ji3 zzC;
    public static final ji3 zzD;
    public static final ji3 zzE;
    public static final ji3 zzF;
    public static final ji3 zzG;
    public static final ji3 zzH;
    public static final ji3 zzI;
    public static final ji3 zzJ;
    public static final ji3 zzK;
    public static final ji3 zzL;
    public static final ji3 zzM;
    public static final ji3 zzN;
    public static final ji3 zzO;
    public static final ji3 zzP;
    public static final ji3 zzQ;
    public static final ji3 zzR;
    public static final ji3 zzS;
    public static final ji3 zzT;
    public static final ji3 zzU;
    public static final ji3 zzV;
    public static final ji3 zzW;
    public static final ji3 zzX;
    public static final ji3 zzY;
    public static final ji3 zza;
    private static final ji3[] zzac;
    private static final /* synthetic */ ji3[] zzad;
    public static final ji3 zzb;
    public static final ji3 zzc;
    public static final ji3 zzd;
    public static final ji3 zze;
    public static final ji3 zzf;
    public static final ji3 zzg;
    public static final ji3 zzh;
    public static final ji3 zzi;
    public static final ji3 zzj;
    public static final ji3 zzk;
    public static final ji3 zzl;
    public static final ji3 zzm;
    public static final ji3 zzn;
    public static final ji3 zzo;
    public static final ji3 zzp;
    public static final ji3 zzq;
    public static final ji3 zzr;
    public static final ji3 zzs;
    public static final ji3 zzt;
    public static final ji3 zzu;
    public static final ji3 zzv;
    public static final ji3 zzw;
    public static final ji3 zzx;
    public static final ji3 zzy;
    public static final ji3 zzz;
    private final dj3 zzZ;
    private final int zzaa;
    private final Class<?> zzab;

    static {
        dj3 dj3Var = dj3.zze;
        ji3 ji3Var = new ji3("DOUBLE", 0, 0, 1, dj3Var);
        zza = ji3Var;
        dj3 dj3Var2 = dj3.zzd;
        ji3 ji3Var2 = new ji3("FLOAT", 1, 1, 1, dj3Var2);
        zzb = ji3Var2;
        dj3 dj3Var3 = dj3.zzc;
        ji3 ji3Var3 = new ji3("INT64", 2, 2, 1, dj3Var3);
        zzc = ji3Var3;
        ji3 ji3Var4 = new ji3("UINT64", 3, 3, 1, dj3Var3);
        zzd = ji3Var4;
        dj3 dj3Var4 = dj3.zzb;
        ji3 ji3Var5 = new ji3("INT32", 4, 4, 1, dj3Var4);
        zze = ji3Var5;
        ji3 ji3Var6 = new ji3("FIXED64", 5, 5, 1, dj3Var3);
        zzf = ji3Var6;
        ji3 ji3Var7 = new ji3("FIXED32", 6, 6, 1, dj3Var4);
        zzg = ji3Var7;
        dj3 dj3Var5 = dj3.zzf;
        ji3 ji3Var8 = new ji3("BOOL", 7, 7, 1, dj3Var5);
        zzh = ji3Var8;
        dj3 dj3Var6 = dj3.zzg;
        ji3 ji3Var9 = new ji3("STRING", 8, 8, 1, dj3Var6);
        zzi = ji3Var9;
        dj3 dj3Var7 = dj3.zzj;
        ji3 ji3Var10 = new ji3("MESSAGE", 9, 9, 1, dj3Var7);
        zzj = ji3Var10;
        dj3 dj3Var8 = dj3.zzh;
        ji3 ji3Var11 = new ji3("BYTES", 10, 10, 1, dj3Var8);
        zzk = ji3Var11;
        ji3 ji3Var12 = new ji3("UINT32", 11, 11, 1, dj3Var4);
        zzl = ji3Var12;
        dj3 dj3Var9 = dj3.zzi;
        ji3 ji3Var13 = new ji3("ENUM", 12, 12, 1, dj3Var9);
        zzm = ji3Var13;
        ji3 ji3Var14 = new ji3("SFIXED32", 13, 13, 1, dj3Var4);
        zzn = ji3Var14;
        ji3 ji3Var15 = new ji3("SFIXED64", 14, 14, 1, dj3Var3);
        zzo = ji3Var15;
        ji3 ji3Var16 = new ji3("SINT32", 15, 15, 1, dj3Var4);
        zzp = ji3Var16;
        ji3 ji3Var17 = new ji3("SINT64", 16, 16, 1, dj3Var3);
        zzq = ji3Var17;
        ji3 ji3Var18 = new ji3("GROUP", 17, 17, 1, dj3Var7);
        zzr = ji3Var18;
        ji3 ji3Var19 = new ji3("DOUBLE_LIST", 18, 18, 2, dj3Var);
        zzs = ji3Var19;
        ji3 ji3Var20 = new ji3("FLOAT_LIST", 19, 19, 2, dj3Var2);
        zzt = ji3Var20;
        ji3 ji3Var21 = new ji3("INT64_LIST", 20, 20, 2, dj3Var3);
        zzu = ji3Var21;
        ji3 ji3Var22 = new ji3("UINT64_LIST", 21, 21, 2, dj3Var3);
        zzv = ji3Var22;
        ji3 ji3Var23 = new ji3("INT32_LIST", 22, 22, 2, dj3Var4);
        zzw = ji3Var23;
        ji3 ji3Var24 = new ji3("FIXED64_LIST", 23, 23, 2, dj3Var3);
        zzx = ji3Var24;
        ji3 ji3Var25 = new ji3("FIXED32_LIST", 24, 24, 2, dj3Var4);
        zzy = ji3Var25;
        ji3 ji3Var26 = new ji3("BOOL_LIST", 25, 25, 2, dj3Var5);
        zzz = ji3Var26;
        ji3 ji3Var27 = new ji3("STRING_LIST", 26, 26, 2, dj3Var6);
        zzA = ji3Var27;
        ji3 ji3Var28 = new ji3("MESSAGE_LIST", 27, 27, 2, dj3Var7);
        zzB = ji3Var28;
        ji3 ji3Var29 = new ji3("BYTES_LIST", 28, 28, 2, dj3Var8);
        zzC = ji3Var29;
        ji3 ji3Var30 = new ji3("UINT32_LIST", 29, 29, 2, dj3Var4);
        zzD = ji3Var30;
        ji3 ji3Var31 = new ji3("ENUM_LIST", 30, 30, 2, dj3Var9);
        zzE = ji3Var31;
        ji3 ji3Var32 = new ji3("SFIXED32_LIST", 31, 31, 2, dj3Var4);
        zzF = ji3Var32;
        ji3 ji3Var33 = new ji3("SFIXED64_LIST", 32, 32, 2, dj3Var3);
        zzG = ji3Var33;
        ji3 ji3Var34 = new ji3("SINT32_LIST", 33, 33, 2, dj3Var4);
        zzH = ji3Var34;
        ji3 ji3Var35 = new ji3("SINT64_LIST", 34, 34, 2, dj3Var3);
        zzI = ji3Var35;
        ji3 ji3Var36 = new ji3("DOUBLE_LIST_PACKED", 35, 35, 3, dj3Var);
        zzJ = ji3Var36;
        ji3 ji3Var37 = new ji3("FLOAT_LIST_PACKED", 36, 36, 3, dj3Var2);
        zzK = ji3Var37;
        ji3 ji3Var38 = new ji3("INT64_LIST_PACKED", 37, 37, 3, dj3Var3);
        zzL = ji3Var38;
        ji3 ji3Var39 = new ji3("UINT64_LIST_PACKED", 38, 38, 3, dj3Var3);
        zzM = ji3Var39;
        ji3 ji3Var40 = new ji3("INT32_LIST_PACKED", 39, 39, 3, dj3Var4);
        zzN = ji3Var40;
        ji3 ji3Var41 = new ji3("FIXED64_LIST_PACKED", 40, 40, 3, dj3Var3);
        zzO = ji3Var41;
        ji3 ji3Var42 = new ji3("FIXED32_LIST_PACKED", 41, 41, 3, dj3Var4);
        zzP = ji3Var42;
        ji3 ji3Var43 = new ji3("BOOL_LIST_PACKED", 42, 42, 3, dj3Var5);
        zzQ = ji3Var43;
        ji3 ji3Var44 = new ji3("UINT32_LIST_PACKED", 43, 43, 3, dj3Var4);
        zzR = ji3Var44;
        ji3 ji3Var45 = new ji3("ENUM_LIST_PACKED", 44, 44, 3, dj3Var9);
        zzS = ji3Var45;
        ji3 ji3Var46 = new ji3("SFIXED32_LIST_PACKED", 45, 45, 3, dj3Var4);
        zzT = ji3Var46;
        ji3 ji3Var47 = new ji3("SFIXED64_LIST_PACKED", 46, 46, 3, dj3Var3);
        zzU = ji3Var47;
        ji3 ji3Var48 = new ji3("SINT32_LIST_PACKED", 47, 47, 3, dj3Var4);
        zzV = ji3Var48;
        ji3 ji3Var49 = new ji3("SINT64_LIST_PACKED", 48, 48, 3, dj3Var3);
        zzW = ji3Var49;
        ji3 ji3Var50 = new ji3("GROUP_LIST", 49, 49, 2, dj3Var7);
        zzX = ji3Var50;
        ji3 ji3Var51 = new ji3("MAP", 50, 50, 4, dj3.zza);
        zzY = ji3Var51;
        zzad = new ji3[]{ji3Var, ji3Var2, ji3Var3, ji3Var4, ji3Var5, ji3Var6, ji3Var7, ji3Var8, ji3Var9, ji3Var10, ji3Var11, ji3Var12, ji3Var13, ji3Var14, ji3Var15, ji3Var16, ji3Var17, ji3Var18, ji3Var19, ji3Var20, ji3Var21, ji3Var22, ji3Var23, ji3Var24, ji3Var25, ji3Var26, ji3Var27, ji3Var28, ji3Var29, ji3Var30, ji3Var31, ji3Var32, ji3Var33, ji3Var34, ji3Var35, ji3Var36, ji3Var37, ji3Var38, ji3Var39, ji3Var40, ji3Var41, ji3Var42, ji3Var43, ji3Var44, ji3Var45, ji3Var46, ji3Var47, ji3Var48, ji3Var49, ji3Var50, ji3Var51};
        ji3[] values = values();
        zzac = new ji3[values.length];
        for (ji3 ji3Var52 : values) {
            zzac[ji3Var52.zzaa] = ji3Var52;
        }
    }

    public ji3(String str, int i10, int i11, int i12, dj3 dj3Var) {
        this.zzaa = i11;
        this.zzZ = dj3Var;
        dj3 dj3Var2 = dj3.zza;
        int i13 = i12 - 1;
        if (i13 == 1) {
            this.zzab = dj3Var.a();
        } else if (i13 != 3) {
            this.zzab = null;
        } else {
            this.zzab = dj3Var.a();
        }
        if (i12 == 1) {
            dj3Var.ordinal();
        }
    }

    public static ji3[] values() {
        return (ji3[]) zzad.clone();
    }

    public final int zza() {
        return this.zzaa;
    }
}
