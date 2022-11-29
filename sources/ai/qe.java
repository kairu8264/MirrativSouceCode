package ai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class qe {

    /* renamed from: c  reason: collision with root package name */
    public static final wg f8905c = new pe();

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f8906d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f8907a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f8908b = -1;

    public final boolean a(rg rgVar) {
        for (int i10 = 0; i10 < rgVar.a(); i10++) {
            qg b10 = rgVar.b(i10);
            if (b10 instanceof vg) {
                vg vgVar = (vg) b10;
                String str = vgVar.f11077y;
                String str2 = vgVar.f11078z;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f8906d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f8907a = parseInt;
                                this.f8908b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final boolean b() {
        return (this.f8907a == -1 || this.f8908b == -1) ? false : true;
    }
}
