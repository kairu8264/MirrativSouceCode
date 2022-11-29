package ep;

import java.io.IOException;

/* loaded from: classes4.dex */
public enum a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a Companion = new a(null);
    private final String protocol;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final a0 a(String str) throws IOException {
            jo.p.h(str, "protocol");
            a0 a0Var = a0.HTTP_1_0;
            if (!jo.p.c(str, a0Var.protocol)) {
                a0Var = a0.HTTP_1_1;
                if (!jo.p.c(str, a0Var.protocol)) {
                    a0Var = a0.H2_PRIOR_KNOWLEDGE;
                    if (!jo.p.c(str, a0Var.protocol)) {
                        a0Var = a0.HTTP_2;
                        if (!jo.p.c(str, a0Var.protocol)) {
                            a0Var = a0.SPDY_3;
                            if (!jo.p.c(str, a0Var.protocol)) {
                                a0Var = a0.QUIC;
                                if (!jo.p.c(str, a0Var.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    a0(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
