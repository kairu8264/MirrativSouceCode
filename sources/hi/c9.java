package hi;

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
public final class c9 {
    public static final c9 zza;
    public static final c9 zzb;
    public static final c9 zzc;
    public static final c9 zzd;
    public static final c9 zze;
    public static final c9 zzf;
    public static final c9 zzg;
    public static final c9 zzh;
    public static final c9 zzi;
    public static final c9 zzj;
    private static final /* synthetic */ c9[] zzk;
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    static {
        c9 c9Var = new c9("VOID", 0, Void.class, Void.class, null);
        zza = c9Var;
        Class cls = Integer.TYPE;
        c9 c9Var2 = new c9("INT", 1, cls, Integer.class, 0);
        zzb = c9Var2;
        c9 c9Var3 = new c9("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = c9Var3;
        c9 c9Var4 = new c9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = c9Var4;
        c9 c9Var5 = new c9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = c9Var5;
        c9 c9Var6 = new c9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = c9Var6;
        c9 c9Var7 = new c9("STRING", 6, String.class, String.class, "");
        zzg = c9Var7;
        c9 c9Var8 = new c9("BYTE_STRING", 7, u7.class, u7.class, u7.f36014x);
        zzh = c9Var8;
        c9 c9Var9 = new c9("ENUM", 8, cls, Integer.class, null);
        zzi = c9Var9;
        c9 c9Var10 = new c9("MESSAGE", 9, Object.class, Object.class, null);
        zzj = c9Var10;
        zzk = new c9[]{c9Var, c9Var2, c9Var3, c9Var4, c9Var5, c9Var6, c9Var7, c9Var8, c9Var9, c9Var10};
    }

    public c9(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static c9[] values() {
        return (c9[]) zzk.clone();
    }

    public final Class<?> a() {
        return this.zzm;
    }
}
