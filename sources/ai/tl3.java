package ai;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class tl3 {
    public static final tl3 zza;
    public static final tl3 zzb;
    public static final tl3 zzc;
    public static final tl3 zzd;
    public static final tl3 zze;
    public static final tl3 zzf;
    public static final tl3 zzg;
    public static final tl3 zzh;
    public static final tl3 zzi;
    public static final tl3 zzj;
    public static final tl3 zzk;
    public static final tl3 zzl;
    public static final tl3 zzm;
    public static final tl3 zzn;
    public static final tl3 zzo;
    public static final tl3 zzp;
    public static final tl3 zzq;
    public static final tl3 zzr;
    private static final /* synthetic */ tl3[] zzt;
    private final ul3 zzs;

    static {
        tl3 tl3Var = new tl3("DOUBLE", 0, ul3.DOUBLE, 1);
        zza = tl3Var;
        tl3 tl3Var2 = new tl3("FLOAT", 1, ul3.FLOAT, 5);
        zzb = tl3Var2;
        ul3 ul3Var = ul3.LONG;
        tl3 tl3Var3 = new tl3("INT64", 2, ul3Var, 0);
        zzc = tl3Var3;
        tl3 tl3Var4 = new tl3("UINT64", 3, ul3Var, 0);
        zzd = tl3Var4;
        ul3 ul3Var2 = ul3.INT;
        tl3 tl3Var5 = new tl3("INT32", 4, ul3Var2, 0);
        zze = tl3Var5;
        tl3 tl3Var6 = new tl3("FIXED64", 5, ul3Var, 1);
        zzf = tl3Var6;
        tl3 tl3Var7 = new tl3("FIXED32", 6, ul3Var2, 5);
        zzg = tl3Var7;
        tl3 tl3Var8 = new tl3("BOOL", 7, ul3.BOOLEAN, 0);
        zzh = tl3Var8;
        tl3 tl3Var9 = new tl3("STRING", 8, ul3.STRING, 2);
        zzi = tl3Var9;
        ul3 ul3Var3 = ul3.MESSAGE;
        tl3 tl3Var10 = new tl3("GROUP", 9, ul3Var3, 3);
        zzj = tl3Var10;
        tl3 tl3Var11 = new tl3("MESSAGE", 10, ul3Var3, 2);
        zzk = tl3Var11;
        tl3 tl3Var12 = new tl3("BYTES", 11, ul3.BYTE_STRING, 2);
        zzl = tl3Var12;
        tl3 tl3Var13 = new tl3("UINT32", 12, ul3Var2, 0);
        zzm = tl3Var13;
        tl3 tl3Var14 = new tl3("ENUM", 13, ul3.ENUM, 0);
        zzn = tl3Var14;
        tl3 tl3Var15 = new tl3("SFIXED32", 14, ul3Var2, 5);
        zzo = tl3Var15;
        tl3 tl3Var16 = new tl3("SFIXED64", 15, ul3Var, 1);
        zzp = tl3Var16;
        tl3 tl3Var17 = new tl3("SINT32", 16, ul3Var2, 0);
        zzq = tl3Var17;
        tl3 tl3Var18 = new tl3("SINT64", 17, ul3Var, 0);
        zzr = tl3Var18;
        zzt = new tl3[]{tl3Var, tl3Var2, tl3Var3, tl3Var4, tl3Var5, tl3Var6, tl3Var7, tl3Var8, tl3Var9, tl3Var10, tl3Var11, tl3Var12, tl3Var13, tl3Var14, tl3Var15, tl3Var16, tl3Var17, tl3Var18};
    }

    public tl3(String str, int i10, ul3 ul3Var, int i11) {
        this.zzs = ul3Var;
    }

    public static tl3[] values() {
        return (tl3[]) zzt.clone();
    }

    public final ul3 a() {
        return this.zzs;
    }
}
