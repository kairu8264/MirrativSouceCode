package jf;

/* loaded from: classes2.dex */
public enum m0 {
    GENDER("gender"),
    FACE("face"),
    COSTUME("cloth"),
    ACCESSORY("accessory"),
    MOTION("motion"),
    COMPANION("companion"),
    ROOM("room"),
    MACHINE("machine");
    
    private final String targetId;

    m0(String str) {
        this.targetId = str;
    }

    public final String c() {
        return this.targetId;
    }
}
