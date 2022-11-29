package jf;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes2.dex */
public enum j0 {
    VERTICAL(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE),
    ROTATE_90("6"),
    ROTATE_270("8");
    
    public static final a Companion = new a(null);
    private final String rawValue;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j0 a(String str) {
            j0 j0Var;
            jo.p.h(str, "value");
            j0[] values = j0.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    j0Var = null;
                    break;
                }
                j0Var = values[i10];
                if (jo.p.c(j0Var.c(), str)) {
                    break;
                }
                i10++;
            }
            return j0Var == null ? j0.VERTICAL : j0Var;
        }
    }

    j0(String str) {
        this.rawValue = str;
    }

    public final String c() {
        return this.rawValue;
    }
}
