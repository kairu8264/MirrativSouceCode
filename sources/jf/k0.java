package jf;

import com.dena.mirrorman.unity.ClosetFocusType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum GENDER uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class k0 {
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 BACKGROUND;
    public static final k0 BACK_WING;
    public static final k0 BEARD;
    public static final k0 BOTH_WEAPON;
    public static final k0 BOTTOMS;
    public static final k0 CENTER_INTERIOR;
    public static final k0 CHEEK;
    public static final k0 COMPANION;
    public static final k0 COMPANION_HAT;
    public static final k0 COMPANION_SCARF;
    public static final k0 COMPANION_TOPS;
    public static final k0 EARRING;
    public static final k0 EFFECT;
    public static final k0 EYE;
    public static final k0 EYEBROW;
    public static final k0 EYESHADOW;
    public static final k0 FACE_PAINT;
    public static final k0 GENDER;
    public static final k0 GLASSES;
    public static final k0 GLASSES_V2;
    public static final k0 HAIR;
    public static final k0 HAIR_ORNAMENT;
    public static final k0 HAT;
    public static final k0 HAT_V2;
    public static final k0 HEAD;
    public static final k0 HEAD_BAND;
    public static final k0 KEMOMIMI;
    public static final k0 LEFT_INTERIOR;
    public static final k0 LEFT_WEAPON;
    public static final k0 LIP;
    public static final k0 MACHINE;
    public static final k0 MASK;
    public static final k0 MOTION_DOWN;
    public static final k0 MOTION_LEFT;
    public static final k0 MOTION_RIGHT;
    public static final k0 MOTION_UP;
    public static final k0 MOUTH;
    public static final k0 NECKLACE;
    public static final k0 NOSE;
    public static final k0 ONEPIECE;
    public static final k0 PERSONA;
    public static final k0 PET;
    public static final k0 PROPOTION;
    public static final k0 RIGHT_INTERIOR;
    public static final k0 RIGHT_WEAPON;
    public static final k0 SCARF;
    public static final k0 SETUP_CLOTHES;
    public static final k0 SHOES;
    public static final k0 SOCKS;
    public static final k0 TOPS;
    public static final k0 WEAPON;
    public static final k0 WING;
    private final ClosetFocusType closetFocusType;
    private final m0 largeCategory;
    private final int maxRows;
    private final int partsId;
    private final e viewSize;

    static {
        m0 m0Var = m0.GENDER;
        ClosetFocusType closetFocusType = ClosetFocusType.MAIN;
        e eVar = e.LARGE;
        GENDER = new k0("GENDER", 0, -1, m0Var, closetFocusType, eVar, 0, 16, null);
        m0 m0Var2 = m0.MOTION;
        ClosetFocusType closetFocusType2 = ClosetFocusType.MAIN_ZOOMOUT;
        PERSONA = new k0("PERSONA", 1, -1, m0Var2, closetFocusType2, eVar, 0, 16, null);
        MOTION_UP = new k0("MOTION_UP", 2, 55, m0Var2, closetFocusType2, null, 2, 8, null);
        MOTION_LEFT = new k0("MOTION_LEFT", 3, 56, m0Var2, closetFocusType2, null, 2, 8, null);
        MOTION_RIGHT = new k0("MOTION_RIGHT", 4, 57, m0Var2, closetFocusType2, null, 2, 8, null);
        MOTION_DOWN = new k0("MOTION_DOWN", 5, 58, m0Var2, closetFocusType2, null, 2, 8, null);
        m0 m0Var3 = m0.FACE;
        PROPOTION = new k0("PROPOTION", 6, -1, m0Var3, ClosetFocusType.BONE_SCALE, null, 0, 24, null);
        ClosetFocusType closetFocusType3 = ClosetFocusType.FACE;
        HEAD = new k0("HEAD", 7, 1, m0Var3, closetFocusType3, null, 0, 24, null);
        HAIR = new k0("HAIR", 8, 3, m0Var3, closetFocusType3, null, 0, 24, null);
        EYEBROW = new k0("EYEBROW", 9, 17, m0Var3, closetFocusType3, null, 0, 24, null);
        EYE = new k0("EYE", 10, 51, m0Var3, closetFocusType3, null, 0, 24, null);
        EYESHADOW = new k0("EYESHADOW", 11, 34, m0Var3, closetFocusType3, null, 0, 24, null);
        CHEEK = new k0("CHEEK", 12, 33, m0Var3, closetFocusType3, null, 0, 24, null);
        NOSE = new k0("NOSE", 13, 15, m0Var3, closetFocusType3, null, 0, 24, null);
        BEARD = new k0("BEARD", 14, 32, m0Var3, closetFocusType3, null, 0, 24, null);
        MOUTH = new k0("MOUTH", 15, 6, m0Var3, closetFocusType3, null, 0, 24, null);
        LIP = new k0("LIP", 16, 35, m0Var3, closetFocusType3, null, 0, 24, null);
        m0 m0Var4 = m0.ACCESSORY;
        FACE_PAINT = new k0("FACE_PAINT", 17, 16, m0Var4, closetFocusType3, null, 2, 8, null);
        m0 m0Var5 = m0.COSTUME;
        ClosetFocusType closetFocusType4 = ClosetFocusType.SETUP;
        SETUP_CLOTHES = new k0("SETUP_CLOTHES", 18, 8, m0Var5, closetFocusType4, null, 2, 8, null);
        ONEPIECE = new k0("ONEPIECE", 19, 31, m0Var5, closetFocusType4, null, 2, 8, null);
        ClosetFocusType closetFocusType5 = ClosetFocusType.TOPS;
        TOPS = new k0("TOPS", 20, 20, m0Var5, closetFocusType5, null, 2, 8, null);
        BOTTOMS = new k0("BOTTOMS", 21, 21, m0Var5, ClosetFocusType.BOTTOMS, null, 2, 8, null);
        ClosetFocusType closetFocusType6 = ClosetFocusType.FOOT;
        SOCKS = new k0("SOCKS", 22, 22, m0Var5, closetFocusType6, null, 2, 8, null);
        SHOES = new k0("SHOES", 23, 23, m0Var5, closetFocusType6, null, 2, 8, null);
        HAT = new k0("HAT", 24, 12, m0Var4, closetFocusType3, null, 2, 8, null);
        GLASSES = new k0("GLASSES", 25, 13, m0Var4, closetFocusType3, null, 2, 8, null);
        SCARF = new k0("SCARF", 26, 14, m0Var5, closetFocusType5, null, 2, 8, null);
        PET = new k0("PET", 27, 18, m0Var5, closetFocusType4, null, 2, 8, null);
        WEAPON = new k0("WEAPON", 28, 26, m0Var4, closetFocusType4, null, 2, 8, null);
        WING = new k0("WING", 29, 59, m0Var5, closetFocusType4, null, 2, 8, null);
        BACK_WING = new k0("BACK_WING", 30, 71, m0Var5, closetFocusType4, null, 2, 8, null);
        HAT_V2 = new k0("HAT_V2", 31, 81, m0Var4, closetFocusType3, null, 2, 8, null);
        HAIR_ORNAMENT = new k0("HAIR_ORNAMENT", 32, 82, m0Var4, closetFocusType3, null, 2, 8, null);
        HEAD_BAND = new k0("HEAD_BAND", 33, 83, m0Var4, closetFocusType3, null, 2, 8, null);
        GLASSES_V2 = new k0("GLASSES_V2", 34, 84, m0Var4, closetFocusType3, null, 2, 8, null);
        MASK = new k0("MASK", 35, 85, m0Var4, closetFocusType3, null, 2, 8, null);
        EARRING = new k0("EARRING", 36, 86, m0Var4, closetFocusType3, null, 2, 8, null);
        LEFT_WEAPON = new k0("LEFT_WEAPON", 37, 87, m0Var4, closetFocusType4, null, 2, 8, null);
        RIGHT_WEAPON = new k0("RIGHT_WEAPON", 38, 88, m0Var4, closetFocusType4, null, 2, 8, null);
        BOTH_WEAPON = new k0("BOTH_WEAPON", 39, 89, m0Var4, closetFocusType4, null, 2, 8, null);
        KEMOMIMI = new k0("KEMOMIMI", 40, 90, m0Var4, closetFocusType3, null, 2, 8, null);
        NECKLACE = new k0("NECKLACE", 41, 91, m0Var4, closetFocusType3, null, 2, 8, null);
        m0 m0Var6 = m0.COMPANION;
        ClosetFocusType closetFocusType7 = ClosetFocusType.COMPANION;
        COMPANION = new k0("COMPANION", 42, 66, m0Var6, closetFocusType7, null, 0, 24, null);
        COMPANION_TOPS = new k0("COMPANION_TOPS", 43, 67, m0Var6, closetFocusType7, null, 0, 24, null);
        COMPANION_HAT = new k0("COMPANION_HAT", 44, 68, m0Var6, closetFocusType7, null, 0, 24, null);
        COMPANION_SCARF = new k0("COMPANION_SCARF", 45, 69, m0Var6, closetFocusType7, null, 0, 24, null);
        m0 m0Var7 = m0.ROOM;
        BACKGROUND = new k0("BACKGROUND", 46, 11, m0Var7, closetFocusType, null, 2, 8, null);
        EFFECT = new k0("EFFECT", 47, 72, m0Var7, closetFocusType, null, 2, 8, null);
        LEFT_INTERIOR = new k0("LEFT_INTERIOR", 48, 73, m0Var7, ClosetFocusType.LEFT_INTERIOR, null, 2, 8, null);
        CENTER_INTERIOR = new k0("CENTER_INTERIOR", 49, 74, m0Var7, closetFocusType, null, 2, 8, null);
        RIGHT_INTERIOR = new k0("RIGHT_INTERIOR", 50, 75, m0Var7, ClosetFocusType.RIGHT_INTERIOR, null, 2, 8, null);
        MACHINE = new k0("MACHINE", 51, 77, m0.MACHINE, ClosetFocusType.MACHINE, null, 0, 24, null);
        $VALUES = a();
    }

    public k0(String str, int i10, int i11, m0 m0Var, ClosetFocusType closetFocusType, e eVar, int i12) {
        this.partsId = i11;
        this.largeCategory = m0Var;
        this.closetFocusType = closetFocusType;
        this.viewSize = eVar;
        this.maxRows = i12;
    }

    public static final /* synthetic */ k0[] a() {
        return new k0[]{GENDER, PERSONA, MOTION_UP, MOTION_LEFT, MOTION_RIGHT, MOTION_DOWN, PROPOTION, HEAD, HAIR, EYEBROW, EYE, EYESHADOW, CHEEK, NOSE, BEARD, MOUTH, LIP, FACE_PAINT, SETUP_CLOTHES, ONEPIECE, TOPS, BOTTOMS, SOCKS, SHOES, HAT, GLASSES, SCARF, PET, WEAPON, WING, BACK_WING, HAT_V2, HAIR_ORNAMENT, HEAD_BAND, GLASSES_V2, MASK, EARRING, LEFT_WEAPON, RIGHT_WEAPON, BOTH_WEAPON, KEMOMIMI, NECKLACE, COMPANION, COMPANION_TOPS, COMPANION_HAT, COMPANION_SCARF, BACKGROUND, EFFECT, LEFT_INTERIOR, CENTER_INTERIOR, RIGHT_INTERIOR, MACHINE};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }

    public final ClosetFocusType c() {
        return this.closetFocusType;
    }

    public final m0 e() {
        return this.largeCategory;
    }

    public final int h() {
        return this.maxRows;
    }

    public final int i() {
        return this.partsId;
    }

    public final e l() {
        return this.viewSize;
    }

    public /* synthetic */ k0(String str, int i10, int i11, m0 m0Var, ClosetFocusType closetFocusType, e eVar, int i12, int i13, jo.h hVar) {
        this(str, i10, i11, m0Var, closetFocusType, (i13 & 8) != 0 ? e.MEDIUM : eVar, (i13 & 16) != 0 ? 1 : i12);
    }
}
