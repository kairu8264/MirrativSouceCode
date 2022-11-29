package hi;

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
public final class lb {
    public static final lb zza;
    public static final lb zzb;
    public static final lb zzc;
    public static final lb zzd;
    public static final lb zze;
    public static final lb zzf;
    public static final lb zzg;
    public static final lb zzh;
    public static final lb zzi;
    public static final lb zzj;
    public static final lb zzk;
    public static final lb zzl;
    public static final lb zzm;
    public static final lb zzn;
    public static final lb zzo;
    public static final lb zzp;
    public static final lb zzq;
    public static final lb zzr;
    private static final /* synthetic */ lb[] zzs;
    private final mb zzt;

    static {
        lb lbVar = new lb("DOUBLE", 0, mb.DOUBLE, 1);
        zza = lbVar;
        lb lbVar2 = new lb("FLOAT", 1, mb.FLOAT, 5);
        zzb = lbVar2;
        mb mbVar = mb.LONG;
        lb lbVar3 = new lb("INT64", 2, mbVar, 0);
        zzc = lbVar3;
        lb lbVar4 = new lb("UINT64", 3, mbVar, 0);
        zzd = lbVar4;
        mb mbVar2 = mb.INT;
        lb lbVar5 = new lb("INT32", 4, mbVar2, 0);
        zze = lbVar5;
        lb lbVar6 = new lb("FIXED64", 5, mbVar, 1);
        zzf = lbVar6;
        lb lbVar7 = new lb("FIXED32", 6, mbVar2, 5);
        zzg = lbVar7;
        lb lbVar8 = new lb("BOOL", 7, mb.BOOLEAN, 0);
        zzh = lbVar8;
        lb lbVar9 = new lb("STRING", 8, mb.STRING, 2);
        zzi = lbVar9;
        mb mbVar3 = mb.MESSAGE;
        lb lbVar10 = new lb("GROUP", 9, mbVar3, 3);
        zzj = lbVar10;
        lb lbVar11 = new lb("MESSAGE", 10, mbVar3, 2);
        zzk = lbVar11;
        lb lbVar12 = new lb("BYTES", 11, mb.BYTE_STRING, 2);
        zzl = lbVar12;
        lb lbVar13 = new lb("UINT32", 12, mbVar2, 0);
        zzm = lbVar13;
        lb lbVar14 = new lb("ENUM", 13, mb.ENUM, 0);
        zzn = lbVar14;
        lb lbVar15 = new lb("SFIXED32", 14, mbVar2, 5);
        zzo = lbVar15;
        lb lbVar16 = new lb("SFIXED64", 15, mbVar, 1);
        zzp = lbVar16;
        lb lbVar17 = new lb("SINT32", 16, mbVar2, 0);
        zzq = lbVar17;
        lb lbVar18 = new lb("SINT64", 17, mbVar, 0);
        zzr = lbVar18;
        zzs = new lb[]{lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9, lbVar10, lbVar11, lbVar12, lbVar13, lbVar14, lbVar15, lbVar16, lbVar17, lbVar18};
    }

    public lb(String str, int i10, mb mbVar, int i11) {
        this.zzt = mbVar;
    }

    public static lb[] values() {
        return (lb[]) zzs.clone();
    }

    public final mb a() {
        return this.zzt;
    }
}
