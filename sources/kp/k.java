package kp;

import ep.a0;
import java.io.IOException;
import java.net.ProtocolException;
import jo.p;
import so.n;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38933d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final a0 f38934a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38935b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38936c;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final k a(String str) throws IOException {
            a0 a0Var;
            String str2;
            p.h(str, "statusLine");
            int i10 = 9;
            if (n.C(str, "HTTP/1.", false, 2, null)) {
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt == 0) {
                        a0Var = a0.HTTP_1_0;
                    } else if (charAt == 1) {
                        a0Var = a0.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (n.C(str, "ICY ", false, 2, null)) {
                a0Var = a0.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = "";
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        p.g(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            }
            throw new ProtocolException("Unexpected status line: " + str);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public k(a0 a0Var, int i10, String str) {
        p.h(a0Var, "protocol");
        p.h(str, "message");
        this.f38934a = a0Var;
        this.f38935b = i10;
        this.f38936c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f38934a == a0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f38935b);
        sb2.append(' ');
        sb2.append(this.f38936c);
        String sb3 = sb2.toString();
        p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
