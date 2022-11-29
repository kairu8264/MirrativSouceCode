package vl;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        a(int i10) {
            this.code = i10;
        }

        public int a() {
            return this.code;
        }
    }

    a a(String str);
}
