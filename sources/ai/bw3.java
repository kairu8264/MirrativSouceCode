package ai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class bw3 {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f2572c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f2573a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f2574b = -1;

    public final boolean a(v7 v7Var) {
        for (int i10 = 0; i10 < v7Var.a(); i10++) {
            u7 b10 = v7Var.b(i10);
            if (b10 instanceof r8) {
                r8 r8Var = (r8) b10;
                if ("iTunSMPB".equals(r8Var.f9368y) && c(r8Var.f9369z)) {
                    return true;
                }
            } else if (b10 instanceof a9) {
                a9 a9Var = (a9) b10;
                if ("com.apple.iTunes".equals(a9Var.f1786x) && "iTunSMPB".equals(a9Var.f1787y) && c(a9Var.f1788z)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean b() {
        return (this.f2573a == -1 || this.f2574b == -1) ? false : true;
    }

    public final boolean c(String str) {
        Matcher matcher = f2572c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = sb.f9778a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f2573a = parseInt;
                    this.f2574b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
