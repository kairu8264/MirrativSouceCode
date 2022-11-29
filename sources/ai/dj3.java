package ai;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class dj3 {
    public static final dj3 zza;
    public static final dj3 zzb;
    public static final dj3 zzc;
    public static final dj3 zzd;
    public static final dj3 zze;
    public static final dj3 zzf;
    public static final dj3 zzg;
    public static final dj3 zzh;
    public static final dj3 zzi;
    public static final dj3 zzj;
    private static final /* synthetic */ dj3[] zzn;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    static {
        dj3 dj3Var = new dj3("VOID", 0, Void.class, Void.class, null);
        zza = dj3Var;
        Class cls = Integer.TYPE;
        dj3 dj3Var2 = new dj3("INT", 1, cls, Integer.class, 0);
        zzb = dj3Var2;
        dj3 dj3Var3 = new dj3("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = dj3Var3;
        dj3 dj3Var4 = new dj3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = dj3Var4;
        dj3 dj3Var5 = new dj3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = dj3Var5;
        dj3 dj3Var6 = new dj3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = dj3Var6;
        dj3 dj3Var7 = new dj3("STRING", 6, String.class, String.class, "");
        zzg = dj3Var7;
        dj3 dj3Var8 = new dj3("BYTE_STRING", 7, oh3.class, oh3.class, oh3.f7807x);
        zzh = dj3Var8;
        dj3 dj3Var9 = new dj3("ENUM", 8, cls, Integer.class, null);
        zzi = dj3Var9;
        dj3 dj3Var10 = new dj3("MESSAGE", 9, Object.class, Object.class, null);
        zzj = dj3Var10;
        zzn = new dj3[]{dj3Var, dj3Var2, dj3Var3, dj3Var4, dj3Var5, dj3Var6, dj3Var7, dj3Var8, dj3Var9, dj3Var10};
    }

    public dj3(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public static dj3[] values() {
        return (dj3[]) zzn.clone();
    }

    public final Class<?> a() {
        return this.zzl;
    }
}
